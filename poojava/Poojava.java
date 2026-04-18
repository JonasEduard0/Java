package com.mycompany.orientaobjeto;

// IMPORTS
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Poojava {
    
    // Método simples, sem parâmetros
    static void metodo() {
        System.out.println("\nEsse é um método");
        System.out.println("Legal");
    }

    // Sobrecarga de método (mesmo nome, parâmetro diferente)
    static void metodo(String nome) {
        System.out.println("\nEsse é o método do " + nome);
        System.out.println("Top");
    }

    // Varargs: aceita vários inteiros como se fosse um array
    static int adicionar(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
    
    // MAIN
    public static void main(String[] args) { //chama métodos static pois main é static

        // Scanner lê dados digitados pelo usuário
        Scanner sc = new Scanner(System.in); /*

        // ENTRADA E SAÍDA DE DADOS
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // lê uma linha inteira
        System.out.println("Olá, " + nome);

        // OPERADOR TERNÁRIO
        final int n = 11;
        String maiorMenor = (n > 10) ? "É maior que 10" : "É menor ou igual a 10";
        System.out.println(maiorMenor);

        // SWITCH CASE
        String dia = "Segunda";

        switch (dia) {
            case "Segunda", "Terca", "Quarta", "Quinta", "Sexta" ->
                System.out.println("Dia da semana");
            case "Sabado", "Domingo" ->
                System.out.println("Fim de semana");
            default ->
                System.out.println("Dia inválido");
        }

        // CHAMADA DE MÉTODOS
        metodo();
        metodo(nome);
        System.out.println("Soma: " + adicionar(1, 2, 3, 4));

        
        // ARRAYS
        String[] frutas = {"Maçã", "Banana"};
        frutas[1] = "Tomate"; // altera valor do array
        Arrays.sort(frutas); // ordena
        Arrays.fill(frutas, "Abacaxi"); // preenche tudo

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // MATRIZ (ARRAY 2D)
        String[] vegetais = new String[2];
        for (int i = 0; i < vegetais.length; i++) {
            System.out.print("Digite um vegetal: ");
            vegetais[i] = sc.nextLine();
        }

        String[][] comida = {frutas, vegetais};
        for (String[] linha : comida) {
            for (String item : linha) {
                System.out.println(item);
            }
        }
        
        // Collection: List: ArrayList
        List<Integer> numeros = new ArrayList<>(); //Tamanho da memória
        numeros.add(8);
        numeros.add(0, 1); //Adiciona 1 na posicao 0
        numeros.get(0); //Pega o valor da posicao 0
        numeros.set(0, 99); //Atualiza a posicao 0 pra num 99
        numeros.remove(0); //Remove posicao 0
        numeros.remove(Integer.valueOf(20)); //Remove o valor 20
        numeros.contains(30); //contém o num 30?
        //E vários outros métodos
        
        // Collection: List: LinkedList(Lista Encadeada)
        numeros = new LinkedList<>();
        
        // Collection: List: Vector(lista sincronizada)
        numeros = new Vector<>(); //Vector
        
        // Map: HASHMAP
        HashMap<String, Double> preços = new HashMap<>(); //<key, value>
        preços.put("Feijão", 9.50);
        preços.put("Arroz", 5.99);
        preços.remove("Arroz"); //Remove pela chave
        System.out.println(preços.get("Feijão"));
        for (Map.Entry<String, Double>produto e : precos.entrySet()) {
            System.out.println("Nome: "+ produto.getKey() + ", Preco: " + produto.getValue());
        }
        
        //Collection: Set: HashSet
        Set<String> animais = new HashSet<>();
        System.out.println(animais.contains("Gato"));
        System.out.println(animais.isEmpty()); //Esta vazio?
        System.out.println(animais.size());    // Tamanho
        
        //Collection: Queue
        Queue<String> fila = new LinkedList<>(); // FIFO
        fila.add("Cliente 1");
        fila.add("Cliente 1");
        System.out.println("Primeiro: " + fila.poll()); // Remove e printa
        System.out.println("Ultimo: " + fila.peek());   // Apenas print
        
        //Collection: Stack
        Stack<String> pilha = new Stack<>(); // FILO
        pilha.push("A"); //Empilhando
        pilha.push("B");
        pilha.push("C");
        System.out.println(pilha.pop());  // Sai C
        System.out.println(pilha.peek()); // Mostra quem esta no topo
        
        
        // OBJETOS E CLASSES
        Estudante[] estudantes = {
            new Estudante("Jonas", 25),
            new Estudante("Eduardo")
        };
        
        for (Estudante e : estudantes) {
            e.nome = "Aluno";
            e.Estuda();
        }
        System.out.println("Total de estudantes: " + Estudante.numDeEstudantes);

        
        // HERANÇA E POLIMORFISMO
        GatoFilho gato = new GatoFilho();
        gato.Comer(); // método herdado
        gato.miar();  // método próprio

        AnimalPai[] animais = {gato}; // polimorfismo

        
        // CLASSES ABSTRATAS / SOBRESCRITA
        Pessoa pessoa = new Pessoa("Jonas", "Eduardo");
        pessoa.mostraNome();

        Aluno aluno = new Aluno("Jão", "Edu", 3.25);
        aluno.mostraNome(); // método sobrescrito

        System.out.println(pessoa); // chama toString()

        
        // ENCAPSULAMENTO
        Circulo circulo = new Circulo(2);
        circulo.setRaio(3);
        System.out.println("Área: " + circulo.area() + " | Raio: " + circulo.getRaio());

        
        // COMPOSIÇÃO
        Moto moto = new Moto("Suzuki", 2025, "V8");
        System.out.println("Engrenagem: " + moto.engrenagem.tipoEngrenagem);

        
        // WRAPPER / AUTOBOXING
        Integer i = 123; // autoboxing
        int j = i;       // unboxing

        String a = Integer.toString(123);
        String b = Boolean.toString(false);
        System.out.println(a + b);

        
        // EXCEÇÕES
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        } catch (Exception e) {
            System.out.println("Erro genérico");
        } finally {
            System.out.println("Fim do tratamento de erro");
        }
        
        
        // DATAS E HORAS
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter formatador =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(data + " " + hora);
        System.out.println(dataHora.format(formatador));

        
        // GENERICS
        Caixa<String, Double> produto1 = new Caixa<>("Maçã", 1.50);
        Caixa<String, Integer> produto2 = new Caixa<>("Banana", 3);

        
        // ENUM
        System.out.print("Digite um dia da semana: ");
        String resposta = sc.nextLine().toUpperCase();

        try {
            Dia d = Dia.valueOf(resposta);
            System.out.println(d.getNumeroDia());
        } catch (Exception e) {
            System.out.println("Dia inválido");
        }


        // THREADS
        Thread t1 = new Thread(new MyRunnable(" segundos"));
        t1.start();
        
        
        // SRP
        Classe c1 = new Classe("Classe 1", 1.0, 2.0, 3.0);
        GerenciaClasse gc = new GerenciaClasse();
        gc.adicionarClasse(c1);
        gc.buscarClasse("Classe 1");
        gc.removerClasse("Classe 1"); */
        
        
        sc.close(); // SEMPRE fechar o Scanner
    }
}