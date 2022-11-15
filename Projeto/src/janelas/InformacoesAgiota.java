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
public class InformacoesAgiota extends javax.swing.JFrame {
        MySQL conectar = new MySQL();
        Cliente novoCliente = new Cliente ();
    /**
     * Creates new form InformacoesPessoais
     */
    public InformacoesAgiota() {
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
        pInfoPessoal = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        txtAgiotaCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtAgiotaNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtAgiotaEmail = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtAgiotaSexo = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtAgiotaTelefone = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtAgiotaEstado = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtAgiotaCidade = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtAgiotaRua = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtAgiotaCep = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtAgiotaCargo = new javax.swing.JTextField();
        pInfo = new javax.swing.JPanel();
        lblInformacoes = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnAgiotaBuscar = new javax.swing.JButton();
        pSeguranca = new javax.swing.JPanel();
        pInicial = new javax.swing.JPanel();
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
        setTitle("Informações Agiota");

        tpInformacoes.setBackground(new java.awt.Color(255, 102, 51));
        tpInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        tpInformacoes.setPreferredSize(new java.awt.Dimension(839, 406));

        pInfoPessoal.setBackground(new java.awt.Color(0, 0, 0));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("CPF");

        txtAgiotaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgiotaCpfActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome Completo");

        txtAgiotaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgiotaNomeActionPerformed(evt);
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

        lblCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade");

        lblRua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 255, 255));
        lblRua.setText("Rua");

        lblCep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCep.setForeground(new java.awt.Color(255, 255, 255));
        lblCep.setText("CEP");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");

        pInfo.setBackground(new java.awt.Color(255, 102, 51));
        pInfo.setForeground(new java.awt.Color(255, 102, 51));

        lblInformacoes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInformacoes.setText("Informações Pessoais");

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(lblInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnAgiotaBuscar.setBackground(new java.awt.Color(255, 102, 51));
        btnAgiotaBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/binoculars.png"))); // NOI18N
        btnAgiotaBuscar.setText("Buscar");
        btnAgiotaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgiotaBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpf)
                            .addComponent(lblNome)
                            .addComponent(lblEmail)
                            .addComponent(lblSexo)
                            .addComponent(lblTelefone)
                            .addComponent(lblEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAgiotaNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgiotaEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgiotaSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgiotaTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAgiotaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCidade)
                                .addGap(18, 18, 18)
                                .addComponent(txtAgiotaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAgiotaCpf)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRua)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAgiotaRua, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(txtAgiotaCargo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCep)
                                .addGap(18, 18, 18)
                                .addComponent(txtAgiotaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgiotaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAgiotaCpf))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAgiotaNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtAgiotaEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAgiotaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtAgiotaTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgiotaEstado)
                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgiotaCidade))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgiotaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgiotaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAgiotaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgiotaBuscar))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pInfoPessoalLayout = new javax.swing.GroupLayout(pInfoPessoal);
        pInfoPessoal.setLayout(pInfoPessoalLayout);
        pInfoPessoalLayout.setHorizontalGroup(
            pInfoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoPessoalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pInfoPessoalLayout.setVerticalGroup(
            pInfoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpInformacoes.addTab("Informações Pessoais", pInfoPessoal);

        pInicial.setBackground(new java.awt.Color(0, 0, 0));
        pInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pInicial.setPreferredSize(new java.awt.Dimension(839, 406));

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

        javax.swing.GroupLayout pInicialLayout = new javax.swing.GroupLayout(pInicial);
        pInicial.setLayout(pInicialLayout);
        pInicialLayout.setHorizontalGroup(
            pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSegurançaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSegurançaMudança, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMudaSenha)
                        .addContainerGap(472, Short.MAX_VALUE))
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addComponent(btnSegurançaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAltEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSegurancaVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pInicialLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pInicialLayout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(lblExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(486, Short.MAX_VALUE)))
        );
        pInicialLayout.setVerticalGroup(
            pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMudaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addComponent(btnSegurançaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSegurançaMudança, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSegurançaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAltEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(pInicialLayout.createSequentialGroup()
                        .addComponent(btnSegurancaVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pInicialLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
            .addGroup(pInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pInicialLayout.createSequentialGroup()
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
                .addComponent(pInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addContainerGap())
        );
        pSegurancaLayout.setVerticalGroup(
            pSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSegurancaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpInformacoes.addTab("Segurança", pSeguranca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tpInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
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

    private void buscarAgiota(Cliente novoCliente) {
        this.conectar.conectaBanco();
        String consultaCpf = this.txtAgiotaCpf.getText ();
        
        try{
            var buscarAgiota = "SELECT"
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
            
            this.conectar.executarSQL (buscarAgiota);
            
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
            txtAgiotaCpf.setText(novoCliente.getCpf());
            txtAgiotaNome.setText(novoCliente.getNome());
            txtAgiotaEmail.setText(novoCliente.getEmail());
            txtAgiotaSexo.setText(novoCliente.getSexo());
            txtAgiotaTelefone.setText(novoCliente.getTelefone());
            txtAgiotaEstado.setText(novoCliente.getEstado());
            txtAgiotaCidade.setText(novoCliente.getCidade());
            txtAgiotaRua.setText(novoCliente.getRua());
            txtAgiotaCep.setText(novoCliente.getCep());
            txtAgiotaCargo.setText(novoCliente.getCargo());
            this.conectar.fechaBanco();
        } 
    }
    
    private void btnSegurancaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurancaVoltarActionPerformed
        // TODO add your handling code here:
        new DividaAgiota().setVisible(true);
        InformacoesAgiota.this.dispose();
        
    }//GEN-LAST:event_btnSegurancaVoltarActionPerformed

    private void btnSegurançaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurançaAlterarActionPerformed
        // TODO add your handling code here:
        new novoEmailAgiota().setVisible(true);
        InformacoesAgiota.this.dispose();
    }//GEN-LAST:event_btnSegurançaAlterarActionPerformed

    private void btnSegurançaMudançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurançaMudançaActionPerformed
        // TODO add your handling code here:
        new novaSenhaAgiota().setVisible(true);
        InformacoesAgiota.this.dispose();
    }//GEN-LAST:event_btnSegurançaMudançaActionPerformed

    private void btnSegurançaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurançaExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSegurançaExcluirActionPerformed

    private void btnAgiotaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgiotaBuscarActionPerformed
        // TODO add your handling code here:
        buscarAgiota(novoCliente);
    }//GEN-LAST:event_btnAgiotaBuscarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        
        new DividaAgiota().setVisible(true);
        InformacoesAgiota.this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtAgiotaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgiotaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgiotaNomeActionPerformed

    private void txtAgiotaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgiotaCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgiotaCpfActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(InformacoesAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesAgiota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgiotaBuscar;
    private javax.swing.JButton btnSegurancaVoltar;
    private javax.swing.JButton btnSegurançaAlterar;
    private javax.swing.JButton btnSegurançaExcluir;
    private javax.swing.JButton btnSegurançaMudança;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAltEmail;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblExcluirConta;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JLabel lblMudaSenha;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSeguranca;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pInfoPessoal;
    private javax.swing.JPanel pInicial;
    private javax.swing.JPanel pSeguranca;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTabbedPane tpInformacoes;
    private javax.swing.JTextField txtAgiotaCargo;
    private javax.swing.JTextField txtAgiotaCep;
    private javax.swing.JTextField txtAgiotaCidade;
    private javax.swing.JTextField txtAgiotaCpf;
    private javax.swing.JTextField txtAgiotaEmail;
    private javax.swing.JTextField txtAgiotaEstado;
    private javax.swing.JTextField txtAgiotaNome;
    private javax.swing.JTextField txtAgiotaRua;
    private javax.swing.JTextField txtAgiotaSexo;
    private javax.swing.JTextField txtAgiotaTelefone;
    // End of variables declaration//GEN-END:variables
}
