package com.example.demo1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText medt_login, medt_password;
    Button mbtnLogin, mbtnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        medt_login = (EditText) findViewById(R.id.edt_login);
        medt_password = (EditText) findViewById(R.id.edt_password);
        mbtnExit = (Button) findViewById(R.id.btn_exit);
        mbtnLogin = (Button) findViewById(R.id.btn_login);
        medt_login.requestFocus();
        mbtnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Bạn có muốn thoát!!!");
                builder.setPositiveButton("Thoát!!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                });
                builder.setNegativeButton("Hủy", null);
                builder.show();
            }
        });
        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (medt_login.getText().toString().isEmpty() || medt_password.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (medt_login.getText().toString().equals("admin") && medt_password.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Tên đăng nhập hoặc mật kẩu không đúng!!!", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}