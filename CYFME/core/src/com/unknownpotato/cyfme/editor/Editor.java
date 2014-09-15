package com.unknownpotato.cyfme.editor;

import java.io.File;

import com.unknownpotato.cyfme.mapunits.Level;
import com.unknownpotato.cyfme.serializing.Serializer;

public class Editor {
	private Serializer serializer;
	private Level level;
	
	public Editor() {
		this.serializer = new Serializer();
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void loadLevel(File file) {
		level = serializer.load(file, Level.class);
	}
}
