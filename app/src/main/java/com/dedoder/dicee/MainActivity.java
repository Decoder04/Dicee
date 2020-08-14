package com.dedoder.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.btnRoll);

        final ImageView imgLeftDice = (ImageView) findViewById(R.id.imgLeftDice);
        final ImageView imgRightDice = (ImageView) findViewById(R.id.imgRightDice);

        final int diceArray[] = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "The button has been pressed!");

                Random randomNumGenerator = new Random();

                int num = randomNumGenerator.nextInt(6);
                Log.d("Dicee.", "Random number 1 is: " + num);
                imgLeftDice.setImageResource(diceArray[num]);
                num = randomNumGenerator.nextInt(6);
                Log.d("Dicee.", "Random number 2 is: " + num);
                imgRightDice.setImageResource(diceArray[num]);
            }
        });

    }
}