import java.util.Scanner;

/*
 * Receber dois numeros inteiros e informar qual valor lido é o menor e qual é o maior
 */

public class Exercicio003 {
    
    public static void main(String[] args){
        // define o leitor como scanner
        Scanner leitor = new Scanner(System.in);

        // recebe o primeiro valor
        System.out.println("Informe o primeiro numero: ");
        int x = leitor.nextInt();

        // recebe o segundo valor
        System.out.println("Informe o segundo numero: ");
        int y = leitor.nextInt();

        // condicional para mostrar qual é o maior e qual é o menor valor
        if(x > y){
            System.out.println(x + " e o maior numero! e " + y + " e o menor numero!");
        }

        else{
            System.out.println(y + " e o maior numero! e " + x + " e o menor numero!");
        }

        leitor.close();
    }

}
