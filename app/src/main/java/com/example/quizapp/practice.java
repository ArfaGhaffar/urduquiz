package com.example.quizapp;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.ActionBar;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.google.android.material.bottomsheet.BottomSheetDialog;

        import java.util.ArrayList;
        import java.util.Random;

public class practice extends AppCompatActivity {

    TextView questionTV,questionNumber,answer;
    Button btn,btn2,btn3,btn4;
    Random random;
    ArrayList<quizmodel> quizArray;
    int currentScore=0, currentPos, questionAttempted=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        questionNumber = findViewById(R.id.textView);
        questionTV = findViewById(R.id.textView2);
        answer = findViewById(R.id.answer);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        random = new Random();
        quizArray = new ArrayList<>();
        getQuizQuestion(quizArray);
        currentPos= random.nextInt(quizArray.size());
        setDataToViews(currentPos);
        //actionbar
        ActionBar actionBar = getSupportActionBar();
        //set actionbar title(Optional)
        actionBar.setTitle("Main page");
        //set back button
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizArray.get(currentPos).getAnswer().trim().toLowerCase().equals(btn.getText().toString().trim().toLowerCase())) {
                   answer.setText("   CORRECT");
                }
                else{
                   answer.setText("    WRONG");

                }
                questionAttempted++;
                currentPos=random.nextInt(quizArray.size());
                setDataToViews(currentPos);

            }

        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizArray.get(currentPos).getAnswer().trim().toLowerCase().equals(btn2.getText().toString().trim().toLowerCase())) {
                    answer.setText("   CORRECT");
                }
                else{
                    answer.setText("    WRONG");
                }
                questionAttempted++;
                currentPos=random.nextInt(quizArray.size());
                setDataToViews(currentPos);
            }

        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizArray.get(currentPos).getAnswer().trim().toLowerCase().equals(btn3.getText().toString().trim().toLowerCase())) {
                    answer.setText("   CORRECT");
                }
                else{
                    answer.setText("    WRONG");
                }
                questionAttempted++;
                currentPos=random.nextInt(quizArray.size());
                setDataToViews(currentPos);
            }

        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizArray.get(currentPos).getAnswer().trim().toLowerCase().equals(btn4.getText().toString().trim().toLowerCase())) {
                    answer.setText("   CORRECT");
                }
                else{
                    answer.setText("    WRONG");

                }
                questionAttempted++;
                currentPos=random.nextInt(quizArray.size());
                setDataToViews(currentPos);
            }

        });


    }

    private void showSheet(){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(practice.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.scores,findViewById(R.id.scores));

        TextView restart=bottomSheetView.findViewById(R.id.reStart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPos=random.nextInt(quizArray.size());
                setDataToViews(currentPos);
                questionAttempted=1;
                currentScore=0;
                bottomSheetDialog.dismiss();
            }
        });


        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void setDataToViews(int currentPos) {
        questionNumber.setText("Questions attempted :"+questionAttempted+"/10");
        if(questionAttempted==10){
            showSheet();
        }else {
            questionTV.setText(quizArray.get(currentPos).getQuestion());
            btn.setText(quizArray.get(currentPos).getOption1());
            btn2.setText(quizArray.get(currentPos).getOption2());
            btn3.setText(quizArray.get(currentPos).getOption3());
            btn4.setText(quizArray.get(currentPos).getOption4());
        }

    }

    private void getQuizQuestion(ArrayList<quizmodel> quizArray) {
        quizArray.add(new quizmodel("How many Makh??rij (?????????? Emission) points are require to correctly read Quran???","17","19","21","18","17"));
        quizArray.add(new quizmodel("How many diacritics are present in the word ?????????????????","1","2","3","4","3"));
        quizArray.add(new quizmodel("How many alphabets are in Arabic???","20","29","25","28","29"));
        quizArray.add(new quizmodel("Which is a small diagonal line placed above a letter???","??????????????","??????????????","????????????","????????????"," ??????????????"));
        quizArray.add(new quizmodel("What is written as short vertical stroke on top of a consonant???","????","??????"," ????","/","??????"));
        quizArray.add(new quizmodel("Which letters when pronounced produce a ???whistling??? sound???","??","??","??","??","??"));
        quizArray.add(new quizmodel("Which of these letters originate from throat???","??","??","??","??","??"));
        quizArray.add(new quizmodel("???Soft letters??? which are pronounced softly???","??","??","??","??","??"));
        quizArray.add(new quizmodel("???Heavy letters??? which are pronounced with a heavy accent:???","??","??","??","All","All"));
        quizArray.add(new quizmodel("Mouth empty space while speaking words like???"," ??????","??????","??????","All","All"));
        quizArray.add(new quizmodel("Base of Tongue which is near Uvula touching the mouth roof???","??","??","??","All","??"));
        quizArray.add(new quizmodel("Portion of Tongue near its base touching the roof of mouth???","??","??","??","??","??"));
        quizArray.add(new quizmodel("One side of the tongue touching the molar teeth???","??","??","??","??","??"));
        quizArray.add(new quizmodel("While pronouncing the ending sound of, bring the vibration to the nose???","??","??","??","??","??"));
        quizArray.add(new quizmodel("Rounding both lips and not closing the mouth???","??","??","??","??","??"));
        quizArray.add(new quizmodel("Outer part of both lips touch each other ???","??","??","??","??","??"));
        quizArray.add(new quizmodel("Inner part of both lips touch each other???","??","??","??","??","??"));
        quizArray.add(new quizmodel("Tip of the two upper jaw teeth touches the inner part of the lower lip???","??","??","??","All","??"));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("text",questionNumber.getText().toString());
        outState.putString("text2",questionTV.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        questionNumber.setText(savedInstanceState.getString("text"));
        questionTV.setText(savedInstanceState.getString("text2"));
        super.onRestoreInstanceState(savedInstanceState);
    }

    //handle onBack pressed(go previous activity)
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}