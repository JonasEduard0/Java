package poojava;

public class Biblioteca {
    String nome;
    int ano;
    Livro[] livros;
    
    Biblioteca(String nome, int ano, Livro[] livros){
        this.nome = nome;
        this.ano = ano;
        this.livros = livros;
    }
    
    void mostraInfo(){
        System.out.println(nome + ", " + ano);
        for(Livro livro : livros){
            System.out.println(livro.mostraInfo());
        }
    }       
}