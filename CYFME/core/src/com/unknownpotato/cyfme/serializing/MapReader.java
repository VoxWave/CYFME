package com.unknownpotato.cyfme.serializing;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.unknownpotato.cyfme.fileio.ZipFileHandle;
import com.unknownpotato.cyfme.mapunits.DataObject;
import com.unknownpotato.cyfme.mapunits.Level;
import com.unknownpotato.cyfme.mapunits.Metadata;

public class MapReader {
	private Serializer serializer;
	
	
	public MapReader() {
		this.serializer = new Serializer();
	}
	
	
	public Level readMap(File file) {		
		Level level = new Level();
		
		//File file = new File(path);
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
		
		ZipFileHandle handle = new ZipFileHandle(zipfile, file);
		
		Collection<DataObject> entities = getEntities(handle);
		level.setEntities(entities);
		
		Texture texture = getTexture(handle);
		level.setBackground(texture);
		
		level.setMetadata(getMetadata(handle));
		
		System.out.println(level.getMetadata().nimi + " " + level.getMetadata().versio);
		
		return level;
	}
	
	private Collection<DataObject> getEntities(FileHandle handle) {
		FileHandle entityHandle = handle.child("entities.json");
		InputStream entities = entityHandle.read();
		return (Collection<DataObject>)serializer.load(entities, Collection.class);
	}
	
	private Texture getTexture(FileHandle handle) {
		FileHandle textureHandle = handle.child("background.png");
		return new Texture(textureHandle);
	}
	
	private Metadata getMetadata(FileHandle handle) {
		FileHandle metadataHandle = handle.child("metadata.json");
		InputStream metadata = metadataHandle.read();
		return serializer.load(metadata, Metadata.class);
	}
	
	private void generateTestData() {
//		Collection<DataObject> temp = new ArrayList<DataObject>();
//		Vector2 paikka1 = new Vector2(3, 4);
//		String tyyppi1 = "puu";
//		float rot1 = 10.4f;
//		DataObject otus1 = new DataObject(paikka1, tyyppi1, rot1);
//		
//		Vector2 paikka2 = new Vector2(5, 1);
//		String tyyppi2 = "kivi";
//		float rot2 = 3.1f;
//		DataObject otus2 = new DataObject(paikka2, tyyppi2, rot2);
//		
//		Vector2 paikka3 = new Vector2(7, 2);
//		String tyyppi3 = "kanto";
//		float rot3 = 3.8f;
//		DataObject otus3 = new DataObject(paikka3, tyyppi3, rot3);
//		
//		temp.add(otus1);
//		temp.add(otus2);
//		temp.add(otus3);
		
//		Metadata testimetadata = new Metadata();
//		testimetadata.nimi = "Epic Battle Grounds";
//		testimetadata.versio = "2.03";
		
		
//		
//		File testifile = new File("/home/mikko/cyfme-test/tavaraa.json");
//		
//		serializer.save(testimetadata, testifile);
//		
//		return null;
	}
	
	
	
}
