package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectetTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout europe = findViewById(R.id.europeLayout);
        final LinearLayout ukraine = findViewById(R.id.ukraineLayout);
        final LinearLayout germany = findViewById(R.id.germanyLayout);
        final LinearLayout norway = findViewById(R.id.norwayLayout);
        final Button startQuizBtn = findViewById(R.id.startQuizBtn);

        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectetTopic = "europe";
                europe.setBackgroundResource(R.drawable.round_back_white_stoke10);

                ukraine.setBackgroundResource(R.drawable.round_back_white10);
                germany.setBackgroundResource(R.drawable.round_back_white10);
                norway.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        ukraine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectetTopic = "ukraine";
                ukraine.setBackgroundResource(R.drawable.round_back_white_stoke10);

                europe.setBackgroundResource(R.drawable.round_back_white10);
                germany.setBackgroundResource(R.drawable.round_back_white10);
                norway.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        germany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectetTopic = "germany";
                germany.setBackgroundResource(R.drawable.round_back_white_stoke10);

                ukraine.setBackgroundResource(R.drawable.round_back_white10);
                europe.setBackgroundResource(R.drawable.round_back_white10);
                norway.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        norway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectetTopic = "norway";
                norway.setBackgroundResource(R.drawable.round_back_white_stoke10);

                germany.setBackgroundResource(R.drawable.round_back_white10);
                ukraine.setBackgroundResource(R.drawable.round_back_white10);
                europe.setBackgroundResource(R.drawable.round_back_white10);


            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (selectetTopic.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Виберіть вікторину",Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectetTopic);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}

