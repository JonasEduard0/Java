package poojava;

public class Estudante {
    String nome;
    int idade;
    boolean isMatriculado;
    static int numDeEstudantes; //static faz pertencer a classe, nn a 1 objeto especifico.

    Estudante(){
        this.nome = "Sem nome";
        this.idade = 0;
    }
    Estudante(String nome){
        this.nome = nome;
        this.idade = 0;
        numDeEstudantes++;
    }
    Estudante(String nome, int idade){ //sobrecarga, quando qr passar -+ argumentos.
        this.nome = nome;
        this.idade = idade;
        numDeEstudantes++;
    }

    void Estuda(){
        System.out.println(nome + " estuda");}}