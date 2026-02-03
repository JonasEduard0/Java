package poojava;

class Caixa<T, U> {//cria um Generico passando <Type>, substitui primitivo
    T item;        //pode ter 1+ tipos.
    U preco;
    
    Caixa(T item, U preco){
        this.item = item;
        this.preco = preco;
    }
    
    public void setItem(T item){
        this.item = item;
    }
    
    public T getItem(){
        return this.item;
    }
}
