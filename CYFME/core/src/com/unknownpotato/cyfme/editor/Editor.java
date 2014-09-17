package com.unknownpotato.cyfme.editor;

import java.io.File;

import com.unknownpotato.cyfme.mapunits.Level;
import com.unknownpotato.cyfme.serializing.MapReader;

public class Editor {
	private MapReader mapreader;
	private Level level;
	
	public Editor() {
		this.mapreader = new MapReader();
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void loadLevel(File file) {
		mapreader.readMap(file);
	}
}
