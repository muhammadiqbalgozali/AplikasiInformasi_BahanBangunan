package com.example.iqbalgozali.tokbangunan;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private static int splashwaktu = 3000;
    ImageView slideSP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        slideSP = (ImageView)findViewById(R.id.imagesplac);
        slideSP.setBackgroundResource(R.drawable.splach);
        AnimationDrawable frameAnimation = (AnimationDrawable) slideSP
                .getBackground();
        //Menjalankan File Animasi
        frameAnimation.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, contex.class);
                startActivity(i);
                this.finish();
            }
            private void finish() {

            }
        },splashwaktu);
    };
}
