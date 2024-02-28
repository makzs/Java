package Exemplos_Aulas;

// Criando outros tipos de funções 

public class Aula01 {
    public static void main(String[] args) {
        // chamando a função calc com os parametros indicados
        calc( 10, 15); // x e y é os argumentos dessa função

    }

    static void calc(int x, int y){
        // stati void > declaração padrão
        // sun é o nome da função (calc) para indicar que é uma função que calcula numeros
        // (x, y) definindo os parametros que são necessarios
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}

