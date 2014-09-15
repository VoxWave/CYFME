package com.unknownpotato.cyfme.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class MapActor extends Actor {
	private TextureRegion img;

	public MapActor() {
		this.img = new TextureRegion(new Texture("badlogic.jpg"));
	}
	
    @Override
    public void draw (Batch batch, float parentAlpha) {
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
        batch.draw(img, getX(), getY(), getOriginX(), getOriginY(),
            getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }
}
