package com.example.iqbalgozali.tokbangunan.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.iqbalgozali.tokbangunan.R;
import java.io.IOException;
import java.io.InputStream;

public class palaron extends AppCompatActivity {
    ListView lv_plaron;
    String[] listproduk = new String[]{"Pipa Fitting PVC Sock 4cm isi 30 - Rp 10.355","Pipa Fitting PVC Tee3 x 2 isi 30 - Rp 10.915",
            "Pipa Fitting PVC sock drat luar 4 isi 9 - Rp 53.000 ","Pipa Fitting PVC sock drat luar 1|1/4 - Rp 10.355 ",
            "Pipa Fitting PVC Faucet Socket 1x3/4 - Rp 17.750 "};
    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Produk Pralon");
        setContentView(R.layout.activity_palaron);
        lv_plaron = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listproduk);
        lv_plaron.setAdapter(adapter);
        mText = (TextView) findViewById(R.id.text);
        loadDataFromAsset();
    }
    public void loadDataFromAsset() {
        // load text
        try {
            // get input stream for text
            InputStream is = getAssets().open("pralon.txt");
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
