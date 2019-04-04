package com.example.lat1_akb2_10116076_fritsonagungjuliansayomi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        String nama = getIntent().getStringExtra("StringNama");

        TextView tv1 = findViewById(R.id.TV1);
        tv1.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    }
}
