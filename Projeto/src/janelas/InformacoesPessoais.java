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
public class InformacoesPessoais extends javax.swing.JFrame {
        MySQL conectar = new MySQL();
        Cliente novoCliente = new Cliente ();
    /**
     * Creates new form InformacoesPessoais
     */
    public InformacoesPessoais() {
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

        tpInformacoes = new javax.swing.JTabbedPane();
        pInformacoes = new javax.swing.JPanel();
        pPrincipalInicial = new javax.swing.JPanel();
        pPrincipal = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtInformacoesCPF = new javax.swing.JTextField();
        txtInformacoesNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtInformacoesEmail = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtInformacoesSexo = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtInformacoesTelefone = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtInformacoesEstado = new javax.swing.JTextField();
        lblCIdade = new javax.swing.JLabel();
        txtInformacoesCidade = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtInformacoesRua = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtInformacoesCep = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtInformacoesCargo = new javax.swing.JTextField();
        pInfoTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnInformacoesBuscar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        pSeguranca = new javax.swing.JPanel();
        pSegurancaPrincipa = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        lblSeguranca = new javax.swing.JLabel();
        btnSegurançaExcluir = new javax.swing.JButton();
        lblMudaSenha = new javax.swing.JLabel();
        btnSegurançaMudança = new javax.swing.JButton();
        btnSegurançaAlterar = new javax.swing.JButton();
        lblExcluirConta = new javax.swing.JLabel();
        lblAltEmail = new javax.swing.JLabel();
        btnSegurancaVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações Pessoais");

        tpInformacoes.setBackground(new java.awt.Color(255, 102, 51));
        tpInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        tpInformacoes.setPreferredSize(new java.awt.Dimension(839, 406));

        pInformacoes.setBackground(new java.awt.Color(0, 0, 0));

        pPrincipalInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome Completo");

        txtInformacoesNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInformacoesNomeActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-Mail\n");

        lblSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo");

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone\n");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado\n");

        lblCIdade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCIdade.setForeground(new java.awt.Color(255, 255, 255));
        lblCIdade.setText("Cidade");

        lblRua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 255, 255));
        lblRua.setText("Rua");

        lblCep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCep.setForeground(new java.awt.Color(255, 255, 255));
        lblCep.setText("CEP");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");

        pInfoTitulo.setBackground(new java.awt.Color(255, 102, 51));
        pInfoTitulo.setForeground(new java.awt.Color(255, 102, 51));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Informações Pessoais");

        javax.swing.GroupLayout pInfoTituloLayout = new javax.swing.GroupLayout(pInfoTitulo);
        pInfoTitulo.setLayout(pInfoTituloLayout);
        pInfoTituloLayout.setHorizontalGroup(
            pInfoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoTituloLayout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        pInfoTituloLayout.setVerticalGroup(
            pInfoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVoltar.setBackground(new java.awt.Color(255, 102, 51));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/voltar.png"))); // NOI18N
        btnVoltar.setText("jButton1");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnInformacoesBuscar.setBackground(new java.awt.Color(255, 102, 51));
        btnInformacoesBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/binoculars.png"))); // NOI18N
        btnInformacoesBuscar.setText("Buscar");
        btnInformacoesBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesBuscarActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("CPF");

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pInfoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pPrincipalLayout.createSequentialGroup()
                                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRua)
                                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtInformacoesRua, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(txtInformacoesCargo))
                                .addGap(18, 18, 18)
                                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblCep)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtInformacoesCep, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                                        .addComponent(btnInformacoesBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblSexo)
                            .addComponent(lblTelefone)
                            .addComponent(lblEstado)
                            .addComponent(lblNome)
                            .addComponent(lblCpf))
                        .addGap(12, 12, 12)
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtInformacoesNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInformacoesEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInformacoesSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInformacoesTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pPrincipalLayout.createSequentialGroup()
                                .addComponent(txtInformacoesEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCIdade)
                                .addGap(18, 18, 18)
                                .addComponent(txtInformacoesCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtInformacoesCPF))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInfoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInformacoesCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblCpf))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInformacoesNome, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtInformacoesEmail))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInformacoesSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtInformacoesTelefone))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInformacoesEstado)
                    .addComponent(lblCIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInformacoesCidade))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInformacoesRua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInformacoesCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInformacoesCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInformacoesBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout pPrincipalInicialLayout = new javax.swing.GroupLayout(pPrincipalInicial);
        pPrincipalInicial.setLayout(pPrincipalInicialLayout);
        pPrincipalInicialLayout.setHorizontalGroup(
            pPrincipalInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pPrincipalInicialLayout.setVerticalGroup(
            pPrincipalInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pInformacoesLayout = new javax.swing.GroupLayout(pInformacoes);
        pInformacoes.setLayout(pInformacoesLayout);
        pInformacoesLayout.setHorizontalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pPrincipalInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pInformacoesLayout.setVerticalGroup(
            pInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipalInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpInformacoes.addTab("Informações Pessoais", pInformacoes);

        pSegurancaPrincipa.setBackground(new java.awt.Color(0, 0, 0));
        pSegurancaPrincipa.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pSegurancaPrincipa.setPreferredSize(new java.awt.Dimension(839, 406));

        pTitulo.setBackground(new java.awt.Color(255, 102, 51));
        pTitulo.setForeground(new java.awt.Color(255, 102, 51));

        lblSeguranca.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblSeguranca.setText("Segurança");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSegurançaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/deletar 1.png"))); // NOI18N
        btnSegurançaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegurançaExcluirActionPerformed(evt);
            }
        });

        lblMudaSenha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblMudaSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblMudaSenha.setText("Mudança de Senha");

        btnSegurançaMudança.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ver_senha.png"))); // NOI18N
        btnSegurançaMudança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegurançaMudançaActionPerformed(evt);
            }
        });

        btnSegurançaAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/email.png"))); // NOI18N
        btnSegurançaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegurançaAlterarActionPerformed(evt);
            }
        });

        lblExcluirConta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblExcluirConta.setForeground(new java.awt.Color(255, 255, 255));
        lblExcluirConta.setText("Excluir Conta");

        lblAltEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAltEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblAltEmail.setText("Alterar Email");

        btnSegurancaVoltar.setBackground(new java.awt.Color(255, 102, 51));
        btnSegurancaVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/voltar.png"))); // NOI18N
        btnSegurancaVoltar.setText("jButton1");
        btnSegurancaVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegurancaVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSegurancaPrincipaLayout = new javax.swing.GroupLayout(pSegurancaPrincipa);
        pSegurancaPrincipa.setLayout(pSegurancaPrincipaLayout);
        pSegurancaPrincipaLayout.setHorizontalGroup(
            pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSegurancaPrincipaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                        .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSegurançaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSegurançaMudança, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMudaSenha)
                        .addContainerGap(466, Short.MAX_VALUE))
                    .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                        .addComponent(btnSegurançaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAltEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSegurancaVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lblExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(486, Short.MAX_VALUE)))
        );
        pSegurancaPrincipaLayout.setVerticalGroup(
            pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSegurancaPrincipaLayout.createSequentialGroup()
                .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                        .addGap(122, 255, Short.MAX_VALUE)
                        .addComponent(lblMudaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSegurançaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSegurançaMudança, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                        .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSegurançaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAltEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                        .addComponent(btnSegurancaVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
            .addGroup(pSegurancaPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pSegurancaPrincipaLayout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lblExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pSegurancaLayout = new javax.swing.GroupLayout(pSeguranca);
        pSeguranca.setLayout(pSegurancaLayout);
        pSegurancaLayout.setHorizontalGroup(
            pSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSegurancaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pSegurancaPrincipa, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                .addContainerGap())
        );
        pSegurancaLayout.setVerticalGroup(
            pSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSegurancaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSegurancaPrincipa, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpInformacoes.addTab("Segurança", pSeguranca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tpInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void deletarCliente(Cliente novoCliente){
        this.conectar.conectaBanco();
        
        String consultaCpf = this.txtInformacoesCPF.getText();
        
        try{
            String deletarCpf = "DELETE from cadastroclientes where cpf = '" + consultaCpf + "'";
                           
            this.conectar.updateSQL (deletarCpf);
            System.out.println(deletarCpf);
            
            
            
        } catch (Exception e) {
            System.out.println("Erro ao Deletar Cliente"+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao Deletar Cliente");
        }
    }
    
    
    
    
    private void buscarCliente(Cliente novoCliente) {
        this.conectar.conectaBanco();
        String consultaCpf = this.txtInformacoesCPF.getText ();
        
        try{
            String buscarCliente = "SELECT"
                    +"cpf,"
                    +"nome,"
                    +"email,"
                    +"sexo,"
                    +"telefone,"
                    +"estado,"
                    +"cidade,"
                    +"rua,"    
                    +"cep,"
                    +"cargo,"
                    + " WHERE "
                        + " cpf = '" + consultaCpf + "';"
                    ;
            
            this.conectar.executarSQL (buscarCliente);
            
            while (this.conectar.getResultSet().next()) {
                novoCliente.setCpf(this.conectar.getResultSet().getString(1));
                novoCliente.setNome(this.conectar.getResultSet().getString(2));
                novoCliente.setEmail(this.conectar.getResultSet().getString(3));
                novoCliente.setSexo(this.conectar.getResultSet().getString(4));
                novoCliente.setTelefone(this.conectar.getResultSet().getString(5));
                novoCliente.setEstado(this.conectar.getResultSet().getString(6));
                novoCliente.setCidade(this.conectar.getResultSet().getString(7));
                novoCliente.setRua(this.conectar.getResultSet().getString(8));
                novoCliente.setCep(this.conectar.getResultSet().getString(9));
                novoCliente.setCargo(this.conectar.getResultSet().getString(10));
            }
            if (novoCliente.getCpf() == ""){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar Cliente " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cliente");
            
        } finally {
            txtInformacoesCPF.setText(novoCliente.getCpf());
            txtInformacoesNome.setText(novoCliente.getNome());
            txtInformacoesEmail.setText(novoCliente.getEmail());
            txtInformacoesSexo.setText(novoCliente.getSexo());
            txtInformacoesTelefone.setText(novoCliente.getTelefone());
            txtInformacoesEstado.setText(novoCliente.getEstado());
            txtInformacoesCidade.setText(novoCliente.getCidade());
            txtInformacoesRua.setText(novoCliente.getRua());
            txtInformacoesCep.setText(novoCliente.getCep());
            txtInformacoesCargo.setText(novoCliente.getCargo());
            this.conectar.fechaBanco();
        } 
        
        
    }
    
    
    private void txtInformacoesNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInformacoesNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInformacoesNomeActionPerformed

    private void btnSegurançaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurançaExcluirActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnSegurançaExcluirActionPerformed

    private void btnSegurançaMudançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurançaMudançaActionPerformed
        // TODO add your handling code here:
        new novoEmail().setVisible(true);
        InformacoesPessoais.this.dispose();
    }//GEN-LAST:event_btnSegurançaMudançaActionPerformed

    private void btnSegurançaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurançaAlterarActionPerformed
        // TODO add your handling code here:
        new novoEmail().setVisible(true);
        InformacoesPessoais.this.dispose();
    }//GEN-LAST:event_btnSegurançaAlterarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        new DividaAtual().setVisible(true);
        InformacoesPessoais.this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSegurancaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurancaVoltarActionPerformed
        // TODO add your handling code here:
        new DividaAtual().setVisible(true);
        InformacoesPessoais.this.dispose();
        
    }//GEN-LAST:event_btnSegurancaVoltarActionPerformed

    private void btnInformacoesBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesBuscarActionPerformed
        // TODO add your handling code here:
        buscarCliente(novoCliente);
    }//GEN-LAST:event_btnInformacoesBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(InformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesPessoais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacoesBuscar;
    private javax.swing.JButton btnSegurancaVoltar;
    private javax.swing.JButton btnSegurançaAlterar;
    private javax.swing.JButton btnSegurançaExcluir;
    private javax.swing.JButton btnSegurançaMudança;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAltEmail;
    private javax.swing.JLabel lblCIdade;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblExcluirConta;
    private javax.swing.JLabel lblMudaSenha;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSeguranca;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pInfoTitulo;
    private javax.swing.JPanel pInformacoes;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pPrincipalInicial;
    private javax.swing.JPanel pSeguranca;
    private javax.swing.JPanel pSegurancaPrincipa;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTabbedPane tpInformacoes;
    private javax.swing.JTextField txtInformacoesCPF;
    private javax.swing.JTextField txtInformacoesCargo;
    private javax.swing.JTextField txtInformacoesCep;
    private javax.swing.JTextField txtInformacoesCidade;
    private javax.swing.JTextField txtInformacoesEmail;
    private javax.swing.JTextField txtInformacoesEstado;
    private javax.swing.JTextField txtInformacoesNome;
    private javax.swing.JTextField txtInformacoesRua;
    private javax.swing.JTextField txtInformacoesSexo;
    private javax.swing.JTextField txtInformacoesTelefone;
    // End of variables declaration//GEN-END:variables
}
