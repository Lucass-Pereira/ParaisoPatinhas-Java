package view;

import dados.Animais;
import dados.SistemaDao;
import dados.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private String u;

    public Menu(String usuario, String nome, String adm) {
        initComponents();
        u = usuario;
        lblSaudacao.setText("Bem vindo " + nome);
        lblAdm.setVisible(false);
        barMenu.setVisible(false);

        if (null != adm) {
            lblAdm.setVisible(true);
            barMenu.setVisible(true);
            btnCaes.setVisible(false);
            btnCaes.setVisible(false);
            btnGatos.setVisible(false);
            btnAnimais.setVisible(false);
        }
    }

    public Menu() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdm = new javax.swing.JLabel();
        lblSaudacao = new javax.swing.JLabel();
        btnAlterarDados = new javax.swing.JButton();
        btnCaes = new javax.swing.JButton();
        btnAnimais = new javax.swing.JButton();
        btnGatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        mnuClientes = new javax.swing.JMenu();
        itmListarC = new javax.swing.JMenuItem();
        itmExcluirC = new javax.swing.JMenuItem();
        mnuAnimais = new javax.swing.JMenu();
        itmListarA = new javax.swing.JMenuItem();
        itmAdiconarA = new javax.swing.JMenuItem();
        itmExcluirA = new javax.swing.JMenuItem();
        itmAlterarA = new javax.swing.JMenuItem();

        setTitle("Tela de Menu");
        getContentPane().setLayout(null);

        lblAdm.setBackground(new java.awt.Color(153, 255, 153));
        lblAdm.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        lblAdm.setForeground(new java.awt.Color(0, 0, 0));
        lblAdm.setText("Modo Administrador");
        getContentPane().add(lblAdm);
        lblAdm.setBounds(520, 20, 270, 30);

        lblSaudacao.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(10, 20, 280, 30);

        btnAlterarDados.setBackground(new java.awt.Color(51, 204, 0));
        btnAlterarDados.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        btnAlterarDados.setText("Alterar seus dados");
        btnAlterarDados.setBorderPainted(false);
        btnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosActionPerformed(evt);
            }
        });
        btnAlterarDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlterarDadosKeyPressed(evt);
            }
        });
        getContentPane().add(btnAlterarDados);
        btnAlterarDados.setBounds(20, 400, 270, 50);

        btnCaes.setBackground(new java.awt.Color(51, 204, 0));
        btnCaes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        btnCaes.setText("Caes");
        btnCaes.setBorderPainted(false);
        btnCaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaesActionPerformed(evt);
            }
        });
        btnCaes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCaesKeyPressed(evt);
            }
        });
        getContentPane().add(btnCaes);
        btnCaes.setBounds(500, 260, 270, 50);

        btnAnimais.setBackground(new java.awt.Color(51, 204, 0));
        btnAnimais.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        btnAnimais.setText("Todos Animais");
        btnAnimais.setBorderPainted(false);
        btnAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimaisActionPerformed(evt);
            }
        });
        btnAnimais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAnimaisKeyPressed(evt);
            }
        });
        getContentPane().add(btnAnimais);
        btnAnimais.setBounds(500, 400, 270, 50);

        btnGatos.setBackground(new java.awt.Color(51, 204, 0));
        btnGatos.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        btnGatos.setText("Gatos");
        btnGatos.setBorderPainted(false);
        btnGatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGatosActionPerformed(evt);
            }
        });
        btnGatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGatosKeyPressed(evt);
            }
        });
        getContentPane().add(btnGatos);
        btnGatos.setBounds(500, 330, 270, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pukas\\Desktop\\Uninove\\2 Semestre\\Modelagem e desenvolvimento orientado a objetos\\Projetos Java\\ParaisoPatinhas\\src\\Imagens\\Tela de boas vindas.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-120, -120, 960, 690);

        mnuClientes.setText("Clientes");

        itmListarC.setText("Listar Clientes");
        itmListarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarCActionPerformed(evt);
            }
        });
        mnuClientes.add(itmListarC);

        itmExcluirC.setText("Excluir Cadastro");
        itmExcluirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirCActionPerformed(evt);
            }
        });
        mnuClientes.add(itmExcluirC);

        barMenu.add(mnuClientes);

        mnuAnimais.setText("Animais");

        itmListarA.setText("Listar Animais");
        itmListarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarAActionPerformed(evt);
            }
        });
        mnuAnimais.add(itmListarA);

        itmAdiconarA.setText("Adicionar Animal");
        itmAdiconarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdiconarAActionPerformed(evt);
            }
        });
        mnuAnimais.add(itmAdiconarA);

        itmExcluirA.setText("Excluir Animal");
        itmExcluirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirAActionPerformed(evt);
            }
        });
        mnuAnimais.add(itmExcluirA);

        itmAlterarA.setText("Alterar Dados de um Animal");
        itmAlterarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarAActionPerformed(evt);
            }
        });
        mnuAnimais.add(itmAlterarA);

        barMenu.add(mnuAnimais);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(814, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosActionPerformed

        try {
            SistemaDao dao;
            dao = new SistemaDao();
            Usuario usuario = dao.buscarUsuario(u);
            TelaUsuario tela;
            tela = new TelaUsuario(usuario, "alterar");
            tela.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarDadosActionPerformed

    private void btnCaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaesActionPerformed

    }//GEN-LAST:event_btnCaesActionPerformed

    private void itmExcluirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirCActionPerformed

        String u;
       
        u = JOptionPane.showInputDialog(null, "Digite o usuario que deseja excluir: ");

        if (u.isEmpty()) {
            return;//stop
        }
try {
            SistemaDao dao;
            dao = new SistemaDao();
            Usuario usuario = dao.buscarUsuario(u);
          
            if (u == u ) { 
                TelaUsuario tela;
                tela = new TelaUsuario(usuario, "excluir");
                tela.setVisible(true);      
            } 
            else{
              JOptionPane.showMessageDialog(null, "Usuario não encontrado");
                return;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itmExcluirCActionPerformed

    private void itmListarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarCActionPerformed
    new ListaUsuarios().setVisible(true);    }//GEN-LAST:event_itmListarCActionPerformed

    private void btnAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimaisActionPerformed
      new TelaTodosAnimais().setVisible(true);
    }//GEN-LAST:event_btnAnimaisActionPerformed

    private void btnGatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGatosActionPerformed

    private void btnAlterarDadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarDadosKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnAlterarDados.doClick();
        }
    }//GEN-LAST:event_btnAlterarDadosKeyPressed

    private void btnCaesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCaesKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnCaes.doClick();
        }
    }//GEN-LAST:event_btnCaesKeyPressed

    private void btnGatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGatosKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnGatos.doClick();
        }
    }//GEN-LAST:event_btnGatosKeyPressed

    private void btnAnimaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAnimaisKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnAnimais.doClick();
        }
    }//GEN-LAST:event_btnAnimaisKeyPressed

    private void itmAlterarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarAActionPerformed


    }//GEN-LAST:event_itmAlterarAActionPerformed

    private void itmAdiconarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdiconarAActionPerformed
     new TelaAnimais().setVisible(true);
    }//GEN-LAST:event_itmAdiconarAActionPerformed

    private void itmListarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarAActionPerformed
        new ListaAnimais().setVisible(true);
    }//GEN-LAST:event_itmListarAActionPerformed

    private void itmExcluirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirAActionPerformed

    }//GEN-LAST:event_itmExcluirAActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnAlterarDados;
    private javax.swing.JButton btnAnimais;
    private javax.swing.JButton btnCaes;
    private javax.swing.JButton btnGatos;
    private javax.swing.JMenuItem itmAdiconarA;
    private javax.swing.JMenuItem itmAlterarA;
    private javax.swing.JMenuItem itmExcluirA;
    private javax.swing.JMenuItem itmExcluirC;
    private javax.swing.JMenuItem itmListarA;
    private javax.swing.JMenuItem itmListarC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAdm;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAnimais;
    private javax.swing.JMenu mnuClientes;
    // End of variables declaration//GEN-END:variables
}
