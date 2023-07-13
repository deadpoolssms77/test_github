package com.example.demo1;

import android.app.Activity;
import android.content.Context;
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

public class adapter_khachHang extends ArrayAdapter {
    Activity context = null;
    int layoutId;
    ArrayList<KhachHang> arr = null;

    public adapter_khachHang(Activity context, int layoutId, ArrayList<KhachHang> arr) {
        super(context, layoutId, arr);
        this.context = context;
        this.layoutId = layoutId;
        this.arr = arr;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutId, null);
        if (arr.size() > 0 && position >= 0) {
            ImageView img = convertView.findViewById(R.id.img_khachHang_item);
            TextView txt = convertView.findViewById(R.id.txt_khachHang_item);
            KhachHang kh = arr.get(position);
            txt.setText(kh.toString());
            if (kh.isGioiTinh())
                img.setImageResource(R.drawable.female);
            else
                img.setImageResource(R.drawable.x);
        }
        return convertView;
    }
}
