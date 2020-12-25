package com.nghia.pvn.kiemtra3;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.content.*;


import android.os.Bundle;

public class Activity2 extends AppCompatActivity {
    private  TextView ten;
    private ImageView hinh;
    private  TextView gia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acti2);
        Intent intent=getIntent();
        product products=(product) intent.getSerializableExtra("product");
        this.ten=(TextView)findViewById(R.id.ten);
        this.ten.setText(products.getTen());
        this.hinh=(ImageView)findViewById(R.id.hinh);
        this.hinh.setImageResource(products.getHinh());
        this.gia=(TextView)findViewById(R.id.gia);
        this.gia.setText(products.getGia());

    }
}