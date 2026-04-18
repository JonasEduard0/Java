//Gerencia objetos de outra classe pois sem ela o Main - que deveria apenas chamar classes - ficaria responsável por tudo e violaria SRP. Usa quando tem muitas instâncias e precisa manipular dados.

package com.mycompany.orientaobjeto;

import java.util.ArrayList;
import java.util.List;

//Classe para criar/armazenar/buscar/atualizar/remover 
public class GerenciaClasse Classe{
    private List<Classe> lst;//Cria o atributo lst do tipo Lista de Classes, pra armazenar elas

    public GerenciaClasse() {
        lst = new ArrayList<>();
    }
    
    public void adicionarClasse(Classe classe){
        lst.add(classe);
    }
    
    public boolean removerClasse(String nomeEmpresa){
        for(int i = 0; i < lst.size(); i++) {
            
            if(lst.get(i).getNomeEmpresa().equals(nomeEmpresa)) {
                lst.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Classe buscarClasse(String nomeEmpresa){
        for(Classe c : lst) {
            if(c.getNomeEmpresa().equals(nomeEmpresa)) {
                return c;
            }
        }
        return null;
    }
}
