package poojava;

public enum Dia {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
    
    private final int numeroDia;
    
    Dia(int numeroDia){
        this.numeroDia = numeroDia;
    }
    
    public int getNumeroDia(){
        return this.numeroDia;}}