/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAFUD SATRIO SETIONO
 */
public class tugas1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form tugas1
     */
    public tugas1() {
        initComponents();
        panelhitung.setVisible(false);
        nilai.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                int NILAI = Integer.parseInt(nilai.getText());
                if(NILAI >= 80) {
                    indeks.setText("A");
                } else if(NILAI >= 70) {
                    indeks.setText("B");
                } else if(NILAI >= 60) {
                    indeks.setText("C");
                } else if(NILAI >= 50) {
                    indeks.setText("D");
                } else {
                    indeks.setText("E");
                }
            }
        });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_mahasiswa = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nim_tambahkan = new javax.swing.JTextField();
        nama_tambahkan = new javax.swing.JTextField();
        btn_tambah_data = new javax.swing.JButton();
        panelhitung = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nim_nilai_tambah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nama_nilai_tambah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nilai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        indeks = new javax.swing.JTextField();
        hitung_btn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(942, 374));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("FORM MAHASISWA");

        table_mahasiswa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Nilai", "Indeks"
            }
        ));
        table_mahasiswa.setVerifyInputWhenFocusTarget(false);
        table_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_mahasiswa);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Tambah Data");

        jLabel4.setText("Nim");

        jLabel5.setText("Nama");

        nim_tambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nim_tambahkanActionPerformed(evt);
            }
        });

        btn_tambah_data.setText("Simpan");
        btn_tambah_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambah_dataMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("FORM HITUNG NILAI MAHASISWA");

        jLabel6.setText("Nim");

        jLabel7.setText("Nama");

        jLabel8.setText("Nilai");

        jLabel9.setText("Indeks");

        indeks.setEditable(false);
        indeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indeksActionPerformed(evt);
            }
        });

        hitung_btn.setText("Simpan");
        hitung_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelhitungLayout = new javax.swing.GroupLayout(panelhitung);
        panelhitung.setLayout(panelhitungLayout);
        panelhitungLayout.setHorizontalGroup(
            panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhitungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addGroup(panelhitungLayout.createSequentialGroup()
                            .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nim_nilai_tambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nilai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nama_nilai_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelhitungLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(indeks, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(panelhitungLayout.createSequentialGroup()
                .addComponent(hitung_btn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelhitungLayout.setVerticalGroup(
            panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhitungLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nim_nilai_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nama_nilai_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelhitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(indeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(hitung_btn)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama_tambahkan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nim_tambahkan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(btn_tambah_data))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelhitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nim_tambahkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama_tambahkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btn_tambah_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(panelhitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_mahasiswaMouseClicked

        int[] selectedRow = table_mahasiswa.getSelectedRows();
        int selectedColumns = 4;

        for (int i = 0; i < selectedRow.length; i++) {
            for (int j = 0; j < selectedColumns; j++) {
                if(j == 0) {
                    nim_nilai_tambah.setText((String) table_mahasiswa.getValueAt(selectedRow[i], j));
                } else if (j == 1) {
                    nama_nilai_tambah.setText((String) table_mahasiswa.getValueAt(selectedRow[i], j));
                } else if (j == 2) {
                    nilai.setText((String) table_mahasiswa.getValueAt(selectedRow[i], j));
                } else if (j == 3) {
                    indeks.setText((String) table_mahasiswa.getValueAt(selectedRow[i], j));
                }
            }
        }

        panelhitung.setVisible(true);
    }//GEN-LAST:event_table_mahasiswaMouseClicked

    private void nim_tambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nim_tambahkanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nim_tambahkanActionPerformed

    private void btn_tambah_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambah_dataMouseClicked

        if(nim_tambahkan.getText().equals("") || nama_tambahkan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan Data Yang Kosong Terlebih Dahulu!!");
        } else {
            // Create table instance
            DefaultTableModel newtable = (DefaultTableModel) table_mahasiswa.getModel();

            newtable.addRow(new Object[]{nim_tambahkan.getText(), nama_tambahkan.getText(), "", ""});
        }
    }//GEN-LAST:event_btn_tambah_dataMouseClicked

    private void indeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indeksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indeksActionPerformed

    private void hitung_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_btnActionPerformed
        if(nilai.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan Data Yang Kosong Terlebih Dahulu!!");
        } else {

            String data[] = {nim_nilai_tambah.getText(), nama_nilai_tambah.getText(), nilai.getText(), indeks.getText()};

            DefaultTableModel newtable = (DefaultTableModel) table_mahasiswa.getModel();
            newtable.setValueAt(nim_nilai_tambah.getText(), table_mahasiswa.getSelectedRow(), 0);
            newtable.setValueAt(nama_nilai_tambah.getText(), table_mahasiswa.getSelectedRow(), 1);
            newtable.setValueAt(nilai.getText(), table_mahasiswa.getSelectedRow(), 2);
            newtable.setValueAt(indeks.getText(), table_mahasiswa.getSelectedRow(), 3);
            nim_nilai_tambah.setText("");
            nama_nilai_tambah.setText("");
            nilai.setText("");
            indeks.setText("");
            JOptionPane.showMessageDialog(this, "Sukses Menambahkan Nilai!!");
        }

        panelhitung.setVisible(false);
    }//GEN-LAST:event_hitung_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tambah_data;
    private javax.swing.JButton hitung_btn;
    private javax.swing.JTextField indeks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_nilai_tambah;
    private javax.swing.JTextField nama_tambahkan;
    private javax.swing.JTextField nilai;
    private javax.swing.JTextField nim_nilai_tambah;
    private javax.swing.JTextField nim_tambahkan;
    private javax.swing.JPanel panelhitung;
    private javax.swing.JTable table_mahasiswa;
    // End of variables declaration//GEN-END:variables
}
