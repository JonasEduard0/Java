package com.mycompany.poojava;

//Não pode ser instanciada. Serve como modelo pra Filhas. Pode ter atributos e métodos concretos.
public abstract class Abstrata{
    
    //Filhas ñ são obrigadas a reimplementá-lo. Método abst., agora classe vira abst. Filhos devem @override e codificar
    public abstract void printar(); 
    
    public void isAbstrata() {
        System.out.println("É uma classe abstrata, este método é concreto");
    }

}
