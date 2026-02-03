package poojava;

public class Moto {
    String modelo;
    int ano;
    Engrenagem engrenagem;
    
    Moto(String modelo, int ano, String tipoEngrenagem){
        this.modelo = modelo;
        this.ano = ano;
        this.engrenagem = new Engrenagem(tipoEngrenagem); //recebe tipo de engrenagem.
    }}