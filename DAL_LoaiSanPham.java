/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.DTO_LoaiSanPham;
import DTO.DTO_Quyen;
import DTO.DTO_NguoiDung;
import GUI_Form_Lab2.Lab2_735_821;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class DAL_LoaiSanPham {
    
    public static int Them_LoaiSP(DTO_LoaiSanPham item){
        String cauTruyVan = "insert into LoaiSanPham values ( N'"+item.getTen()+"',N'"+item.getMoTa()+"')";
        
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);
          
        return result;
    }
    public static int Xoa_LoaiSP( String MaLoai){
        String cauTruyVan = "delete LoaiSanPham where MaLoai = "+MaLoai;
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);
          
        return result;
    }
     public static int Sua_LoaiSP(DTO_LoaiSanPham item){
         String cauTruyVan = "update LoaiSanPham set  Ten = N'"+item.getTen()+"',"
                 + " MoTa= N'"+item.getMoTa()+"' where MaLoai = "+item.getMaLoai()+"";
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);
        
        return result;
    }
    public static ResultSet getAllLoaiSanPham(){
        String query = "Select * from LoaiSanPham";
        return Lab2_735_821.conn.ExcuteQuerySelect(query);
    }
  
}
