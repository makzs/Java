package Aulas.Heranças;

public class Programa {
    public static void main(String[] args) {
        //Bike bikePrincipal = new Bike("vermelho");

        BikeDeCorrida bikeCorrida = new BikeDeCorrida("verde", 100);
        // bikeCorrida.setCor("verde");
        bikeCorrida.setVelocidade(80);

        BikedeTrilha bikeTrilha = new BikedeTrilha("azul", 60);
        // bikeTrilha.setCor("azul");
        // bikeTrilha.setVelocidade(60);

        BikeDePasseio bikePasseio = new BikeDePasseio("amarelo", 40);
        // bikePasseio.setCor("Amarelo");
        // bikePasseio.setVelocidade(50);

        System.out.println(bikeCorrida);
        System.out.println(bikeTrilha);
        System.out.println(bikePasseio);

        
    }
}
