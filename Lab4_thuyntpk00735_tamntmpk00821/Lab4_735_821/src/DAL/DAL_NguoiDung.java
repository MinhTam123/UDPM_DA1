/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import BLL.*;
import DTO.*;
import GUI_Form_Lab2.*;
import java.sql.ResultSet;
/**
 *
 * @author Yuuki Nguyen
 */
public class DAL_NguoiDung {
    public static int Them_ND(DTO_NguoiDung item){
        String cauTruyVan = "set dateFormat DMY insert into NguoiDung values (N'" +item.getTen() +"' , N'"+item.getMatKhau()+"' ,N'"
                + item.getHoTen() + "',"+ item.getMaQuyen() + "," + item.getGioiTinh() + ",'"+ item.getNgaySinh() + "',"+item.getHoatDong()+",N'"+item.getDiaChi()+"', N'"+ item.getGhiChu() + "')" ;
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);
          
        return result;
    }
    
    public static int Xoa_ND(String ID) {
        String cauTruyVan = "delete NguoiDung where Ma = " + ID;
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);

        return result;
    }

    public static int Sua_ND(DTO_NguoiDung item) {
        String cauTruyVan = "set dateFormat DMY update NguoiDung set Ten = N'"+item.getTen()+"', MatKhau  = N'"+item.getMatKhau()+"', HoTen = N'"+item.getHoTen()+"',"
                + "MaQuyen = "+item.getMaQuyen()+", GioiTinh = "+item.getGioiTinh()+", NgaySinh = '"+item.getNgaySinh()+"', HoatDong = N'"+item.getHoatDong()+"',"
                + "DiaChi = N'"+item.getDiaChi()+"',GhiChu= N'"+item.getGhiChu()+"' where Ma = "+item.getMa()+"";

        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);

        return result;
    }
    
    public static ResultSet getAllLoaiSanPham(){
        String query = "Select * from NguoiDung";
        return Lab2_735_821.conn.ExcuteQuerySelect(query);
    }
  
   public static  ResultSet TimKiem(String timkiem){
     
        String Seach = "select * from NguoiDung where HoTen like N'%" +timkiem  +"%'"
                + " or DiaChi like N'%"+ timkiem + "%' or Day(NgaySinh) like '%"+ timkiem+"%'";
        
        return Lab2_735_821.conn.ExcuteQuerySelect(Seach);
   }
}
