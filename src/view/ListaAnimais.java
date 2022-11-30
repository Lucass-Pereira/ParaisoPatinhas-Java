
package view;

import dados.SistemaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListaAnimais extends javax.swing.JFrame {

   
    public ListaAnimais() {
        initComponents();
        preencherTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimais = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();

        setTitle("Lista de Animais");
        getContentPane().setLayout(null);

        tblAnimais.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        tblAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdAnimal", "Nome", "Especie", "Sexo", "Porte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnimais.setColumnSelectionAllowed(true);
        tblAnimais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAnimais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAnimais.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAnimais);
        tblAnimais.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 800, 400);

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel1.setText("Pesquise o Id do Animal:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 30, 170, 30);

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(540, 29, 240, 30);

        setSize(new java.awt.Dimension(814, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
     
          String p;
        p = txtPesquisa.getText();
        if (p.equalsIgnoreCase("")) {
            preencherTabela();
            return;
        }
        try {
            SistemaDao dao;
            dao = new SistemaDao();
            ResultSet resultado = dao.pesquisarAnimal(p);

            // 3 - Carregar Ususarios na tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblAnimais.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) { //laco de repeticao na variavel resultado
                Object dados[] = {
                    resultado.getString("Idanimal"),
                    resultado.getString("nome"),
                    resultado.getString("especie"),
                    resultado.getString("sexo"),
                    resultado.getString("porte"),
                };
                tblModelo.addRow(dados);
            }
            } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_txtPesquisaActionPerformed
                                                                  
    
  private void preencherTabela() {
        try {
            SistemaDao dao;
            dao = new SistemaDao();
            ResultSet resultado = dao.listarAnimais();

            // 3 - Carregar Ususarios na tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblAnimais.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) { //laco de repeticao na variavel resultado
                 Object dados[] = {
                    resultado.getString("Idanimal"),
                    resultado.getString("nome"),
                    resultado.getString("especie"),
                    resultado.getString("sexo"),
                    resultado.getString("porte"),
                };
                tblModelo.addRow(dados);
            }

            // 4 - Desconectar BD
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
  }
  
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
            java.util.logging.Logger.getLogger(ListaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnimais;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
