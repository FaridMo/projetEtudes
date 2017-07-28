/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDonnées;
import application.BDD;
import application.Config;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Farid M.H
 */
public class Login extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
    String username1, password1, hak;
    
    
    public Login() {
        db = new BDD(new Config().HOST_DB, new Config().USERNAME_DB,new Config().PASSWORD_DB,new Config().PORT,new Config().IPHOST);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button_connexion = new javax.swing.JButton();
        button_quitter = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        afficheMdp = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);
        jPanel1.add(txt_username);
        txt_username.setBounds(120, 90, 158, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel2.setText("Username :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 96, 73, 21);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(128, 11, 97, 51);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 149, 68, 21);

        button_connexion.setBackground(new java.awt.Color(102, 102, 102));
        button_connexion.setText("Connecter");
        button_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_connexionActionPerformed(evt);
            }
        });
        jPanel1.add(button_connexion);
        button_connexion.setBounds(50, 210, 90, 23);

        button_quitter.setBackground(new java.awt.Color(102, 102, 102));
        button_quitter.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        button_quitter.setText("Quitter");
        button_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_quitterActionPerformed(evt);
            }
        });
        jPanel1.add(button_quitter);
        button_quitter.setBounds(190, 210, 73, 23);
        jPanel1.add(txt_password);
        txt_password.setBounds(120, 150, 160, 30);

        afficheMdp.setText("afficher mot de passe");
        afficheMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficheMdpActionPerformed(evt);
            }
        });
        jPanel1.add(afficheMdp);
        afficheMdp.setBounds(270, 190, 129, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 250);

        setSize(new java.awt.Dimension(421, 293));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_connexionActionPerformed
          rs = db.querySelectAll("utilisateur", "username='" + txt_username.getText() +
                  "' and password='" + String.valueOf(txt_password.getPassword()) + "'");
        try {
            while (rs.next()) {
                username1 = rs.getString("username");
                password1 = rs.getString("password");
                hak = rs.getString("type");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (username1 == null && password1 == null) {
            JOptionPane.showMessageDialog(this, "le nom utilisateur ou le mot de passe est incorrect");
        } else {
            if (hak.equals("directeur")) {
                JOptionPane.showMessageDialog(null, "Bienvenu(e) dans notre application");
                Principale h = new Principale();
                h.setVisible(true);
                this.dispose();
            } 
        }
        
    }//GEN-LAST:event_button_connexionActionPerformed

    private void button_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_quitterActionPerformed
        dispose();
    }//GEN-LAST:event_button_quitterActionPerformed

    private void afficheMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficheMdpActionPerformed
                if(afficheMdp.isSelected()){
                    txt_password.setEchoChar((char)0);
                }else{
                    txt_password.setEchoChar('*');
                }
    }//GEN-LAST:event_afficheMdpActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox afficheMdp;
    private javax.swing.JButton button_connexion;
    private javax.swing.JButton button_quitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
