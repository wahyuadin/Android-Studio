package com.wahyu.utsmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    public void persen(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class); //Pindah Slide
        startActivity(intent); // Pindah Slide
    }

    public void keluar(View view) {
        moveTaskToBack(true);
        finish();
        System.exit(0);
    }
}