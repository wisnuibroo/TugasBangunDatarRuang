package com.example.tugasbangundatarruang;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class persegipanjang extends AppCompatActivity {

    EditText txtAngka1, txtAngka2;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        txtAngka1 = findViewById(R.id.txtAngka1);
        txtAngka2 = findViewById(R.id.txtAngka2);
        tvHasil = findViewById(R.id.tvHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String panjangPengguna = txtAngka1.getText().toString();
                String lebarPengguna = txtAngka2.getText().toString();

                if (panjangPengguna.isEmpty() || lebarPengguna.isEmpty()) {
                    Toast.makeText(persegipanjang.this, "Masukkan panjang dan lebar", Toast.LENGTH_SHORT).show();
                    return;
                }

                double panjang = Double.parseDouble(panjangPengguna);
                double lebar = Double.parseDouble(lebarPengguna);

                double luas = panjang * lebar;

                tvHasil.setText("Luas Persegi Panjang: " + luas);
            }
        });


        Log.d("PersegiPanjangActivity", "Activity PersegiPanjang telah dibuka");

        // Tambahkan pesan Toast untuk menampilkan pesan kepada pengguna
        Toast.makeText(this, "Activity Persegi Panjang telah dibuka", Toast.LENGTH_SHORT).show();
    }
}
