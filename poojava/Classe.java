package com.mycompany.orientaobjeto;

import java.util.Objects;
import java.util.Scanner;

public class Classe {
    public static int contador = 0; // Pertence á classe, não ao objeto. Será algo em comum em todas intâncias.
    private final int imutavel = 10; // Não permite a variavel ser reescrita
    private String nomeEmpresa;
    private double precoAcao;
    private double variacaoDiaria;
    private double qtdAcoes;

    public void setNomeEmpresa(String nomeEmpresa) { this.nomeEmpresa = nomeEmpresa; }
    public void setPrecoAcao(double precoAcao) { this.precoAcao = precoAcao; }
    public void setQtdAcoes(double qtdAcoes) { this.qtdAcoes = qtdAcoes; }
    public void setVariacaoDiaria(double variacaoDiaria) { this.variacaoDiaria = variacaoDiaria; }
    
    public String getNomeEmpresa() { return nomeEmpresa; }
    public double getPrecoAcao() { return precoAcao; }
    public double getQtdAcoes() { return qtdAcoes; }
    public double getVariacaoDiaria() { return variacaoDiaria; }

    public Classe(String nomeEmpresa, double precoAcao, double variacaoDiaria, double qtdAcoes) {
        this.nomeEmpresa = nomeEmpresa; // Construtor construir e preencher os dados ao mesmo tempo
        this.precoAcao = precoAcao;
        this.variacaoDiaria = variacaoDiaria;
        this.qtdAcoes = qtdAcoes;
        contador++; //vai contar quantas intâncias teve dessa classe.
    }

    public Classe() { // Construtor q aloca espaço de memoria para a instancia, inicializa zarado.
        nomeEmpresa = "";
        precoAcao = 0.0;
        variacaoDiaria = 0.0;
        qtdAcoes = 0.0;
        contador++;
    }
    
    public Classe(Classe outra) {
        this.nomeEmpresa = outra.nomeEmpresa;
        this.precoAcao = outra.precoAcao;
        this.variacaoDiaria = outra.variacaoDiaria;
        this.qtdAcoes = outra.qtdAcoes;
    }
    
    public void fill() {
        Scanner ler = new Scanner(System.in); //Preenche com dados do usuário

        System.out.print("nomeEmpresa: "); //Preenche cada um dos atributos
        this.nomeEmpresa = ler.next();

        System.out.print("precoAcao: ");
        this.precoAcao = ler.nextDouble();

        System.out.print("variacaoDiaria: ");
        this.variacaoDiaria = ler.nextDouble();

        System.out.print("qtdAcoes: ");
        this.qtdAcoes = ler.nextDouble();
    }
    
    public Classe copiar() {
        return new Classe(this);
    }
    
    @Override // Sobrescrever o metodo que já existe com esse de mesmo nome.
    public String toString() { // imprime, mas override no toString é melhor.
        return "Nome da Empresa: " + nomeEmpresa + 
	       "\nPreco da Acao: " + precoAcao + 
	       "\nVariacao Diaria: " + variacaoDiaria + 
	       "\nQuantidade de Acoes: " + qtdAcoes; }

    @Override
    public int hashCode() { // Melhora pesquisas quando trabalhar com hashSet/Map<>.
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.nomeEmpresa);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precoAcao) ^ (Double.doubleToLongBits(this.precoAcao) >>> 32));
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) { //Compara 2 objs para ver se são o mesmo.
        // Verifica se é o mesmo objeto
        if (this == obj) {
            return true;
        }

        // Verifica se é nulo
        if (obj == null) {
            return false;
        }

        // Verifica se é da mesma classe
        if (getClass() != obj.getClass()) {
            return false;
        }

        // Cast para Classe
        final Classe other = (Classe) obj;

        // Compara apenas o nome da empresa (chave única)
        return java.util.Objects.equals(this.nomeEmpresa, other.nomeEmpresa);
    }
}
