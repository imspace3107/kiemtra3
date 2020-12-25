package com.nghia.pvn.kiemtra3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGrid extends ArrayAdapter < String > {

    private final Activity context;
    private final String[] title;
    private final String[] tv;
    private final Integer[] imageId;

    public CustomGrid(Activity context, String[] web, String[] cs, Integer[] imageId)
    {
        super(context, R.layout.list, web);
        this.context = context;
        this.title = web;
        this.tv = cs;
        this.imageId = imageId;

    }@Override
    public View getView(int position, View view, ViewGroup parent)
    {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.grid, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.t1);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.t2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.h);

        txtTitle.setText(title[position]);
        txtTitle2.setText(tv[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;

    }
}