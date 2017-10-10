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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Yuuki Nguyen
 */
public class BLL_LoaiSanPham {
    
    public static int Them_LoaiSP ( String Ten, String MoTa){
        if (Check( Ten, MoTa)){
                       
            
            DTO_LoaiSanPham item = new DTO_LoaiSanPham(Ten, MoTa);
            System.out.println("Thêm thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã thêm thành công !");
            return DAL_LoaiSanPham.Them_LoaiSP(item);
            
        }
        return -1;
    }
     
       /*------------------------------------------------*/
     
    public static int Sua_LoaiSP (String MaLoai,String Ten, String MoTa){
        int Ma;
         if(MaLoai.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Mã Loại");
              return -1;
         }
        else{
             try{
                  Ma = Integer.parseInt(MaLoai);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "Mã Loại phải là số");
              return -1;
             }
    }
          if (Check(Ten, MoTa)){
     
            
            DTO_LoaiSanPham item = new DTO_LoaiSanPham(Ma,Ten, MoTa);
            System.out.println("Sửa thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã sửa thành công !");
          return DAL_LoaiSanPham.Sua_LoaiSP(item);  
        }
                  return -1;
    }
      
        /*------------------------------------------------*/
      
    public static int Xoa_LoaiSP (ArrayList<String> mangMaLoai){
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
                      DAL_LoaiSanPham.Xoa_LoaiSP(maLoai);
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
            ResultSet rs = DAL.DAL_LoaiSanPham.getAllLoaiSanPham();

            while(rs.next()){
                int a = table.getRowCount();
                item[0] = a+1;
                item[1] = rs.getString("MaLoai");                
                item[2] = rs.getString("Ten");
                item[3] = rs.getString("MoTa");
              
                table.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi truy vấn: " + ex.getMessage());
        }
    }
     
     public static boolean Check(String Ten, String MoTa){
       
        if (Ten.trim().length() <1 || Ten.trim().length() >50){
           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của tên không hợp lệ");
            return false;
        }
         if(MoTa.trim().length() > 250){
            Lab2_735_821.ThongBao("Thông Báo Lỗi", "Độ dài mô tả quá lớn");
           
              return false;
        }
                  
        return true;
    }


}
