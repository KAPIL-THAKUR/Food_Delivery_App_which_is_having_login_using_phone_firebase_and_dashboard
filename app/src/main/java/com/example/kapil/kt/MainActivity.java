package com.example.kapil.kt;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=2000;
    ProgressBar progressBar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressBar);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setProgress(2000);
                firebaseAuth=FirebaseAuth.getInstance();

                FirebaseUser user=firebaseAuth.getCurrentUser();
                if(user!=null){
                    startActivity(new Intent(MainActivity.this,DetailActivity.class));
                }else{
                    Intent Splash=new Intent(MainActivity.this,SplashActivity.class);
                    startActivity(Splash);
                }
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
