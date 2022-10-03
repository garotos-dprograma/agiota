/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.facens.garotos.fab2.agiota.forms;

import java.awt.Toolkit;

/**
 *
 * @author aluno
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
        initComponents();
        setIcon();
    }
    int focusLogin = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTelaLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        cbSalvarSenha = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        lblInaConta = new javax.swing.JLabel();
        lblInaConta1 = new javax.swing.JLabel();
        lblImgTelaLogin = new javax.swing.JLabel();
        lblEntrarBotao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar");
        setName("Entrar"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jpTelaLogin.setName("Entrar"); // NOI18N
        jpTelaLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Entrar");
        jpTelaLogin.add(jLabel1);
        jLabel1.setBounds(890, 90, 100, 80);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Usuário ou E-mail");
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        jpTelaLogin.add(txtUsuario);
        txtUsuario.setBounds(720, 170, 390, 70);

        pwdSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pwdSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdSenha.setText("Senha");
        pwdSenha.setBorder(null);
        pwdSenha.setEchoChar('*');
        pwdSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdSenhaFocusLost(evt);
            }
        });
        jpTelaLogin.add(pwdSenha);
        pwdSenha.setBounds(720, 320, 390, 70);

        cbSalvarSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbSalvarSenha.setText("Salvar Informações");
        jpTelaLogin.add(cbSalvarSenha);
        cbSalvarSenha.setBounds(720, 410, 160, 25);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Esqueceu sua senha?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jpTelaLogin.add(jLabel2);
        jLabel2.setBounds(960, 410, 150, 17);

        lblInaConta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInaConta.setText("Não possui conta?");
        jpTelaLogin.add(lblInaConta);
        lblInaConta.setBounds(720, 520, 160, 40);

        lblInaConta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInaConta1.setForeground(new java.awt.Color(51, 102, 255));
        lblInaConta1.setText("Criar nova conta");
        lblInaConta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInaConta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInaConta1MousePressed(evt);
            }
        });
        jpTelaLogin.add(lblInaConta1);
        lblInaConta1.setBounds(850, 520, 160, 40);

        lblImgTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/facens/garotos/fab2/agiota/imagens/telaLogin.png"))); // NOI18N
        lblImgTelaLogin.setText("jLabel3");
        lblImgTelaLogin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpTelaLogin.add(lblImgTelaLogin);
        lblImgTelaLogin.setBounds(-10, 0, 570, 720);

        lblEntrarBotao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEntrarBotao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/facens/garotos/fab2/agiota/imagens/button (1).png"))); // NOI18N
        lblEntrarBotao.setText("Entrar");
        lblEntrarBotao.setToolTipText("");
        lblEntrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrarBotao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEntrarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEntrarBotaoMousePressed(evt);
            }
        });
        jpTelaLogin.add(lblEntrarBotao);
        lblEntrarBotao.setBounds(680, 440, 470, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 1274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pwdSenha.setEchoChar((char) 0);

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Usuário ou E-mail");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        focusLogin++;
        if(txtUsuario.getText().equals("Usuário ou E-mail"))
            txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void pwdSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdSenhaFocusLost
        if(pwdSenha.getText().isEmpty()){
            pwdSenha.setEchoChar((char)0);
            pwdSenha.setText("Senha");
        }
        if(!pwdSenha.getText().equals("Senha"))
            pwdSenha.setEchoChar('*');
    }//GEN-LAST:event_pwdSenhaFocusLost

    private void pwdSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdSenhaFocusGained
        if(pwdSenha.getText().equals("Senha")){
            pwdSenha.setText(null);
            pwdSenha.setEchoChar('*');}
    }//GEN-LAST:event_pwdSenhaFocusGained

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.out.println("Perdi a senha");
    }//GEN-LAST:event_jLabel2MousePressed

    private void lblInaConta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInaConta1MousePressed
        System.out.println("Criar Conta");
        telaCadastro telaCad = new telaCadastro();
        telaCad.setVisible(true);
    }//GEN-LAST:event_lblInaConta1MousePressed

    private void lblEntrarBotaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarBotaoMousePressed
        if(cbSalvarSenha.isSelected())
            System.out.println("Programar onde salvar a senha");
    }//GEN-LAST:event_lblEntrarBotaoMousePressed

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbSalvarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpTelaLogin;
    private javax.swing.JLabel lblEntrarBotao;
    private javax.swing.JLabel lblImgTelaLogin;
    private javax.swing.JLabel lblInaConta;
    private javax.swing.JLabel lblInaConta1;
    private javax.swing.JPasswordField pwdSenha;

    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/facens/garotos/fab2/agiota/imagens/icone.png")));
    }
}
