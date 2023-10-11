package com.example.funciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.funciones.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(String(), "onCreate");
    }

    override fun onStart() {
        super.onStart()
        Log.i(String(), "onStart");
    }

    override fun onResume(){
        super.onResume()
        Log.i(String(), "onResume");
    }

    override fun onPause() {
        super.onPause()
        Log.i(String(), "onPause");
    }

    override fun onStop() {
        super.onStop()
        Log.i(String(), "onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(String(), "onDestroy");
    }

}