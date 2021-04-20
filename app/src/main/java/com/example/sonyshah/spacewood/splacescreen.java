package com.example.sonyshah.spacewood;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splacescreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=1000;    //2sec


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splacescreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent=new Intent(splacescreen.this,login.class);
                startActivity(splashIntent);
                finish();

            }
        },SPLASH_TIME_OUT);

    }
}
