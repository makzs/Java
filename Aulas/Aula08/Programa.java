package Aulas.Aula08;

public class Programa {

    public static void main(String[] args){
        int numero = 100;
        String numTexto = String.valueOf(numero);

        char primeiraLetra = numTexto.charAt(0);

        System.out.println("Letra: " + primeiraLetra);

        String texto2 = "Programação em Java";

        System.out.println("---------------------------------------");

        // manipular tamanho da string
        System.out.println("Normal: " + texto2);
        System.out.println("Maiscula: " + texto2.toUpperCase());
        System.out.println("Minuscula: " + texto2.toLowerCase());

        System.out.println("---------------------------------------");

        // recortar strings
        System.out.println(texto2.substring(0, 10));

        String[] palavras = texto2.split(" ");
        String palavra1 = palavras[0];
        String palavra2 =  palavras[1];
        String palavra3 =  palavras[2];

        System.out.println("1 palavra: " + palavra1);
        System.out.println("2 palavra: " + palavra2);
        System.out.println("3 palavra: " + palavra3);

        System.out.println("---------------------------------------");

        double total = 0;
        // Dados de contas bancarias
        // Nome: CPF: saldo
        String[] registros = {"Pedro;123123;5000",
                           "Ana;321321;4000"};
        for (int i = 0; i < registros.length; i++){
            String linha = registros[i];
            String[] dados = linha.split(";");
            String nome = dados[0];
            String cpf = dados[1];
            Double saldo = Double.parseDouble(dados[2]);
            total += saldo;
            System.out.println("Nome: "+ nome + "\nCPF: "+ cpf + "\nSaldo: "+ saldo);
        }
    }

}
