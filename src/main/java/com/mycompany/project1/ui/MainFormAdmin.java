
package com.mycompany.project1.ui;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainFormAdmin extends javax.swing.JFrame {
    public MainFormAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInf = new javax.swing.JButton();
        btnEat = new javax.swing.JButton();
        btnBody = new javax.swing.JButton();
        btnLogOutAction = new javax.swing.JButton();
        btnIntro = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSuggest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Vivaldi", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Myfitness");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 545, 46));

        btnInf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userperson.png"))); // NOI18N
        btnInf.setText("Thông tin người dùng");
        btnInf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInf.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnInf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfActionPerformed(evt);
            }
        });
        jPanel1.add(btnInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 56));

        btnEat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food1.png"))); // NOI18N
        btnEat.setText("Dinh dưỡng món ăn ");
        btnEat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEat.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEatActionPerformed(evt);
            }
        });
        jPanel1.add(btnEat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 56));

        btnBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dumbbell.png"))); // NOI18N
        btnBody.setText("Chỉ số cơ thể");
        btnBody.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBody.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBody.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBodyActionPerformed(evt);
            }
        });
        jPanel1.add(btnBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, -1));

        btnLogOutAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        btnLogOutAction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOutAction.setVerifyInputWhenFocusTarget(false);
        btnLogOutAction.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogOutAction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogOutAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOutAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 60, 40));

        btnIntro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/introduction.png"))); // NOI18N
        btnIntro.setText("Giới thiệu");
        btnIntro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIntro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnIntro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntroActionPerformed(evt);
            }
        });
        jPanel1.add(btnIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 140, 58));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit-32.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 140, -1));

        btnSuggest.setIcon(new javax.swing.ImageIcon("C:\\Users\\ITC\\Downloads\\icon\\đồ ăn.png")); // NOI18N
        btnSuggest.setText("Thực đơn gợi ý ");
        btnSuggest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuggest.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSuggest.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSuggest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuggestActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuggest, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 150, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthy.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       int lick=JOptionPane.showConfirmDialog(null,"Bạn Có Muốn Thoát Khỏi Chương Trình Hay Không?","Thông Báo",2);
        if(lick==JOptionPane.OK_OPTION){
            System.exit(0);
        }
        else{
            if(lick==JOptionPane.CANCEL_OPTION){    
                this.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEatActionPerformed
      SearchEat search = new SearchEat(this,true);
      search.setVisible(true);
    }//GEN-LAST:event_btnEatActionPerformed

    private void btnLogOutActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionActionPerformed
     int Click = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất tài khoản khỏi hệ thống hay không?", "Thông Báo",2);
        if(Click ==JOptionPane.YES_OPTION){
           logindialog  login = new logindialog(this, true);
           login.setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionActionPerformed

    private void btnInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfActionPerformed
        Info info = new Info(this,true);
        info.setVisible(true);
    }//GEN-LAST:event_btnInfActionPerformed

    private void btnIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntroActionPerformed
        AboutUsDialog aboutDialog = new AboutUsDialog(this,true);
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_btnIntroActionPerformed

    private void btnSuggestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuggestActionPerformed
        SuggestEat suggest = new SuggestEat(this,true);
        suggest.setVisible(true);
    }//GEN-LAST:event_btnSuggestActionPerformed

    private void btnBodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBodyActionPerformed
       Body body = new Body(this,true);
       body.setVisible(true);
    }//GEN-LAST:event_btnBodyActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new MainFormAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBody;
    private javax.swing.JButton btnEat;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInf;
    private javax.swing.JButton btnIntro;
    private javax.swing.JButton btnLogOutAction;
    private javax.swing.JButton btnSuggest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
