package com.example.iqbalgozali.tokbangunan;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.iqbalgozali.tokbangunan.list.baja;
import com.example.iqbalgozali.tokbangunan.list.cat;
import com.example.iqbalgozali.tokbangunan.list.keramik;
import com.example.iqbalgozali.tokbangunan.list.palaron;
import com.example.iqbalgozali.tokbangunan.list.semen;
import com.example.iqbalgozali.tokbangunan.list.tools;
public class pilih_barang extends AppCompatActivity {
        private ListView lv;
    String Kategori[]={"Semen", "Pralon", "Keramik", "Baja", "Cat", "Alat Tools"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Produk");
        setContentView(R.layout.activity_pilih_barang);

        lv = (ListView) findViewById(R.id.ListView);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Kategori);

        // set data

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) lv.getItemAtPosition(position);

                switch (itemPosition) {
                    case 0:
                        Intent sm = new Intent(pilih_barang.this, semen.class);
                        startActivity(sm);
                        break;

                    case 1:
                        Intent pla = new Intent(pilih_barang.this, palaron.class);
                        startActivity(pla);
                        break;

                    case 2:
                        Intent km = new Intent(pilih_barang.this, keramik.class);
                        startActivity(km);
                        break;
                    case 3:
                        Intent bj = new Intent(pilih_barang.this, baja.class);
                        startActivity(bj);
                        break;

                    case 4:
                        Intent  ct = new Intent(pilih_barang.this, cat.class);
                        startActivity(ct);
                        break;
                    case 5:
                        Intent  at = new Intent(pilih_barang.this, tools.class);
                        startActivity(at);
                        break;

                }
            }
        });
    }
}




