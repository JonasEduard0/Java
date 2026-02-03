package poojava; 

public class MyRunnable implements Runnable{ //interface String texto; 
    String texto;
    
    MyRunnable(String texto){ 
        this.texto = texto; }

    @Override public void run(){ 
        for (int i = 1; i <= 5; i++) { 
            try { Thread.sleep(1000);
            System.out.println(i + texto); 
            } 
            catch(Exception e){ 
                System.out.println("Thread interrompido.");
                break;
            }
            if (i==5) { 
                System.out.println("Time´s up!"); //termina o codigo 
}}}}