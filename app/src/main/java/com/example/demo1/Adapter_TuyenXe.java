package com.example.demo1;

import static com.example.demo1.R.color.blue;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.Html;
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

public class Adapter_TuyenXe extends ArrayAdapter {
    Activity context = null;
    int layOutID;
    ArrayList<TuyenXe> arr = null;

    public Adapter_TuyenXe(@NonNull Activity context, int resource, @NonNull ArrayList<TuyenXe> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layOutID = resource;
        this.arr = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layOutID, null);
        if (arr.size() > 0 && position >= 0) {
            TextView txt = convertView.findViewById(R.id.txt_item_id_tuyenxe);
            ImageView img = convertView.findViewById(R.id.img_id_tuyenxe_item);
            TuyenXe tuyenXe = arr.get(position);
            txt.setText(tuyenXe.toString());
            String idTuyenXe = "<font color='#0000FF'>" + tuyenXe.getiDTuyenXe() + "</font>";
            txt.setText(Html.fromHtml(idTuyenXe));
            img.setImageResource(R.drawable.bus);
        }
        return convertView;
    }
}
