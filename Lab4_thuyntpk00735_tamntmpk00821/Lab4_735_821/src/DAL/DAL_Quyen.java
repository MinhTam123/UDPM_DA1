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
 * @author Yuuki Nguyen
 */
public class DAL_Quyen {
    
      public static int Them_Quyen(DTO_Quyen item){
        String cauTruyVan = "insert into QuyenNguoiDung values ( N'"+item.getTenQuyen()+"',N'"+item.getMoTa()+"')";
        
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);
          
        return result;
    }
      
       public static int Xoa_Quyen(String maLoai) {
        String cauTruyVan = "delete QuyenNguoiDung where MaQuyen = " + maLoai;
        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);

        return result;
    }

    

    public static int Sua_Quyen(DTO_Quyen item) {
        String cauTruyVan = "update QuyenNguoiDung set TenQuyen = N'"+item.getTenQuyen()+"', MoTa =N'"+item.getMoTa()+
                "' where MaQuyen = "+item.getMaQuyen()+"";

        int result = Lab2_735_821.conn.ExcuteNonQuery(cauTruyVan);

        return result;
    }
     public static ResultSet getAllLoaiSanPham(){
        String query = "Select * from QuyenNguoiDung";
        return Lab2_735_821.conn.ExcuteQuerySelect(query);
    }
}
