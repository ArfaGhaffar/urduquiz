package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class quiz extends AppCompatActivity {

    TextView textView1,textView2;
    Button btn,btn2,btn3,btn4;
    Random random;
    ArrayList<quizmodel> quizArray;
    int currentScore=0, currentPos, questionAttempted=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        random = new Random();
        quizArray = new ArrayList<>();
        getQuizQuestion(quizArray);
        currentPos= random.nextInt(quizArray.size());
    }

    private void getQuizQuestion(ArrayList<quizmodel> quizArray) {
        quizArray.add(new quizmodel("What is the color of apple","Red","blue","yellow","orange","Red"));
        quizArray.add(new quizmodel("What is the color of orange","Orange","blue","yellow","orange","Orange"));
        quizArray.add(new quizmodel("What is the color of banana","Yellow","blue","yellow","orange","Yellow"));
        quizArray.add(new quizmodel("What is the color of leaf","Green","blue","yellow","orange","Green"));
    }
}