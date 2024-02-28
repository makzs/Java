package Exemplos_Aulas;

import java.util.Random;

// Mega Sena em Java

public class Aula04 {
    
    public static void main(String[] args) {
        // importa random da biblioteca
        Random generate = new Random();

        // loop para geração de numeros        
        for(int i = 0; i < 6; i++){
            // aleatoriza um numero entre 1 e 60
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }

}
