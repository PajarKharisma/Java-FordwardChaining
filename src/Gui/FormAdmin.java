package Gui;

import Koneksi.KoneksiDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAdmin extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String kodePenyakitDialog;
    String queryTampilGejala = "select * from tbl_gejala order by kode + 0 asc";
    String queryTampilPenyakit = "select * from tbl_penyakit order by kode + 0 asc";

    public FormAdmin() throws SQLException {
        initComponents();
        con = new KoneksiDb().getConnect();
        tampilGejala(queryTampilGejala);
        tampilPenyakit(queryTampilPenyakit);
        tampilHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogOut = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaPenyakit = new javax.swing.JTextArea();
        txtKodePenyakit = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPenyakit = new javax.swing.JTable();
        btnPenyakitBaru = new javax.swing.JButton();
        btnPenyakitSimpan = new javax.swing.JButton();
        btnPenyakitEdit = new javax.swing.JButton();
        btnPenyakitHapus = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        areaSolusi = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        txtPenyakitPencarian = new javax.swing.JTextField();
        btnPenyakitCari = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaGejala = new javax.swing.JTextArea();
        txtKodeGejala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGejalaSimpan = new javax.swing.JButton();
        btnGejalaEdit = new javax.swing.JButton();
        btnGejalaHapus = new javax.swing.JButton();
        btnGejalaBaru = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGejala = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cbLevel = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtPenyakit = new javax.swing.JTextField();
        btnOpenDialog = new javax.swing.JButton();
        txtGejalaPencarian = new javax.swing.JTextField();
        btnGejalaCari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        lblLogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogOut.setText("Logout");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogOut);
        lblLogOut.setBounds(1300, 0, 60, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tambah Admin");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1130, 0, 110, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Home");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1250, 0, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Kode : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Penyakit : ");

        areaPenyakit.setColumns(20);
        areaPenyakit.setRows(5);
        areaPenyakit.setEnabled(false);
        jScrollPane3.setViewportView(areaPenyakit);

        txtKodePenyakit.setEnabled(false);

        tblPenyakit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblPenyakit);

        btnPenyakitBaru.setText("Baru");
        btnPenyakitBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenyakitBaruActionPerformed(evt);
            }
        });

        btnPenyakitSimpan.setText("Simpan");
        btnPenyakitSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenyakitSimpanActionPerformed(evt);
            }
        });

        btnPenyakitEdit.setText("Edit");
        btnPenyakitEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenyakitEditActionPerformed(evt);
            }
        });

        btnPenyakitHapus.setText("Hapus");
        btnPenyakitHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenyakitHapusActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Solusi : ");

        areaSolusi.setColumns(20);
        areaSolusi.setRows(5);
        areaSolusi.setEnabled(false);
        jScrollPane6.setViewportView(areaSolusi);

        jTextField1.setText("jTextField1");

        btnPenyakitCari.setText("Cari");
        btnPenyakitCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenyakitCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtKodePenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPenyakitBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPenyakitSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPenyakitEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPenyakitHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPenyakitPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPenyakitCari, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKodePenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPenyakitBaru)
                                    .addComponent(btnPenyakitSimpan)
                                    .addComponent(btnPenyakitEdit)
                                    .addComponent(btnPenyakitHapus)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPenyakitCari)
                                    .addComponent(txtPenyakitPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgIcon/data penyakit.png")), jPanel2); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Kode : ");

        areaGejala.setColumns(20);
        areaGejala.setRows(5);
        areaGejala.setEnabled(false);
        jScrollPane1.setViewportView(areaGejala);

        txtKodeGejala.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Gejala : ");

        btnGejalaSimpan.setText("Simpan");
        btnGejalaSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGejalaSimpanActionPerformed(evt);
            }
        });

        btnGejalaEdit.setText("Edit");
        btnGejalaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGejalaEditActionPerformed(evt);
            }
        });

        btnGejalaHapus.setText("Hapus");
        btnGejalaHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGejalaHapusActionPerformed(evt);
            }
        });

        btnGejalaBaru.setText("Baru");
        btnGejalaBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGejalaBaruActionPerformed(evt);
            }
        });

        tblGejala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblGejala);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Level :");

        cbLevel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Penyakit : ");

        txtPenyakit.setEnabled(false);

        btnOpenDialog.setText(".............");
        btnOpenDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenDialogActionPerformed(evt);
            }
        });

        btnGejalaCari.setText("Cari");
        btnGejalaCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGejalaCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGejalaBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGejalaSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGejalaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGejalaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                .addComponent(txtGejalaPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGejalaCari, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtKodeGejala, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnOpenDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKodeGejala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGejalaCari)
                        .addComponent(txtGejalaPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGejalaBaru)
                        .addComponent(btnGejalaSimpan)
                        .addComponent(btnGejalaHapus)
                        .addComponent(btnGejalaEdit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgIcon/data gejala.png")), jPanel1); // NOI18N

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblHistory);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgIcon/data history.png")), jPanel3); // NOI18N

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 39, 1340, 660);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Input Data Penyakit dan Gejala");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 10, 285, 22);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcon/background admin.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1370, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tampilGejala(String query) throws SQLException {
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("Kode");
        mdl.addColumn("Gejala");
        mdl.addColumn("Level");
        mdl.addColumn("Kode Penyakit");
        tblGejala.setModel(mdl);

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
    
    private void tampilHistory() throws SQLException {
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("Id");
        mdl.addColumn("Nama Penyakit");
        mdl.addColumn("Kelompok Petani");
        mdl.addColumn("Kode Penyakit");
        tblHistory.setModel(mdl);

        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from tbl_riwayat order by id + 0 asc");
            while (rs.next()) {
                mdl.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("nama_petani"),
                    rs.getString("kelompok_petani"),
                    rs.getString("penyakit")
                });
                tblHistory.setModel(mdl);
            }
        } catch (Exception e) {
            System.out.println("#ERROR " + e.getMessage());
        }
    }

    private void tampilPenyakit(String query) throws SQLException {
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("Kode");
        mdl.addColumn("Penyakit");
        tblPenyakit.setModel(mdl);

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                mdl.addRow(new Object[]{
                    rs.getString("kode"),
                    rs.getString("penyakit")
                });
                tblPenyakit.setModel(mdl);
            }
        } catch (Exception e) {
            System.out.println("#ERROR " + e.getMessage());
        }
    }

    private void clearGejala() {
        txtKodeGejala.setText(null);
        areaGejala.setText(null);
    }

    private void clearPenyakit() {
        txtKodePenyakit.setText(null);
        areaPenyakit.setText(null);
    }

    private void btnGejalaBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGejalaBaruActionPerformed
        txtKodeGejala.setEnabled(true);
        areaGejala.setEnabled(true);
    }//GEN-LAST:event_btnGejalaBaruActionPerformed

    private void btnGejalaSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGejalaSimpanActionPerformed
        String kodeGejala = txtKodeGejala.getText();
        String gejala = areaGejala.getText().toLowerCase();
        int level = Integer.parseInt(cbLevel.getSelectedItem().toString());
        String penyakit = kodePenyakitDialog;

        if (btnGejalaSimpan.getText().equals("Simpan")) {
            try {
                String sql = "insert into tbl_gejala values(?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, kodeGejala);
                ps.setString(2, gejala);
                ps.setInt(3, level);
                ps.setString(4, penyakit);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                tampilGejala(queryTampilGejala);
            } catch (Exception e) {
                System.out.println("#Error " + e.getMessage());
            }
        } else {
            btnGejalaSimpan.setText("Simpan");
            String sql = "UPDATE tbl_gejala SET gejala='" + gejala + "' WHERE kode='" + kodeGejala + "'";
            try {
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                tampilGejala(queryTampilGejala);
            } catch (SQLException ex) {
                System.out.println("#Error " + ex.getMessage());
            }
        }

        clearGejala();
        txtKodeGejala.setEnabled(false);
        areaGejala.setEnabled(false);
    }//GEN-LAST:event_btnGejalaSimpanActionPerformed

    private void btnGejalaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGejalaEditActionPerformed
        int pilih = tblGejala.getSelectedRow();
        if (pilih == -1) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih item");
        } else {
            btnGejalaSimpan.setText("Ubah");
            txtKodeGejala.setText(tblGejala.getValueAt(pilih, 0).toString());
            areaGejala.setText(tblGejala.getValueAt(pilih, 1).toString());
            areaGejala.setEnabled(true);
        }
    }//GEN-LAST:event_btnGejalaEditActionPerformed

    private void btnGejalaHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGejalaHapusActionPerformed
        int pilih = tblGejala.getSelectedRow();
        String kodeGejala = "";
        if (pilih == -1) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih item");
        } else {
            kodeGejala = tblGejala.getValueAt(pilih, 0).toString();
        }
        try {
            String sql = "DELETE from tbl_gejala WHERE kode='" + kodeGejala + "'";
            ps = con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            tampilGejala(queryTampilGejala);
        } catch (Exception e) {
            System.out.println("#Error " + e.getMessage());
        }
        /*
        System.out.println("Kode Penyakit : "+kodePenyakitDialog);
        System.out.println(cbLevel.getSelectedItem().toString());
        */
    }//GEN-LAST:event_btnGejalaHapusActionPerformed

    private void btnPenyakitBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenyakitBaruActionPerformed
        txtKodePenyakit.setEnabled(true);
        areaPenyakit.setEnabled(true);
        areaSolusi.setEnabled(true);
    }//GEN-LAST:event_btnPenyakitBaruActionPerformed

    private void btnPenyakitSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenyakitSimpanActionPerformed
        String kodePenyakit = txtKodePenyakit.getText().toUpperCase();
        String penyakit = areaPenyakit.getText().toLowerCase();
        String solusi = areaSolusi.getText().toLowerCase();

        if (btnPenyakitSimpan.getText().equals("Simpan")) {
            try {
                String sql = "insert into tbl_penyakit values(?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, kodePenyakit);
                ps.setString(2, penyakit);
                ps.setString(3, solusi);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                tampilPenyakit(queryTampilPenyakit);
            } catch (Exception e) {
                System.out.println("#Error " + e.getMessage());
            }
        } else {
            btnPenyakitSimpan.setText("Simpan");
            String sql = "UPDATE tbl_penyakit SET penyakit='" + penyakit + "' WHERE kode='" + kodePenyakit + "'";
            try {
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                tampilPenyakit(queryTampilPenyakit);
            } catch (SQLException ex) {
                System.out.println("#Error " + ex.getMessage());
            }
        }

        clearPenyakit();
        txtKodePenyakit.setEnabled(false);
        areaPenyakit.setEnabled(false);
        areaSolusi.setEnabled(false);
    }//GEN-LAST:event_btnPenyakitSimpanActionPerformed

    private void btnPenyakitEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenyakitEditActionPerformed
        int pilih = tblPenyakit.getSelectedRow();
        if (pilih == -1) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih item");
        } else {
            btnPenyakitSimpan.setText("Ubah");
            txtKodePenyakit.setText(tblPenyakit.getValueAt(pilih, 0).toString());
            areaPenyakit.setText(tblPenyakit.getValueAt(pilih, 1).toString());
            areaPenyakit.setEnabled(true);
        }
    }//GEN-LAST:event_btnPenyakitEditActionPerformed

    private void btnPenyakitHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenyakitHapusActionPerformed
        int pilih = tblPenyakit.getSelectedRow();
        String kodePenyakit = "";
        if (pilih == -1) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih item");
        } else {
            kodePenyakit = tblPenyakit.getValueAt(pilih, 0).toString();
        }
        try {
            String sql = "DELETE from tbl_penyakit WHERE kode='" + kodePenyakit + "'";
            ps = con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            tampilPenyakit(queryTampilPenyakit);
        } catch (Exception e) {
            System.out.println("#Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnPenyakitHapusActionPerformed

    private void btnOpenDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenDialogActionPerformed
        try {
            DialogPenyakit dialogPenyakit = new DialogPenyakit();
            dialogPenyakit.formAdmin = this;
            dialogPenyakit.show();
        } catch (SQLException ex) {
            Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnOpenDialogActionPerformed

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        try {
            new FormLogin().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new FormAwal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try {
            new FormTambahAdmin().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnPenyakitCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenyakitCariActionPerformed
        String searchParam = txtPenyakitPencarian.getText();
        String query = "SELECT * FROM tbl_penyakit WHERE kode LIKE '%"+searchParam+"%' OR penyakit LIKE '%"+searchParam+"%' ORDER BY kode + 0 ASC";
        try {
            tampilPenyakit(query);
        } catch (SQLException ex) {
            Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPenyakitCariActionPerformed

    private void btnGejalaCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGejalaCariActionPerformed
        String searchParam = txtGejalaPencarian.getText();
        String query = "SELECT * FROM tbl_gejala WHERE kode LIKE '%"+searchParam+"%' OR penyakit LIKE '%"+searchParam+"%' ORDER BY kode + 0 ASC";
        try {
            tampilGejala(query);
        } catch (SQLException ex) {
            Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGejalaCariActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormAdmin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaGejala;
    private javax.swing.JTextArea areaPenyakit;
    private javax.swing.JTextArea areaSolusi;
    private javax.swing.JButton btnGejalaBaru;
    private javax.swing.JButton btnGejalaCari;
    private javax.swing.JButton btnGejalaEdit;
    private javax.swing.JButton btnGejalaHapus;
    private javax.swing.JButton btnGejalaSimpan;
    private javax.swing.JButton btnOpenDialog;
    private javax.swing.JButton btnPenyakitBaru;
    private javax.swing.JButton btnPenyakitCari;
    private javax.swing.JButton btnPenyakitEdit;
    private javax.swing.JButton btnPenyakitHapus;
    private javax.swing.JButton btnPenyakitSimpan;
    private javax.swing.JComboBox cbLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JTable tblGejala;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTable tblPenyakit;
    private javax.swing.JTextField txtGejalaPencarian;
    private javax.swing.JTextField txtKodeGejala;
    private javax.swing.JTextField txtKodePenyakit;
    public javax.swing.JTextField txtPenyakit;
    private javax.swing.JTextField txtPenyakitPencarian;
    // End of variables declaration//GEN-END:variables
}
