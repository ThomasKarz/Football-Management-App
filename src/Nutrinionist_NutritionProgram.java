/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Nutrinionist_NutritionProgram extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Nutrinionist_NutritionProgram() {
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

        page = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jComboBox_Player = new javax.swing.JComboBox<>();
        create = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jComboBox_EndDate = new javax.swing.JComboBox<>();
        jComboBox_FromDate = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page.setIcon(new javax.swing.ImageIcon("C:\\Users\\giann\\Downloads\\Mockups-FM\\Mockups\\FM-Nutr-Program.png")); // NOI18N
        page.setText(" ");
        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

        back.setText(" ");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 90, 30));

        jComboBox_Player.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nikolas", "Giorgos", "Giannis", "Kostas", "Mixalis", "Angelo", "Alexios", "Shasha", "Mike Jr", "Jordan", "Stelios" }));
        jComboBox_Player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PlayerActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 130, 30));

        create.setText("jButton1");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 100, 20));

        edit.setText("jButton1");
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 100, 20));

        jComboBox_EndDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5/3/23", "6/3/23", "7/3/23", "8/3/23" }));
        jComboBox_EndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EndDateActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 130, 30));

        jComboBox_FromDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/3/23", "2/3/23", "3/3/23", "4/3/23" }));
        jComboBox_FromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FromDateActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_FromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Nutrinionist a = new Nutrinionist();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void jComboBox_PlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_PlayerActionPerformed

    private void jComboBox_EndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_EndDateActionPerformed

    private void jComboBox_FromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FromDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_FromDateActionPerformed

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        Nutrinionist_CreateProgram a = new Nutrinionist_CreateProgram();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton create;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<String> jComboBox_EndDate;
    private javax.swing.JComboBox<String> jComboBox_FromDate;
    private javax.swing.JComboBox<String> jComboBox_Player;
    private javax.swing.JLabel page;
    // End of variables declaration//GEN-END:variables
}
