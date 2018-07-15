package com.example.iqbalgozali.tokbangunan.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.iqbalgozali.tokbangunan.R;
import java.io.IOException;
import java.io.InputStream;

public class cat extends AppCompatActivity {
    ListView lv_cat;
    String[] listproduk = new String[]{"DULUX 2,5 Ltr - Rp190.000","CATYLAC 5kg - Rp105.000","VINILEX 25KG - Rp445.000","METROLITE 16Ltr - Rp390.000","MOWILEX 20Ltr  - Rp300.000"};
    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Produk Cat");
        setContentView(R.layout.activity_cat);
        lv_cat = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listproduk);
        lv_cat.setAdapter(adapter);
        mText = (TextView) findViewById(R.id.text);
        loadDataFromAsset();
    }
    public void loadDataFromAsset() {
        // load text
        try {
            // get input stream for text
            InputStream is = getAssets().open("cat.txt");
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
