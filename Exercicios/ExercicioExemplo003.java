import java.util.Scanner;

/*
 * Criar um programa para processar as seguintes informações de um aluno:
 * matrícula, nome , nota 1, nota 2, nota 3, nota 4 e nota 5;
 * O sistema deverá ler as notas do aluno em um vetor e a entrada de dados 
 * pelo usuário só poderá ser nos valores de 0 a 10
 * imprimir o relatório final com todos os dados:
 * Matrícula: xxxxx
 * Nome: xxxxx xxxxx
 * Nota (x) : xxxxx
 * Nota (y) : yyyyy
 * (...)
 */

 public class ExercicioExemplo003{

    public static void main(String[] args){
        // variaveis
        int contador = 0;
        int[] notas = new int[5];

        // define leitor como um scanner
        Scanner leitor = new Scanner(System.in);

        // recebe o valor da matricula
        System.out.println("Informe a Matricula do aluno: ");
        int Matricula = leitor.nextInt();
        // pula uma linha para o input de string nao ler o vazio
        leitor.nextLine();

        // recebe o valor do nome
        System.out.println("Informe o nome do aluno: ");
        String Nome = leitor.nextLine();

        // laço de repeticao while para receber os valores das notas
        while(contador < 5){
            System.out.println("Informe o valor da " + (contador+1) + "a nota: ");
            int notaDigitada = leitor.nextInt();

            // condicional para validar se as notas estao entre 0 e 10
            if ((notaDigitada > 0) && (notaDigitada < 10)){
                notas[contador] = notaDigitada;
                System.out.println("Nota registrada, proxima... ");
                contador++;
            }
            else{
                System.out.println("Erro!");
                System.out.println("Informe uma nota valida de 0 a 10!");
            }
        }

        System.out.println("--------------------------");

        // imprime na tela os dados recebidos
        System.out.println("Matricula: " + Matricula);
        System.out.println("Nome: " + Nome);
        for(int i = 0; i < 5; i++){
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        leitor.close();
    }

 }