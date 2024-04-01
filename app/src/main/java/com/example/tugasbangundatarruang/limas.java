package com.example.tugasbangundatarruang;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class limas extends AppCompatActivity {

    EditText txtSisi, txtTinggiLimas;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);

        txtSisi = findViewById(R.id.txtAngka1);
        txtTinggiLimas = findViewById(R.id.txtAngka2);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String sisiStr = txtSisi.getText().toString();
                String tinggiLimasStr = txtTinggiLimas.getText().toString();

                if (sisiStr.isEmpty() || tinggiLimasStr.isEmpty()) {
                    Toast.makeText(limas.this, "Masukkan nilai sisi dan tinggi limas", Toast.LENGTH_SHORT).show();
                    return;
                }

                double sisi = Double.parseDouble(sisiStr);
                double tinggiLimas = Double.parseDouble(tinggiLimasStr);

                double luasAlas = Math.pow(sisi, 2); // Rumus luas persegi
                double luasSelubung = 4 * sisi * tinggiLimas; // Ada 4 sisi pada limas segi empat

                double luasTotal = luasAlas + luasSelubung;

                tvHasil.setText("Luas Permukaan Limas Segi Empat: " + luasTotal);
            }
        });

        Log.d("LimasSegiEmpatActivity", "Activity Limas Segi Empat telah dibuka");

        // Tambahkan pesan Toast untuk menampilkan pesan kepada pengguna
        Toast.makeText(this, "Activity Limas Segi Empat telah dibuka", Toast.LENGTH_SHORT).show();
    }
}
