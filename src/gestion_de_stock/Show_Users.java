/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_stock;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DellE5570
 */
public class Show_Users extends javax.swing.JFrame {

    /**
     * Creates new form Show_Users
     */
    BigDecimal admnPKey;
    DefaultTableModel dt;
    ResultSet rs;

    public Show_Users(BigDecimal PKey) {
        initComponents();
        admnPKey = PKey;
        setTitle("SHOW ALL USERS");
        setResizable(false);
        setLocationRelativeTo(null);
        Fill_Table();
    }

    void Fill_Table() {
        try {
            dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            rs = Connexion.Seconnecter().createStatement().executeQuery("select nom_personne , prenom_personne , email_personne , upper(admin) from personnelle "
                    + "where id_personne != "+admnPKey+"");
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4)});
                }
            } else {
                System.out.println("NO DATA FOUND");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Show_Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Show_Users() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "E-mail", "Is Admin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setText("WELCOME DEAR ADMIN");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("SHOW :");

        jButton1.setText("ADMIN ONLY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("NON ADMIN ONLY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SHOW ALL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        jLabel3.setText("Click On The User To Delete It");

        jMenu1.setText("OPTIONS");

        jMenuItem1.setText("GO BACK");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setVisible(false);
        Admin_Dashboard admn = new Admin_Dashboard(admnPKey);
        admn.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            rs = Connexion.Seconnecter().createStatement().executeQuery("select nom_personne , prenom_personne , email_personne , upper(admin) from personnelle where UPPER(admin) = 'TRUE'");
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4)});
                }
            } else {
                System.out.println("NO DATA FOUND");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Show_Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            rs = Connexion.Seconnecter().createStatement().executeQuery("select nom_personne , prenom_personne , email_personne , upper(admin) from personnelle where upper(admin) = 'FALSE'");
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4)});
                }
            } else {
                System.out.println("NO DATA FOUND");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Show_Users.class.getName()).log(Level.SEVERE, null, ex);
        }

     }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Fill_Table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            String passwordcheck = JOptionPane.showInputDialog(null, "Enter Your Password In Order To Delete User :");
            rs = Connexion.Seconnecter().createStatement().executeQuery("select password from personnelle where id_personne = " + admnPKey);
            if (!rs.isBeforeFirst()) {
                System.out.println("NO DATA FOUND");
            } else {
                rs.next();
                if (passwordcheck.matches((String) rs.getString(1))) {
                    rs = Connexion.Seconnecter().createStatement().executeQuery("select id_personne from personnelle where email_personne = '" + (String) dt.getValueAt(jTable1.getSelectedRow(), 2) + "'");
                    rs.next();
                    String req = "delete from personnelle where id_Personne = " + rs.getObject(1);
                    System.out.println(req);
                    int R = Connexion.Seconnecter().createStatement().executeUpdate(req);
                    if (R != 0) {
                        JOptionPane.showMessageDialog(null, "USER SUCCESSFULLY DELETED", "SUCCES", JOptionPane.INFORMATION_MESSAGE);
                        R = Connexion.Seconnecter().createStatement().executeUpdate("insert into trace values (sysdate , 'DELETING' , 'PERSONNELLE' , "+admnPKey+")");
                        Fill_Table();
                    }
                } else {
                    if (passwordcheck.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "ENTER YOUR PASSWORDS. TRY AGAIN", "PASSWORD ERROR", JOptionPane.ERROR_MESSAGE);
                        rs = Connexion.Seconnecter().createStatement().executeQuery("select password from personnelle where id_personne = " + admnPKey);
                    } else {
                        JOptionPane.showMessageDialog(null, "PASSWORDS DO NOT MATCH. TRY AGAIN", "PASSWORD ERROR", JOptionPane.ERROR_MESSAGE);
                        rs = Connexion.Seconnecter().createStatement().executeQuery("select password from personnelle where id_personne = " + admnPKey);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Show_Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Show_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
