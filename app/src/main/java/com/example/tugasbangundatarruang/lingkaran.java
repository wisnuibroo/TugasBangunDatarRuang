package com.example.tugasbangundatarruang;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class lingkaran extends AppCompatActivity {

    EditText txtAngka1;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        txtAngka1 = findViewById(R.id.txtAngka1);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariPengguna = txtAngka1.getText().toString();

                if (jariJariPengguna.isEmpty()) {
                    Toast.makeText(lingkaran.this, "Masukkan panjang jari-jari", Toast.LENGTH_SHORT).show();
                    return;
                }

                double jariJari = Double.parseDouble(jariJariPengguna);
                double luas = Math.PI * jariJari * jariJari;

                tvHasil.setText("Luas Lingkaran: " + luas);
            }
        });

        Log.d("LingkaranActivity", "Activity Lingkaran telah dibuka");

        // Tambahkan pesan Toast untuk menampilkan pesan kepada pengguna
        Toast.makeText(this, "Activity Lingkaran telah dibuka", Toast.LENGTH_SHORT).show();
    }
}
