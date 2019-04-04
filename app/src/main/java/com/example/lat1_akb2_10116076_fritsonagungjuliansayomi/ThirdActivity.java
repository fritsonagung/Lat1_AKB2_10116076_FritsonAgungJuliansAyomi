package com.example.lat1_akb2_10116076_fritsonagungjuliansayomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    public EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        et1 = (EditText) findViewById(R.id.ET1);
        Button button1 = findViewById(R.id.BT1);

        button1.setOnClickListener(new View.OnClickListener()
        {
             @Override
             public void onClick(View v){
                 String nama = et1.getText().toString();
                 Intent start = new Intent(ThirdActivity.this, FourthActivity.class);
                 start.putExtra("StringNama",nama);
                 startActivity(start);
             }
         });
        }
    }


