package com.example.tugasbangundatarruang;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class bola extends AppCompatActivity {

    EditText txtJariJari;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        txtJariJari = findViewById(R.id.txtAngka1);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String jariJariPengguna = txtJariJari.getText().toString();

                if (jariJariPengguna.isEmpty()) {
                    Toast.makeText(bola.this, "Masukkan nilai jari-jari bola", Toast.LENGTH_SHORT).show();
                    return;
                }

                double jariJari = Double.parseDouble(jariJariPengguna);

                double luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);

                tvHasil.setText("Luas Permukaan Bola: " + luasPermukaan);

                Log.d("BolaActivity", "Luas Permukaan Bola: " + luasPermukaan);

                Toast.makeText(bola.this, "Luas Permukaan Bola: " + luasPermukaan, Toast.LENGTH_SHORT).show();
            }
        });

        Log.d("BolaActivity", "Activity Bola telah dibuka");

        // Tambahkan pesan Toast untuk memberi tahu pengguna bahwa activity telah dibuka
        Toast.makeText(this, "Activity Bola telah dibuka", Toast.LENGTH_SHORT).show();
    }
}
