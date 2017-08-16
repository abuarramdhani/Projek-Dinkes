/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DlgAdmin.java
 *
 * Created on 21 Jun 10, 20:53:44
 */

package setting;

import fungsi.WarnaTable;
import fungsi.batasInput;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author perpustakaan
 */
public class DlgSetKamarInap extends javax.swing.JDialog {
    private final DefaultTableModel tabMode;
    private Connection koneksi=koneksiDB.condb();
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    private PreparedStatement ps;
    private ResultSet rs;

    /** Creates new form DlgAdmin
     * @param parent
     * @param modal */
    public DlgSetKamarInap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(10,10);
        setSize(457,249);

        Object[] row={"Jam Minimal Dihitung di Kamar","Hitung Hari dari Awal Masuk","Fee Perujuk Ranap","Aktifkan Diagnosa Akhir","Biaya Ranap Gabung Bayi"};
        tabMode=new DefaultTableModel(null,row){
              @Override public boolean isCellEditable(int rowIndex, int colIndex){return false;}
        };

        tbAdmin.setModel(tabMode);
        //tampil();
        //tbJabatan.setDefaultRenderer(Object.class, new WarnaTable(Scroll.getBackground(),Color.GREEN));
        tbAdmin.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbAdmin.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 5; i++) {
            TableColumn column = tbAdmin.getColumnModel().getColumn(i);
            column.setPreferredWidth(150);            
        }

        tbAdmin.setDefaultRenderer(Object.class, new WarnaTable());

        Jam.setDocument(new batasInput((byte)30).getOnlyAngka(Jam));
        fee.setDocument(new batasInput((byte)15).getOnlyAngka(fee));
        Bayi.setDocument(new batasInput((byte)15).getOnlyAngka(Bayi));
        try {
            ps=koneksi.prepareStatement("select * from set_jam_minimal ");
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFrame1 = new widget.InternalFrame();
        Scroll = new widget.ScrollPane();
        tbAdmin = new widget.Table();
        panelGlass7 = new widget.panelisi();
        jLabel4 = new widget.Label();
        Jam = new widget.TextBox();
        jLabel5 = new widget.Label();
        jLabel6 = new widget.Label();
        cmbYes = new widget.ComboBox();
        jLabel7 = new widget.Label();
        fee = new widget.TextBox();
        jLabel8 = new widget.Label();
        cmbYes2 = new widget.ComboBox();
        jLabel9 = new widget.Label();
        Bayi = new widget.TextBox();
        jLabel10 = new widget.Label();
        panelGlass5 = new widget.panelisi();
        BtnSimpan = new widget.Button();
        BtnBatal = new widget.Button();
        BtnHapus = new widget.Button();
        BtnEdit = new widget.Button();
        BtnKeluar = new widget.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Setup Kamar Inap ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        internalFrame1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        Scroll.setName("Scroll"); // NOI18N
        Scroll.setOpaque(true);

        tbAdmin.setAutoCreateRowSorter(true);
        tbAdmin.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        tbAdmin.setName("tbAdmin"); // NOI18N
        tbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdminMouseClicked(evt);
            }
        });
        tbAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAdminKeyPressed(evt);
            }
        });
        Scroll.setViewportView(tbAdmin);

        internalFrame1.add(Scroll, java.awt.BorderLayout.CENTER);

        panelGlass7.setName("panelGlass7"); // NOI18N
        panelGlass7.setPreferredSize(new java.awt.Dimension(44, 107));
        panelGlass7.setLayout(null);

        jLabel4.setText("Jam Minimal Dihitung di Kamar :");
        jLabel4.setName("jLabel4"); // NOI18N
        panelGlass7.add(jLabel4);
        jLabel4.setBounds(0, 12, 163, 23);

        Jam.setHighlighter(null);
        Jam.setName("Jam"); // NOI18N
        Jam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JamKeyPressed(evt);
            }
        });
        panelGlass7.add(Jam);
        Jam.setBounds(166, 12, 50, 23);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Jam");
        jLabel5.setName("jLabel5"); // NOI18N
        panelGlass7.add(jLabel5);
        jLabel5.setBounds(219, 12, 50, 23);

        jLabel6.setText("Fee Perujuk Ranap : Rp");
        jLabel6.setName("jLabel6"); // NOI18N
        panelGlass7.add(jLabel6);
        jLabel6.setBounds(0, 42, 179, 23);

        cmbYes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYes.setName("cmbYes"); // NOI18N
        cmbYes.setOpaque(false);
        cmbYes.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYesKeyPressed(evt);
            }
        });
        panelGlass7.add(cmbYes);
        cmbYes.setBounds(455, 12, 60, 23);

        jLabel7.setText("Hitung Hari dari Awal Masuk :");
        jLabel7.setName("jLabel7"); // NOI18N
        panelGlass7.add(jLabel7);
        jLabel7.setBounds(292, 12, 160, 23);

        fee.setHighlighter(null);
        fee.setName("fee"); // NOI18N
        fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                feeKeyPressed(evt);
            }
        });
        panelGlass7.add(fee);
        fee.setBounds(182, 42, 100, 23);

        jLabel8.setText("Aktifkan Diagnosa Akhir :");
        jLabel8.setName("jLabel8"); // NOI18N
        panelGlass7.add(jLabel8);
        jLabel8.setBounds(292, 42, 160, 23);

        cmbYes2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbYes2.setName("cmbYes2"); // NOI18N
        cmbYes2.setOpaque(false);
        cmbYes2.setPreferredSize(new java.awt.Dimension(55, 28));
        cmbYes2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbYes2KeyPressed(evt);
            }
        });
        panelGlass7.add(cmbYes2);
        cmbYes2.setBounds(455, 42, 60, 23);

        jLabel9.setText("Biaya Ranap Gabung Bayi :");
        jLabel9.setName("jLabel9"); // NOI18N
        panelGlass7.add(jLabel9);
        jLabel9.setBounds(0, 72, 163, 23);

        Bayi.setHighlighter(null);
        Bayi.setName("Bayi"); // NOI18N
        Bayi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BayiKeyPressed(evt);
            }
        });
        panelGlass7.add(Bayi);
        Bayi.setBounds(166, 72, 50, 23);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("%");
        jLabel10.setName("jLabel10"); // NOI18N
        panelGlass7.add(jLabel10);
        jLabel10.setBounds(219, 72, 50, 23);

        internalFrame1.add(panelGlass7, java.awt.BorderLayout.PAGE_START);

        panelGlass5.setName("panelGlass5"); // NOI18N
        panelGlass5.setPreferredSize(new java.awt.Dimension(55, 55));
        panelGlass5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpan.setMnemonic('S');
        BtnSimpan.setText("Simpan");
        BtnSimpan.setToolTipText("Alt+S");
        BtnSimpan.setName("BtnSimpan"); // NOI18N
        BtnSimpan.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        BtnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnSimpanKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnSimpan);

        BtnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Cancel-2-16x16.png"))); // NOI18N
        BtnBatal.setMnemonic('B');
        BtnBatal.setText("Baru");
        BtnBatal.setToolTipText("Alt+B");
        BtnBatal.setName("BtnBatal"); // NOI18N
        BtnBatal.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });
        BtnBatal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnBatalKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnBatal);

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stop_f2.png"))); // NOI18N
        BtnHapus.setMnemonic('H');
        BtnHapus.setText("Hapus");
        BtnHapus.setToolTipText("Alt+H");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        BtnHapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnHapusKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnHapus);

        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/inventaris.png"))); // NOI18N
        BtnEdit.setMnemonic('G');
        BtnEdit.setText("Ganti");
        BtnEdit.setToolTipText("Alt+G");
        BtnEdit.setIconTextGap(3);
        BtnEdit.setName("BtnEdit"); // NOI18N
        BtnEdit.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        BtnEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnEditKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnEdit);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnKeluar.setMnemonic('K');
        BtnKeluar.setText("Keluar");
        BtnKeluar.setToolTipText("Alt+K");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        BtnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnKeluarKeyPressed(evt);
            }
        });
        panelGlass5.add(BtnKeluar);

        internalFrame1.add(panelGlass5, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);
        internalFrame1.getAccessibleContext().setAccessibleName("::[ Setup Terhitung Kamar Inap ]::");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        if(Jam.getText().trim().equals("")){
            Valid.textKosong(Jam,"Jumlah Jam");
        }else if(Bayi.getText().trim().equals("")){
            Valid.textKosong(Bayi,"Biaya Ranap Gabung Bayi");
        }else if(fee.getText().trim().equals("")){
            Valid.textKosong(fee,"Fee Perujuk Ranap");
        }else if(tabMode.getRowCount()==0){
            Sequel.menyimpan("set_jam_minimal","'"+Jam.getText()+"','"+cmbYes.getSelectedItem()+"','"+fee.getText()+"','"+cmbYes2.getSelectedItem()+"','"+Bayi.getText()+"'","Set Kamar Inap");
            tampil();
            emptTeks();
        }else if(tabMode.getRowCount()>0){
            JOptionPane.showMessageDialog(null,"Maaf, Hanya diijinkan satu setup jam ...!!!!");
            Jam.requestFocus();
        }
}//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnSimpanActionPerformed(null);
        }else{
            Valid.pindah(evt,Bayi,BtnBatal);
        }
}//GEN-LAST:event_BtnSimpanKeyPressed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        emptTeks();
}//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnBatalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnBatalKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            emptTeks();
        }else{Valid.pindah(evt, BtnSimpan, BtnHapus);}
}//GEN-LAST:event_BtnBatalKeyPressed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        if(tabMode.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Maaf, data sudah habis...!!!!");
            Jam.requestFocus();
        }else if(Jam.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Gagal menghapus. Pilih dulu data yang mau dihapus.\nKlik data pada table untuk memilih...!!!!");
        }else if(! Jam.getText().trim().equals("")){
            Sequel.queryu("delete from set_jam_minimal");
            tampil();
            emptTeks();
        }
}//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHapusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnHapusKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnHapusActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnBatal, BtnKeluar);
        }
}//GEN-LAST:event_BtnHapusKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        if(tabMode.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Maaf, data jam minimal tidak boleh kosong ...!!!!");
            Jam.requestFocus();
        }else if(! (tabMode.getRowCount()==0)) {
            dispose();
        }
}//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }else{Valid.pindah(evt,BtnBatal,BtnKeluar);}
}//GEN-LAST:event_BtnKeluarKeyPressed

    private void tbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdminMouseClicked
        if(tabMode.getRowCount()!=0){
            try {
                getData();
            } catch (java.lang.NullPointerException e) {
            }
        }
}//GEN-LAST:event_tbAdminMouseClicked

    private void tbAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAdminKeyPressed
        if(tabMode.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getData();
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
}//GEN-LAST:event_tbAdminKeyPressed

private void JamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JamKeyPressed
     Valid.pindah(evt, BtnKeluar,cmbYes);

}//GEN-LAST:event_JamKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       tampil();
    }//GEN-LAST:event_formWindowOpened

    private void cmbYesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYesKeyPressed
        Valid.pindah(evt, Jam,fee);
    }//GEN-LAST:event_cmbYesKeyPressed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        if(Jam.getText().trim().equals("")){
            Valid.textKosong(Jam,"Jumlah Jam");
        }else if(Bayi.getText().trim().equals("")){
            Valid.textKosong(Bayi,"Biaya Ranap Gabung Bayi");
        }else if(fee.getText().trim().equals("")){
            Valid.textKosong(fee,"Fee Perujuk Ranap");
        }else{
            Sequel.queryu("delete from set_jam_minimal");
            Sequel.menyimpan("set_jam_minimal","'"+Jam.getText()+"','"+cmbYes.getSelectedItem()+"','"+fee.getText()+"','"+cmbYes2.getSelectedItem()+"','"+Bayi.getText()+"'","Jumlah Jam");
            tampil();
            emptTeks();
        }
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnEditKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnEditActionPerformed(null);
        }else{
            Valid.pindah(evt, BtnHapus, BtnKeluar);
        }
    }//GEN-LAST:event_BtnEditKeyPressed

    private void feeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feeKeyPressed
        Valid.pindah(evt,cmbYes,cmbYes2);
    }//GEN-LAST:event_feeKeyPressed

    private void cmbYes2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbYes2KeyPressed
        Valid.pindah(evt, fee,Bayi);
    }//GEN-LAST:event_cmbYes2KeyPressed

    private void BayiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BayiKeyPressed
        Valid.pindah(evt, cmbYes2,BtnSimpan);
    }//GEN-LAST:event_BayiKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgSetKamarInap dialog = new DlgSetKamarInap(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.TextBox Bayi;
    private widget.Button BtnBatal;
    private widget.Button BtnEdit;
    private widget.Button BtnHapus;
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private widget.TextBox Jam;
    private widget.ScrollPane Scroll;
    private widget.ComboBox cmbYes;
    private widget.ComboBox cmbYes2;
    private widget.TextBox fee;
    private widget.InternalFrame internalFrame1;
    private widget.Label jLabel10;
    private widget.Label jLabel4;
    private widget.Label jLabel5;
    private widget.Label jLabel6;
    private widget.Label jLabel7;
    private widget.Label jLabel8;
    private widget.Label jLabel9;
    private widget.panelisi panelGlass5;
    private widget.panelisi panelGlass7;
    private widget.Table tbAdmin;
    // End of variables declaration//GEN-END:variables

    public void tampil() {
        Valid.tabelKosong(tabMode);
        try{            
            rs=ps.executeQuery();
            while(rs.next()){
                tabMode.addRow(new Object[]{rs.getString(1),rs.getString(2),Valid.SetAngka(rs.getDouble(3)),rs.getString(4),rs.getString(5)});
             }
        }catch(SQLException e){
            System.out.println("Notifikasi : "+e);
        }
    }

    private void getData() {
        int row=tbAdmin.getSelectedRow();
        if(row!= -1){
            Jam.setText(tbAdmin.getValueAt(row,0).toString());            
            cmbYes.setSelectedItem(tbAdmin.getValueAt(row,1).toString());
            fee.setText(tbAdmin.getValueAt(row,2).toString());            
            cmbYes2.setSelectedItem(tbAdmin.getValueAt(row,3).toString());
            Bayi.setText(tbAdmin.getValueAt(row,4).toString());
        }
    }

    public void emptTeks() {
        Jam.setText("0");
        fee.setText("0");
        Bayi.setText("0");
        cmbYes.setSelectedItem("No");
        cmbYes2.setSelectedItem("No");
        Jam.requestFocus();
    }
}
