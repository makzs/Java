package Aulas.Heranças;

public class Programa {
    public static void main(String[] args) {
        Bike bikePrincipal = new Bike("vermelho");

        BikeDeCorrida bikeCorrida = new BikeDeCorrida();
        bikeCorrida.setCor("verde");
        bikeCorrida.setVelocidade(80);

        BikedeTrilha bikeTrilha = new BikedeTrilha();
        bikeTrilha.setCor("azul");
        bikeTrilha.setVelocidade(60);

        BikeDePasseio bikePasseio = new BikeDePasseio();
        bikePasseio.setCor("Amarelo");
        bikePasseio.setVelocidade(50);

        System.out.println(bikePrincipal);
        System.out.println(bikeCorrida);
        System.out.println(bikeTrilha);
        System.out.println(bikePasseio);

        
    }
}
