package poojava;

public class Circulo extends Formato {
    private double raio;
    
    Circulo(double raio){
        this.raio = raio;
    }
    
    double getRaio(){
        return this.raio;
    }
    
    void setRaio(double raio){
        if (raio <= 0) {
            System.out.println("Raio nao pode ser negativo ou zero.");
        } else{
            this.raio = raio;
        }
    }
    
    @Override //todo formato tem area, mas especifico por cada forma.
    double area(){//a area especifica do raio é
        return (raio*raio)* Math.PI;}}