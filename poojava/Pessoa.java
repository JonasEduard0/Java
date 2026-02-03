package poojava; 

public class Pessoa { 
    String nome; 
    String sobrenome; 
    
    Pessoa(String nome, String sobrenome){ 
        this.nome = nome; 
        this.sobrenome = sobrenome; 
    } 
    
    void mostraNome(){ 
        System.out.println(nome + " " + sobrenome); 
    } 
    
    @Override public String toString(){ 
        return nome + " " + sobrenome;
    }
}