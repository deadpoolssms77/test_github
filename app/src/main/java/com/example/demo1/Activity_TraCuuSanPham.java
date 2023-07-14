package com.example.demo1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Activity_TraCuuSanPham extends AppCompatActivity {
    EditText edtTraCuu;
    Button btnBack;
    ImageButton btnTraCuu;
    ListView lvSanPham;
    ArrayList<String> arr;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_tracuusanpham);
        btnBack = findViewById(R.id.btn_Back_TCSP);
        btnTraCuu = findViewById(R.id.btn_TraCuu);
        edtTraCuu = findViewById(R.id.edt_TraCuu);
        lvSanPham = findViewById(R.id.lvSanPham);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        arr = new ArrayList<String>();
        adapter = new ArrayAdapter<>(Activity_TraCuuSanPham.this, android.R.layout.simple_list_item_1, arr);
        lvSanPham.setAdapter(adapter);
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Tiger!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        arr.add("Nước giặt omo tẩy trắng siêu tốc!!!");
        adapter.notifyDataSetChanged();
        btnTraCuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoiTraCuu = edtTraCuu.getText().toString();
                timVaHienThiSanPham(chuoiTraCuu);
            }
        });
        edtTraCuu.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String chuoiTraCuu = editable.toString();
                if(chuoiTraCuu.isEmpty())
                {
                    lvSanPham.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }

    public void timVaHienThiSanPham(String chuoiTraCuu) {
        if(edtTraCuu.toString().isEmpty())
        {
            lvSanPham.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }
        else {
            ArrayList<String> sPTuongDoiList = new ArrayList<String>();
            for (String sanpham : arr)
            {
                if (sanpham.contains(chuoiTraCuu))
                    sPTuongDoiList.add(sanpham);
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(Activity_TraCuuSanPham.this, android.R.layout.simple_list_item_1, sPTuongDoiList);
            lvSanPham.setAdapter(arrayAdapter);
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
