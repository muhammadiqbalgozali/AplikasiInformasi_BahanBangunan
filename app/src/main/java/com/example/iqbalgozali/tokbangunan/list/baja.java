package com.example.iqbalgozali.tokbangunan.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.iqbalgozali.tokbangunan.R;
import java.io.IOException;
import java.io.InputStream;

public class baja extends AppCompatActivity {
    ListView lv_baja;
    String[] listproduk = new String[]{"BMT Truss SNI 6m - Rp 57.000","AlfaPrima Truss SNI 6m - Rp 65.000",
            "Taso Truss SNI 6m - Rp 80.000","CBM Truss SNI 6m - Rp 76.000","HS Truss SNI 6m  - Rp 62.000"};

    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Produk Baja");
        setContentView(R.layout.activity_baja);
        lv_baja = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listproduk);
        lv_baja.setAdapter(adapter);
        mText = (TextView) findViewById(R.id.text);
        loadDataFromAsset();
    }
    public void loadDataFromAsset() {
        // load text
        try {
            // get input stream for text
            InputStream is = getAssets().open("baja.txt");
            // check size
            int size = is.available();
            // create buffer for IO
            byte[] buffer = new byte[size];
            // get data to buffer
            is.read(buffer);
            // close stream
            is.close();
            // set result to TextView
            mText.setText(new String(buffer));
        }
        catch (IOException ex) {
            return;
        }

    }
}
