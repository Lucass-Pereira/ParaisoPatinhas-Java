package view;

import dados.SistemaDao;
import dados.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lbl2 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        getContentPane().setLayout(null);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(260, 210, 300, 30);

        btnEntrar.setBackground(new java.awt.Color(51, 204, 0));
        btnEntrar.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entre");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(320, 330, 180, 31);

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(260, 280, 300, 30);

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(51, 204, 0));
        lbl2.setText("ou");
        getContentPane().add(lbl2);
        lbl2.setBounds(400, 365, 34, 30);

        btnCadastro.setBackground(new java.awt.Color(51, 204, 0));
        btnCadastro.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastre-se");
        btnCadastro.setBorder(null);
        btnCadastro.setBorderPainted(false);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        btnCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastroKeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastro);
        btnCadastro.setBounds(320, 400, 180, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pukas\\Desktop\\Uninove\\2 Semestre\\Modelagem e desenvolvimento orientado a objetos\\Projetos Java\\ParaisoPatinhas\\src\\Imagens\\Tela de Login.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-100, 0, 910, 530);

        setSize(new java.awt.Dimension(814, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       try {
            Usuario usuario;
        usuario = new Usuario(); // Instanciar um objeto
        usuario.setUsuario(txtUsuario.getText());
        usuario.setSenha(txtSenha.getText());
            // chamar o que esta na classe SistemaDao
            SistemaDao dao;
            dao = new SistemaDao();
            ResultSet resultado = dao.validarUsuario(usuario);
         

            //4 - Verificar se o usuário foi encontrado na tabela usuário do banco de dados.
            if (resultado.next()) {
                String usu, nome, adm;
                usu = resultado.getString("usuario");
                nome = resultado.getString("nome");
                adm = resultado.getString("adm");
                //Abrir o formulário Menu.java
                Menu tela;
                tela = new Menu(usu, nome,adm);
                tela.setVisible(true);
                }else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
            }
            //5 - Desconectar.
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaUsuario tela;
        tela = new TelaUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnEntrar.doClick();    }//GEN-LAST:event_btnEntrarKeyPressed
    }
        
    private void btnCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastroKeyPressed
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnCadastro.doClick();}
    }//GEN-LAST:event_btnCadastroKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed

    }//GEN-LAST:event_txtUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
