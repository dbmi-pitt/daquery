package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileHelper
{
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
	
	public static File createTempDirectory()throws IOException
	{
	    File temp = null;

	    Path p = Files.createTempDirectory("pathcdrn");
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
	
	public static File serializeFilename(File f)
	{
		return(f);
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
