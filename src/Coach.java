/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Coach extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Coach() {
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

        forms = new javax.swing.JLabel();
        squad = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        training = new javax.swing.JLabel();
        feedback = new javax.swing.JLabel();
        page = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forms.setText(" ");
        forms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formsMouseClicked(evt);
            }
        });
        getContentPane().add(forms, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 250, 20));

        squad.setText(" ");
        squad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                squadMouseClicked(evt);
            }
        });
        getContentPane().add(squad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 100, 20));

        stats.setText(" ");
        stats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statsMouseClicked(evt);
            }
        });
        getContentPane().add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 170, 20));

        logout.setText(" ");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 20, 110, 30));

        training.setText(" ");
        training.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainingMouseClicked(evt);
            }
        });
        getContentPane().add(training, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 170, 30));

        feedback.setText(" ");
        feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackMouseClicked(evt);
            }
        });
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 130, 30));

        page.setIcon(new javax.swing.ImageIcon("C:\\Users\\giann\\Downloads\\Mockups-FM\\Mockups\\FMCoach&Assistants.png")); // NOI18N
        page.setText(" ");
        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formsMouseClicked
      Coach_Formations a = new Coach_Formations();
      a.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_formsMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Home a = new Home();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void squadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squadMouseClicked
        Coach_Squad a = new Coach_Squad();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_squadMouseClicked

    private void trainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainingMouseClicked
       Coach_TrainingPrograms a =  new Coach_TrainingPrograms();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_trainingMouseClicked

    private void statsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsMouseClicked
       Coach_InsertData a =  new Coach_InsertData();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_statsMouseClicked

    private void feedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMouseClicked
       Coach_PlayerFeedback a =  new Coach_PlayerFeedback();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_feedbackMouseClicked

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
    private javax.swing.JLabel feedback;
    private javax.swing.JLabel forms;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel page;
    private javax.swing.JLabel squad;
    private javax.swing.JLabel stats;
    private javax.swing.JLabel training;
    // End of variables declaration//GEN-END:variables
}
