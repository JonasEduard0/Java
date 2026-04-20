package com.mycompany.poojava;

//Gerencia objetos de outra classe pois sem ela o Main - que deveria apenas chamar classes - ficaria responsável por tudo e violaria SRP. Usa quando tem muitas instâncias e precisa manipular dados.

import java.util.ArrayList;
import java.util.List;

//Classe para criar/armazenar/buscar/atualizar/remover 
public class GerenciaClasse {
    private int numero;
    private List<Classe> classe;//Cria o atributo lst do tipo Lista de Classes, pra armazenar elas

    public GerenciaClasse() {
        numero = 0;
        classe = new ArrayList<>();
    }

    public GerenciaClasse(int numero, List<Classe> classe) {
        this.numero = numero;
        this.classe = classe;
    }
    
    public List<Classe> getClasse() { return classe; }
    public int getNumero() { return numero; }
    
    public void adicionarClasse(Classe c){
        classe.add(c);
    }
    
    public boolean removerClasse(String nomeEmpresa){
        for(int i = 0; i < classe.size(); i++) {
            
            if(classe.get(i).getNomeEmpresa().equals(nomeEmpresa)) {
                classe.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Classe buscarClasse(String nomeEmpresa){
        for(Classe c : classe) {
            if(c.getNomeEmpresa().equals(nomeEmpresa)) {
                return c;
            }
        }
        return null;
    }
    
/*  @Override
    public String toString() {  Ineficiente em projetos, cria nova String, copia tudo, descarta antiga
        String aux = "Numero: " + this.numero;

        for (int i = 0; i < classe.size(); i++) {
            aux = aux + classe.get(i).toString();
        }
        return aux;
    } */
    
    @Override
    public String toString() { // Vai acumulando internamente, mais rápido.
        StringBuilder sb = new StringBuilder() // Cria um objeto vazio pra montar a String.
                
        .append("Numero: ").append(numero).append(", "); // Imprime texto, variavel, e espaçamento
                                                         // Imprimiria cada atributo assim aqui.
        for (Classe c : classe) {
            sb.append(c).append(". \n"); // chama toString da Roda.
        }

        return sb.toString(); // Converte tudo pra String no fim.
    }
    
 /* public void copiar(GerenciaClasse outro) {
        this.numero = outro.getNumero();

        this.classe = outro.getClasse(); Copia rasa, apenas aponta pra objeto e nao cria um.
    } */
    
    public void copiar(GerenciaClasse outro) {
        numero = outro.getNumero();
                                    //Copia profunda, cria outra classe identica a copiada.
        classe = new ArrayList<>();
        for (Classe c : outro.getClasse()) {
            classe.add(c.copiar());
        }
    }
}