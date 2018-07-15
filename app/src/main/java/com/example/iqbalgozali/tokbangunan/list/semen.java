package com.example.iqbalgozali.tokbangunan.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.iqbalgozali.tokbangunan.R;

import java.io.IOException;
import java.io.InputStream;

public class semen extends AppCompatActivity {
ListView lv_semen;
    String[] listproduk = new String[]{"Semen tiga roda 1kg - Rp3000","SEMEN TIGA RODA 5 KG - Rp15000",
            "SEMEN TIGA RODA 10 KG - Rp30000","SEMEN TIGA RODA 15 KG - 45000","SEMEN TIGA RODA 50 KG  - Rp150000"};

    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Produk Semen");
        setContentView(R.layout.activity_semen);
        lv_semen = (ListView) findViewById(R.id.listview);
        mText = (TextView) findViewById(R.id.text);
        loadDataFromAsset();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listproduk);
        lv_semen.setAdapter(adapter);

    }
    public void loadDataFromAsset() {
        try {
            InputStream is = getAssets().open("semen.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            mText.setText(new String(buffer));
        }
        catch (IOException ex) {
            return;
        }
    }
}

