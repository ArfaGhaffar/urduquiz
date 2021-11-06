package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class quiz extends AppCompatActivity {

    TextView textView1,textView2;
    Button btn,btn2,btn3,bt4;
    Random random;
    ArrayList<quizmodel> quizArray;
    int currentScore=0, currentPos, questionAttempted=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
}