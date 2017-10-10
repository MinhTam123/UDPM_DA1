/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrator
 */
public class DTO_SanPham {
    
        int MaSP, MaLoai, SoLuong;
        String Ten, MoTa;
        double Gia;

    public DTO_SanPham(int MaLoai, int SoLuong, String Ten, String MoTa, double Gia) {
        this.MaLoai = MaLoai;
        this.SoLuong = SoLuong;
        this.Ten = Ten;
        this.MoTa = MoTa;
        this.Gia = Gia;
    }

        public DTO_SanPham() {
        }

        public DTO_SanPham(int MaSP, int MaLoai, int SoLuong, String Ten, String MoTa, double Gia) {
            this.MaSP = MaSP;
            this.MaLoai = MaLoai;
            this.SoLuong = SoLuong;
            this.Ten = Ten;
            this.MoTa = MoTa;
            this.Gia = Gia;
        }

        public int getMaSP() {
            return MaSP;
        }

        public void setMaSP(int MaSP) {
            this.MaSP = MaSP;
        }

        public int getMaLoai() {
            return MaLoai;
        }

        public void setMaLoai(int MaLoai) {
            this.MaLoai = MaLoai;
        }

        public int getSoLuong() {
            return SoLuong;
        }

        public void setSoLuong(int SoLuong) {
            this.SoLuong = SoLuong;
        }

        public String getTen() {
            return Ten;
        }

        public void setTen(String Ten) {
            this.Ten = Ten;
        }

        public String getMoTa() {
            return MoTa;
        }

        public void setMoTa(String MoTa) {
            this.MoTa = MoTa;
        }

        public double getGia() {
            return Gia;
        }

        public void setGia(double Gia) {
            this.Gia = Gia;
        }

    }
