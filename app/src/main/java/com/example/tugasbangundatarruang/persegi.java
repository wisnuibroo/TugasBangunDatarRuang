package com.example.tugasbangundatarruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persegi extends AppCompatActivity {

    EditText txtAngka1;
    TextView tvHasil;
    Button btnHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        txtAngka1 = findViewById(R.id.txtAngka1);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String SisiPengguna = txtAngka1.getText().toString();

                if (SisiPengguna.isEmpty()) {
                    Toast.makeText(persegi.this, "Masukkan panjang sisi", Toast.LENGTH_SHORT).show();
                    return;
                }

                double panjang = Double.parseDouble(SisiPengguna);
                double luas = panjang * panjang;

                tvHasil.setText("Luas Persegi: " + luas);
            }
        });


        Log.d("PersegiActivity", "Activity Persegi telah dibuka");

        // Tambahkan pesan Toast untuk menampilkan pesan kepada pengguna
        Toast.makeText(this, "Activity Persegi telah dibuka", Toast.LENGTH_SHORT).show();

    }
}