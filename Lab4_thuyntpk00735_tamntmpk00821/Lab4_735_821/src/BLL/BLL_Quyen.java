/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.*;
import DTO.*;
import GUI_Form_Lab2.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Yuuki Nguyen
 */
public class BLL_Quyen {
 
//    public static int Them_Quyen(String TenQuyen, String MoTa){
//        if (TenQuyen.trim().length() <1 || TenQuyen.trim().length() >30){
//           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của tên không hợp lệ");
//            return -1;
//        }
//        else if(MoTa.trim().length() > 50){
//            Lab2_735_821.ThongBao("Thông Báo Lỗi", "Độ Dài Quá Lớn");
//           
//              return -1;
//        }
//        else{
//           System.out.println("Thêm thành công");
//            Lab2_735_821.ThongBaoOK("Thêm Báo Thành công", "Đã Thêm thành công !");
//            DTO_Quyen item = new DTO_Quyen();
//        return DAL_Quyen.Them_Quyen(item);
//            
//        }
//    }
    
    
    
     public static int Them_Quyen ( int MaQuyen,String Ten, String MoTa){
        if (Check( Ten, MoTa)){ 
            // Nếu các câu lệnh check được thông qua thì thực hiện lệnh ở dưới                   
            DTO_Quyen item = new DTO_Quyen(MaQuyen,Ten, MoTa);
            System.out.println("Thêm thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã thêm thành công !");
            return DAL_Quyen.Them_Quyen(item);
            
        }
        return -1; // Nếu check gặp lỗi thì không thực hiện câu lệnh,đồng thời quay lại trước khi dữ liệu thay đổi
    }
    
      public static int Sua_Quyen ( int MaQuyen,String Ten, String MoTa){
        if (Check( Ten, MoTa)){
                                  
            DTO_Quyen item = new DTO_Quyen(MaQuyen,Ten, MoTa);
            System.out.println("Sửa thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã sửa thành công !");
            return DAL_Quyen.Sua_Quyen(item);
            
        }
        return -1;
    }
      
       public static int Xoa_Quyen (ArrayList<String> mangMaLoai){
         int rs =-1;
          for( int i = 0; i <mangMaLoai.size(); i++){
           String maLoai = mangMaLoai.get(i);
                   
           if(0 == mangMaLoai.size()){
               
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Mã Loại");
              return rs;
              
           }else{
                try{
                      Integer.parseInt(maLoai);
                      System.out.println("Xóa thành công");
                      DAL_Quyen.Xoa_Quyen(maLoai);
                }
                catch(Exception e){
                     Lab2_735_821.ThongBao("Thông Báo Lỗi", "Mã Loại phải là số");
                 
                }
            }
        }
          return rs;    // Lựa chọn là No     
       }
    
      public static void  DuLieuDatabase( DefaultTableModel table){
        
        Object[] item = new Object[4]; // tạo mảng
        
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
           // Lấy dữ liệu LoaiSanPham bằng hàm bên DAL
            ResultSet rs = DAL.DAL_Quyen.getAllLoaiSanPham();

            while(rs.next()){
                int a = table.getRowCount();
                item[0] = a+1;
                item[1] = rs.getString("MaQuyen");
                item[2] = rs.getString("TenQuyen");                
                item[3] = rs.getString("MoTa");              
                table.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi truy vấn: " + ex.getMessage());
        }
    }
      
      public static boolean Check(String Ten, String MoTa){
       
        if (Ten.trim().length() <1 || Ten.trim().length() >50){ // Nếu Tên nằm ngoài khoảng từ 1 đến 50 thì báo lỗi
           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của tên quyền không hợp lệ");
            return false;
        }
         if(MoTa.trim().length() > 250){
            Lab2_735_821.ThongBao("Thông Báo Lỗi", "Độ dài mô tả quá lớn");
           
              return false;
        }
                  
        return true;
    }

}
