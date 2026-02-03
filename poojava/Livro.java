package poojava;

public class Livro {
    String titulo;
    int pagina;
    
    Livro(String titulo, int pagina){
        this.titulo = titulo;
        this.pagina = pagina;
    }
    
    String mostraInfo(){
        return this.titulo + " (" + this.pagina + ") paginas";}}