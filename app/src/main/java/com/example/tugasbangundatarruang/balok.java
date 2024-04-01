package com.example.tugasbangundatarruang;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class balok extends AppCompatActivity {

    EditText txtPanjang, txtLebar, txtTinggi;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        txtPanjang = findViewById(R.id.txtAngka1);
        txtLebar = findViewById(R.id.txtAngka2);
        txtTinggi = findViewById(R.id.txtAngka3);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String panjangPengguna = txtPanjang.getText().toString();
                String lebarPengguna = txtLebar.getText().toString();
                String tinggiPengguna = txtTinggi.getText().toString();

                if (panjangPengguna.isEmpty() || lebarPengguna.isEmpty() || tinggiPengguna.isEmpty()) {
                    Toast.makeText(balok.this, "Masukkan panjang, lebar, dan tinggi", Toast.LENGTH_SHORT).show();
                    return;
                }

                double panjang = Double.parseDouble(panjangPengguna);
                double lebar = Double.parseDouble(lebarPengguna);
                double tinggi = Double.parseDouble(tinggiPengguna);

                double luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

                tvHasil.setText("Luas Balok: " + luas);
            }
        });

        Log.d("BalokActivity", "Activity Balok telah dibuka");

        // Tambahkan pesan Toast untuk menampilkan pesan kepada pengguna
        Toast.makeText(this, "Activity Balok telah dibuka", Toast.LENGTH_SHORT).show();
    }
}
