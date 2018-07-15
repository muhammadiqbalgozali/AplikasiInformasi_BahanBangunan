package com.example.iqbalgozali.tokbangunan.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.iqbalgozali.tokbangunan.R;
import java.io.IOException;
import java.io.InputStream;

public class tools extends AppCompatActivity {
    ListView lv_tools;
    TextView mText;
    String[] listproduk = new String[]{"Advance Mechanical Tool set Krisbow 6pcs - Rp2000.000","Air Chipping Hammer - Rp740.000",
            "Air Dirl Krisbow 3/8IN - Rp910.000","Mesi Gergaji Makita 4327M - Rp 830.000","Mesin Pemotong DeWALT D28720  - Rp2.369.000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        lv_tools = (ListView) findViewById(R.id.listview);
        getSupportActionBar().setTitle("Produk Tools");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listproduk);
        lv_tools.setAdapter(adapter);
        mText = (TextView) findViewById(R.id.text);
        loadDataFromAsset();
    }
    public void loadDataFromAsset() {
        // load text
        try {
            // get input stream for text
            InputStream is = getAssets().open("tools.txt");
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
