package com.example.tugasbangundatarruang;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kubus extends AppCompatActivity {

    EditText txtAngka1;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        txtAngka1 = findViewById(R.id.txtAngka1);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String SisiPengguna = txtAngka1.getText().toString();

                if (SisiPengguna.isEmpty()) {
                    Toast.makeText(kubus.this, "Masukkan panjang sisi", Toast.LENGTH_SHORT).show();
                    return;
                }

                double sisi = Double.parseDouble(SisiPengguna);
                double luas = 6 * Math.pow(sisi, 2);

                tvHasil.setText("Luas Kubus: " + luas);
            }
        });

        Log.d("KubusActivity", "Activity Kubus telah dibuka");

        // Tambahkan pesan Toast untuk menampilkan pesan kepada pengguna
        Toast.makeText(this, "Activity Kubus telah dibuka", Toast.LENGTH_SHORT).show();
    }
}
