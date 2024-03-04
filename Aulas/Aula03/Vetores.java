import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        // Scanner
        Scanner leitor = new Scanner(System.in);

        // Vetores
        int[] vet1 = new int[3];

        // int[] vet2 = new int[] { 6, 8, 3 };

        // vet1[1] = 450;
        // int VlrPos1 = vet1[0];

        // System.out.println("Vet1 pos 1: " + VlrPos1);
        // System.out.println("Vet1 pos 2: " + vet1[1]);
        // System.out.println("Vet2 pos 1: " + vet2[0]);

        // Repetidores for, while, do while:

        // Repetidor para preencher o vetor 1
        for (int i = 0; i < 3; i++) {

            System.out.println("Informe o valor da posição: " + (i + 1));
            int VlrDigitado = leitor.nextInt();

            vet1[i] = VlrDigitado;
            // vet[i] = leitor.nexInt();

        }

        // Imprimir os valores de vet1
        boolean executor = true;
        int contador = 0;
        while (executor && contador < 3) {
            int vlrVetor = vet1[contador];
            // se valor maior que 100 cancela a operacao
            if (vlrVetor > 100){
                executor = false;
            }
            else {
                System.out.println("Valor na posição " + (contador + 1) + " : " + vlrVetor);
    
                contador++;
            }
        }

        // Zerar o vetor
        contador = 0;
        do {
            // vetor esta zerado?
            if(vet1[0] == 0){
                break;
            }

            vet1[contador] = 0;

            contador ++;
        }while(contador < 3);


        leitor.close();

    }

}
