package poojava;

// ===============================
// IMPORTS

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Poojava {

    // ===============================
    // MÉTODOS (FUNÇÕES)

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

    // ===============================
    // MAIN

    public static void main(String[] args) {

        // Scanner lê dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // ===============================
        // ENTRADA E SAÍDA DE DADOS

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // lê uma linha inteira
        System.out.println("Olá, " + nome);

        // ===============================
        // OPERADOR TERNÁRIO

        int n = 11;
        String maiorMenor = (n > 10) ? "É maior que 10" : "É menor ou igual a 10";
        System.out.println(maiorMenor);

        // ===============================
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

        // ===============================
        // CHAMADA DE MÉTODOS

        metodo();
        metodo(nome);

        System.out.println("Soma: " + adicionar(1, 2, 3, 4));

        // ===============================
        // ARRAYS

        String[] frutas = {"Maçã", "Banana"};
        frutas[1] = "Tomate"; // altera valor do array

        Arrays.sort(frutas); // ordena
        Arrays.fill(frutas, "Abacaxi"); // preenche tudo

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // ===============================
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

        // ===============================
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

        // ===============================
        // HERANÇA E POLIMORFISMO

        GatoFilho gato = new GatoFilho();
        gato.Comer(); // método herdado
        gato.miar();  // método próprio

        AnimalPai[] animais = {gato}; // polimorfismo

        // ===============================
        // CLASSES ABSTRATAS / SOBRESCRITA

        Pessoa pessoa = new Pessoa("Jonas", "Eduardo");
        pessoa.mostraNome();

        Aluno aluno = new Aluno("Jão", "Edu", 3.25);
        aluno.mostraNome(); // método sobrescrito

        System.out.println(pessoa); // chama toString()

        // ===============================
        // ENCAPSULAMENTO

        Circulo circulo = new Circulo(2);
        circulo.setRaio(3);
        System.out.println("Área: " + circulo.area() + " | Raio: " + circulo.getRaio());

        // ===============================
        // COMPOSIÇÃO

        Moto moto = new Moto("Suzuki", 2025, "V8");
        System.out.println("Engrenagem: " + moto.engrenagem.tipoEngrenagem);

        // ===============================
        // WRAPPER / AUTOBOXING

        Integer i = 123; // autoboxing
        int j = i;       // unboxing

        String a = Integer.toString(123);
        String b = Boolean.toString(false);
        System.out.println(a + b);

        // ===============================
        // ARRAYLIST

        ArrayList<String> listaFrutas = new ArrayList<>();

        listaFrutas.add("Maçã");
        listaFrutas.add("Banana");
        listaFrutas.set(0, "Pera");
        listaFrutas.remove(1);

        System.out.println(listaFrutas);

        // ===============================
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

        // ===============================
        // DATAS E HORAS

        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter formatador =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(data + " " + hora);
        System.out.println(dataHora.format(formatador));

        // ===============================
        // GENERICS

        Caixa<String, Double> produto1 = new Caixa<>("Maçã", 1.50);
        Caixa<String, Integer> produto2 = new Caixa<>("Banana", 3);

        // ===============================
        // HASHMAP

        HashMap<String, Double> preços = new HashMap<>();
        preços.put("Feijão", 9.50);
        preços.put("Arroz", 5.99);
        preços.remove("Arroz");

        System.out.println(preços);
        System.out.println(preços.get("Feijão"));

        // ===============================
        // ENUM

        System.out.print("Digite um dia da semana: ");
        String resposta = sc.nextLine().toUpperCase();

        try {
            Dia d = Dia.valueOf(resposta);
            System.out.println(d.getNumeroDia());
        } catch (Exception e) {
            System.out.println("Dia inválido");
        }

        // ===============================
        // THREADS

        Thread t1 = new Thread(new MyRunnable(" segundos"));
        t1.start();

        // ===============================
        // FINALIZAÇÃO

        sc.close(); // SEMPRE fechar o Scanner
    }
}