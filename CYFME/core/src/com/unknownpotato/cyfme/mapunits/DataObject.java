package com.unknownpotato.cyfme.mapunits;

import com.unknownpotato.cyfme.vector.Vector;

public class DataObject {
	
	private Vector pos;
	private String type;
	private float rot;
	
	public DataObject(Vector pos, String type, float rot){
		this.pos = pos;
		this.rot = rot;
		this.type = type;
	}
	
	public Vector getPos(){
		return this.pos;
	}
	
	public float getRot(){
		return this.rot;
	}
	
	public String getType(){
		return this.type;
	}
	
}
