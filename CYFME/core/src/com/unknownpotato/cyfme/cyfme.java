package com.unknownpotato.cyfme;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.unknownpotato.cyfme.editor.Editor;
import com.unknownpotato.cyfme.ui.EditorUI;

public class cyfme implements ApplicationListener {
	private Screen screen;
	
	@Override
	public void create () {
		Editor editor = new Editor();
		screen = new EditorUI(editor);
	}

	@Override
	public void render () {
		screen.render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void resize(int width, int height) {
		screen.resize(width, height);
	}

	@Override
	public void pause() {
		screen.pause();
	}

	@Override
	public void resume() {
		screen.resume();
	}

	@Override
	public void dispose() {
		screen.dispose();
	}
}
