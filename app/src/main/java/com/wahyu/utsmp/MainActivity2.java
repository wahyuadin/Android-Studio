package com.wahyu.utsmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText harga, diskon;
    TextView hasil, pothar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide(); // Hapus Layout
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); // Hapus Layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        harga = findViewById(R.id.harga);
        diskon = findViewById(R.id.diskon);
        hasil = findViewById(R.id.hasil);
        pothar = findViewById(R.id.pothar);
    }

    public void proses(View view) {
        int txtHarga = Integer.parseInt(harga.getText().toString());
        int txtDiskon = Integer.parseInt(diskon.getText().toString());

        int potongan = txtHarga * txtDiskon / 100;
        int Hasil = txtHarga - potongan;
        int Pothar = txtHarga - Hasil;

        pothar.setText(String.valueOf(Pothar));
        hasil.setText(String.valueOf(Hasil));

    }

    public void kembali(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class); //Pindah Slide
        startActivity(intent); // Pindah Slide
    }
}