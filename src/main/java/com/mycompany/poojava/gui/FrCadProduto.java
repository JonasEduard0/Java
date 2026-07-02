package com.mycompany.poojava.gui;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FrCadProduto extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrCadProduto.class.getName());

    private String codEscolhido;
    private boolean editando;
    private ProdutoController controller;
    private GerenciadorProduto gerente;
    
    public FrCadProduto() {
        initComponents();
        
        this.editando = false;
        this.codEscolhido = "";
        gerente = new GerenciadorProduto();
        controller = new ProdutoController(gerente);
        
        habilitarCampos(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        lblCusto = new javax.swing.JLabel();
        edtCusto = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        edtPreco = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        lblTitulo.setBackground(new java.awt.Color(102, 102, 102));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Produtos");
        lblTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTituloMouseExited(evt);
            }
        });

        panBotoes.setBackground(new java.awt.Color(102, 102, 102));

        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        btnNovo.addActionListener(this::btnNovoActionPerformed);
        panBotoes.add(btnNovo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);
        panBotoes.add(btnEditar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);
        panBotoes.add(btnCancelar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);
        panBotoes.add(btnExcluir);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);
        panBotoes.add(btnSalvar);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lblCode.setText("Codigo:");

        lblNome.setText("Nome:");

        lblCusto.setText("Custo:");

        lblNome1.setText("Preco:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCusto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome1)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome1)
                    .addComponent(lblCusto)
                    .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane2.setViewportView(edtListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTituloMouseEntered
        btnEditar.setBackground(Color.blue);
    }//GEN-LAST:event_lblTituloMouseEntered

    private void lblTituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTituloMouseExited
        btnEditar.setBackground(Color.gray);
    }//GEN-LAST:event_lblTituloMouseExited

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        if (this.editando) { //MVC, View
            produtoController.atualizarProduto(codAntigo, edtNome.getText())
        } else{
            produtoController.adicionarProduto(edtCodigo.getText(), edtNome.getText())
        }

        //Limpa e habilita campos
        limparCampos();
        habilitarCampos(true);
        this.editando = false;
        this.atualizarTabela();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Produto novoProduto = camposParaObjeto();
        
        if (this.editando == true) {
            gerente.atualizarProduto(codEscolhido, novoProduto);
        } else{
            gerente.adicionarProduto(novoProduto);
        }
        
        gerente.adicionarProduto(novoProduto);
        
        limparCampos();
        habilitarCampos(false);
        this.editando = false;
        
        String listagem = gerente.toString();
        edtListagem.setText(listagem);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.codEscolhido = JOptionPane.showInputDialog("Informe o codigo do produto: ");
        Produto produtoEditando = controller.adicionarProduto(codEscolhido);
        
        if (produtoEditando =! null) {
            this.editando = true;
            limparCampos();
            habilitarCampos(true);
            
            objetoParaCampos(produtoEditando)
        } else{
            JOptionPane.showMessageDialog(this, "Produto inexistente");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.codEscolhido = JOptionPane.showInputDialog("Informe o codigo do produto: ");
       
        Produto produto = controller.buscarProduto(codEscolhido);
        
        if (produto = null) {
            JOptionPane.showMessageDialog(this, "Produto inexistente");
        } else{
            controller.removerProduto(codEscolhido);
            JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!");
        }
        String listagem = gerente.toString();
        edtListagem.setText(listagem);
    }//GEN-LAST:event_btnExcluirActionPerformed

    
    public void objetoParaCampos(Produto produto){
        edtCodigo.setText(produto.getCodigo());
        edtNome.setText(produto.getNome());
        edtCusto.setText(produto.getCusto()+"");
        edtPreco.setText(produto.getPreco()+"");
    }
    
    private Produto camposParaObjeto(){
        Produto p = new Produto();
        produto.setCodigo(edtCodigo.getText());
        produto.setNome(edtNome.getText());
        
        String custoStr = edtCusto.getText();
        if (!custoStr.isEmpty()) {
           double custo = Double.parseDouble(custoStr);
           produto.setCusto(custo);
        }
        
        String precoStr = edtPreco.getText(); //Como e num mas campo string, converte
        if (!precoStr.isEmpty()) {
           double preco = Double.parseDouble(precoStr);
           produto.setPreco(preco);
        }
        
        return produto;
    }

    public void habilitarCampos(boolean flag){
        this.edtCodigo.setEnabled(flag);
        this.edtNome.setEnabled(flag);
        this.edtCusto.setEnabled(flag);
        this.edtPreco.setEnabled(flag);
    }
    
    public void limparCampos(){
        this.edtCodigo.setText("");
        this.edtCusto.setText("");
        this.edtNome.setText("");
        this.edtPreco.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtCusto;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPreco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panBotoes;
    // End of variables declaration//GEN-END:variables
}
