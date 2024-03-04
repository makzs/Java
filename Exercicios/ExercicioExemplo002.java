import java.util.Scanner;

/*
 * Transformar o programa do exercício 1 para um sistema que permita ler a entrada de dados pelo usuário 
 * em um vetor durante execução:
 * Permitir que o usuário informe, primeiro, os dados de 5 (cinco) alunos e depoisde capturados os dados, 
 * imprimir o relatório final com todos os dados:
 * Matrícula: xxxxx
 * Nome: xxxxx xxxxx
 * Aprovado: ( x ) Sim ( ) Não
 * Nota final: xxxxx
 */

public class ExercicioExemplo002 {

    public static void main(String[] args) {
        // define o leitor como scanner
        Scanner leitor = new Scanner(System.in);

        // declara os vetores 
        int[] Matricula = new int[5];
        String[] Nomes = new String[5];
        int[] notas1 = new int[5];
        int[] notas2 = new int[5];
        int[] medias =  new int[5];
        String[] aprovados = new String[5];

        for (int i = 0; i < 5; i++){

            // Recebe o valor da matricula da pessoa i
            System.out.println("Informe o valor da Matricula da pessoa " + (i+1) + " : ");
            int VlrDigitado = leitor.nextInt();
            // pula linha para a prox string nao ler linha nula
            leitor.nextLine();

            // armazena o valor digitado no array Matricula
            Matricula[i] = VlrDigitado;

            // Recebe o nome da pessoa i
            System.out.println("Informe o Nome da pessoa " + (i+1) + " : ");
            String NomeDigitado = leitor.nextLine();

            // armazena o valor digitado no array Nomes
            Nomes[i] = NomeDigitado;

            // Recebe o valor da primeira nota da pessoa i
            System.out.println("Informe o valor da primeira nota da pessoa " + (i+1) + " : ");
            int nota1Digitada = leitor.nextInt();

            // armazena o valor digitado no array notas1
            notas1[i] = nota1Digitada;

            // Recebe o valor da segunda nota da pessoa i
            System.out.println("Informe o valor da segunda nota da pessoa " + (i+1) + " : ");
            int nota2Digitada = leitor.nextInt();

            // armazena o valor digitado no array notas2
            notas2[i] = nota2Digitada;

            // calcula e armazena a media das duas notas no array medias
            medias[i] = (notas1[i] + notas2[i]) / 2;

            // estrutura condicional para armazenar no array aprovados se a pessoa foi aprovada ou nao
            if (medias[i] >= 6){
                aprovados[i] = "Aprovado: ( x ) Sim ( ) Não";
            }
            else{
                aprovados[i] = "Aprovado: ( ) Sim ( x ) Não";
            }

        }

        System.out.println("\n");
        System.out.println("DADOS REGISTRADOS:");
        System.out.println("\n");

        // laço for para imprimir na tela os dados registrados
        for (int i = 0; i < 5; i++){

            System.out.println("\n");
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("Matrícula: " + Matricula[i]);
            System.out.println("Nome: " + Nomes[i]);
            System.out.println("Aprovado: " + aprovados[i]);
            System.out.println("Nota Final: " + medias[i]);
            System.out.println("- - - - - - - - - - - - -");

        }

        leitor.close();

    }
}