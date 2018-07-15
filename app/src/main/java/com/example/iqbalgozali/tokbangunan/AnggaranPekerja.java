package com.example.iqbalgozali.tokbangunan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class AnggaranPekerja extends AppCompatActivity {
EditText Volume,HargaPek;
    TextView Lihat;
    Button Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Anggaran Pekerja");
        setContentView(R.layout.activity_anggaran_pekerja);

        Volume = (EditText)findViewById(R.id.VB);
        HargaPek = (EditText)findViewById(R.id.BP);
        Lihat = (TextView)findViewById(R.id.HS);
        Hasil = (Button)findViewById(R.id.BtHs);

        Hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String VolumeBn = Volume.getText().toString().trim();
                String HargaPekBn = HargaPek.getText().toString().trim();

                int V = Integer.parseInt(VolumeBn);
                int H = Integer.parseInt(HargaPekBn);
                int Biaya = V*H;

                Lihat.setText("Biaya Pekerjaan :" + Biaya);

            }
        });
    }
}
