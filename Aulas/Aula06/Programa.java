import br.edu.up.Bike;

public class Programa {

    public static void main(String[] args){

        String texto1 = "100";
        String texto2 = "50";

        // concatenação
        String textoFinal = texto1 + texto2;
        System.out.println("Texto: " + textoFinal);

        // parsear (converter)
        Integer numero1 = Integer.parseInt(texto1);
        // int primitivo / Integer classe (toda classe primeira letra maiscula)
        int numero2 = Integer.parseInt(texto2);
        System.out.println(Calculadora.Somar(numero1, numero2));

        int resultado = numero1 + numero2;
        System.out.println("Int: " + resultado);

        System.out.println("\n");

        // a diferença: primitivo = variavel / classe = objeto
        //double varaivel = 10.60;
        //Double objeto = 10.50;

        //int inteiro = objeto.intValue();

        // classes que geram objetos nao se pode alterar por nao ter o termo "static"
        // erro1:
        //Bike.marca = "Caloi";
        // erro2:
        //Bike.marchaAtual = 3;

        // A classe Bike nao foi criada para gerar uma biblioteca de funções e sim criar objetos

        // Criando objetos do tipo bike
        Bike minhaBike = new Bike();
        Bike suaBike = new Bike();

        // apos a criação é possivel alterar
        minhaBike.marca = "Caloi";
        minhaBike.alterarMarcha(3);

        suaBike.marca = "Oggi";
        suaBike.alterarMarcha(2);

        System.out.println("Minha bike marca: " + minhaBike.marca);
        System.out.println("Minha bike marcha: " + minhaBike.marchaAtual);

        System.out.println("\n");

        System.out.println("Sua bike marca: " + suaBike.marca);
        System.out.println("Sua bike marcha: " + suaBike.marchaAtual);
    }

}
