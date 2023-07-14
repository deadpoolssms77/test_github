package com.example.demo1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity_ChuyenXe extends AppCompatActivity {

    ListView mlv;
    Button btnBack;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tuyenxe_activity);
        mlv =findViewById(R.id.listView_tuyenXe);
        btnBack=findViewById(R.id.btn_back_tuyenXe);
        ArrayList<TuyenXe> arrayList = new ArrayList<TuyenXe>();
        Adapter_TuyenXe adapter_tuyenXe = new Adapter_TuyenXe(Activity_ChuyenXe.this, R.layout.layout_tuyenxe, arrayList);
        mlv.setAdapter(adapter_tuyenXe);
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        arrayList.add(new TuyenXe("Hà Nội","TPHCM", 3600));
        adapter_tuyenXe.notifyDataSetChanged();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
