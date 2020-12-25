package com.nghia.pvn.kiemtra3;
import java.io.Serializable;

public class product implements Serializable {
    private String ten;
    private int hinh;
    private String gia;

    public product(String ten, int hinh, String gia) {
        this.ten = ten;
        this.hinh = hinh;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGia() {
        return gia;
    }
}
