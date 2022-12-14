/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dhika.client_2101082009;

import com.dhika.client_2101082009.controller.PeminjamanController;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author User
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    PeminjamanController controller;
    public FormPeminjaman() {
        initComponents();
        controller = new PeminjamanController(this);
        controller.bersihForm();
        controller.viewTabel();
    }

    public JTable getTablePeminjaman() {
        return TablePeminjaman;
    }

    public JTextField getTxtAnggotaId() {
        return txtAnggotaId;
    }

    public JTextField getTxtBukuId() {
        return txtBukuId;
    }

    public JTextField getTxtPeminjamanId() {
        return txtPeminjamanId;
    }

    public JTextField getTxtTglKembali() {
        return txtTglKembali;
    }

    public JTextField getTxtTglPinjam() {
        return txtTglPinjam;
    }

  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPeminjamanId = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        txtAnggotaId = new javax.swing.JTextField();
        txtBukuId = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        txtTglKembali = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCencel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePeminjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Peminjaman Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 30);

        jLabel2.setText("Angota Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 46, 100, 20);

        jLabel3.setText("Buku Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 76, 100, 20);

        jLabel4.setText("Tgl Pinjam");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 106, 100, 20);

        jLabel5.setText("Tgl kembali");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 136, 90, 20);

        txtPeminjamanId.setText("jTextField1");
        getContentPane().add(txtPeminjamanId);
        txtPeminjamanId.setBounds(120, 10, 170, 30);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(300, 10, 72, 22);

        txtAnggotaId.setText("jTextField2");
        txtAnggotaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnggotaIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnggotaId);
        txtAnggotaId.setBounds(120, 40, 250, 30);

        txtBukuId.setText("jTextField3");
        getContentPane().add(txtBukuId);
        txtBukuId.setBounds(120, 70, 250, 30);

        txtTglPinjam.setText("jTextField4");
        getContentPane().add(txtTglPinjam);
        txtTglPinjam.setBounds(120, 100, 250, 30);

        txtTglKembali.setText("jTextField5");
        getContentPane().add(txtTglKembali);
        txtTglKembali.setBounds(120, 130, 250, 30);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(10, 170, 70, 22);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(90, 170, 72, 22);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(180, 170, 72, 22);

        btnCencel.setText("Cencel");
        btnCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCencelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCencel);
        btnCencel.setBounds(270, 170, 72, 22);

        TablePeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Peminjaman Id", "Anggota Id", "Buku Id", "Tgl Pinjam", "Tgl Kembali"
            }
        ));
        jScrollPane1.setViewportView(TablePeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 360, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnggotaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnggotaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnggotaIdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updatePeminjaman();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
         controller.getPeminjamanId();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        controller.savePeminjaman();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.deletePeminjaman();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCencelActionPerformed
        // TODO add your handling code here:
        controller.bersihForm();
    }//GEN-LAST:event_btnCencelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look antxtPeminjamanIding code (optional) ">
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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePeminjaman;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCencel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAnggotaId;
    private javax.swing.JTextField txtBukuId;
    private javax.swing.JTextField txtPeminjamanId;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
