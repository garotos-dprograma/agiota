/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package janelas;

import classe.Cliente;
import conexoes.MySQL;
import javax.swing.JOptionPane;

/**
 *
 * @author limal
 */
public class AprovacaoEmprestimo extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Cliente novoCliente = new Cliente ();
    /**
     * Creates new form novaSenha
     */
    public AprovacaoEmprestimo() {
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

        txtemailAntigo2 = new javax.swing.JTextField();
        txtEmrpestimo1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnReprovar1 = new javax.swing.JButton();
        txtEmrpestimo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtEmrpestimo2 = new javax.swing.JTextField();
        txtEmrpestimo3 = new javax.swing.JTextField();
        txtEmrpestimo4 = new javax.swing.JTextField();
        txtEmrpestimo5 = new javax.swing.JTextField();
        txtEmrpestimo6 = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        txtNome2 = new javax.swing.JTextField();
        txtNome3 = new javax.swing.JTextField();
        txtNome4 = new javax.swing.JTextField();
        txtNome5 = new javax.swing.JTextField();
        txtNome6 = new javax.swing.JTextField();
        btnAprovar1 = new javax.swing.JButton();
        btnReprovar2 = new javax.swing.JButton();
        btnAprovar2 = new javax.swing.JButton();
        btnReprovar3 = new javax.swing.JButton();
        btnAprovar3 = new javax.swing.JButton();
        btnReprovar4 = new javax.swing.JButton();
        btnAprovar4 = new javax.swing.JButton();
        btnReprovar5 = new javax.swing.JButton();
        btnAprovar5 = new javax.swing.JButton();
        btnReprovar6 = new javax.swing.JButton();
        btnAprovar6 = new javax.swing.JButton();

        txtemailAntigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailAntigo2ActionPerformed(evt);
            }
        });

        txtEmrpestimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmrpestimo1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aprovar Empréstimo");

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        lblValor.setBackground(new java.awt.Color(0, 0, 0));
        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor.setText("Valor");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Aprovação Emprestimo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/binoculars.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReprovar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnReprovar1.setText("Negar");
        btnReprovar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprovar1ActionPerformed(evt);
            }
        });

        txtEmrpestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmrpestimoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtEmrpestimo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmrpestimo2ActionPerformed(evt);
            }
        });

        txtEmrpestimo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmrpestimo3ActionPerformed(evt);
            }
        });

        txtEmrpestimo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmrpestimo4ActionPerformed(evt);
            }
        });

        txtEmrpestimo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmrpestimo5ActionPerformed(evt);
            }
        });

        txtEmrpestimo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmrpestimo6ActionPerformed(evt);
            }
        });

        lblNome.setBackground(new java.awt.Color(0, 0, 0));
        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });

        txtNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome2ActionPerformed(evt);
            }
        });

        txtNome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome3ActionPerformed(evt);
            }
        });

        txtNome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome4ActionPerformed(evt);
            }
        });

        txtNome5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome5ActionPerformed(evt);
            }
        });

        txtNome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome6ActionPerformed(evt);
            }
        });

        btnAprovar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/updated.png"))); // NOI18N
        btnAprovar1.setText("Aprovar");
        btnAprovar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovar1ActionPerformed(evt);
            }
        });

        btnReprovar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnReprovar2.setText("Negar");
        btnReprovar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprovar2ActionPerformed(evt);
            }
        });

        btnAprovar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/updated.png"))); // NOI18N
        btnAprovar2.setText("Aprovar");
        btnAprovar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovar2ActionPerformed(evt);
            }
        });

        btnReprovar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnReprovar3.setText("Negar");
        btnReprovar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprovar3ActionPerformed(evt);
            }
        });

        btnAprovar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/updated.png"))); // NOI18N
        btnAprovar3.setText("Aprovar");
        btnAprovar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovar3ActionPerformed(evt);
            }
        });

        btnReprovar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnReprovar4.setText("Negar");
        btnReprovar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprovar4ActionPerformed(evt);
            }
        });

        btnAprovar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/updated.png"))); // NOI18N
        btnAprovar4.setText("Aprovar");
        btnAprovar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovar4ActionPerformed(evt);
            }
        });

        btnReprovar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnReprovar5.setText("Negar");
        btnReprovar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprovar5ActionPerformed(evt);
            }
        });

        btnAprovar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/updated.png"))); // NOI18N
        btnAprovar5.setText("Aprovar");
        btnAprovar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovar5ActionPerformed(evt);
            }
        });

        btnReprovar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnReprovar6.setText("Negar");
        btnReprovar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprovar6ActionPerformed(evt);
            }
        });

        btnAprovar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/updated.png"))); // NOI18N
        btnAprovar6.setText("Aprovar");
        btnAprovar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmrpestimo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(txtEmrpestimo5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmrpestimo4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmrpestimo3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmrpestimo2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmrpestimo))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNome6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(txtNome5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReprovar5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAprovar5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReprovar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAprovar1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReprovar2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAprovar2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReprovar3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAprovar3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReprovar4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAprovar4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReprovar6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAprovar6)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmrpestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReprovar1)
                    .addComponent(btnAprovar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmrpestimo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReprovar2)
                    .addComponent(btnAprovar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmrpestimo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReprovar3)
                    .addComponent(btnAprovar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmrpestimo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReprovar4)
                    .addComponent(btnAprovar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmrpestimo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReprovar5)
                    .addComponent(btnAprovar5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmrpestimo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReprovar6)
                    .addComponent(btnAprovar6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        

    public void atualizarEmail(Cliente novoCliente){
        this.conectar.conectaBanco();
        
        String consultaEmail = this.txtEmrpestimo.getText();
        
        try{
            var atualizaCpf = "UPDATE cadastroclientes SET "
                    + "email = '" + txtEmrpestimo.getText() + "' "
                    + " WHERE "
                    + " email = '" + consultaEmail + "';"
                    ;
            this.conectar.updateSQL (atualizaCpf);
            System.out.println(atualizaCpf);
            
            if(novoCliente.getNome() == ""){
                JOptionPane.showMessageDialog(null, "Erro não Buscar E-mail");
            }         
        } catch(Exception e) {
            System.out.println("Erro ao Atualizar Cliente"+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao buscar Email");
        
        } finally {
            txtEmrpestimo.setText(novoCliente.getSenha());
          
            
        }
    }
    
    private void txtEmrpestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmrpestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmrpestimoActionPerformed

    private void txtemailAntigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailAntigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailAntigo2ActionPerformed

    private void btnReprovar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprovar1ActionPerformed
        // TODO add your handling code here:
        novoCliente.LimparCliente();
        this.txtEmrpestimo.setText("");
      
    }//GEN-LAST:event_btnReprovar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        new DividaAgiota().setVisible(true);
        AprovacaoEmprestimo.this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtEmrpestimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmrpestimo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmrpestimo1ActionPerformed

    private void txtEmrpestimo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmrpestimo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmrpestimo2ActionPerformed

    private void txtEmrpestimo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmrpestimo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmrpestimo3ActionPerformed

    private void txtEmrpestimo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmrpestimo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmrpestimo4ActionPerformed

    private void txtEmrpestimo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmrpestimo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmrpestimo5ActionPerformed

    private void txtEmrpestimo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmrpestimo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmrpestimo6ActionPerformed

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void txtNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome2ActionPerformed

    private void txtNome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome3ActionPerformed

    private void txtNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome4ActionPerformed

    private void txtNome5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome5ActionPerformed

    private void txtNome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome6ActionPerformed

    private void btnAprovar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAprovar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        atualizarEmail(novoCliente);
        new InformacoesPessoais().setVisible(true);
        AprovacaoEmprestimo.this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnReprovar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprovar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReprovar2ActionPerformed

    private void btnAprovar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAprovar2ActionPerformed

    private void btnReprovar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprovar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReprovar3ActionPerformed

    private void btnAprovar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAprovar3ActionPerformed

    private void btnReprovar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprovar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReprovar4ActionPerformed

    private void btnAprovar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAprovar4ActionPerformed

    private void btnReprovar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprovar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReprovar5ActionPerformed

    private void btnAprovar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAprovar5ActionPerformed

    private void btnReprovar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprovar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReprovar6ActionPerformed

    private void btnAprovar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAprovar6ActionPerformed

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
            java.util.logging.Logger.getLogger(AprovacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AprovacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AprovacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AprovacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AprovacaoEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprovar1;
    private javax.swing.JButton btnAprovar2;
    private javax.swing.JButton btnAprovar3;
    private javax.swing.JButton btnAprovar4;
    private javax.swing.JButton btnAprovar5;
    private javax.swing.JButton btnAprovar6;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReprovar1;
    private javax.swing.JButton btnReprovar2;
    private javax.swing.JButton btnReprovar3;
    private javax.swing.JButton btnReprovar4;
    private javax.swing.JButton btnReprovar5;
    private javax.swing.JButton btnReprovar6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtEmrpestimo;
    private javax.swing.JTextField txtEmrpestimo1;
    private javax.swing.JTextField txtEmrpestimo2;
    private javax.swing.JTextField txtEmrpestimo3;
    private javax.swing.JTextField txtEmrpestimo4;
    private javax.swing.JTextField txtEmrpestimo5;
    private javax.swing.JTextField txtEmrpestimo6;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JTextField txtNome4;
    private javax.swing.JTextField txtNome5;
    private javax.swing.JTextField txtNome6;
    private javax.swing.JTextField txtemailAntigo2;
    // End of variables declaration//GEN-END:variables

}
