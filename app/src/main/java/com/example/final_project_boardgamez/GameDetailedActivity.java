package com.example.final_project_boardgamez;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.final_project_boardgamez.GameData.GameInfo;

public class GameDetailedActivity extends AppCompatActivity {
    public static final String EXTRA_GAME_INFO = "GameInfo";
    private static final String TAG = GameDetailedActivity.class.getSimpleName();

    private GameInfo mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_detailed_collection);
        Log.d(TAG, "Created GameDetailedActivity");


        Button editButton = findViewById(R.id.btn_edit);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Replace with an action...");
            }
        });
    }


}
