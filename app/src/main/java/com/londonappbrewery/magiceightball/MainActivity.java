package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView displayText;
        Button askButton;
        final ImageView ballImage;

        askButton = findViewById(R.id.askButton);
        ballImage = findViewById(R.id.ballImage);
        //displayText = findViewById(R.id.textMessage);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();

                int number = randomGenerator.nextInt(5);

                ballImage.setImageResource(ballArray[number]);
            }
        });


    }
}
