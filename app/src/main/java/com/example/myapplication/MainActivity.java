package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MYLOG","in oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYLOG","in onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYLOG","in onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYLOG","in onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYLOG","in onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYLOG","in onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MYLOG","in onrestart");

    }

}
