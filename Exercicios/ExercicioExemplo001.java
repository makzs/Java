import java.util.Scanner;

/*
 * Criar um programa para processar as seguintes informações de um aluno:matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;
 * Durante a execução calcular a nota final do aluno utilizando a seguinteregra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a6 o aluno está aprovado, caso contrário estará reprovado;
 * O programa deverá imprimir o seguinte relatório:
 * Matrícula: xxxxx
 * Nome: xxxxx xxxxx
 * Aprovado: ( x ) Sim ( ) Não
 * Nota final: xxxxx
 */

public class ExercicioExemplo001 {

    public static void main(String[] args) {
        // define o leitor como scanner
        Scanner leitor = new Scanner(System.in);

        // recebe o valor da matricula e pula uma linha para evitar a leitura errada do proximo leitor
        System.out.println("Informe sua Matricula: ");
        int matricula = leitor.nextInt();
        leitor.nextLine();

        // recebe o valor do nome
        System.out.println("Informe seu Nome: ");
        String Nome = leitor.nextLine();

        // recebe o valor da primeira nota
        System.out.println("Informe sua primeira nota: ");
        int nota1 = leitor.nextInt();

        // recebe o valor da segunda nota
        System.out.println("Informe sua segunda nota: ");
        int nota2 = leitor.nextInt();

        // calcula a media a partir da primeira e da segunda nota
        int media = (nota1 + nota2) / 2;

        // condicional para mostrar se foi aprovado ou nao a partir da media das notas
        if (media >= 6) {

            System.out.println("- - - - - - - - - - - - -");
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + Nome);
            System.out.println("Aprovado: ( x ) Sim ( ) Não");
            System.out.println("Nota Final: " + media);
            System.out.println("- - - - - - - - - - - - -");

        }

        else {

            System.out.println("- - - - - - - - - - - - -");
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + Nome);
            System.out.println("Aprovado: ( ) Sim ( x ) Não");
            System.out.println("Nota Final: " + media);
            System.out.println("- - - - - - - - - - - - -");

        }


        leitor.close();

    }
}
