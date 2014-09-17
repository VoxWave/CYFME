package com.unknownpotato.cyfme.serializing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import com.badlogic.gdx.files.FileHandle;
import com.unknownpotato.cyfme.fileio.ZipFileHandle;

public class MapReader {
	
	public void readMap(String path) {
		File file = new File(path);
		ZipFile zipfile = null;
		try {
			zipfile = new ZipFile(file);
		} catch (ZipException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileHandle handle = new ZipFileHandle(zipfile, file);
		
		FileHandle entityHandle = handle.child("entities.json");
		
		InputStream entities = entityHandle.read();
		int koko = 0;
		
		try {
			koko = entities.available();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] array = new byte[koko];
		try {
			entities.read(array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(new String(array, StandardCharsets.UTF_8));
		
	}
	
	
	
}
