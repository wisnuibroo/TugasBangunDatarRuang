package com.example.tugasbangundatarruang;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class segitiga extends AppCompatActivity {

    EditText txtAngka1, txtAngka2;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        txtAngka1 = findViewById(R.id.txtAngka1);
        txtAngka2 = findViewById(R.id.txtAngka2);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasPengguna = txtAngka1.getText().toString();
                String tinggiPengguna = txtAngka2.getText().toString();


                if (alasPengguna.isEmpty() || tinggiPengguna.isEmpty()) {
                    Toast.makeText(segitiga.this, "Masukkan alas dan tinggi", Toast.LENGTH_SHORT).show();
                    return;
                }

                double alas = Double.parseDouble(alasPengguna);
                double tinggi = Double.parseDouble(tinggiPengguna);

                double luas = 0.5 * alas * tinggi;

                tvHasil.setText("Luas Segitiga: " + luas);
            }
        });

        Log.d("SegitigaActivity", "Activity Segitiga telah dibuka");

        // Tambahkan pesan Toast untuk menampilkan pesan kepada pengguna
        Toast.makeText(this, "Activity Segitiga telah dibuka", Toast.LENGTH_SHORT).show();
    }
}
