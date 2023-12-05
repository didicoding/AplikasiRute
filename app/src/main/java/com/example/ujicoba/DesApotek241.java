package com.example.ujicoba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class DesApotek241 extends AppCompatActivity {

    ViewFlipper gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_apotek241);
        int images[]={R.drawable.bangun1, R.drawable.bangun2,R.drawable.bangun3,};
        gambar = findViewById(R.id.gambar);

        //loop
        /*for (int i=0; i<image.leght; i++);
        flipperimages(images(i));
         */

        for (int image : images){
            flipperimages(image);
        }
    }
    public void flipperimages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        gambar.addView(imageView);
        gambar.setFlipInterval(9000);
        gambar.setAutoStart(true);
        gambar.setInAnimation(this, android.R.anim.slide_in_left);
        gambar.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}