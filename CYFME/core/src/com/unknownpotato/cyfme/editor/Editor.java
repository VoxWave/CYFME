package com.unknownpotato.cyfme.editor;

import java.io.File;

import com.unknownpotato.cyfme.fileio.MapReader;
import com.unknownpotato.cyfme.mapunits.Level;

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
