import java.util.Scanner;

/*
 * Crie um algoritmo que permita fazer três conversões monetárias. O algoritmo deve receber o valor em real(R$) e apresentar os valores convertidos em:
 * 1. Dólar (1 dólar = 5,17 reais)
 * 2. Euro (1 euro = 6,14 reais)
 * 3. Peso argentino (1 peso argentino = 0,05 reais)
 */

public class Exercicio002 {

    public static void main(String[] args) {
        // define o leitor como scanner
        Scanner leitor = new Scanner(System.in);

        // recebe o valor em reais
        System.out.println("Informe o valor em reais:");
        double valorReais = leitor.nextDouble();

        // calcula as conversões
        double dolar = valorReais / 5.17;
        double Euro = valorReais / 6.14;
        double Peso = valorReais / 0.07;

        // seta a formatação de texto para mostrar apenas 2 casas decimais
        String formato = "%.2f";

        // mostra a lista de valores convertidos
        System.out.println("Os valores convertidos são: ");
        System.out.println("Dolar: " + String.format(formato, dolar) + " dolares");
        System.out.println("Euro: " + String.format(formato, Euro) + " euros");
        System.out.println("Peso argentino: " + String.format(formato, Peso) + " pesos argentinos");

        leitor.close();

    }

}
