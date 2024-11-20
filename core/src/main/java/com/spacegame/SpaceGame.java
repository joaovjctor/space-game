package com.spacegame;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;

import com.spacegame.tools.GameCamera;
import com.spacegame.screens.MainMenuScreen;
import com.spacegame.tools.ScrollingBackground;

public class SpaceGame extends Game {

    public static final int WIDTH = 480;
    public static final int HEIGHT = 720;
    public static boolean IS_MOBILE = false;

    public SpriteBatch batch;
    public ScrollingBackground scrollingBackground;
    public GameCamera cam;

    @Override
    public void create () {
        batch = new SpriteBatch();
        cam = new GameCamera(WIDTH, HEIGHT);  // Usando OrthographicCamera diretamente

        // Inicializando o fundo rolante
        this.scrollingBackground = new ScrollingBackground();

        // Definindo a tela inicial do jogo
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render () {
        // Atualizando a projeção da câmera antes de renderizar
        batch.setProjectionMatrix(cam.combined());
        super.render();
    }

    @Override
    public void resize(int width, int height) {
        // Atualizando a câmera para o novo tamanho de tela
        cam.update(width, height);
        super.resize(width, height);
    }
}
