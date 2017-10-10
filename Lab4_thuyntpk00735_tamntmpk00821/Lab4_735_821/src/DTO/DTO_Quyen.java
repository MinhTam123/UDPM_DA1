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
public class DTO_Quyen {
int MaQuyen;
String TenQuyen, MoTa;
    public DTO_Quyen() {
    }

    public DTO_Quyen(int MaQuyen, String TenQuyen, String MoTa) {
        this.MaQuyen = MaQuyen;
        this.TenQuyen = TenQuyen;
        this.MoTa = MoTa;
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String TenQuyen) {
        this.TenQuyen = TenQuyen;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
}
