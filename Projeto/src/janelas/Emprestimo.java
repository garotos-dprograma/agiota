package janelas;

import classe.Pessoa;
import classe.Divida;
import conexoes.MySQL;
import javax.swing.JOptionPane;
import static classe.Gerenciador.idLogado;

public class Emprestimo extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Pessoa novoCliente = new Pessoa();
    Divida divida = new Divida();

    private int idDevedor;

    public int getIdDevedor() {
        return idDevedor;
    }

    public void setIdDevedor(int idDevedor) {
        this.idDevedor = idDevedor;
    }

    public Emprestimo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtemailAntigo2 = new javax.swing.JTextField();
        pPrincipal = new javax.swing.JPanel();
        lblValorEmprestimo = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtEmprestimo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        lblParcela = new javax.swing.JLabel();
        cbxParcela = new javax.swing.JComboBox<>();
        txtCPF = new javax.swing.JTextField();
        lblCpfDevedor = new javax.swing.JLabel();
        txtJuros = new javax.swing.JTextField();
        lblTaxaJuros = new javax.swing.JLabel();
        lblBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pPrincipal.setBackground(new java.awt.Color(255, 102, 51));
        pPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValorEmprestimo.setBackground(new java.awt.Color(0, 0, 0));
        lblValorEmprestimo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblValorEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        lblValorEmprestimo.setText("Digite o valor do empréstimo");
        pPrincipal.add(lblValorEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        btnSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save.png"))); // NOI18N
        btnSolicitar.setText("Cadastrar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        pPrincipal.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pPrincipal.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 332, -1, -1));
        pPrincipal.add(txtEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 182, -1));

        btnCancelar.setBackground(new java.awt.Color(220, 174, 50));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Voltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pPrincipal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        lblParcela.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblParcela.setForeground(new java.awt.Color(255, 255, 255));
        lblParcela.setText("Parcela");
        pPrincipal.add(lblParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        cbxParcela.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "3", "6 ", "9", "12", "24", "48" }));
        cbxParcela.setToolTipText("");
        pPrincipal.add(cbxParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 170, 80, -1));
        pPrincipal.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, -1));

        lblCpfDevedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCpfDevedor.setForeground(new java.awt.Color(255, 255, 255));
        lblCpfDevedor.setText("CPF do devedor");
        pPrincipal.add(lblCpfDevedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 109, -1));
        pPrincipal.add(txtJuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 94, -1));

        lblTaxaJuros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTaxaJuros.setForeground(new java.awt.Color(255, 255, 255));
        lblTaxaJuros.setText("Taxa de Juros(%)");
        pPrincipal.add(lblTaxaJuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/novoemprestimo.png"))); // NOI18N
        pPrincipal.add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean getIdPorCpf() {
        this.conectar.conectaBanco();
        boolean sucess = false;

        String consultaEndividado = this.txtCPF.getText();

        try {
            String pegarId = "Select id from pessoa "
                    + " WHERE "
                    + " cpf = '" + consultaEndividado + "';";
            this.conectar.executarSQL(pegarId);
            while (this.conectar.getResultSet().next()) {
                this.setIdDevedor(this.conectar.getResultSet().getInt(1));
            }

            if (idLogado == idDevedor) {
                JOptionPane.showMessageDialog(null, "O CPF informado é o mesmo do usuário logado!");
            } else {
                sucess = true;
            }
        } catch (Exception e) {
            System.out.println("Erro ao procurar devedor" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar id");
        } finally {
            this.conectar.fechaBanco();
        }
        return sucess;
    }

    public void criarDivida(Divida divida) {
        if (!getIdPorCpf())
            return;

        try {
            this.conectar.conectaBanco();
            String criar = "insert into divida(devedorId, agiotaId, taxaJuros, parcelas, valorAtual, valorProMes) "
                    + "values("
                    + idDevedor + ", "
                    + idLogado + ", "
                    + this.txtJuros.getText() + ", "
                    + this.cbxParcela.getSelectedIndex() + ", "
                    + this.txtEmprestimo.getText() + ", "
                    + "proxMes(" + this.txtEmprestimo.getText() + ", "
                    + this.txtJuros.getText() + ")"
                    + ");";
            this.conectar.insertSQL(criar);

            new MenuAgiota().setVisible(true);
            Emprestimo.this.dispose();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar dívida: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar dívida!");
        } finally {
            this.conectar.fechaBanco();
        }
    }

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSolicitarActionPerformed
        criarDivida(divida);
    }// GEN-LAST:event_btnSolicitarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLimparActionPerformed
        novoCliente.limparDados();
        this.txtEmprestimo.setText("");
        this.cbxParcela.setSelectedIndex(0);
        this.txtCPF.setText("");
        this.txtJuros.setText("");
    }// GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
        new MenuAgiota().setVisible(true);
        Emprestimo.this.dispose();
    }// GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbxParcela;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblCpfDevedor;
    private javax.swing.JLabel lblParcela;
    private javax.swing.JLabel lblTaxaJuros;
    private javax.swing.JLabel lblValorEmprestimo;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmprestimo;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtemailAntigo2;
    // End of variables declaration//GEN-END:variables

}
