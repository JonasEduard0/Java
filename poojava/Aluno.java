package poojava;

public class Aluno extends Pessoa{ //herança da classe pai Estudante.
    double media;
    
    Aluno(String nome, String sobrenome, double media){
        super(nome, sobrenome); //
        this.media = media;
    }
    
//Estamos avisando ao java q queremos sobrescrever o metodos do pai por esse de mesmo nome, dando prioridade a esse.
    @Override
    void mostraNome(){
        System.out.println(nome + " " + sobrenome + ", aluno.");
    }
}