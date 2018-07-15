package com.example.iqbalgozali.tokbangunan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Anggaran extends AppCompatActivity {
EditText Lebar,Panjang,Harga;
    Button hasil;
    TextView biaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Anggaran Bangunan");
        setContentView(R.layout.activity_anggaran);
        Lebar = (EditText)findViewById(R.id.editText);
        Panjang = (EditText)findViewById(R.id.editText2);
        Harga = (EditText)findViewById(R.id.editText3);
        hasil = (Button) findViewById(R.id.button);
        biaya = (TextView)findViewById(R.id.textView8);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String LebarBn = Lebar.getText().toString().trim();
                String PanjangBn = Panjang.getText().toString().trim();
                String HargaBn = Harga.getText().toString().trim();

               int L = Integer.parseInt(LebarBn);
                int P = Integer.parseInt(PanjangBn);
                int H = Integer.parseInt(HargaBn);
                int hasil = L*P;
                int Biaya = hasil*H;

                biaya.setText("Biaya Bangunan :" + Biaya);


            }
        });
    }
}
