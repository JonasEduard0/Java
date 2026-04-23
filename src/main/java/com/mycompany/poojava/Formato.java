package poojava;

public abstract class Formato {
    abstract double area();//abstrato é criado no pai abstrato, implementado no filho
    private final int abc = 0;//final nn permite a variavel ser reescrita
    
    void display(){ //Esses métodos são concretos, sao implementados no pai
        System.out.println("Este e um formato.");}}