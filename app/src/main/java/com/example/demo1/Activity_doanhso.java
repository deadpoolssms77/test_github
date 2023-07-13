package com.example.demo1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity_doanhso extends AppCompatActivity {

    ListView lv;
    Button mbtnQuaylai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_thongkedoanhso);
        lv = findViewById(R.id.lv);
        mbtnQuaylai=findViewById(R.id.btn_Quaylai);
        ArrayList<String> arr = new ArrayList<String>();
        customAdapter_doanhso adapter = new customAdapter_doanhso(Activity_doanhso.this, R.layout.custom_layout_doanhso, arr);
        lv.setAdapter(adapter);
        arr.add("Doanh số theo ngày");
        arr.add("Doanh số theo giờ");
        arr.add("Doanh số theo tháng");
        arr.add("Doanh số theo năm");
        arr.add("Doanh số theo sản phẩm");
        arr.add("Doanh số theo quý");
        arr.add("Doanh số theo mã");
        arr.add("Doanh số theo loại sản phẩm");
        arr.add("Doanh số theo doanh nghiệp");
        arr.add("Doanh số theo nhân viên");
        adapter.notifyDataSetChanged();
        mbtnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
