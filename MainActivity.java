package com.example.myuts_15030030;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    //Deklarasi Variabel
    EditText nim, nama;
    RadioButton jenisKelas;
    RadioGroup kelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisialisasi program
        // Text Input
        nim = (EditText)findViewById(R.id.editnim);
        nama = (EditText)findViewById(R.id.editnama);

        //Radio Button
        kelas = (RadioGroup) findViewById(R.id.kelas);
    }

    public void send(View view) {
        int radioId = kelas.getCheckedRadioButtonId();
        jenisKelas = (RadioButton) findViewById(radioId);

        //Menghubungkan MainActivity dengan HasilActivity
        Intent hubung = new Intent(this, HasilActivity.class);


        hubung.putExtra("nim", nim.getText().toString());
        hubung.putExtra("nama", nama.getText().toString());
        hubung.putExtra("jenisKelas", jenisKelas.getText().toString());
        startActivity(hubung);

    }
}