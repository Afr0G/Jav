package ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade;
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(idade, nome);

        pessoa.mensagem();
    }
}
