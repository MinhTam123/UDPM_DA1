/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Form_Lab2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import DAL.DBConnection;
/**
 *
 * @author Administrator
 */
public class frm_Main extends javax.swing.JFrame {

    /**
     * Creates new form frmDangNhap
     */
    public frm_Main() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTop = new javax.swing.JPanel();
        LblTitle1 = new javax.swing.JLabel();
        PnlMiddle = new javax.swing.JPanel();
        btnNguoiDung = new javax.swing.JButton();
        btnQuyen = new javax.swing.JButton();
        btnLoaiSanPham = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTop.setBackground(new java.awt.Color(0, 0, 204));

        LblTitle1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        LblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitle1.setText("Quản Lý Sản Phẩm");

        PnlMiddle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.orange));

        btnNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNguoiDung.setText("NGƯỜI DÙNG");
        btnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiDungActionPerformed(evt);
            }
        });

        btnQuyen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuyen.setText("QUYỀN");
        btnQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuyenActionPerformed(evt);
            }
        });

        btnLoaiSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLoaiSanPham.setText("LOẠI SẢN PHẨM");
        btnLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaiSanPhamActionPerformed(evt);
            }
        });

        btnSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSanPham.setText("SẢN PHẨM");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlMiddleLayout = new javax.swing.GroupLayout(PnlMiddle);
        PnlMiddle.setLayout(PnlMiddleLayout);
        PnlMiddleLayout.setHorizontalGroup(
            PnlMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMiddleLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        PnlMiddleLayout.setVerticalGroup(
            PnlMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMiddleLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(PnlMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout PnlTopLayout = new javax.swing.GroupLayout(PnlTop);
        PnlTop.setLayout(PnlTopLayout);
        PnlTopLayout.setHorizontalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTopLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PnlMiddle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlTopLayout.setVerticalGroup(
            PnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnlMiddle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       
     DBConnection connection = new DBConnection();
     public static String MaQuyen;
    
    private void btnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiDungActionPerformed
       
              // Hiển thị Form Main và ẩn Form đăng nhập
              this.hide();      
              frm_NguoiDung frm1  = new frm_NguoiDung();
                 frm1.show();
                 
    }//GEN-LAST:event_btnNguoiDungActionPerformed

    private void btnQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuyenActionPerformed
        // TODO add your handling code here:
        this.hide();
        frm_Quyen frmDK = new frm_Quyen();
        frmDK.show();
    }//GEN-LAST:event_btnQuyenActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        this.hide();
        frm_SanPham frmRepass = new frm_SanPham();
        frmRepass.show();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        this.hide();
        frm_LoaiSanPham frm3 = new frm_LoaiSanPham();
        frm3.show();
    }//GEN-LAST:event_btnLoaiSanPhamActionPerformed

 
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitle1;
    private javax.swing.JPanel PnlMiddle;
    private javax.swing.JPanel PnlTop;
    private javax.swing.JButton btnLoaiSanPham;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnQuyen;
    private javax.swing.JButton btnSanPham;
    // End of variables declaration//GEN-END:variables
}
