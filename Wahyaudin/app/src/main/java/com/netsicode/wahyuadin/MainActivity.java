package com.netsicode.wahyuadin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide(); // Hapus Layout
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); // Hapus Layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proseslogin(View view) {
    }
}