package com.elses.myapplication;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity{

    Handler handler;
    private static final String GenericTag = "Splash Activity";
    private static final int PERMISSIONS_REQUEST_CODE = 1111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, NavigationScreen.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
