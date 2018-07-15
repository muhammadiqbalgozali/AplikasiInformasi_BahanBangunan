package com.example.iqbalgozali.tokbangunan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class contex extends AppCompatActivity {
    private Context mcontext;
    private Activity mactivity;
    private RelativeLayout mreal;
    private Button pilih, pengaplikasian, about, anggranRM,anggaranPK;
    private PopupWindow mpopup;
    ImageView slide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Menu");
        setContentView(R.layout.activity_contex);
mcontext = getApplication();
        mactivity = contex.this;
        mreal = (RelativeLayout) findViewById(R.id.activity_contex);
        pilih = (Button) findViewById(R.id.pilih);
        pengaplikasian = (Button) findViewById(R.id.app);
        about = (Button) findViewById(R.id.about);
        anggranRM = (Button) findViewById(R.id.AB);
        anggaranPK = (Button)findViewById(R.id.AT);

        slide = (ImageView)findViewById(R.id.image);
        slide.setBackgroundResource(R.drawable.slideshow);
        AnimationDrawable frameAnimation = (AnimationDrawable) slide
                .getBackground();
        //Menjalankan File Animasi
        frameAnimation.start();
        anggaranPK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PK = new Intent(getApplicationContext(),AnggaranPekerja.class);
                startActivity(PK);
            }
        });

        anggranRM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RM = new Intent(getApplicationContext(), Anggaran.class);
                startActivity(RM);
            }
        });

        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pilih_barang.class);
                startActivity(i);
            }
        });
        pengaplikasian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater Lapp = (LayoutInflater) mcontext.getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = Lapp.inflate(R.layout.popup_aplikasi,null);

                mpopup = new PopupWindow(
                        customView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );
                if(Build.VERSION.SDK_INT>=21){
                    mpopup.setElevation(5.0f);
                }
                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mpopup.dismiss();

                    }
                });

                mpopup.showAtLocation(mreal, Gravity.CENTER,0,0);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = inflater.inflate(R.layout.popup_about,null);


                mpopup = new PopupWindow(
                        customView,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );
                if(Build.VERSION.SDK_INT>=22){
                    mpopup.setElevation(5.0f);
                }

                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mpopup.dismiss();

                    }
                });
                mpopup.showAtLocation(mreal, Gravity.CENTER,0,0);

            }
        });
    }
}
