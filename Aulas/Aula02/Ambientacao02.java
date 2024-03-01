import java.util.Scanner;

public class Ambientacao02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = leitor.nextInt();
        System.out.println("O numero informado foi: " + numero);

        System.out.println("Informe um numero decimal: ");
        double numeroDecimal = leitor.nextDouble();
        System.out.println("O numero informado foi: " + numeroDecimal);

        leitor.close();

    }
}
