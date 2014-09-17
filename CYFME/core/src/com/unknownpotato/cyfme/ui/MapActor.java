package com.unknownpotato.cyfme.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.unknownpotato.cyfme.editor.Editor;
import com.unknownpotato.cyfme.mapunits.DataObject;
import com.unknownpotato.cyfme.mapunits.Level;

public class MapActor extends Actor {
	//private OrthographicCamera camera;
	private TextureRegion img;
	private Editor editor;
	private Level level;

	public MapActor(Editor editor) {
		this.editor = editor;
		this.level = editor.getLevel();
		this.img = new TextureRegion(new Texture("badlogic.jpg"));
	}
	
    @Override
    public void draw (Batch batch, float parentAlpha) {
    	if (level == null) {
    		return;
    	}
    	//batch.setProjectionMatrix(camera.combined);
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
        batch.draw(img, getX(), getY(), getOriginX(), getOriginY(),
            getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
        
        int nro = 0;
        for (DataObject e : level.getEntities()) {
        	nro++;
        	System.out.println("entity " + nro);
            batch.draw(img, getX()+e.getPos().x, getY()+e.getPos().y, getOriginX(), getOriginY(),
                    getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
        }
        
    }
}
