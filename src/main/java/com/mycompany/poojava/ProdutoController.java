package com.mycompany.poojava;

public class ProdutoController {

    private GerenciadorProduto gerente;

    public ProdutoController(GerenciadorProduto gerente){
        this.gerente = gerente;
    }

    public void adicionarProduto(Produto p){
        gerente.adicionarProduto(p);
    }

    public void removerProduto(String codigo){
        gerente.removerProduto(codigo);
    }

    public Produto buscarProduto(String codigo){
        return gerente.buscarProduto(codigo);
    }

    public void atualizarProduto(String codigo, Produto p){
        gerente.atualizarProduto(codigo,p);
    }

}