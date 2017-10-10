/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Yuuki Nguyen
 */

// B1: Định nghĩa 1 class MyCOmbobox
// B2: frmSanPham : tạo DefaultComboBoxModel
// B3: Tạo đối tượng MyCombobox chứa gtrij dc lấy từ DTB

public class MyCombobox {
    
    public Object Text; // để hiển thị
    public Object Value; // để xử lí vs databasse
    
    
    public MyCombobox (Object Text, Object Value){
        this.Text = Text;
        this.Value = Value;
    }
    
    @Override
    
    public String toString(){
        return Text.toString();
    }
}
