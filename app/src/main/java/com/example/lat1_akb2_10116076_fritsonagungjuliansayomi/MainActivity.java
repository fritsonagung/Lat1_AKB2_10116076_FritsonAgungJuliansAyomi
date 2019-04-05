package com.example.lat1_akb2_10116076_fritsonagungjuliansayomi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/*
    Nama         : Fritson Agung Julians Ayomi
    NIM          : 10116076
    Kelas        : AKB-2 / IF-2
    Tanggal Buat : 04 April 2019
 */

/*
    CHANGE LOG
    1.  Kamis 4 April 2019 10.30, Membuat Layout Tampilan Awal
    2.  Kamis 4 April 2019 13.40, Membuat Layout Tampilan Kedua
    3.  Kamis 4 April 2019 14.03, Membuat Layout Tampilan Ketiga
    4.  Kamis 4 April 2019 14.32, Membuat Layout Tampilan Keempat
    5.  Kamis 4 April 2019 15.11, Membuat Fungsi Perpindahan Ke Layout Tampilan Kedua
    6.  Kamis 4 April 2019 15.45, Membuat Fungsi Perpindahan Ke Layout Tampilan Ketiga
    7.  Kamis 4 April 2019 16.01, Membuat Fungsi Perpindahan Ke Layout Keempat
    8.  Kamis 4 April 2019 16.30, Membuat Fungsi Pengambilan Variable Nama dan Umur
    9.  Kamis 4 April 2019 18,00, Mengenerate APK file
    10. Jumat 5 April 2019 15.15, Membuat Fungsi Exit Pada Tombol Oke
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.BT1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class ));
            }
        });


    }
}
