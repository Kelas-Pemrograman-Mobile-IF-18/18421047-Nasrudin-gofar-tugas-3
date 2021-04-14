package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtnilaia,edtnilaib;
    Button btntambah,btnkurang,btnkali,btnbagi;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnilaia = (EditText) findViewById(R.id.edtnilaia);
        edtnilaib = (EditText) findViewById(R.id.edtnilaib);
        txthasil = (TextView) findViewById(R.id.txthasil);
        btntambah = (Button) findViewById(R.id.btntambah);
        btnkurang = (Button) findViewById(R.id.btnkurang);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnbagi = (Button) findViewById(R.id.btnbagi);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaia = Integer.parseInt(edtnilaia.getText().toString());
                int nilaib = Integer.parseInt(edtnilaib.getText().toString());

                int hasil = nilaia + nilaib;
                txthasil.setText(String.valueOf(hasil));

                btnbagi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int nilaia = Integer.parseInt(edtnilaia.getText().toString());
                        int nilaib = Integer.parseInt(edtnilaib.getText().toString());

                        int hasil = nilaia / nilaib;
                        txthasil.setText(String.valueOf(hasil));

                        btnkurang.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                int nilaia = Integer.parseInt(edtnilaia.getText().toString());
                                int nilaib = Integer.parseInt(edtnilaib.getText().toString());

                                int hasil = nilaia - nilaib;
                                txthasil.setText(String.valueOf(hasil));

                                btnkali.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int nilaia = Integer.parseInt(edtnilaia.getText().toString());
                                        int nilaib = Integer.parseInt(edtnilaib.getText().toString());

                                        int hasil = nilaia * nilaib;
                                        txthasil.setText(String.valueOf(hasil));

                                    }
                                });
                            }


                        }}}}}}}