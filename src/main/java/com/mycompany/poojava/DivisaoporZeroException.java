package com.mycompany.poojava;

public class DivisaoporZeroException extends RuntimeException{ // Cria um erro personalizado
    public DivisaoporZeroException(String msg){
        super("Não é possível dividir por zero"); // Se /0, throw new DivisaoporZeroException();
    }
}
