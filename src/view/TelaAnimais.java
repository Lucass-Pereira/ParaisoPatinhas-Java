package view;


import dados.Animais;
import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaAnimais extends javax.swing.JFrame {

    // Sera chamado pela op do menu "add usuario"
    public TelaAnimais() {
        initComponents();
        btnExcluir.setVisible(false);
        btnSalvarAlteracao.setVisible(false);
    }

    // Sera chamado pela op do menu "Excluir usuario"
    public TelaAnimais(String a, String operacao) {
        initComponents();
        
        if (operacao.equals("excluir")) {
            btnSalvarAlteracao.setVisible(false);
            btnSalvar.setVisible(false);
        } else if (operacao.equals("alterar")) {
            btnExcluir.setVisible(false);
            btnSalvar.setVisible(false);
            txtIdAnimal.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdAnimal = new javax.swing.JLabel();
        txtIdAnimal = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvarAlteracao = new javax.swing.JButton();
        lblPorte = new javax.swing.JLabel();
        cmbEspecie = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        cmbPorte = new javax.swing.JComboBox<>();

        setTitle("Cadastro de Animais");
        getContentPane().setLayout(null);

        lblIdAnimal.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        lblIdAnimal.setText("IdAnimal*");
        getContentPane().add(lblIdAnimal);
        lblIdAnimal.setBounds(420, 70, 50, 40);

        txtIdAnimal.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        txtIdAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAnimalActionPerformed(evt);
            }
        });
        txtIdAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdAnimalKeyPressed(evt);
            }
        });
        getContentPane().add(txtIdAnimal);
        txtIdAnimal.setBounds(480, 70, 280, 40);

        lblNome.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(430, 140, 40, 40);

        txtNome.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(480, 140, 280, 40);

        lblEspecie.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        lblEspecie.setText("Espécie*");
        getContentPane().add(lblEspecie);
        lblEspecie.setBounds(417, 210, 47, 40);

        lblSexo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        lblSexo.setText("Sexo");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(430, 280, 40, 40);

        btnSalvar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(30, 410, 200, 50);

        btnExcluir.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        btnExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExcluirKeyPressed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(570, 410, 200, 50);

        btnSalvarAlteracao.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnSalvarAlteracao.setText("Salvar Alterações");
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });
        btnSalvarAlteracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarAlteracaoKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracao);
        btnSalvarAlteracao.setBounds(250, 410, 300, 50);

        lblPorte.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lblPorte.setText("Porte");
        getContentPane().add(lblPorte);
        lblPorte.setBounds(630, 280, 40, 40);

        cmbEspecie.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        cmbEspecie.setMaximumRowCount(3);
        cmbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a espécie", "Cão", "Gato" }));
        getContentPane().add(cmbEspecie);
        cmbEspecie.setBounds(480, 210, 280, 40);

        cmbSexo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        cmbSexo.setMaximumRowCount(3);
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "M", "F" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSexo);
        cmbSexo.setBounds(480, 280, 80, 40);

        cmbPorte.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        cmbPorte.setMaximumRowCount(4);
        cmbPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "P", "M", "G" }));
        getContentPane().add(cmbPorte);
        cmbPorte.setBounds(680, 280, 80, 40);

        setSize(new java.awt.Dimension(814, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAnimalActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //1 - Pegar as informacoes doa campos do formulario

        //2 - Verificar se campo txtUsuario do formulario nao esta vazio
        if (txtIdAnimal.equals("")) {
            JOptionPane.showMessageDialog(null, "Id não preenchido");
            txtIdAnimal.requestFocus();
            return; // stop
        }

        if (cmbEspecie.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Espécie não selecionada");
            txtIdAnimal.requestFocus();
            return; // stop
        }
        
        Animais animal;
        animal = new Animais(); // Instanciar um objeto
        animal.setIdanimal(txtIdAnimal.getText());
        animal.setNome(txtNome.getText());
        animal.setEspecie(cmbEspecie.getSelectedItem().toString());
        animal.setSexo(cmbSexo.getSelectedItem().toString());
        animal.setPorte(cmbPorte.getSelectedItem().toString());

        //3 - Conectar com BD e salvar os dados no bd
        try {
            SistemaDao dao;
            dao = new SistemaDao();
            dao.salvarAnimal(animal);

            //4.1 - Se Salvou no bd, mostrar msg e limpar os campos
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
            txtIdAnimal.setText("");
            txtNome.setText("");
            cmbEspecie.setSelectedIndex(0);
            cmbSexo.setSelectedIndex(0);
            cmbPorte.setSelectedIndex(0);
            txtIdAnimal.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtIdAnimal.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtIdAnimalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAnimalKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtIdAnimalKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cmbEspecie.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvar.doClick();
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int resposta; // 0 - Sim; 1 - Não ; 2 - Cancelar
        resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir");
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmacao", 1);
        //  1.1 - Se a responta for sim

        if (resposta == 0) {

            //1.1.1 Obter o usuário no txtUsuario.
            Animais animal;
            animal = new Animais();
            animal.setIdanimal(txtIdAnimal.getText());

            //1.1.2 Conectar com bd
            try {
                SistemaDao dao;
                dao = new SistemaDao();
                dao.excluirAnimal(animal);

                //1.1.4 - Se Excluiu no bd, mostra msg de exclusao
                JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso");
                dispose();// fecha a tela
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
            }
        } else {// resposta foi nao
            dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnExcluir.doClick();
        }
    }//GEN-LAST:event_btnExcluirKeyPressed

    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
       
        String i, e;
        
        i = txtIdAnimal.getText();
        e = cmbEspecie.getSelectedItem().toString();
        
       if (i.equals("")) {
            JOptionPane.showMessageDialog(null, "Id não preenchido");
            txtIdAnimal.requestFocus();
            return; // stop
        }

        if (e.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Espécie não selecionada");
            cmbEspecie.requestFocus();
            return; // stop
        }
        
        Animais animal;
        animal = new Animais(); // Instanciar um objeto
        animal.setIdanimal(txtIdAnimal.getText());
        animal.setNome(txtNome.getText()); 
        animal.setSexo(cmbSexo.getSelectedItem().toString());
        animal.setEspecie(cmbEspecie.getSelectedItem().toString());
       animal.setPorte(cmbPorte.getSelectedItem().toString());

        //3 - Conectar com BD e salvar os dados no bd
        try {
            SistemaDao dao;
            dao = new SistemaDao();
            dao.alterarAnimal(animal);

            //4.1 - Se Salvou no bd, mostrar msg e limpar os campos
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
            txtIdAnimal.setText("");
            txtNome.setText("");
            cmbEspecie.setSelectedIndex(0);
            cmbSexo.setSelectedIndex(0);
            cmbPorte.setSelectedIndex(0);
            txtIdAnimal.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtIdAnimal.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed

    private void btnSalvarAlteracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvarAlteracao.doClick();
        }
    }//GEN-LAST:event_btnSalvarAlteracaoKeyPressed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JComboBox<String> cmbEspecie;
    private javax.swing.JComboBox<String> cmbPorte;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdAnimal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPorte;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtIdAnimal;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
