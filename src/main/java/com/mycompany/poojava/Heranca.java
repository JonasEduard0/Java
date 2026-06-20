package com.mycompany.poojava;

public class Heranca { // Usado pra reutilizar metodos para varias classes filhas.
    protected int numer = 0; // Classes filhas podem usar, se fosse private não poderia.
    
    protected void imprimeNumer(){
        System.out.println("Numero da classe pai Heranca: " + numer);
    }
}
