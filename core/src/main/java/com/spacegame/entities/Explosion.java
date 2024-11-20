package com.spacegame.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Explosion {

    public static final float FRAME_LENGTH = 0.2f;
    public static final int OFFSET = 8;
    public static final int SIZE = 64;
    public static final int IMAGE_SIZE = 32;

    private static Animation<TextureRegion> anim = null;
    float x, y;
    float statetime;

    public boolean remove = false;

    public Explosion (float x, float y) {
        this.x = x - OFFSET;
        this.y = y - OFFSET;
        statetime = 0;

        if (anim == null) {
            // Garantindo que a animação pegue as regiões corretas da imagem
            Texture texture = new Texture("explosion.png");
            TextureRegion[] frames = TextureRegion.split(texture, IMAGE_SIZE, IMAGE_SIZE)[0];  // Pega a primeira linha (ou ajusta conforme sua imagem)
            anim = new Animation<>(FRAME_LENGTH, frames);  // Cria a animação com a linha de quadros
        }
    }

    public void update (float deltatime) {
        statetime += deltatime;
        if (anim.isAnimationFinished(statetime))
            remove = true;
    }

    public void render (SpriteBatch batch) {
        batch.draw(anim.getKeyFrame(statetime), x, y, SIZE, SIZE);
    }
}
