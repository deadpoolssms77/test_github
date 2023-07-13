package com.example.demo1;

import androidx.annotation.NonNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    SimpleDateFormat ngaySinhDD = new SimpleDateFormat("dd/MM/yyyy");
    private String hoTen;

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    private Date ngaySinh;
    private boolean gioiTinh;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public KhachHang(String hoTen, String ngaySinh, boolean gioiTinh) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinhDD.parse(ngaySinh);
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
