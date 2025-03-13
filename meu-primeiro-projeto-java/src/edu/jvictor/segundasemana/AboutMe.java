package edu.jvictor.segundasemana;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String nome;
        String sobrenome;
        int idade;
        double altura;
        
        // Verificar se foram passados argumentos pela linha de comando
        if (args.length >= 4) {
            // Se sim, usar os argumentos
            nome = args[0];
            sobrenome = args[1];
            idade = Integer.valueOf(args[2]);
            altura = Double.valueOf(args[3]);
        } else {
            // Se não, solicitar entrada do usuário
            System.out.println("Digite seu nome");
            nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            sobrenome = scanner.next();
            
            System.out.println("Digite sua idade");
            idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            altura = scanner.nextDouble();
        }
        
        // Exibir as informações
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        // Fechar o scanner
        scanner.close();
    }
}