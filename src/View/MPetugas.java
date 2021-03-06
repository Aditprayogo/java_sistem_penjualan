/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller_Petugas;
//import com.sun.imageio.plugins.png.RowFilter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LENOVO
 */
public class MPetugas extends javax.swing.JFrame {

    /**
     * Creates new form MPetugas
     */
    Controller_Petugas controller;
    DefaultTableModel dm;
    
    public MPetugas() {
        initComponents();
        setLocationRelativeTo(this);
        controller = new Controller_Petugas(this);
        controller.isiTable();
    }

    public JTable getTblpetugas() {
        return tblpetugas;
    }

    public JTextArea getTxtalamat() {
        return txtalamat;
    }

    public JTextField getTxtkatakunci() {
        return txtkatakunci;
    }

    public JTextField getTxtkdpetugas() {
        return txtkdpetugas;
    }

    public JTextField getTxtnmpetugas() {
        return txtnmpetugas;
    }

    public JTextField getTxttelp() {
        return txttelp;
    }
    
    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        tblpetugas.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
        
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
        txtkdpetugas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnmpetugas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();
        cmdsimpan = new javax.swing.JButton();
        cmdubah = new javax.swing.JButton();
        cmdhapus = new javax.swing.JButton();
        cmdbatal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtkatakunci = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpetugas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entry Data Petugas");

        jLabel2.setText("Kode Petugas : ");

        txtkdpetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkdpetugasKeyReleased(evt);
            }
        });

        jLabel3.setText("Nama Petugas : ");

        jLabel4.setText("Alamat : ");

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jLabel5.setText("No Telepon : ");

        cmdsimpan.setText("Simpan");
        cmdsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsimpanActionPerformed(evt);
            }
        });

        cmdubah.setText("Ubah");
        cmdubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdubahActionPerformed(evt);
            }
        });

        cmdhapus.setText("Hapus");
        cmdhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdhapusActionPerformed(evt);
            }
        });

        cmdbatal.setText("Batal");
        cmdbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbatalActionPerformed(evt);
            }
        });

        jLabel6.setText("Kata Kunci Pencarian :");

        txtkatakunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkatakunciActionPerformed(evt);
            }
        });
        txtkatakunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkatakunciKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkatakunciKeyReleased(evt);
            }
        });

        tblpetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblpetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpetugasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpetugas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnmpetugas)
                            .addComponent(txtkdpetugas)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(txttelp)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(cmdubah)
                                .addGap(18, 18, 18)
                                .addComponent(cmdhapus)
                                .addGap(31, 31, 31)
                                .addComponent(cmdbatal))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtkatakunci)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkdpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnmpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdsimpan)
                    .addComponent(cmdubah)
                    .addComponent(cmdhapus)
                    .addComponent(cmdbatal))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtkatakunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkatakunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkatakunciActionPerformed
        // TODO add your handling code here:
        controller.isiTableCari();
    }//GEN-LAST:event_txtkatakunciActionPerformed

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.isiTable();
        controller.reset();
    }//GEN-LAST:event_cmdsimpanActionPerformed

    private void cmdubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdubahActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.isiTable();
        controller.reset();
    }//GEN-LAST:event_cmdubahActionPerformed

    private void cmdhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdhapusActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.isiTable();
        controller.reset();
    }//GEN-LAST:event_cmdhapusActionPerformed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        // TODO add your handling code here:
        
        controller.reset();

    }//GEN-LAST:event_cmdbatalActionPerformed

    private void tblpetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpetugasMouseClicked
        // TODO add your handling code here:
        controller.isiField(tblpetugas.getSelectedRow());
    }//GEN-LAST:event_tblpetugasMouseClicked

    private void txtkdpetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdpetugasKeyReleased
        // TODO add your handling code here:
        controller.isiTableCari();
        

        
    }//GEN-LAST:event_txtkdpetugasKeyReleased

    private void txtkatakunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkatakunciKeyReleased
       
        controller.isiTableCari();
        
    }//GEN-LAST:event_txtkatakunciKeyReleased

    private void txtkatakunciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkatakunciKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (txtkdpetugas.getText().isEmpty()) {
//                controller.reset();
//            } else {
//                controller.isiTable();
//            }
//        }
    

    }//GEN-LAST:event_txtkatakunciKeyPressed

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
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MPetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdhapus;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JButton cmdubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpetugas;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtkatakunci;
    private javax.swing.JTextField txtkdpetugas;
    private javax.swing.JTextField txtnmpetugas;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}
