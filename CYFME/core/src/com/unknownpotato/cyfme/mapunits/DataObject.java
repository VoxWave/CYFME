package com.unknownpotato.cyfme.mapunits;

import com.badlogic.gdx.math.Vector2;

public class DataObject {
	
	private float rot;
	
	/**
	 * What we spawn
	 */
	private String type;
	
	/**
	 * where we spawn it
	 */
	private Vector2 pos;
	
	
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
	
	public void setPos(Vector2 pos){
		this.pos=pos;
	}
	
	public void setRot(float rot){
		this.rot=rot;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
}
