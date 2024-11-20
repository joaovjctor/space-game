package com.spacegame.lwjgl3;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.spacegame.SpaceGame;

public class Lwjgl3Launcher {
    public static void main(String[] args) {
        if (StartupHelper.startNewJvmIfRequired()) return; // Suporte para macOS e ajuda no Windows.
        createApplication();
    }

    private static Lwjgl3Application createApplication() {
        return new Lwjgl3Application(new SpaceGame(), getDefaultConfiguration());
    }

    private static Lwjgl3ApplicationConfiguration getDefaultConfiguration() {
        Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
        configuration.setTitle("spacegame");
        configuration.setForegroundFPS(60); // Configurando FPS fixo
        configuration.setWindowedMode(SpaceGame.WIDTH, SpaceGame.HEIGHT); // Configurando resolução
        configuration.setResizable(true); // Tornando a janela redimensionável
        configuration.setWindowIcon("icon_128.png", "icon_32.png", "icon_16.png"); // Configurando ícones
        return configuration;
    }
}
