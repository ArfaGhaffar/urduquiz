
package com.example.quizapp;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.google.android.material.bottomsheet.BottomSheetDialog;

        import java.util.ArrayList;
        import java.util.Random;

public class share extends AppCompatActivity {

    Button btn;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scores2);

        btn = findViewById(R.id.button5);
        score=findViewById(R.id.TVscore);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
               /* Intent shareIntent= new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT,"toString(score)");
                shareIntent.setType("text/plain");

                if(shareIntent.resolveActivity(getPackageManager())!=null){
                    startActivity(shareIntent);
                    }*/

            }
        });

    }
}