package com.example.scanencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    ImageView imageView;
    TextView tv;

    public static String s = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageView = (ImageView)findViewById(R.id.imageView2);
        tv = (TextView)findViewById(R.id.textView2);

        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("BitmapImage");
        imageView.setImageBitmap(bitmap);

        tv.setText(s);
    }
}