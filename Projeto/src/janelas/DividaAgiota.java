package janelas;

import classe.Pessoa;
import conexoes.MySQL;
import javax.swing.JOptionPane;

public class DividaAgiota extends javax.swing.JFrame {
    Pessoa usuarioLogado = new Pessoa();
    MySQL conectar = new MySQL();
    
    public DividaAgiota() {
        initComponents();
    }
    
    public DividaAgiota(Pessoa usuarioLogado){
        initComponents();
        this.usuarioLogado = usuarioLogado;
        this.lblOla.setText("Olá, Sr(a) " + this.usuarioLogado.getNome());
        buscarDividaTotal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTitulo = new javax.swing.JPanel();
        lblOla = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalDividas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalDevedores = new javax.swing.JLabel();
        btnAtualConsulta = new javax.swing.JButton();
        btnAtualDados = new javax.swing.JButton();
        btnAtualNovo = new javax.swing.JButton();
        lblConsulta = new javax.swing.JLabel();
        lblMeusDados = new javax.swing.JLabel();
        lblAprovar = new javax.swing.JLabel();
        btnAtualDados1 = new javax.swing.JButton();
        lblLogoff = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pTitulo.setBackground(new java.awt.Color(220, 174, 50));
        pTitulo.setForeground(new java.awt.Color(220, 174, 50));

        lblOla.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        lblOla.setForeground(new java.awt.Color(0, 0, 0));
        lblOla.setText("Olá, Agiota");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblOla, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(665, 665, 665))
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTituloLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblOla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(220, 174, 50));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total de clientes devendo:");

        lblTotalDividas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTotalDividas.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total de dívidas:");

        lblTotalDevedores.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lblTotalDevedores.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalDevedores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalDividas, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotalDividas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotalDevedores, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
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

        btnAtualNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mao_com_dinheiro.png"))); // NOI18N
        btnAtualNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualNovoActionPerformed(evt);
            }
        });

        lblConsulta.setBackground(new java.awt.Color(255, 255, 255));
        lblConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblConsulta.setText("Consulta");

        lblMeusDados.setBackground(new java.awt.Color(255, 255, 255));
        lblMeusDados.setForeground(new java.awt.Color(255, 255, 255));
        lblMeusDados.setText("Meus Dados");

        lblAprovar.setBackground(new java.awt.Color(255, 255, 255));
        lblAprovar.setForeground(new java.awt.Color(255, 255, 255));
        lblAprovar.setText("Emprestimos para Aprovar");

        btnAtualDados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logoff.png"))); // NOI18N
        btnAtualDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualDados1ActionPerformed(evt);
            }
        });

        lblLogoff.setBackground(new java.awt.Color(255, 255, 255));
        lblLogoff.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoff.setText("Log Off");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtualConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblConsulta)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAprovar)
                        .addGap(42, 42, 42)
                        .addComponent(lblMeusDados))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAtualNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAtualDados, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtualDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblLogoff)
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMeusDados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAprovar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualDados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buscarDividaTotal(){
        this.conectar.conectaBanco();
        try{
            String query = "SELECT "
                    + "SUM(valorAtual),"
                    + "COUNT(1) "
                    + "FROM divida "
                    + "WHERE agiotaId = " + this.usuarioLogado.getId();
            
            this.conectar.executarSQL (query);
            
            while (this.conectar.getResultSet().next()) {
                this.lblTotalDividas.setText("R$ " + this.conectar.getResultSet().getDouble(1));
                this.lblTotalDevedores.setText("" + this.conectar.getResultSet().getInt(2));
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar dívidas! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar dívidas!");
            
        } finally {
            this.conectar.fechaBanco();
        }
    }
    
    private void btnAtualConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualConsultaActionPerformed
        new ConsultaAgiota(usuarioLogado).setVisible(true);
        DividaAgiota.this.dispose();
    }//GEN-LAST:event_btnAtualConsultaActionPerformed

    private void btnAtualDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualDadosActionPerformed
        new InformacoesAgiota().setVisible(true);
        DividaAgiota.this.dispose();
    }//GEN-LAST:event_btnAtualDadosActionPerformed

    private void btnAtualNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualNovoActionPerformed
        new AprovacaoEmprestimo().setVisible(true);
        DividaAgiota.this.dispose();
    }//GEN-LAST:event_btnAtualNovoActionPerformed

    private void btnAtualDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualDados1ActionPerformed
        new Login().setVisible(true);
        DividaAgiota.this.dispose();
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
            java.util.logging.Logger.getLogger(DividaAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DividaAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DividaAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DividaAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DividaAgiota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualConsulta;
    private javax.swing.JButton btnAtualDados;
    private javax.swing.JButton btnAtualDados1;
    private javax.swing.JButton btnAtualNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAprovar;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblLogoff;
    private javax.swing.JLabel lblMeusDados;
    private javax.swing.JLabel lblOla;
    private javax.swing.JLabel lblTotalDevedores;
    private javax.swing.JLabel lblTotalDividas;
    private javax.swing.JPanel pTitulo;
    // End of variables declaration//GEN-END:variables
}
