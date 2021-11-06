package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openActivity1();
            }
        });

    }

    private void openActivity1() {
        Intent intent = new Intent(this,quiz.class);
        startActivity(intent);
    }


}







/*Typeface typeface = Typeface.createFromAsset(textView.getText().getAssets(),"src/main/Jameel.ttf");
        this.textView.setTypeface(typeface);
        https://github.com/ArfaGhaffar/urduquiz.git */