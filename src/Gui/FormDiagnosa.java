package Gui;

import Koneksi.KoneksiDb;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormDiagnosa extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String queryUpdate = "";
    ArrayList<String> listKodePenyakit = new ArrayList<String>();
    LinkedList<String> listResult = new LinkedList<String>();
    int level = 1;

    public FormDiagnosa() throws SQLException {
        initComponents();
        con = new KoneksiDb().getConnect();
        tampilGejala("SELECT * FROM tbl_gejala WHERE LEVEL=1 ORDER BY kode+0 ASC");
        btnLanjut.setEnabled(false);
    }

    private void tampilGejala(String query) throws SQLException {
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("Kode");
        mdl.addColumn("Gejala");
        mdl.addColumn("Level");
        mdl.addColumn("Penyakit");
        tblGejala.setModel(mdl);

        tblGejala.getColumnModel().getColumn(0).setMinWidth(0);
        tblGejala.getColumnModel().getColumn(0).setMaxWidth(80);
        tblGejala.getColumnModel().getColumn(2).setMinWidth(0);
        tblGejala.getColumnModel().getColumn(2).setMaxWidth(0);
        tblGejala.getColumnModel().getColumn(3).setMinWidth(0);
        tblGejala.getColumnModel().getColumn(3).setMaxWidth(0);

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                mdl.addRow(new Object[]{
                    rs.getString("kode"),
                    rs.getString("gejala"),
                    rs.getString("level"),
                    rs.getString("penyakit")
                });
                tblGejala.setModel(mdl);
            }
        } catch (Exception e) {
            System.out.println("#ERROR " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblPict = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtKelompok = new javax.swing.JTextField();
        txtNamaPetani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGejala = new javax.swing.JTable();
        txtGejala = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnLanjut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("Kelompok : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 80, 90, 17);
        getContentPane().add(lblPict);
        lblPict.setBounds(1100, 120, 250, 240);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(880, 620, 120, 50);
        getContentPane().add(txtKelompok);
        txtKelompok.setBounds(120, 80, 300, 20);
        getContentPane().add(txtNamaPetani);
        txtNamaPetani.setBounds(120, 50, 300, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Nama : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 60, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Tabel Gejala");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 10, 148, 29);

        tblGejala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblGejala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblGejala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGejalaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGejala);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 114, 1070, 490);

        txtGejala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGejala.setEnabled(false);
        getContentPane().add(txtGejala);
        txtGejala.setBounds(250, 620, 491, 49);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcon/icon tambah.png"))); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah);
        btnTambah.setBounds(10, 620, 97, 49);

        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcon/icon lanjut.png"))); // NOI18N
        btnLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLanjut);
        btnLanjut.setBounds(130, 620, 110, 49);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcon/background diagnosa.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1366, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        int pilih = tblGejala.getSelectedRow();
        if (pilih == -1) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih item");
        } else {
            String daftarGejala = txtGejala.getText();
            daftarGejala += tblGejala.getValueAt(pilih, 0).toString() + " - ";
            listKodePenyakit.add(tblGejala.getValueAt(pilih, 3).toString());
            listResult.add(tblGejala.getValueAt(pilih, 3).toString());
            txtGejala.setText(daftarGejala);
        }
        btnLanjut.setEnabled(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
        btnLanjut.setEnabled(false);
        String namaPetani = txtNamaPetani.getText();
        String kelompokPetani = txtKelompok.getText();
        
        level++;
        txtGejala.setText(null);
        queryUpdate += "SELECT * FROM tbl_gejala WHERE(";
        for (int i = 0; i < listKodePenyakit.size(); i++) {
            queryUpdate += "penyakit='" + listKodePenyakit.get(i) + "'";
            if (i < listKodePenyakit.size() - 1) {
                queryUpdate += "OR ";
            }
        }
        queryUpdate += ")AND level=" + level;

        try {
            tampilGejala(queryUpdate);
        } catch (SQLException ex) {
            Logger.getLogger(FormDiagnosa.class.getName()).log(Level.SEVERE, null, ex);
        }

        //System.out.println(queryUpdate);
        queryUpdate = "";
        listKodePenyakit.clear();
        
        if(tblGejala.getRowCount() < 1){
            System.out.println(listResult.get(listResult.size()-1));
            String kode = listResult.get(listResult.size()-1);
            FormResult formResult;
            try {
                String sql = "insert into tbl_riwayat(nama_petani, kelompok_petani, penyakit) values(?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, namaPetani);
                ps.setString(2, kelompokPetani);
                ps.setString(3, kode);
                ps.execute();
                formResult = new FormResult(kode, namaPetani, kelompokPetani);
                formResult.form = this;
                formResult.show();
            } catch (SQLException ex) {
                Logger.getLogger(FormDiagnosa.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (Exception e) {
                System.out.println("#Error " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnLanjutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FormAwal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblGejalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGejalaMouseClicked
        int pilih = tblGejala.getSelectedRow();
        String fileName = tblGejala.getValueAt(pilih, 0).toString();
        ImageIcon icon = new ImageIcon("imgGejala\\"+fileName+".jpg");
        lblPict.setIcon(icon);
    }//GEN-LAST:event_tblGejalaMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDiagnosa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDiagnosa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDiagnosa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDiagnosa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormDiagnosa().setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(FormDiagnosa.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanjut;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPict;
    private javax.swing.JTable tblGejala;
    private javax.swing.JTextField txtGejala;
    private javax.swing.JTextField txtKelompok;
    private javax.swing.JTextField txtNamaPetani;
    // End of variables declaration//GEN-END:variables
}
