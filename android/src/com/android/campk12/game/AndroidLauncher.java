package com.android.campk12.game;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.udacity.gamedev.gigagal.GigaGalGame;

public class AndroidLauncher extends AndroidApplication {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        launch();
    }

    private void launch() {
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new GigaGalGame(), config);
    }
}
