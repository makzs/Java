import java.util.Scanner;

/*
 * Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área
 */

public class Exercicio001 {

    public static void main(String[] args) {
        // define o leitor como scanner
        Scanner leitor = new Scanner(System.in);

        // le a altura do retangulo
        System.out.println("Informe a altura do retangulo: ");
        int altura = leitor.nextInt();

        // le a largura do retangulo
        System.out.println("Informe a largura do retangulo: ");
        int largura = leitor.nextInt();

        // calcula a area do retangulo
        int area = altura * largura;

        // informa qual e a area do retangulo
        System.out.println("A area desse retangulo é de: " + area);

        leitor.close();
    }

}
