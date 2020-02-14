package com.example.sankesh.automatedwatering;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by user on 12/27/2016.
 */

public class Splash  extends Activity{


    //1sec splash screen 1000;
    //2sec splash screen 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int SPLASH_TIME_OUT = 4000;
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }  }, SPLASH_TIME_OUT

            );
        }
    }

