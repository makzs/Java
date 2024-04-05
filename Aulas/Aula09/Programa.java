public class Programa {

    // para acessar o valor do objeto se usa um metodo dele e nao a definição de valores, tudo para proteger a informação!
    public static void main(String[] args){

        Carro uno = new Carro(200);

        // definir a marca a partir de get e set
        uno.setMarca("Fiat");
        uno.setModelo("Uno Mille");

        // utilizar os metodos da classe para alterar um atributo protegido com private
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();

        uno.freiar();
        uno.freiar();
        uno.freiar();

        System.out.println("Marca: " + uno.getMarca());
        System.out.println("Modelo: " + uno.getModelo());
        System.out.println("Velocidade: " + uno.getVelocidade());
        System.out.println("Velocidade: " + uno.getVelocidadeMaxima());

        Carro bmw = new Carro(240);
        bmw.setMarca("BMW");
        bmw.setModelo("I7");

        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();

        bmw.freiar();
        bmw.freiar();
        bmw.freiar();

        System.out.println("Marca: " + bmw.getMarca());
        System.out.println("Modelo: " + bmw.getModelo());
        System.out.println("Velocidade: " + bmw.getVelocidade());
        System.out.println("Velocidade: " + bmw.getVelocidadeMaxima());
    }

}
