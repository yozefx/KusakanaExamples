package com.kusakana.exercise002;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Exercice 2";
		cfg.useGL30 = false;
		cfg.width = 800;
		cfg.height = 480;
		
		new LwjglApplication(new Exercise002(), cfg);
	}
}
