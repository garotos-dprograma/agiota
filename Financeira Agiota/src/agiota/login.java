/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agiota;

/**
 *
 * @author limal
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwdSenha1 = new javax.swing.JPasswordField();
        cbSalvarSenha = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        lblInaConta = new javax.swing.JLabel();
        btxEntrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pwdSenha = new javax.swing.JPasswordField();
        cbSalvarSenha1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblInaConta1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        pwdSenha1.setBackground(new java.awt.Color(255, 255, 255));
        pwdSenha1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pwdSenha1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdSenha1.setText("Senha");
        pwdSenha1.setBorder(null);
        pwdSenha1.setEchoChar('*');
        pwdSenha1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdSenha1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdSenha1FocusLost(evt);
            }
        });

        cbSalvarSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbSalvarSenha.setForeground(new java.awt.Color(255, 255, 255));
        cbSalvarSenha.setText("Salvar Informações");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Esqueceu sua senha?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        lblInaConta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInaConta.setText("Não possui conta?");

        btxEntrar.setBackground(new java.awt.Color(255, 102, 51));
        btxEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btxEntrar.setText("ENTRAR");
        btxEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxEntrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        txtUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUsuario1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario1.setText("Usuário ou E-mail");
        txtUsuario1.setBorder(null);
        txtUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuario1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuario1FocusLost(evt);
            }
        });
        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTRAR");

        pwdSenha.setBackground(new java.awt.Color(255, 255, 255));
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

        cbSalvarSenha1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbSalvarSenha1.setForeground(new java.awt.Color(255, 255, 255));
        cbSalvarSenha1.setText("Salvar Informações");
        cbSalvarSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalvarSenha1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Esqueceu sua senha?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Entrar");

        lblInaConta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInaConta1.setForeground(new java.awt.Color(255, 255, 255));
        lblInaConta1.setText("Não possui conta?");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Criar Nova Conta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblInaConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbSalvarSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsuario1)
                    .addComponent(jLabel1)
                    .addComponent(pwdSenha)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSalvarSenha1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInaConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuario1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuario1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1FocusGained

    private void txtUsuario1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuario1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1FocusLost

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void pwdSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdSenhaFocusGained
        if(pwdSenha.getText().equals("Senha")){
            pwdSenha.setText(null);
            pwdSenha.setEchoChar('*');}
    }//GEN-LAST:event_pwdSenhaFocusGained

    private void pwdSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdSenhaFocusLost
        if(pwdSenha.getText().isEmpty()){
            pwdSenha.setEchoChar((char)0);
            pwdSenha.setText("Senha");
        }
        if(!pwdSenha.getText().equals("Senha"))
        pwdSenha.setEchoChar('*');
    }//GEN-LAST:event_pwdSenhaFocusLost

    private void pwdSenha1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdSenha1FocusGained
        if(pwdSenha.getText().equals("Senha")){
            pwdSenha.setText(null);
            pwdSenha.setEchoChar('*');}
    }//GEN-LAST:event_pwdSenha1FocusGained

    private void pwdSenha1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdSenha1FocusLost
        if(pwdSenha.getText().isEmpty()){
            pwdSenha.setEchoChar((char)0);
            pwdSenha.setText("Senha");
        }
        if(!pwdSenha.getText().equals("Senha"))
        pwdSenha.setEchoChar('*');
    }//GEN-LAST:event_pwdSenha1FocusLost

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.out.println("Perdi a senha");
    }//GEN-LAST:event_jLabel2MousePressed

    private void btxEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btxEntrarActionPerformed

    private void cbSalvarSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalvarSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSalvarSenha1ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        System.out.println("Perdi a senha");
    }//GEN-LAST:event_jLabel3MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Cadastro().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btxEntrar;
    private javax.swing.JCheckBox cbSalvarSenha;
    private javax.swing.JCheckBox cbSalvarSenha1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblInaConta;
    private javax.swing.JLabel lblInaConta1;
    private javax.swing.JPasswordField pwdSenha;

    private javax.swing.JPasswordField pwdSenha1;

    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
