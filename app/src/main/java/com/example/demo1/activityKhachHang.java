package com.example.demo1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.util.ArrayList;

public class activityKhachHang extends AppCompatActivity {
    ListView mlvKH;
    Button btnQuaylai;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khachhang);
        mlvKH = findViewById(R.id.lv_khachHang);
        btnQuaylai=findViewById(R.id.btn_Quaylai);
        ArrayList<KhachHang> arr =new ArrayList<KhachHang>();
        adapter_khachHang adapter = new adapter_khachHang(activityKhachHang.this, R.layout.custom_layout_khachhang, arr);
        mlvKH.setAdapter(adapter);
        try {
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
            arr.add(new KhachHang("Lê Hồ Trường Vũ", "11/01/2001", true));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        adapter.notifyDataSetChanged();
        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
