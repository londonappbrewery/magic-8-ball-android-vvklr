package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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
        Button buttonAsk;

        buttonAsk = (Button) findViewById(R.id.buttonAsk);

        final ImageView BallImage = (ImageView) findViewById(R.id.BallImage);

        final int[] ballArray = {R.drawable.a,
                R.drawable.b,
                R.drawable.dct,
                R.drawable.dn,
                R.drawable.dnt,
                R.drawable.idk,
                R.drawable.w,
                R.drawable.y
        };

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("askbutton", "ASKBuTTON got pressed");
                Random randomnumbergenerator = new Random();
                int number = randomnumbergenerator.nextInt(8);
                BallImage.setImageResource(ballArray[number]);
            }
        });




    }
}
