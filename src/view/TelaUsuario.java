package view;

import dados.SistemaDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dados.Usuario;

public class TelaUsuario extends javax.swing.JFrame {

    public TelaUsuario() {
        initComponents();
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
    }

    public TelaUsuario(Usuario usuario, String operacao) {
        initComponents();
        txtUsuario.setText(usuario.getUsuario());
        txtSenha.setText(usuario.getSenha());
        txtNome.setText(usuario.getNome());
        txtDtNasc.setText(usuario.getDtNasc());
        txtCpf.setText(usuario.getCpf());
        txtTelefone.setText(usuario.getTelefone());
        txtEndereco.setText(usuario.getEndereco());
        txtNumero.setText(usuario.getNumero());
        txtCidade.setText(usuario.getCidade());
        txtEstado.setText(usuario.getEstado());
        txtCep.setText(usuario.getCep());

        if (operacao.equals("excluir")) {
            btnAlterar.setVisible(false);
            btnSalvar.setVisible(false);
        } else if (operacao.equals("alterar")) {
            btnExcluir.setVisible(false);
            btnSalvar.setVisible(false);
            txtUsuario.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEndereço = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDtNasc = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setText("jTextField1");

        setTitle("Tela de Usuario");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("*Usúario:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(20, 20, 130, 30);

        lblSenha.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("*Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(370, 20, 130, 30);

        lblNome.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("*Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 90, 130, 30);

        lblCPF.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("*CPF:");
        getContentPane().add(lblCPF);
        lblCPF.setBounds(20, 160, 130, 30);

        lblEndereço.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblEndereço.setForeground(new java.awt.Color(0, 0, 0));
        lblEndereço.setText("*Endereço:");
        getContentPane().add(lblEndereço);
        lblEndereço.setBounds(20, 230, 130, 30);

        lblNumero.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        lblNumero.setText("*Nº:");
        getContentPane().add(lblNumero);
        lblNumero.setBounds(600, 230, 130, 30);

        lblCidade.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(0, 0, 0));
        lblCidade.setText("Cidade:");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(20, 300, 130, 30);

        lblEstado.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("Estado:");
        getContentPane().add(lblEstado);
        lblEstado.setBounds(290, 300, 130, 30);

        lblCEP.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(0, 0, 0));
        lblCEP.setText("*CEP:");
        getContentPane().add(lblCEP);
        lblCEP.setBounds(570, 300, 130, 30);

        lblTelefone.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefone.setText("*Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(370, 160, 130, 30);

        lblDataNasc.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        lblDataNasc.setText("*Data de Nascimento:");
        getContentPane().add(lblDataNasc);
        lblDataNasc.setBounds(460, 90, 170, 30);

        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCidade);
        txtCidade.setBounds(90, 300, 190, 30);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(100, 20, 250, 30);

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNome);
        txtNome.setBounds(90, 90, 360, 30);

        txtDtNasc.setBackground(new java.awt.Color(255, 255, 255));
        txtDtNasc.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtDtNasc.setForeground(new java.awt.Color(0, 0, 0));
        txtDtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtNascActionPerformed(evt);
            }
        });
        getContentPane().add(txtDtNasc);
        txtDtNasc.setBounds(630, 90, 150, 30);

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(460, 160, 250, 30);

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(110, 230, 480, 30);

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNumero);
        txtNumero.setBounds(650, 230, 130, 30);

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        txtCpf.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCpfInputMethodTextChanged(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(70, 160, 250, 30);

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtEstado);
        txtEstado.setBounds(350, 300, 210, 30);

        txtCep.setBackground(new java.awt.Color(255, 255, 255));
        txtCep.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtCep.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtCep);
        txtCep.setBounds(620, 300, 160, 30);

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(txtSenha);
        txtSenha.setBounds(440, 20, 260, 30);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("*Dados de Preenchimento Obrigatório");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(534, 350, 250, 16);

        btnAlterar.setBackground(new java.awt.Color(51, 204, 0));
        btnAlterar.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnAlterar.setText("Salvar Alterações");
        btnAlterar.setBorder(null);
        btnAlterar.setBorderPainted(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        btnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlterarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(250, 410, 300, 50);

        btnExcluir.setBackground(new java.awt.Color(51, 204, 0));
        btnExcluir.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
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

        btnSalvar.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvar.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela de boas vindas.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-120, -30, 1100, 550);

        setSize(new java.awt.Dimension(814, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String u, s, n, dtn, cpf, tel, end, num, cep;
        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        dtn = txtDtNasc.getText();
        cpf = txtCpf.getText();
        tel = txtTelefone.getText();
        end = txtEndereco.getText();
        num = txtNumero.getText();
        cep = txtCep.getText();

        if (u.equals("")) {
            JOptionPane.showMessageDialog(null, "Usúario não preenchido");
            txtUsuario.requestFocus();
            return; // stop
        }

        if (s.equals("")) {
            JOptionPane.showMessageDialog(null, "Senha não preenchida");
            txtSenha.requestFocus();
            return; // stop
        }
        if (n.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome não preenchido");
            txtNome.requestFocus();
            return; // stop
        }
        if (dtn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data de Nascimento não preenchida");
            txtDtNasc.requestFocus();
            return; // stop
        }
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CPF não preenchido");
            txtCpf.requestFocus();
            return; // stop
        }
        if (tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Telefone não preenchido");
            txtTelefone.requestFocus();
            return; // stop
        }
        if (end.equals("")) {
            JOptionPane.showMessageDialog(null, "Endereço não preenchido");
            txtEndereco.requestFocus();
            return; // stop
        }
        if (num.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Número do endereço não preenchido");
            txtNumero.requestFocus();
            return; // stop
        }
        if (cep.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CEP não preenchido");
            txtCep.requestFocus();
            return; // stop
        }

        Usuario usuario;
        usuario = new Usuario(); // Instanciar um objeto
        usuario.setUsuario(txtUsuario.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setNome(txtNome.getText());
        usuario.setDtNasc(txtDtNasc.getText());
        usuario.setCpf(txtCpf.getText());
        usuario.setTelefone(txtTelefone.getText());
        usuario.setEndereco(txtEndereco.getText());
        usuario.setNumero(txtNumero.getText());
        usuario.setCidade(txtCidade.getText());
        usuario.setEstado(txtEstado.getText());
        usuario.setCep(txtCep.getText());

        //3 - Conectar com BD e salvar os dados no bd
        try {
            SistemaDao dao;
            dao = new SistemaDao();
            dao.salvarUsuario(usuario);

            //4.1 - Se Salvou no bd, mostrar msg e limpar os campos
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
            dispose();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtUsuario.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtDtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtNascActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

//1 - Perguntar se tem certeza que deseja excluir
        int resposta; // 0 - Sim; 1 - Não ; 2 - Cancelar
        resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir");
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmacao", 1);
        //  1.1 - Se a responta for sim

        if (resposta == 0) {

            //1.1.1 Obter o usuário no txtUsuario.
            Usuario usuario;
            usuario = new Usuario();
            usuario.setUsuario(txtUsuario.getText());

            //1.1.2 Conectar com bd
            try {
                SistemaDao dao;
                dao = new SistemaDao();
                dao.excluirUsuario(usuario);

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

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
               String  s, n, dtn, cpf, tel, end, num, cep;
        
        s = txtSenha.getText();
        n = txtNome.getText();
        dtn = txtDtNasc.getText();
        cpf = txtCpf.getText();
        tel = txtTelefone.getText();
        end = txtEndereco.getText();
        num = txtNumero.getText();
        cep = txtCep.getText();

        
        if (s.equals("")) {
            JOptionPane.showMessageDialog(null, "Senha não preenchida");
            txtSenha.requestFocus();
            return; // stop
        }
        if (n.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome não preenchido");
            txtNome.requestFocus();
            return; // stop
        }
        if (dtn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data de Nascimento não preenchida");
            txtDtNasc.requestFocus();
            return; // stop
        }
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CPF não preenchido");
            txtCpf.requestFocus();
            return; // stop
        }
        if (tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Telefone não preenchido");
            txtTelefone.requestFocus();
            return; // stop
        }
        if (end.equals("")) {
            JOptionPane.showMessageDialog(null, "Endereço não preenchido");
            txtEndereco.requestFocus();
            return; // stop
        }
        if (num.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Número do endereço não preenchido");
            txtNumero.requestFocus();
            return; // stop
        }
        if (cep.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CEP não preenchido");
            txtCep.requestFocus();
            return; // stop
        }
        
        Usuario usuario;
        usuario = new Usuario(); // Instanciar um objeto
        usuario.setUsuario(txtUsuario.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setNome(txtNome.getText());
        usuario.setDtNasc(txtDtNasc.getText());
        usuario.setCpf(txtCpf.getText());
        usuario.setTelefone(txtTelefone.getText());
        usuario.setEndereco(txtEndereco.getText());
        usuario.setNumero(txtNumero.getText());
        usuario.setCidade(txtCidade.getText());
        usuario.setEstado(txtEstado.getText());
        usuario.setCep(txtCep.getText());

        //3 - Conectar com BD e salvar os dados no bd
        try {

            SistemaDao dao;
            dao = new SistemaDao();
            dao.alterarDados(usuario);

            //4.1 - Se Salvou no bd, mostrar msg e limpar os campos
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");

            dispose();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtSenha.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtCpfInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCpfInputMethodTextChanged

    }//GEN-LAST:event_txtCpfInputMethodTextChanged

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvar.doClick();    }                                    
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarKeyPressed
    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnAlterar.doClick();    }                                    
    }//GEN-LAST:event_btnAlterarKeyPressed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnExcluir.doClick();    }                                    
    }//GEN-LAST:event_btnExcluirKeyPressed

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEndereço;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
