
package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class shareIt extends AppCompatActivity {

    Button btn8;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_it);

        btn8 = findViewById(R.id.btn7);
        score=findViewById(R.id.quizscore);



    }
}