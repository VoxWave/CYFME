package com.unknownpotato.cyfme.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.unknownpotato.cyfme.editor.Editor;

public class SideActor extends Actor{
	private Editor editor;
	private TextureRegion img;
	
	public SideActor(Editor editor) {
		this.editor = editor;
		//@TODO: Kysy editorilta minkä tyyppisiä entiyjä on olemassa ja lisää niitä vastaavat napit sivupalkkiin
		this.img = new TextureRegion(new Texture("sidebar.png"));
	}
	
    @Override
    public void draw (Batch batch, float parentAlpha) {
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
        batch.draw(img, getX(), getY(), getOriginX(), getOriginY(),
            getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
        
    }
}
