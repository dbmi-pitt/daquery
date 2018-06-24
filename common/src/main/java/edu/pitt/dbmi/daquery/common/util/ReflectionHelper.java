package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
	
	/**
	 * Find all setter methods that match a given parameter name
	 * Criteria is, match parameter name, single argument and returns void  
	 */
	public static List<Method> findMatchingSetters(Class<?> cls, String parameterName)
	{
		List<Method> returnMethods = new ArrayList<Method>();
		if(!StringHelper.isEmpty(parameterName) && ! (cls == null))
		{
			String pNameTrimmed = parameterName.trim();
			String setterName = "set" + pNameTrimmed.substring(0, 1).toUpperCase() + pNameTrimmed.substring(1);
			Method [] allMethods = cls.getMethods();
			for(Method m : allMethods)
			{
				if(m.getName().equals(setterName) &&
					m.getReturnType().equals(Void.TYPE) &&
					m.getParameterTypes().length == 1)
				{
					returnMethods.add(m);
				}
			}
		}
		return(returnMethods);
	}
	
	public static void setValue(Object obj, Class<?> cls, String parameterName, String value) throws InvocationTargetException, IllegalAccessException, IllegalArgumentException, DaqueryException
	{
		List<Method> setters = findMatchingSetters(cls, parameterName);
		Class<?> valType = StringHelper.myType(value);
		if(valType == null) throw new DaqueryException("The type for " + value + " while setting " + parameterName + " could not be determined.  Only int, boolean or String are supported.");
		boolean invoked = false;
		for(Method m : setters)
		{ 
			Class<?> type = m.getParameterTypes()[0];
			if(type.equals(int.class) && valType.equals(Integer.class))
			{
				m.invoke(obj, Integer.parseInt(value));
				invoked = true;
			}
			else if(type.equals(Integer.class) && valType.equals(Integer.class))
			{
				m.invoke(obj, new Integer(Integer.parseInt(value)));
				invoked = true;
			}
			else if(type.equals(boolean.class) && valType.equals(Boolean.class))
			{
				m.invoke(obj, StringHelper.toBool(value));
				invoked = true;
			}
			else if(type.equals(Boolean.class) && valType.equals(Boolean.class))
			{
				m.invoke(obj, new Boolean(StringHelper.toBool(value)));
				invoked = true;
			}
			else if(type.equals(String.class) && valType.equals(String.class))
			{
				m.invoke(obj, value);
				invoked = true;
			}
		}
		if(! invoked)
		{
			throw new DaqueryException("The available setter argument types for " + parameterName + " did not match the supplied value type of " + valType.getSimpleName());
		}
	}
	
	
	
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
