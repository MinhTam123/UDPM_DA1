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
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuuki Nguyen
 */
public class BLL_NguoiDung {
    
    
//      public static int Them_ND(String Ten,String MatKhau,String HoTen){
//        if (HoTen.trim().length() <1 || Ten.trim().length() >30){
//           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của tên không hợp lệ");
//            return -1;
//        }
//        else if((Ten.trim().length() < 1) || (MatKhau.length() < 1)){
//            Lab2_735_821.ThongBao("Thông Báo Lỗi", "Vui lòng không để trống tên "
//                    + "đăng nhập và mật khẩu");
//           
//              return -1;
//        }
//        else{
//            System.out.println("Thêm thành công");
//            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã thêm thành công !");
//            DTO_NguoiDung item = new DTO_NguoiDung();
//            return DAL_NguoiDung.Them_ND(item);
//        }
//    }
      
        public static int Them_ND (String MaQuyen,int GioiTinh,String HoatDong,String TenDN, String MatKhau,String Ten,
                 String Ngaysinh,String DiaChi,String MoTa){
        
          if (Check( MaQuyen, GioiTinh, HoatDong, TenDN,  MatKhau, Ten,
                  Ngaysinh, DiaChi,MoTa)){
     
            
            DTO_NguoiDung item = new DTO_NguoiDung(Integer.parseInt(MaQuyen),GioiTinh,Integer.parseInt(HoatDong)
                    ,TenDN,MatKhau,Ten,DiaChi,MoTa,Ngaysinh);
            System.out.println("Thêm thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã thêm thành công !");
          return DAL_NguoiDung.Them_ND(item);  
        }
                  return -1;
    }         
      /*------------------------------------------------*/    
        public static int Sua_ND (String ID,String MaQuyen,int GioiTinh,String HoatDong,String TenDN, String MatKhau,String Ten,
                 String Ngaysinh,String DiaChi,String MoTa){
       
         if(ID.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có ID người dùng");
              return -1;
         }
        else{
             try{
                  Integer.parseInt(ID);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "ID phải là số");
              return -1;
             }
    }
          if (Check( MaQuyen, GioiTinh, HoatDong, TenDN,  MatKhau, Ten,
                  Ngaysinh, DiaChi,MoTa)){
     
            
            DTO_NguoiDung item = new DTO_NguoiDung(Integer.parseInt(ID),Integer.parseInt(MaQuyen),GioiTinh,Integer.parseInt(HoatDong)
                    ,TenDN,MatKhau,Ten,Ngaysinh,DiaChi,MoTa);
            System.out.println("Sửa thành công");
            Lab2_735_821.ThongBaoOK("Thông Báo Thành công", "Đã sửa thành công !");
          return DAL_NguoiDung.Sua_ND(item);  
        }
      return -1;
    }
          /*------------------------------------------------*/
        public static int Xoa_ND (ArrayList<String> mangMaLoai){
         int rs =-1;
          for( int i = 0; i <mangMaLoai.size(); i++){
           String maLoai = mangMaLoai.get(i);
                   
           if(0 == mangMaLoai.size()){
               
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Mã người dùng");
              return rs;
              
           }else{
                try{
                      Integer.parseInt(maLoai);
                      System.out.println("Xóa thành công");
                      DAL_NguoiDung.Xoa_ND(maLoai);
                }
                catch(Exception e){
                     Lab2_735_821.ThongBao("Thông Báo Lỗi", "Mã ND phải là số");
                 
                }
            }
        }
     
                
           
        return rs;    // Lựa chọn là No       
     }   
        
            
        public static void  DuLieuDatabase( DefaultTableModel table){

                Object[] item = new Object[11]; // tạo mảng

                table.setRowCount(0); // set lại số dòng của bảng về 0

                try {
                   // Lấy dữ liệu LoaiSanPham bằng hàm bên DAL
                    ResultSet rs = DAL.DAL_NguoiDung.getAllLoaiSanPham();

                    while(rs.next()){
                        int a = table.getRowCount();
                        item[0] = a+1;
                        item[1] = rs.getString("Ma");
                        item[2] = rs.getString("Ten");
                        item[3] = rs.getString("MatKhau");
                        item[4] = rs.getString("HoTen");
                        item[5] = rs.getString("MaQuyen");
                        item[6] = rs.getString("GioiTinh"); 
                        item[7] = DateFormatString.getDateString(rs.getDate("NgaySinh"));               
                        item[8] = rs.getString("HoatDong");
                        item[9] = rs.getString("DiaChi");
                        item[10]= rs.getString("GhiChu");              
                        table.addRow(item);
                    }
                } catch (SQLException ex) {
                    System.out.println("lỗi truy vấn: " + ex.getMessage());
                }
            }

        public static boolean Check(String MaQuyen,int GioiTinh,String HoatDong,String TenDN, String MatKhau,String Ten,
                                    String Ngaysinh,String DiaChi,String MoTa){
       
        if (Ten.trim().length() <1 || Ten.trim().length() >50){
           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của tên không hợp lệ");
            return false;
        }
         if (TenDN.trim().length() <1 || TenDN.trim().length() >15 
                 ||MatKhau.trim().length() <1 || MatKhau.trim().length() >15){
           Lab2_735_821.ThongBao("Thông Báo lỗi", "Độ dài của tên đăng nhập hoặc mật khẩu không hợp lệ");
            return false;
        }
         if(MoTa.trim().length() > 250){
            Lab2_735_821.ThongBao("Thông Báo Lỗi", "Độ dài mô tả quá lớn");
           
              return false;
        }
        if(HoatDong.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Hoạt động người dùng");
              return false;
         }
        else{
             try{
                 Integer.parseInt(HoatDong);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "Hoạt động phải là số");
              return false;
             }
    } 
         
        
         if(MaQuyen.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Mã Quyền người dùng");
              return false;
         }
        else{
             try{
                 Integer.parseInt(MaQuyen);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "Mã Quyền phải là số");
              return false;
             }
    }
         if(Ngaysinh.trim().equals("")){
              Lab2_735_821.ThongBao("Thông Báo Lỗi", "Chưa có Ngày Sinh người dùng");
              return false;
         }
        else{
             try{
                 DateFormatString.getDate(Ngaysinh);
              }
             catch(Exception e){
                  Lab2_735_821.ThongBao("Thông Báo Lỗi", "Ngày Sinh phải là số");
              return false;
             }
    }
        return true;
    }

        public static void DoDuLieuVaoCombobox(DefaultComboBoxModel cbbModel){
        try {
              ResultSet rs = DAL.DAL_Quyen.getAllLoaiSanPham();
           // DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
            while(rs.next()){
                MyCombobox item = new MyCombobox(rs.getString("TenQuyen"), 
                        rs.getString("MaQuyen"));
                cbbModel.addElement(item);
            }            
            
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn" + ex.getMessage());
        }
    }
        
        
        public static  ResultSet TimKiem(String timkiem){
      
        ResultSet rs;
        rs = DAL_NguoiDung.TimKiem(timkiem);
        return rs;

       
    }
         public static void  DODuLieuTimKiem( ResultSet rs, JTable bang){

                Object[] item = new Object[11]; // tạo mảng
                DefaultTableModel table = (DefaultTableModel)bang.getModel();

                table.setRowCount(0); // set lại số dòng của bảng về 0

                try {
                   // Lấy dữ liệu LoaiSanPham bằng hàm bên DAL
                    
                    while(rs.next()){
                        int a = table.getRowCount();
                        item[0] = a+1;
                        item[1] = rs.getString("Ma");
                        item[2] = rs.getString("Ten");
                        item[3] = rs.getString("MatKhau");
                        item[4] = rs.getString("HoTen");
                        item[5] = rs.getString("MaQuyen");
                        item[6] = rs.getString("GioiTinh"); 
                        item[7] = DateFormatString.getDateString(rs.getDate("NgaySinh"));               
                        item[8] = rs.getString("HoatDong");
                        item[9] = rs.getString("DiaChi");
                        item[10]= rs.getString("GhiChu");              
                        table.addRow(item);
                    }
                } catch (SQLException ex) {
                    System.out.println("lỗi truy vấn: " + ex.getMessage());
                }
            }
}
