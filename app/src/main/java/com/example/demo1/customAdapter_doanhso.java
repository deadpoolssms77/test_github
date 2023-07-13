package com.example.demo1;

import android.app.Activity;
import android.content.Context;
import android.telephony.ims.RcsUceAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class customAdapter_doanhso extends ArrayAdapter {
    Activity context = null;
    ArrayList<String> myArry = null;
    int layoutid;

    public customAdapter_doanhso(Activity context, int resource, ArrayList<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutid = resource;
        this.myArry = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutid, null);
        if (myArry.size() > 0 && position >= 0) {
            TextView txt = (TextView) convertView.findViewById(R.id.txt_item);
            ImageView img = (ImageView) convertView.findViewById(R.id.img_item);
            String string = myArry.get(position);
            txt.setText(string);
            img.setImageResource(R.drawable.money);
        }
        return convertView;
    }
}
