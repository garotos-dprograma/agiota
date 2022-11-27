package janelas;

import classe.Pessoa;
import conexoes.MySQL;
import javax.swing.JOptionPane;

public class DividaAtual extends javax.swing.JFrame {
    Pessoa usuarioLogado = new Pessoa();
    MySQL conectar = new MySQL();

    public DividaAtual() {
        initComponents();
    }
    
    public DividaAtual(Pessoa usuario) {
        initComponents();
        usuarioLogado = usuario;
        this.lblOla.setText("Olá, " + this.usuarioLogado.getNome());
        buscarDividaTotal();
    }
    
    public void buscarDividaTotal(){
        this.conectar.conectaBanco();
        try{
            String query = "SELECT "
                    + "SUM(valorAtual),"
                    + "COUNT(1) "
                    + "FROM divida "
                    + "WHERE devedorId = " + this.usuarioLogado.getId();
            
            this.conectar.executarSQL (query);
            
            while (this.conectar.getResultSet().next()) {
                this.lblDividaTotalValor.setText("R$ " + this.conectar.getResultSet().getDouble(1));
                this.lblTotalAgiotas.setText("" + this.conectar.getResultSet().getInt(2));
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar dívidas! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar dívidas!");
            
        } finally {
            this.conectar.fechaBanco();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pInicial = new javax.swing.JPanel();
        pDivida = new javax.swing.JPanel();
        lblDividaTotalValor = new javax.swing.JLabel();
        btnAtualConsulta = new javax.swing.JButton();
        btnAtualDados = new javax.swing.JButton();
        lblConsulta = new javax.swing.JLabel();
        lblMeusDados = new javax.swing.JLabel();
        btnAtualDados1 = new javax.swing.JButton();
        lblLogoff = new javax.swing.JLabel();
        lblVoceEstaDevendo = new javax.swing.JLabel();
        lblDividaAtual = new javax.swing.JLabel();
        lblTotalAgiotas = new javax.swing.JLabel();
        lblAgiotas = new javax.swing.JLabel();
        pTitulo = new javax.swing.JPanel();
        lblOla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pInicial.setBackground(new java.awt.Color(0, 0, 0));

        pDivida.setBackground(new java.awt.Color(255, 51, 51));

        lblDividaTotalValor.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        lblDividaTotalValor.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pDividaLayout = new javax.swing.GroupLayout(pDivida);
        pDivida.setLayout(pDividaLayout);
        pDividaLayout.setHorizontalGroup(
            pDividaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDividaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDividaTotalValor, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDividaLayout.setVerticalGroup(
            pDividaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDividaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDividaTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAtualConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/consultar.png"))); // NOI18N
        btnAtualConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualConsultaActionPerformed(evt);
            }
        });

        btnAtualDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dados.png"))); // NOI18N
        btnAtualDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualDadosActionPerformed(evt);
            }
        });

        lblConsulta.setBackground(new java.awt.Color(255, 255, 255));
        lblConsulta.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblConsulta.setText("Consulta");

        lblMeusDados.setBackground(new java.awt.Color(255, 255, 255));
        lblMeusDados.setForeground(new java.awt.Color(255, 255, 255));
        lblMeusDados.setText("Meus Dados");

        btnAtualDados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logoff.png"))); // NOI18N
        btnAtualDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualDados1ActionPerformed(evt);
            }
        });

        lblLogoff.setBackground(new java.awt.Color(255, 255, 255));
        lblLogoff.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoff.setText("Log Off");

        lblVoceEstaDevendo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblVoceEstaDevendo.setForeground(new java.awt.Color(255, 102, 102));
        lblVoceEstaDevendo.setText("Você está devendo para");

        lblDividaAtual.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        lblDividaAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblDividaAtual.setText("Dívida atual total:");

        lblTotalAgiotas.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTotalAgiotas.setForeground(new java.awt.Color(255, 102, 102));

        lblAgiotas.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblAgiotas.setForeground(new java.awt.Color(255, 102, 102));
        lblAgiotas.setText("agiotas.");

        javax.swing.GroupLayout pInicialLayout = new javax.swing.GroupLayout(pInicial);
        pInicial.setLayout(pInicialLayout);
        pInicialLayout.setHorizontalGroup(
            pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicialLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addComponent(lblDividaAtual)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addComponent(pDivida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pInicialLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblConsulta)))
                        .addGap(89, 89, 89)
                        .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualDados, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMeusDados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogoff)
                            .addComponent(btnAtualDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicialLayout.createSequentialGroup()
                        .addComponent(lblVoceEstaDevendo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalAgiotas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgiotas)
                        .addGap(562, 562, 562))))
        );
        pInicialLayout.setVerticalGroup(
            pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicialLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblDividaAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDivida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVoceEstaDevendo)
                    .addComponent(lblTotalAgiotas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgiotas))
                .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMeusDados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualDados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pTitulo.setBackground(new java.awt.Color(255, 51, 51));
        pTitulo.setForeground(new java.awt.Color(255, 102, 51));

        lblOla.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        lblOla.setForeground(new java.awt.Color(255, 255, 255));
        lblOla.setText("Olá, Endividado");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblOla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(670, 670, 670))
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTituloLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblOla)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualDadosActionPerformed
        // TODO add your handling code here:
        new InformacoesPessoais().setVisible(true);
        DividaAtual.this.dispose();
    }//GEN-LAST:event_btnAtualDadosActionPerformed

    private void btnAtualConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualConsultaActionPerformed
        // TODO add your handling code here:
        new ConsultaDivida(usuarioLogado).setVisible(true);
        DividaAtual.this.dispose();
    }//GEN-LAST:event_btnAtualConsultaActionPerformed

    private void btnAtualDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualDados1ActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        DividaAtual.this.dispose();
    }//GEN-LAST:event_btnAtualDados1ActionPerformed

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
            java.util.logging.Logger.getLogger(DividaAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DividaAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DividaAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DividaAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DividaAtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualConsulta;
    private javax.swing.JButton btnAtualDados;
    private javax.swing.JButton btnAtualDados1;
    private javax.swing.JLabel lblAgiotas;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblDividaAtual;
    private javax.swing.JLabel lblDividaTotalValor;
    private javax.swing.JLabel lblLogoff;
    private javax.swing.JLabel lblMeusDados;
    private javax.swing.JLabel lblOla;
    private javax.swing.JLabel lblTotalAgiotas;
    private javax.swing.JLabel lblVoceEstaDevendo;
    private javax.swing.JPanel pDivida;
    private javax.swing.JPanel pInicial;
    private javax.swing.JPanel pTitulo;
    // End of variables declaration//GEN-END:variables
}
