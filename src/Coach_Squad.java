/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Coach_Squad extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Coach_Squad() {
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
        edit = new javax.swing.JButton();
        createPlayer = new javax.swing.JButton();
        selectPlayer = new javax.swing.JButton();
        comparePlayers = new javax.swing.JButton();
        selectPosition = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page.setIcon(new javax.swing.ImageIcon("C:\\Users\\giann\\Downloads\\Mockups-FM\\Mockups\\FM-CA-Squad.png")); // NOI18N
        page.setText(" ");
        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

        back.setText(" ");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 90, 30));

        edit.setText("jButton1");
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 120, 20));

        createPlayer.setText("jButton1");
        createPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createPlayerMouseClicked(evt);
            }
        });
        getContentPane().add(createPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 120, 20));

        selectPlayer.setText("jButton1");
        selectPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectPlayerMouseClicked(evt);
            }
        });
        getContentPane().add(selectPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 110, 20));

        comparePlayers.setText("jButton1");
        getContentPane().add(comparePlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 110, 20));

        selectPosition.setText("jButton1");
        getContentPane().add(selectPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 110, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Coach a = new Coach();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void selectPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectPlayerMouseClicked
        Coach_PlayerStats a = new Coach_PlayerStats();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_selectPlayerMouseClicked

    private void createPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createPlayerMouseClicked
        Coach_CreatePlayer  a = new Coach_CreatePlayer();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createPlayerMouseClicked

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
    private javax.swing.JButton comparePlayers;
    private javax.swing.JButton createPlayer;
    private javax.swing.JButton edit;
    private javax.swing.JLabel page;
    private javax.swing.JButton selectPlayer;
    private javax.swing.JButton selectPosition;
    // End of variables declaration//GEN-END:variables
}
