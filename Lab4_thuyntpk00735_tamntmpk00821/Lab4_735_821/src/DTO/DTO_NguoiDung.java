/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class DTO_NguoiDung {
    int Ma,MaQuyen,GioiTinh,HoatDong;
    String Ten, MatKhau,HoTen, DiaChi, GhiChu, NgaySinh,timkiem;

    public String getTimkiem() {
        return timkiem;
    }

    public void setTimkiem(String timkiem) {
        this.timkiem = timkiem;
    }

    public DTO_NguoiDung(String timkiem) {
        this.timkiem = timkiem;
    }

    public DTO_NguoiDung() {
    }

    public DTO_NguoiDung(int MaQuyen, int GioiTinh, int HoatDong, String Ten, String MatKhau, String HoTen, String DiaChi, String GhiChu, String NgaySinh) {
        this.MaQuyen = MaQuyen;
        this.GioiTinh = GioiTinh;
        this.HoatDong = HoatDong;
        this.Ten = Ten;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
        this.NgaySinh = NgaySinh;
    }

    public DTO_NguoiDung(int Ma, int MaQuyen, int GioiTinh, int HoatDong, String Ten, String MatKhau, String HoTen, String NgaySinh, String DiaChi, String GhiChu) {
        this.Ma = Ma;
        this.MaQuyen = MaQuyen;
        this.GioiTinh = GioiTinh;
        this.HoatDong = HoatDong;
        this.Ten = Ten;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int Ma) {
        this.Ma = Ma;
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getHoatDong() {
        return HoatDong;
    }

    public void setHoatDong(int HoatDong) {
        this.HoatDong = HoatDong;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}
