package com.example.myuts_15030030;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tampil_Data extends AppCompatActivity {
    //Deklarasi Variabel
    TextView programstudi, dnama, dnim, dmatakuliah, dsks, ddosen, dtanggal, dkelas, dsftujian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil__data);

        String tampil_nim = getIntent().getExtras().getString("tampil_nim");
        String tampil_nama = getIntent().getExtras().getString("tampil_nama");
        String tampil_kelas = getIntent().getExtras().getString("tampil_kelas");
        String Tanggal = getIntent().getExtras().getString("Tanggal");
        String Matakuliah = getIntent().getExtras().getString("Matakuliah");
        String Sks = getIntent().getExtras().getString("Sks");
        String Sifat_ujian = getIntent().getExtras().getString("Sifat_ujian");
        String Programstudi = getIntent().getExtras().getString("Program_studi");
        String dosen_pengampu = getIntent().getExtras().getString("dosen_pengampu");

        dnim.setText(tampil_nim);
        dnama.setText(tampil_nama);
        dkelas.setText(tampil_kelas);
        dtanggal.setText(Tanggal);
        dmatakuliah.setText(Matakuliah);
        dsks.setText(Sks);
        dsftujian.setText(Sifat_ujian);
        programstudi.setText(Programstudi);
        ddosen.setText(dosen_pengampu);



    }
}