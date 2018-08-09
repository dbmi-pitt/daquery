package edu.pitt.dbmi.daquery.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class ZipUtil {

	/**
     * Unzip it
     * @param zipFile input zip file
     * @param output zip file output folder
     */
    public void unZip(String zFile, String outputFolder) throws IOException{
   	
    	// create a directory with the same name to which the contents will be extracte
    	String zipPath = zFile.substring(0, zFile.length()-4);
    	File temp = new File(zipPath);
    	temp.mkdir();
    	        
    	ZipFile zipFile = null;

    	
    	try {
			
			zipFile = new ZipFile(zFile);
			
			// get an enumeration of the ZIP file entries
			Enumeration<? extends ZipEntry> e = zipFile.entries();
			
			while (e.hasMoreElements()) {
				
				ZipEntry entry = e.nextElement();
				
				File destinationPath = new File(zipPath, entry.getName());
				 
				//create parent directories
				destinationPath.getParentFile().mkdirs();
				
				// if the entry is a file extract it
				if (entry.isDirectory()) {
					continue;
				}
				else {
					
					System.out.println("Extracting file: " + destinationPath);
					
					BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(entry));

					int b;
					byte buffer[] = new byte[1024];

					FileOutputStream fos = new FileOutputStream(destinationPath);
					
					BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

					while ((b = bis.read(buffer, 0, 1024)) != -1) {
						bos.write(buffer, 0, b);
					}
					
					bos.close();
					bis.close();
					
				}
				
			}
			
		}
		catch (IOException ioe) {
			System.out.println("Error opening zip file" + ioe);
		}
		 finally {
			 try {
				 if (zipFile!=null) {
					 zipFile.close();
				 }
			 }
			 catch (IOException ioe) {
					System.out.println("Error while closing zip file" + ioe);
			 }
		 }

   }    
}


