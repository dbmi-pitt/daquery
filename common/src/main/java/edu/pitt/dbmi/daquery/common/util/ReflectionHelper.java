package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReflectionHelper
{
	private static Logger log = Logger.getLogger(ReflectionHelper.class.getName());
	
	public static List<Class<?>> classesInPackage(String pkg) throws IOException
	{
		List<Class<?>> rVal = new ArrayList<Class<?>>();
		String pkgAsFilePath = pkg.replace('.', '/');
		for (File f : getResourceFolderFiles(pkgAsFilePath))
		{
			String clsStr = classNameFromPath(f.toString(), pkg);
			if(clsStr != null)
			{
				try
				{
					Class<?> tstCls = Class.forName(clsStr);
					rVal.add(tstCls);
				}
				catch(ClassNotFoundException e)
				{
					log.log(Level.SEVERE, "Unable to instantiate class " + clsStr + " while resolving classes in " + pkg + ".", e);
				}
			}
		}		
		return(rVal);
	}
	
	private static File[] getResourceFolderFiles (String folder) throws IOException
	{
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource(folder);
		String path = url.getPath();
		File [] rFiles = null;
		//if it is a jar file open the jar file and look inside
		if(path.contains("!"))
		{
			ArrayList<File> files = new ArrayList<File>();
			String pathToJar = path.substring(0, path.indexOf('!'));
			URL jarURL = new URL(pathToJar);
			ZipInputStream jar = new ZipInputStream(jarURL.openStream());
			while(true)
			{
				ZipEntry entry = jar.getNextEntry();
				if(entry == null) break;
				String fName = entry.getName();
				if(fName.startsWith(folder) && fName.endsWith(".class"))
				{
					File f = new File(fName);
					files.add(f);
				}
			}
			rFiles = (File []) Array.newInstance(File.class, files.size());
			rFiles = files.toArray(rFiles);
		}
		else
		{
			rFiles = new File(path).listFiles();
		}
		return rFiles;
		
/*
  
 URL jar = src.getLocation();
  ZipInputStream zip = new ZipInputStream(jar.openStream());
  while(true) {
    ZipEntry e = zip.getNextEntry();
    if (e == null)
      break;
    String name = e.getName();
    if (name.startsWith("path/to/your/dir/")) {
      // Do something with this entry. 
      ...
    }
  } 		
 */
	}
  
	private static String classNameFromPath(String path, String packageName)
	{
		String rVal = path.trim();
		if(rVal.toLowerCase().endsWith(".class"))
			rVal = rVal.substring(0, rVal.length() - 6);
		else
			return(null);
		  
		int lastSlash = rVal.lastIndexOf("/");
		if(lastSlash == -1) lastSlash = rVal.lastIndexOf("\\");
		if(lastSlash != -1)
			rVal = rVal.substring(lastSlash + 1);
		return(packageName + "." + rVal);
	}	  
}
