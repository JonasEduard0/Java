package com.mycompany.poojava;

//Filha de abstrata, deve implementar metodos abst., se ñ vira abst.
//Implementa, todos metodos devem ser @override
public class Concreta extends Abstrata implements Interface{
    
    @Override
    public void printar() {
        System.out.println("Na filha se coloca o codigo");
    }
    
    public void interfaces(){
        System.out.println("Metodo de interface. Polimorfismo (Concreta)");
    }
}
