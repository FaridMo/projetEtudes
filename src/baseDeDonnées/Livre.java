/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDonnées;

import application.BDD;
import application.Config;
import application.ResultSetTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Farid M.H
 */
public class Livre extends javax.swing.JFrame {

     ResultSet rs;
     BDD db;
    
    public Livre() {
        db = new BDD(new Config().HOST_DB, new Config().USERNAME_DB,new Config().PASSWORD_DB,new Config().PORT,new Config().IPHOST);
        initComponents();
        listeTable();
    }

    public void table(){
        String a[] = {"nom_livre","auteur_livre","annee_edition"};
        rs = db.querySelect(a,"livre");
        Livre l = new Livre();
        table_livre.setModel(new ResultSetTableModel(rs));
    }
    
    public void actualiser(){
        txt_nomDuLivre.setText("");
        txt_auteurDuLivre.setText("");
        txt_anneeDedition.setText("");
    }
    
    public void listeTable(){
            rs = db.exécutionQuery("SELECT * FROM livre;");
            table_livre.setModel(new ResultSetTableModel(rs));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        modifier_livre = new javax.swing.JButton();
        supprimer_livre = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_livre = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_nomDuLivre = new javax.swing.JTextField();
        txt_auteurDuLivre = new javax.swing.JTextField();
        txt_anneeDedition = new javax.swing.JTextField();
        ajouter_livre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("GESTION DES LIVRES");

        modifier_livre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        modifier_livre.setText("Modifier");
        modifier_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_livreActionPerformed(evt);
            }
        });

        supprimer_livre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        supprimer_livre.setText("Supprimer");
        supprimer_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_livreActionPerformed(evt);
            }
        });

        retour.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        retour.setText("Retour");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });

        table_livre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table_livre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id_livre", "nom_livre", "auteur_livre", "annee_edition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_livre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_livreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_livre);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel20.setText("ENREGISTREMENT DES OUVRAGES");

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel21.setText("NOM DU LIVRE");

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel22.setText("AUTEUR");

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel23.setText("ANNEE DE L'EDITION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_auteurDuLivre)
                            .addComponent(txt_anneeDedition)
                            .addComponent(txt_nomDuLivre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txt_auteurDuLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_anneeDedition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_nomDuLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        ajouter_livre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ajouter_livre.setText("Ajouter");
        ajouter_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_livreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(ajouter_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifier_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(supprimer_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modifier_livre)
                                .addComponent(ajouter_livre))
                            .addComponent(supprimer_livre)
                            .addComponent(retour))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(982, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        Principale p = new Principale();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_retourActionPerformed

    private void ajouter_livreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_livreActionPerformed
        if (txt_nomDuLivre.getText().equals("") || txt_auteurDuLivre.getText().equals("") || txt_anneeDedition.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Veuillez compléter les informations ! ");
        }else{
            String[] colon={"nom_livre","auteur_livre","annee_edition"};
            String[] inf={txt_nomDuLivre.getText(),txt_auteurDuLivre.getText(),txt_anneeDedition.getText()};
            System.out.println(db.queryInsert("livre", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_ajouter_livreActionPerformed

    private void modifier_livreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_livreActionPerformed
        if (txt_nomDuLivre.getText().equals("") || txt_auteurDuLivre.getText().equals("") || txt_anneeDedition.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Veuillez compléter les informations ! ");
        }else{
            String[] colon={"nom_livre","auteur_livre","annee_edition"};
            String[] inf={txt_nomDuLivre.getText(),txt_auteurDuLivre.getText(),txt_anneeDedition.getText()};
            String id = String.valueOf(table_livre.getValueAt(table_livre.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("livre", colon, inf,"id='"+id+"'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_modifier_livreActionPerformed

    private void table_livreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_livreMouseClicked
        txt_nomDuLivre.setText(String.valueOf(table_livre.getValueAt(table_livre.getSelectedColumn(),1)));
        txt_auteurDuLivre.setText(String.valueOf(table_livre.getValueAt(table_livre.getSelectedColumn(), 2)));
        txt_anneeDedition.setText(String.valueOf(table_livre.getValueAt(table_livre.getSelectedColumn(), 3)));
    }//GEN-LAST:event_table_livreMouseClicked

    private void supprimer_livreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_livreActionPerformed
        String id = String.valueOf(table_livre.getValueAt(table_livre.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "supprimer définitivement ce livre de la liste ?","Confimer la suppression",
                JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) 
        {
            db.queryDelete("livre","id="+id);
        }else{
            return;
        }
        table();
    }//GEN-LAST:event_supprimer_livreActionPerformed

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
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Livre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_livre;
    private javax.swing.JButton enregistrer;
    private javax.swing.JButton enregistrer1;
    private javax.swing.JButton enregistrer2;
    private javax.swing.JButton enregistrer3;
    private javax.swing.JButton enregistrer4;
    private javax.swing.JButton enregistrer5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier_livre;
    private javax.swing.JButton retour;
    private javax.swing.JButton supprimer_livre;
    private javax.swing.JTable table_livre;
    private javax.swing.JTextField txt_anneeDedition;
    private javax.swing.JTextField txt_anneeEdition;
    private javax.swing.JTextField txt_anneeEdition1;
    private javax.swing.JTextField txt_anneeEdition2;
    private javax.swing.JTextField txt_anneeEdition3;
    private javax.swing.JTextField txt_anneeEdition4;
    private javax.swing.JTextField txt_anneeEdition5;
    private javax.swing.JTextField txt_auteurDuLivre;
    private javax.swing.JTextField txt_auteurLivre;
    private javax.swing.JTextField txt_auteurLivre1;
    private javax.swing.JTextField txt_auteurLivre2;
    private javax.swing.JTextField txt_auteurLivre3;
    private javax.swing.JTextField txt_auteurLivre4;
    private javax.swing.JTextField txt_auteurLivre5;
    private javax.swing.JTextField txt_nomDuLivre;
    private javax.swing.JTextField txt_nomLivre;
    private javax.swing.JTextField txt_nomLivre1;
    private javax.swing.JTextField txt_nomLivre2;
    private javax.swing.JTextField txt_nomLivre3;
    private javax.swing.JTextField txt_nomLivre4;
    private javax.swing.JTextField txt_nomLivre5;
    // End of variables declaration//GEN-END:variables
}
