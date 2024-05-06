// imports de listas dinamicas
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        //Bike bikePrincipal = new Bike("vermelho");

        // cria uma lista de uma classe especifica
        List<BikeDeCorrida> listBikeDeCorrida = new ArrayList<>();

        // cria uma lista de bikes uma classe acima de bikes especificas
        List<Bike> listBike = new ArrayList<>();

        BikeDeCorrida bikeCorrida = new BikeDeCorrida("verde", 100);
        // bikeCorrida.setCor("verde");
        bikeCorrida.setVelocidade(80);

        listBikeDeCorrida.add(bikeCorrida);
        listBike.add(bikeCorrida);

        BikedeTrilha bikeTrilha = new BikedeTrilha("azul", 60);
        // bikeTrilha.setCor("azul");
        // bikeTrilha.setVelocidade(60);

        //listBikeDeCorrida.add(bikeTrilha); -> nao é possivel adicionar outra classe em uma lista de uma classe especifico
        listBike.add(bikeTrilha); // aqui nao temos uma lista de uma classe especifica e sim de uma classe com abstração acima dessas especificas

        BikeDePasseio bikePasseio = new BikeDePasseio("amarelo", 40);
        // bikePasseio.setCor("Amarelo");
        // bikePasseio.setVelocidade(50);

        listBike.add(bikePasseio);

        // System.out.println(bikeCorrida);
        // System.out.println(bikeTrilha);
        // System.out.println(bikePasseio);

        // imprime as bike utilizando a lista dinamica
        for (Bike bike : listBike) {
            System.out.println(bike);
        }
        
    }
}
