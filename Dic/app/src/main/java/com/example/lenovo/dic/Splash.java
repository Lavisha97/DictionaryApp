package com.example.lenovo.dic;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private static int time_splash=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent i1= new Intent(Splash.this, MainActivity.class);
                startActivity(i1);
                finish();
            }
        },time_splash);

    }
}