package Aulas.Heranças;

public class BikeDeCorrida extends Bike{

    public BikeDeCorrida(String cor, int velocidadeMaxima){
        // super é a chamada do construtor da classe mae
        super(cor, velocidadeMaxima);
    }

    @Override
    public String toString() {
        // se o encapsluamento for private tera que usar o get
        // return "BikeDeCorrida [cor=" + super.getCor() + ",]";
        // se o encapsulamento for protected ele herdara os atributos
        return "BikeDeCorrida [cor=" + cor + ", velocidade=" + velocidade + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }
}
