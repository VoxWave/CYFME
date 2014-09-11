package com.unknownpotato.cyfme.mapunits;

import com.badlogic.gdx.math.Vector2;

public class DataObject {
	
	private Vector2 pos;
	private String type;
	private float rot;
	
	public DataObject(Vector2 pos, String type, float rot){
		this.pos = pos;
		this.rot = rot;
		this.type = type;
	}
	
	public Vector2 getPos(){
		return this.pos;
	}
	
	public float getRot(){
		return this.rot;
	}
	
	public String getType(){
		return this.type;
	}
	
}
