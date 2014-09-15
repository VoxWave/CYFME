package com.unknownpotato.cyfme;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.unknownpotato.cyfme.editor.Editor;
import com.unknownpotato.cyfme.ui.Drawable;
import com.unknownpotato.cyfme.ui.EditorUI;

public class cyfme implements ApplicationListener {
	private Drawable drawable;
	
	@Override
	public void create () {
		Editor editor = new Editor();
		drawable = new EditorUI(editor);
	}

	@Override
	public void render () {
		drawable.render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void resize(int width, int height) {
		drawable.resize(width, height);
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		drawable.dispose();
	}
}
