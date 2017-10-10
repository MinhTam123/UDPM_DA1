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
public class BLL_SanPham {
    
//    public static int Them_SanPham(String Ten, String MoTa){
//        if (Ten.trim().length() <1 || Ten.trim().length() >50){
//           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của tên không hợp lệ");
//            return -1;
//        }
//        else if(MoTa.trim().length() > 250){
//            Lab2_735_821.ThongBao("Thông Báo Lỗi", "Độ dài mô tả quá lớn");
//           
//              return -1;
//        }
//       
//        // Check Giá, Số lượng
//        
//        
//        else{
//           System.out.println("Thêm thành công");
//            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã thêm thành công !");
//            DTO_SanPham item = new DTO_SanPham();
//            return DAL_SanPham.ThemSP(item);
//        }
//    }
//    
     public static int Them_SanPham ( String MaLoai,String SoLuong,String Ten, String MoTa,String Gia){
        if (Check(MaLoai,SoLuong, Ten, MoTa,Gia)){                       
            
            DTO_SanPham item = new DTO_SanPham(Integer.parseInt(MaLoai),Integer.parseInt(SoLuong), Ten, MoTa,Double.parseDouble(Gia));
            System.out.println("Thêm thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã thêm thành công !");
            return DAL_SanPham.ThemSP(item);
            
        }
        return -1;
    }
    
     public static int Sua_SanPham (String MaSP, String MaLoai,String SoLuong,String Ten, String MoTa,String Gia){
        int Ma;
         if(MaSP.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Mã Loại");
              return -1;
         }
        else{
             try{
                  Ma = Integer.parseInt(MaSP);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "Mã Loại phải là số");
              return -1;
             }
    }
         if (Check(MaLoai,SoLuong, Ten, MoTa,Gia)){                       
            
            DTO_SanPham item = new DTO_SanPham(Ma,Integer.parseInt(MaLoai),Integer.parseInt(SoLuong), Ten, MoTa,Double.parseDouble(Gia));
            System.out.println("Sửa thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã sửa thành công !");
            return DAL_SanPham.SuaSP(item);
            
        }
        return -1;
    }
       /*------------------------------------------------*/
      
     public static int Xoa_SanPham (ArrayList<String> mangMaLoai){
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
                      DAL_SanPham.XoaSP(maLoai);
                }
                catch(Exception e){
                     Lab2_735_821.ThongBao("Thông Báo Lỗi", "Mã Loại phải là số");
                 
                }
            }
        }
            return rs;
     }
    
    public static void  DuLieuDatabase( DefaultTableModel table){
        
        Object[] item = new Object[7]; // tạo mảng
        
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
           // Lấy dữ liệu LoaiSanPham bằng hàm bên DAL
            ResultSet rs = DAL.DAL_SanPham.getAllLoaiSanPham();

            while(rs.next()){
                int a = table.getRowCount();
                item[0] = a+1;
                item[1] = rs.getString("MaSP");
                item[2] = rs.getString("Ten");
                item[3] = rs.getString("MoTa");              
                item[4] = rs.getString("SoLuong");
                item[5] = rs.getString("Gia");
                item[6] = rs.getString("MaLoai");
                
              
                table.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi truy vấn: " + ex.getMessage());
        }
    }
 
    
   public static boolean Check( String MaLoai,String SoLuong,String Ten, String MoTa,String Gia){
       
        if (Ten.trim().length() <1 || Ten.trim().length() >50){
           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của Tên SP không hợp lệ");
            return false;
        }
         
         if(MoTa.trim().length() > 250){
            Lab2_735_821.ThongBao("Thông Báo Lỗi", "Độ dài mô tả quá lớn");
           
              return false;
        }
         if(SoLuong.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Số lượng");
              return false;
         }
        else{
             try{
                   Integer.parseInt(SoLuong);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "SL phải là số");
              return false;
             }
    }
         
          if(Gia.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Giá");
              return false;
         }
        else{
             try{
                   Double.parseDouble(Gia);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "Giá phải là số");
              return false;
             }
    }
                  
        return true;
    }
}
