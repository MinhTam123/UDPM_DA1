/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import GUI_Form_Lab2.Lab2_735_821;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class DAL_SanPham {
    
      public static int XoaSP(String maLoai){
     String cauTruyVan = "delete SanPham where MaSP =" +maLoai;
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);
          
        return result;
    }
    public static int ThemSP(DTO_SanPham item){
        String cauTruyVan = "insert into SanPham values (N'"+item.getTen()+"', N'"+item.getMoTa()+"',"+item.getSoLuong()+","+item.getGia()+","+item.getMaLoai()+")";
        
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);
          
        return result;
    }
      public static int SuaSP(DTO_SanPham item) {
        String cauTruyVan = "update SanPham set Ten = N'"+item.getTen()+"',MoTa = N'"+item.getMoTa()+"',Gia = "+item.getGia()+", \n"
                + "SoLuong = "+item.getSoLuong()+", MaLoai = "+item.getMaLoai()+" where MaSP = "+item.getMaSP()+"";

        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);

        return result;
    }
      
        public static ResultSet getAllLoaiSanPham(){
        String query = "Select * from SanPham";
        return Lab2_735_821.conn.ExcuteQuerySelect(query);
    }
}
