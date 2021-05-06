package com.example.myuts_15030030;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HasilActivity extends AppCompatActivity {

    //Deklarasi Variabel
    TextView tampil_nim, tampil_nama, tampil_kelas;
    EditText Tanggal, Matakuliah, Sks, Sifat_ujian, Program_studi, dosen_pengampu;
    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //Inisialisasi Program
        tampil_nim =(TextView) findViewById(R.id.tampilnim);
        tampil_nama =(TextView) findViewById(R.id.tampilnama);
        tampil_kelas =(TextView) findViewById(R.id.tampilkelas);
        Tanggal = (EditText) findViewById(R.id.tanggal);
        Matakuliah = (EditText) findViewById(R.id.editmatakuliah);
        Sks = (EditText) findViewById(R.id.editsks);
        Sifat_ujian = (EditText) findViewById(R.id.editsifatujian);
        Program_studi = (EditText) findViewById(R.id.editprogramstudi);
        dosen_pengampu = (EditText) findViewById(R.id.editdosenpengampu);
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        String nim = getIntent().getExtras().getString("nim");
        String nama = getIntent().getExtras().getString("nama");
        String jenisKelas = getIntent().getExtras().getString("jenisKelas");

        //Ngeset Text kedalam viewnya
        tampil_nim.setText(nim);
        tampil_nama.setText(nama);
        tampil_kelas.setText(jenisKelas);






    }

    private void showDateDialog() {
        Calendar calendar = Calendar.getInstance();

        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, month, dayOfMonth);
                Tanggal.setText(dateFormat.format(newDate.getTime()));
            }

        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    public void masuk(View view) {


        Intent data = new Intent(this, Tampil_Data.class);
        data.putExtra("tampil_nim", tampil_nim.getText().toString());
        data.putExtra("tampil_nama", tampil_nama.getText().toString());
        data.putExtra("tampil_kelas", tampil_kelas.getText().toString());
        data.putExtra("Tanggal", Tanggal.getText().toString());
        data.putExtra("Matakuliah", Matakuliah.getText().toString());
        data.putExtra("Sks", Sks.getText().toString());
        data.putExtra("Sifat_ujian", Sifat_ujian.getText().toString());
        data.putExtra("Program_studi", Program_studi.getText().toString());
        data.putExtra("dosen_pengampu", dosen_pengampu.getText().toString());
        startActivity(data);

    }
}