package com.example.demo1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class Activity3 extends AppCompatActivity {
    EditText medtTen, medtDC, medtSDT;
    RadioGroup mrdgGT;
    RadioButton mrdNam, mrdNu;
    Button mbtnThoat2, mbtnLuu;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_nhan);
        medtTen=(EditText) findViewById(R.id.edtTen);
        medtDC=(EditText) findViewById(R.id.edtDiaChi);
        medtSDT=(EditText) findViewById(R.id.edtSDT);
        mrdgGT=(RadioGroup) findViewById(R.id.rdgGT);
        mrdNam=(RadioButton) findViewById(R.id.rdNam);
        mrdNu=(RadioButton) findViewById(R.id.rdNu);
        mbtnThoat2=(Button) findViewById(R.id.btnThoat2);
        mbtnLuu=(Button) findViewById(R.id.btnLuu);
        mbtnThoat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Activity3.this);
                builder.setTitle("Bạn có muốn thoát!!!");
                builder.setNegativeButton("Hủy", null);
                builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.show();
            }
        });
        mbtnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity3.this,"Bạn đã lưu thành công!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
