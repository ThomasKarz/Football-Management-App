/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Coach_Formations extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Coach_Formations() {
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
        jComboBox_Form = new javax.swing.JComboBox<>();
        create = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page.setIcon(new javax.swing.ImageIcon("C:\\Users\\giann\\Downloads\\Mockups-FM\\Mockups\\FM-CA-Formations.png")); // NOI18N
        page.setText(" ");
        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

        back.setText(" ");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 90, 30));

        jComboBox_Form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4-3-3", "4-4-2", "4-3-1-2", "4-5-1", "3-5-2", "3-4-1-2", "3-4-2-1", "3-3-3-1", "3-3-2-2", " " }));
        jComboBox_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FormActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 40));

        create.setText("jButton1");
        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 120, 20));

        edit.setText("jButton1");
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 120, 20));

        show.setText("jButton1");
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 110, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Coach a = new Coach();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void jComboBox_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_FormActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox_Form;
    private javax.swing.JLabel page;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
