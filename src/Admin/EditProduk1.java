/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Admin;



import UILogin.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import Admin.DashAdm_Produk;
import static Admin.DashAdm_Produk.viewDataProduk;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author FAUZI
 */
public class EditProduk1 extends javax.swing.JDialog {

    
    public void setData(String kode, String nama, String gambar, String supplier, String kategori, int hargaJual, int hargaBeli, int stok, String deskripsi) {
        txtKodeProduk.setText(kode);
        txtNamaProduk.setText(nama);
        txtGambarProduk.setText(gambar);
        comboSupplierProduk.setSelectedItem(supplier);
        comboKategoriProduk.setSelectedItem(kategori);
        txtHargaJual.setText(String.valueOf(hargaJual));
        txtHargaBeli.setText(String.valueOf(hargaBeli));
        txtStokProduk.setText(String.valueOf(stok));
        txtDeskripsiProduk.setText(deskripsi);
    }

    public JTextField getTxtDeskripsiProduk() {
        return txtDeskripsiProduk;
    }

    public void setTxtDeskripsiProduk(JTextField txtDeskripsiProduk) {
        this.txtDeskripsiProduk = txtDeskripsiProduk;
    }

    public JTextField getTxtGambarProduk() {
        return txtGambarProduk;
    }

    public void setTxtGambarProduk(JTextField txtGambarProduk) {
        this.txtGambarProduk = txtGambarProduk;
    }

    public JTextField getTxtHargaBeli() {
        return txtHargaBeli;
    }

    public void setTxtHargaBeli(JTextField txtHargaBeli) {
        this.txtHargaBeli = txtHargaBeli;
    }

    public JTextField getTxtHargaJual() {
        return txtHargaJual;
    }

    public void setTxtHargaJual(JTextField txtHargaJual) {
        this.txtHargaJual = txtHargaJual;
    }

    public JTextField getTxtKodeProduk() {
        return txtKodeProduk;
    }

    public void setTxtKodeProduk(JTextField txtKodeProduk) {
        this.txtKodeProduk = txtKodeProduk;
    }

    public JTextField getTxtNamaProduk() {
        return txtNamaProduk;
    }

    public void setTxtNamaProduk(JTextField txtNamaProduk) {
        this.txtNamaProduk = txtNamaProduk;
    }

    public JTextField getTxtStokProduk() {
        return txtStokProduk;
    }

    public void setTxtStokProduk(JTextField txtStokProduk) {
        this.txtStokProduk = txtStokProduk;
    }
    
    private int id;
    private String KP;
    private String NP;
    private String GP;
    private String PSup;
    private String PK;
    private int HJ;
    private int HB;
    private int ST;
    private String DS;
    /**
     * Creates new form TambahProduk1
     */
    public EditProduk1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        viewCategory("produk_kategori", comboSupplierProduk);
        viewCategory("supplier", comboKategoriProduk);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKodeProduk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaProduk = new javax.swing.JTextField();
        txtGambarProduk = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboKategoriProduk = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtStokProduk = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHargaBeli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHargaJual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDeskripsiProduk = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboSupplierProduk = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnSimpanEdit = new rojeru_san.complementos.RSButtonHover();
        btnBatal = new rojeru_san.complementos.RSButtonHover();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Form Edit Produk");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        txtKodeProduk.setEditable(false);
        txtKodeProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeProdukActionPerformed(evt);
            }
        });
        jPanel1.add(txtKodeProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 30));

        jLabel4.setText("Kode Produk");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, 20));

        jLabel5.setText("Nama");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 20));

        txtNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaProdukActionPerformed(evt);
            }
        });
        jPanel1.add(txtNamaProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 253, 30));

        txtGambarProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGambarProdukActionPerformed(evt);
            }
        });
        jPanel1.add(txtGambarProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, 30));

        jLabel7.setText("Gambar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, 20));

        comboKategoriProduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboKategoriProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKategoriProdukActionPerformed(evt);
            }
        });
        jPanel1.add(comboKategoriProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        jLabel8.setText("Produk Supplier");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 40));

        jButton1.setText("Pilih");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 60, 30));

        txtStokProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokProdukActionPerformed(evt);
            }
        });
        jPanel1.add(txtStokProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 253, 30));

        jLabel11.setText("Stok");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, -1));

        txtHargaBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaBeliActionPerformed(evt);
            }
        });
        jPanel1.add(txtHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 253, 30));

        jLabel10.setText("Harga Jual");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 80, 20));

        txtHargaJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaJualActionPerformed(evt);
            }
        });
        jPanel1.add(txtHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 253, 30));

        jLabel9.setText("Harga Jual");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 80, 20));

        txtDeskripsiProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeskripsiProdukActionPerformed(evt);
            }
        });
        jPanel1.add(txtDeskripsiProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 250, 80));

        jLabel12.setText("Deskripsi");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 80, 20));

        comboSupplierProduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboSupplierProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        jLabel6.setText("Kategori");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 20));

        btnSimpanEdit.setText("Simpan");
        btnSimpanEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpanEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 610, 10));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeProdukActionPerformed

    private void txtNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaProdukActionPerformed

    private void txtGambarProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGambarProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGambarProdukActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtStokProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokProdukActionPerformed

    private void txtHargaBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaBeliActionPerformed

    private void txtHargaJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaJualActionPerformed

    private void txtDeskripsiProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeskripsiProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeskripsiProdukActionPerformed

    private void btnSimpanEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanEditActionPerformed
        // Ambil data dari form
        String kodeProduk = txtKodeProduk.getText();
        String namaProduk = txtNamaProduk.getText();
        String gambarProduk = txtGambarProduk.getText();
        String produkSupplier = comboSupplierProduk.getSelectedItem().toString();
        String produkKategori = comboKategoriProduk.getSelectedItem().toString();
        int hargaJual;
        int hargaBeli;
        int stok;
        String deskripsi = txtDeskripsiProduk.getText();

        // Validasi input
        if (namaProduk.isEmpty() || gambarProduk.isEmpty() || produkSupplier.isEmpty() || produkKategori.isEmpty() || deskripsi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;  
        }

        // Cek apakah input harga dan stok berupa angka
        try {
            hargaJual = Integer.parseInt(txtHargaJual.getText());
            hargaBeli = Integer.parseInt(txtHargaBeli.getText());
            stok = Integer.parseInt(txtStokProduk.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Pastikan harga dan stok diisi dengan angka yang valid.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;  
        }

        try {
            Connection K = Koneksi.Go();
            String Q = "UPDATE produk SET nama_produk=?, gambar_produk=?, produk_supplier=?, produk_kategori=?, harga_produk_jual=?, harga_produk_beli=?, produk_stok=?, deskripsi_produk=? WHERE produk_kode=?";

            PreparedStatement PS = K.prepareStatement(Q);
            PS.setString(1, namaProduk);
            PS.setString(2, gambarProduk);
            PS.setString(3, produkSupplier);
            PS.setString(4, produkKategori);
            PS.setInt(5, hargaJual);
            PS.setInt(6, hargaBeli);
            PS.setInt(7, stok);
            PS.setString(8, deskripsi);
            PS.setString(9, kodeProduk);

            PS.executeUpdate();
            DashAdm_Produk.viewDataProduk(""); // Memperbarui tampilan data produk
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saat memperbarui data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
//        this.setVisible(false); 
    }//GEN-LAST:event_btnSimpanEditActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void comboKategoriProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKategoriProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboKategoriProdukActionPerformed

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
            java.util.logging.Logger.getLogger(EditProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditProduk1 dialog = new EditProduk1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnBatal;
    private rojeru_san.complementos.RSButtonHover btnSimpanEdit;
    private javax.swing.JComboBox<String> comboKategoriProduk;
    private javax.swing.JComboBox<String> comboSupplierProduk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDeskripsiProduk;
    private javax.swing.JTextField txtGambarProduk;
    private javax.swing.JTextField txtHargaBeli;
    private javax.swing.JTextField txtHargaJual;
    private javax.swing.JTextField txtKodeProduk;
    private javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtStokProduk;
    // End of variables declaration//GEN-END:variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKP() {
        return KP;
    }

    public void setKP(String KP) {
        this.KP = KP;
    }

    public String getNP() {
        return NP;
    }

    public void setNP(String NP) {
        this.NP = NP;
    }

    public String getGP() {
        return GP;
    }

    public void setGP(String GP) {
        this.GP = GP;
    }

    public String getPSup() {
        return PSup;
    }

    public void setPSup(String PSup) {
        this.PSup = PSup;
    }

    public String getPK() {
        return PK;
    }

    public void setPK(String PK) {
        this.PK = PK;
    }

    public int getHJ() {
        return HJ;
    }

    public void setHJ(int HJ) {
        this.HJ = HJ;
    }

    public int getHB() {
        return HB;
    }

    public void setHB(int HB) {
        this.HB = HB;
    }

    public int getST() {
        return ST;
    }

    public void setST(int ST) {
        this.ST = ST;
    }

    public String getDS() {
        return DS;
    }

    public void setDS(String DS) {
        this.DS = DS;
    }

    
    private void viewCategory(String tableName, JComboBox cmb) {
        try {
        cmb.removeAllItems();
        Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM "+tableName;
            ResultSet R = S.executeQuery(Q);
//            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("ID");                 	 	 	 	 	 	 	 	
                String name = R.getString("nama");
//                String desc = R.getString("description");
                cmb.addItem(id+"-"+name);                 
            }
        } catch (SQLException e) {
        System.err.println("ErrorCode: 1123"+e.getMessage());
        }
    }
    
}


