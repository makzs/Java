import java.util.Scanner;

/*
 * Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área
 */

public class Exercicio001 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a altura do retangulo: ");
        int altura = leitor.nextInt();

        System.out.println("Informe a largura do retangulo: ");
        int largura = leitor.nextInt();

        int area = altura * largura;

        System.out.println("A area desse retangulo é de: " + area);

        leitor.close();
    }

}
