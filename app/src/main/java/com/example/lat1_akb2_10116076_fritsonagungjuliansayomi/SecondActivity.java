package com.example.lat1_akb2_10116076_fritsonagungjuliansayomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.text.Html;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button1 = findViewById(R.id.BT1);

        TextView ketentuan = findViewById(R.id.TV3);
        String formattedText = "Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> kami";
        ketentuan.setText(Html.fromHtml(formattedText));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class ));
            }
        });
    }
}
