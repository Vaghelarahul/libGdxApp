package com.android.campk12.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Rahul Vaghela on 17/3/20
 */
public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        TextView textView = findViewById(R.id.launch_game);
        textView.setOnClickListener(v -> launch());
    }

    private void launch() {
        Intent intent = new Intent(this, AndroidLauncher.class);
        startActivity(intent);
    }
}
