package view;

import javax.swing.JOptionPane;


public class TelaPituca extends javax.swing.JFrame {
 int cont = 1;

    public TelaPituca() {
        initComponents(); 
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnVoltar = new javax.swing.JButton();
        btnAdotar = new javax.swing.JButton();
        btnProximaFoto = new javax.swing.JButton();
        btnFotoAnterior = new javax.swing.JButton();
        lblFoto3 = new javax.swing.JLabel();
        lblFoto2 = new javax.swing.JLabel();
        lblFoto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Apresentacao");
        getContentPane().setLayout(null);

        BtnVoltar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVoltar);
        BtnVoltar.setBounds(20, 20, 100, 40);

        btnAdotar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnAdotar.setText("Quero Adotar!");
        btnAdotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdotarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdotar);
        btnAdotar.setBounds(570, 20, 200, 40);

        btnProximaFoto.setText(">");
        btnProximaFoto.setBorderPainted(false);
        btnProximaFoto.setContentAreaFilled(false);
        btnProximaFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProximaFotoMouseClicked(evt);
            }
        });
        btnProximaFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximaFoto);
        btnProximaFoto.setBounds(410, 0, 390, 600);

        btnFotoAnterior.setBackground(new java.awt.Color(255, 255, 255));
        btnFotoAnterior.setText("<");
        btnFotoAnterior.setBorder(null);
        btnFotoAnterior.setBorderPainted(false);
        btnFotoAnterior.setContentAreaFilled(false);
        btnFotoAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFotoAnteriorMouseClicked(evt);
            }
        });
        btnFotoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnFotoAnterior);
        btnFotoAnterior.setBounds(0, 0, 390, 600);

        lblFoto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelasAnimais/Pituca/download.jpg"))); // NOI18N
        getContentPane().add(lblFoto3);
        lblFoto3.setBounds(0, 0, 800, 600);

        lblFoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelasAnimais/Pituca/Lhasa-Apso.jpg"))); // NOI18N
        getContentPane().add(lblFoto2);
        lblFoto2.setBounds(0, 0, 800, 600);

        lblFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelasAnimais/Pituca/664-lhasa-apso-222201523.jpg"))); // NOI18N
        getContentPane().add(lblFoto1);
        lblFoto1.setBounds(0, 0, 800, 600);

        setSize(new java.awt.Dimension(814, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoAnteriorActionPerformed
    
    cont --;
    
    if(cont<1){
        cont = 3;
    }
        
      if(cont==1){    
    lblFoto1.setVisible(true);
    lblFoto2.setVisible(false);
    lblFoto3.setVisible(false);
    }
    else if(cont==2){
    lblFoto1.setVisible(false);
    lblFoto2.setVisible(true);
    lblFoto3.setVisible(false);     
    }
    else{
    lblFoto1.setVisible(false);
    lblFoto2.setVisible(false);
    lblFoto3.setVisible(true); 
    }
    
    System.out.println(cont);
    
    
    }//GEN-LAST:event_btnFotoAnteriorActionPerformed

    private void btnProximaFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaFotoActionPerformed
    cont ++;
    
    if(cont>3){
        cont = 1;
    }
   
      if(cont==1){    
    lblFoto1.setVisible(true);
    lblFoto2.setVisible(false);
    lblFoto3.setVisible(false);
    }
    else if(cont==2){
    lblFoto1.setVisible(false);
    lblFoto2.setVisible(true);
    lblFoto3.setVisible(false);     
    }
    else{
    lblFoto1.setVisible(false);
    lblFoto2.setVisible(false);
    lblFoto3.setVisible(true); 
    }
      
    System.out.println(cont);
       
    }//GEN-LAST:event_btnProximaFotoActionPerformed

    private void btnFotoAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoAnteriorMouseClicked
            }//GEN-LAST:event_btnFotoAnteriorMouseClicked

    private void btnProximaFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximaFotoMouseClicked
            }//GEN-LAST:event_btnProximaFotoMouseClicked

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
      dispose();
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void btnAdotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdotarActionPerformed
    JOptionPane.showMessageDialog(null, "Parabéns pela escolha" + "\n" + "Em breve entraremos em contato para dar"
            + " andamento na adoção do seu pet" + "\n" + "Obrigado!", "Processo de Adocao",1 );
    }//GEN-LAST:event_btnAdotarActionPerformed


    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPituca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPituca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPituca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPituca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPituca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JButton btnAdotar;
    private javax.swing.JButton btnFotoAnterior;
    private javax.swing.JButton btnProximaFoto;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblFoto2;
    private javax.swing.JLabel lblFoto3;
    // End of variables declaration//GEN-END:variables
}
