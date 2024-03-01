import java.util.Scanner;

/*
 * Desenvolver um algoritmo para ler o valor inteiro da idade de uma pessoa e imprimir uma das mensgagens:
 * se idade <= 13: Criança!
 * se idade > 13 e <= 18: Adolescente!
 * se idade > 18 e <= 60: Adulto!
 * se idade > 60: Idoso!
 */

public class Exercicio004 {
    
    public static void main(String[] args){
        // define leitor como scanner
        Scanner leitor = new Scanner(System.in);

        // recebe a idade
        System.out.println("Informe a idade: ");
        int idade = leitor.nextInt();

        // condicional para definir a resposta de a cordo com a idade
        if (idade <= 13) {
            System.out.println("Criança!");
        }
        else if (idade > 13 && idade <= 18){
            System.out.println("Adolescente!");
        }
        else if (idade > 18 && idade <= 60){
            System.out.println("Adulto!");
        }
        else if (idade > 60){
            System.out.println("Idoso!");
        }
        else{
            System.out.println("Idade invalida!");
        }


        leitor.close();
    }

}
