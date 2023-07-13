package com.example.demo1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    Button btnThoat;
    ImageButton imbKH, imbCaNhan, imbCTBH, imbDST, imbTCSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnThoat = (Button) findViewById(R.id.btn_thoat);
        imbCTBH = (ImageButton) findViewById(R.id.imbtn_CTBH);
        imbKH = (ImageButton) findViewById(R.id.imbtn_khachHang);
        imbCaNhan = (ImageButton) findViewById(R.id.imbtn_caNhan);
        imbDST = (ImageButton) findViewById(R.id.imbtn_danhsachTuyen);
        imbTCSP = (ImageButton) findViewById(R.id.imbtn_TCSP);

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Activity2.this);
                builder.setTitle("Bạn có thực sự muốn thoát?");
                builder.setPositiveButton("Hủy", null);
                builder.setNegativeButton("Đồng ý!!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.show();
            }
        });
        imbCaNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                startActivity(intent);
            }
        });
        imbCTBH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, Activity_doanhso.class);
                startActivity(intent);
            }
        });
        imbKH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, activityKhachHang.class);
                startActivity(intent);
            }
        });
    }
}
