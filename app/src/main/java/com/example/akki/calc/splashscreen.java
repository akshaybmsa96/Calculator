package com.example.akki.calc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Akki on 23-04-2016.
 */
public class splashscreen extends AppCompatActivity{
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread thread;
        thread=new Thread(){
            public void run(){

                try {
                    sleep(3000);


                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                finally {
                    Intent i=new Intent(splashscreen.this,calc.class);
                    startActivity(i);

                }
            }
        }; thread.start();

    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
