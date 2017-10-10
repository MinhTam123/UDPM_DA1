/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Tanmtmpk00821
 */
public class DTO_LoaiSanPham {

    int maLoai;
    String Ten, MoTa;

    public DTO_LoaiSanPham() {
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
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

    public DTO_LoaiSanPham(int maLoai, String Ten, String MoTa) {
        this.maLoai = maLoai;
        this.Ten = Ten;
        this.MoTa = MoTa;
    }

    public DTO_LoaiSanPham(String Ten, String MoTa) {
        this.Ten = Ten;
        this.MoTa = MoTa;
    }

}