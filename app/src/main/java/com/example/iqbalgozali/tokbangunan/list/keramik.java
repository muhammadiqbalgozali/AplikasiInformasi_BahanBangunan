package com.example.iqbalgozali.tokbangunan.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.iqbalgozali.tokbangunan.R;
import java.io.IOException;
import java.io.InputStream;

public class keramik extends AppCompatActivity {
    ListView lv_keramik;
    String[] listproduk = new String[]{"Keramik Platinum 20x20 alpha blue 25/dos - Rp 42.000","Keramik Platinum 30x30 capri brown 11/dos - Rp 37.000",
            "Keramik Platinum 60x60 fresno 4/dos - Rp 82.300","Keramik Platinum 50x50 ecco grey 4/dos - Rp 70.000","Keramik Arwana warna putih m2 - Rp 65.000"};
    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Produk Keramik");
        setContentView(R.layout.activity_keramik);
        lv_keramik = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listproduk);
        lv_keramik.setAdapter(adapter);
        mText = (TextView) findViewById(R.id.text);
        loadDataFromAsset();
    }
    public void loadDataFromAsset() {
        // load text
        try {
            // get input stream for text
            InputStream is = getAssets().open("keramik.txt");
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

