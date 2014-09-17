package com.unknownpotato.cyfme.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.unknownpotato.cyfme.editor.Editor;

public class EditorUI implements Drawable{
	private Editor editor;
	
	private Stage stage;
	private Actor sideActor;
	private Actor mapActor;
	
	public EditorUI(Editor editor) {
		this.editor = editor;
		this.stage = new Stage(new ScreenViewport());
		this.sideActor = new SideActor(editor);
		this.mapActor = new MapActor(editor);
		this.mapActor.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		this.sideActor.setBounds(0, 0, 100, Gdx.graphics.getHeight());

		stage.addActor(mapActor);
		stage.addActor(sideActor);
	}

	@Override
	public void render(float delta) {
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    stage.act(delta);
	    stage.draw();
	}

	@Override
	public void resize(int w, int h) {
	    stage.getViewport().update(w, h, true);
	}

	@Override
	public void dispose() {
	    stage.dispose();
	}

}
