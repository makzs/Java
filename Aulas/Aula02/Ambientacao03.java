import java.util.Scanner;

public class Ambientacao03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = leitor.nextLine();

        System.out.println("Texto digitado: " + texto);

        leitor.close();

    }

}
