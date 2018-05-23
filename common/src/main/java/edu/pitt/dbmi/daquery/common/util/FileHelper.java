package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileHelper
{
	public static void main(String [] args)
	{
		String testFile = "/Users/bill/ndir/f1.zip";
		File sf = serializeFilename(new File(testFile));
		if(sf == null) System.out.println("is null");
		else System.out.println(sf.getAbsolutePath());
		/*ExtendedFile ef = new ExtendedFile(testFile);
		System.out.println("dir:" + ef.dir);
		System.out.println("extension:" + ef.extension);
		System.out.println("filename:" + ef.filename);
		System.out.println("filenameNoExtension:" + ef.filenameNoExtension);
		System.out.println("serializer:" + ef.serializer); */
	}
	public static InputStream streamFromBaseResource(String filename)
	{
		InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/" + filename);
		return(is);
	}
	
	public static boolean dirExists(String path)
	{
		try
		{
			File f = new File(path);
			if(f != null && f.exists() && f.isDirectory())
				return(true);
			else
				return(false);
		}
		catch(Throwable t)
		{
			return(false);
		}
			
	}
	
	public static File createExportTempDirectory() throws IOException, DaqueryException
	{
	    File temp = null;
	    String baseDirStr = AppProperties.getTempFileExportDir();
	    Path baseDir = Paths.get(baseDirStr);
	    Path p = Files.createTempDirectory(baseDir, "dqexport");
	    temp = p.toFile();
	    return(temp);
	}
	
	public static void moveFile(File fileToMove, File directoryToMoveTo) throws IOException
	{
		if(!fileToMove.exists())
			throw new IOException("Cannont move " + fileToMove.getAbsolutePath() + " because it does not exist.");
		
		if(!directoryToMoveTo.exists())
			throw new IOException("Cannont move " + fileToMove.getAbsolutePath() + " to " + directoryToMoveTo.getAbsolutePath() + ".  The destination directory does not exist.");
		
		
		Path sourceFile = fileToMove.toPath();
		Path destDir = directoryToMoveTo.toPath();
		
		Path moveTo = destDir.resolve(sourceFile.getFileName());
		
		if(moveTo.toFile().exists())
			throw new IOException("Cannont move " + fileToMove.getAbsolutePath() + " to " + directoryToMoveTo.getAbsolutePath() + ".  A file of the same name already exists in the  destination directory.");
		
		Files.move(sourceFile, moveTo, StandardCopyOption.REPLACE_EXISTING);
	}
	
	public static boolean deleteDirectory(File directory) {
	    if(directory.exists()){
	        File[] files = directory.listFiles();
	        if(null!=files){
	            for(int i=0; i<files.length; i++) {
	                if(files[i].isDirectory()) {
	                    deleteDirectory(files[i]);
	                }
	                else {
	                    files[i].delete();
	                }
	            }
	        }
	    }
	    return(directory.delete());
	}
	
	//Zip all files in a directory
	public static void zipDirectory(File directory, File zipFile, boolean recursive) throws IOException
	{
		if(! directory.exists() || ! directory.isDirectory())
		{
			throw new IOException("Unable to create zip file " + zipFile.getAbsolutePath() + ".  The directory of files to zip at " + directory.getAbsolutePath() + " does not exist or is not a valid directory.");
		}
		makeZip(directory, zipFile, recursive);
	}
	


    /**
    * Look for existing files with the pattern /any/directory/filename-serializer.extension.  If one
    * exists increment the serializer by one.
    * @param f The file to look at.
    * @return
    */
    public static File serializeFilename(File f)
    {
    	if(f.isDirectory())
    		return(null);

    	File dir = f.getParentFile();
    	if(dir == null)
    		return(null);
    	
    	ExtendedFile ef = new ExtendedFile(f);
    	if(ef.filenameNoExtension == null)
    		return(f);
    	String [] filesToCheck = dir.list(new FileStartsAndEndsWith(ef.filenameNoExtension, ef.extension));
    	int maxSerial = 0;
    	boolean first = true;
    	if(filesToCheck != null)
    	{
	    	for(String toCheck : filesToCheck)
	    	{
	    		if(first)
	    		{
	    			maxSerial = 1;
	    			first = false;
	    		}
	    		ExtendedFile efc = new ExtendedFile(toCheck);
	    		if(efc != null && efc.serializer != null && efc.serializer.intValue() > maxSerial)
	    			maxSerial = efc.serializer.intValue();
	    	}
    	}
    	if(maxSerial > 0)
    	{
    		String fName = ef.filenameNoExtension + "-" + (maxSerial + 1);
    		if(ef.extension != null)
    			fName = fName + "." + ef.extension;
    		File fAndPath = Paths.get(dir.getAbsolutePath(), fName).toFile();
    		return(fAndPath);
    	}
    	else
    		return(f);
    }

    
    public static void checkAndCreateDir(File f) throws DaqueryException
    {
		if(! f.exists())
		{
			try{f.mkdirs();}
			catch(Throwable ioe)
			{
				String msg = "Unable to create directory at " + f.getAbsolutePath();
				throw new DaqueryException(msg, ioe);
			}
		}
		if(! f.isDirectory())
		{
			String msg = f.getAbsolutePath() + " is not a valid directory.";
			throw new DaqueryException(msg);
		}
		if(! f.canWrite())
		{
			String msg = f.getAbsolutePath() + " is not writable";
			throw new DaqueryException(msg);
		}	
    }
    private static class ExtendedFile
    {
    	public File dir = null;
    	public String filename = null;
    	public String extension = null;
    	public String filenameNoExtension = null;
    	public Integer serializer = null;
    	
    	public ExtendedFile(String fileAndPath)
    	{
    		parse(new File(fileAndPath));
    	}
    	public ExtendedFile(File fileAndPath)
    	{
    		parse(fileAndPath);
    	}
    	private void parse(File path)
    	{
    		File dir = path.getParentFile();
    		if(dir != null && dir.isDirectory())
    			this.dir = dir;
    		filename = path.getName();
    		if(filename != null) filename = filename.trim();
    		FileParts fps = parseFilename(filename);
    		serializer = fps.serializer;
    		extension = fps.extension;
    		filenameNoExtension = fps.fileNoExtension;
    	}
    	
    	static FileParts parseFilename(String  filename)
    	{
    		if(StringHelper.isBlank(filename))
    			return(null);
    		FileParts fps = new FileParts();
    		String fn = filename.trim();
    		int dotPos = fn.lastIndexOf(".");
    		String t;
    		if(dotPos > 0 && dotPos < fn.length())
    		{
    			fps.extension = fn.substring(dotPos + 1);
    			fps.fileNoExtension = fn.substring(0, dotPos);
    			t = fps.fileNoExtension;
    		}
    		else
    		{
    			fps.fileNoExtension = fn;
    			t = fn;
    		}
    		if(t.matches(".*-[0-9]+$"))
    		{
    			int dashLoc = t.lastIndexOf("-");
    			fps.serializer = Integer.parseInt(t.substring(dashLoc + 1));
    			fps.fileNoExtension = t.substring(0, dashLoc);
    		}
    		return(fps);
    	}
    }
    private static class FileParts
	{
		Integer serializer = null;
		String extension = null;
		String fileNoExtension = null;
	}

    private static class FileStartsAndEndsWith implements FilenameFilter
    {
    	private String start;
    	private String end;
    	boolean checkEnd;
    	public FileStartsAndEndsWith(String fileStart, String fileEnd)
    	{
    		start = fileStart;
    		end = fileEnd;
    		checkEnd = !StringHelper.isEmpty(fileEnd);
    	}
		@Override
		public boolean accept(File dir, String name) {
			if(StringHelper.isEmpty(name)) return(false);
			return((checkEnd)?(name.startsWith(start)&&name.endsWith(end)):name.startsWith(start));
		}    	
    }
	
	private static int makeZip(File zipDirectory, File outputFile, boolean recursive) throws FileNotFoundException, IOException
	{
		// if the archive exists already delete it and start over
		
		if (outputFile.exists())
			outputFile.delete();
		// construct a list of files to add to the archive
		// all files in the directory will be added

		List<FileAndDirName> filesToAdd = new ArrayList<FileAndDirName>();
		
		addFilesInDirectory(zipDirectory, "", filesToAdd, recursive);

		// if no files were found
		if (filesToAdd.size() == 0) {
			return(0);
		}

		// open the archive
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFile));
		out.setLevel(Deflater.DEFAULT_COMPRESSION);
		byte[] buffer = new byte[18024];

		// loop through the files and add them
		for (FileAndDirName fileToZip : filesToAdd) {
			FileInputStream in = new FileInputStream(fileToZip.file);
			out.putNextEntry(new ZipEntry(fileToZip.dirName + fileToZip.file.getName()));
			int len;
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			out.closeEntry();
			in.close();

		}
		out.close();
		return(filesToAdd.size());
	}
	private static void addFilesInDirectory(File dir, String currentDirectory, List<FileAndDirName> filesToAdd, boolean recursive)
	{
		String[] files = dir.list();
		for (String file : files) {
			File f = new File(dir, file);
			if (f.exists())
			{
				if(f.isFile())
				{
					FileAndDirName fdn = new FileAndDirName();
					fdn.file = f;
					fdn.dirName = currentDirectory;
					filesToAdd.add(fdn);
				}
				else if(f.isDirectory() && recursive)
				{
					addFilesInDirectory(f, currentDirectory + f.getName() + "/", filesToAdd, true);
				}
			}
		}
	}	
	private static class FileAndDirName
	{
		public File file;
		public String dirName;
	}	
}
