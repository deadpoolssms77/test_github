package com.example.demo1;

import androidx.annotation.NonNull;

public class TuyenXe {
    private int iDTuyenXe;
    private static int nextId=1;
    private String diemDau;
    private String diemDen;
    private double cuLi;

    public TuyenXe(String diemDau, String diemDen, double cuLi) {
        this.setiDTuyenXe(nextId++);
        this.setDiemDau(diemDau);
        this.setDiemDen(diemDen);
        this.setCuLi(cuLi);
    }

    public int getiDTuyenXe() {
        return iDTuyenXe;
    }

    public void setiDTuyenXe(int iDTuyenXe) {
        this.iDTuyenXe = iDTuyenXe;
    }

    public String getDiemDau() {
        return diemDau;
    }

    public void setDiemDau(String diemDau) {
        this.diemDau = diemDau;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public double getCuLi() {
        return cuLi;
    }

    public void setCuLi(double cuLi) {
        this.cuLi = cuLi;
    }

    @NonNull
    @Override
    public String toString() {
        return iDTuyenXe + ". Điểm xuất phát: " + diemDau + "; Điểm đến: " + diemDen + "; Cự li: " + cuLi;
    }
}
