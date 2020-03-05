package com.example.informatiquemobile46;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "notif";
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {

        Log.i(TAG, "Vers l'infini");

        Intent intent = new Intent(this, Questionnaire.class);

        startActivityForResult(intent, TEXT_REQUEST);

    }

    public void goToQuestionnaire(View view) {
        Intent intent = new Intent(this, Questionnaire.class);

        startActivityForResult(intent, TEXT_REQUEST);

    }
}
