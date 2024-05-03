package Aulas.Heranças;

public class BikeDePasseio extends Bike{

    public BikeDePasseio(String cor, int velocidadeMaxima){
        // super é a chamada do construtor da classe mae
        super(cor, velocidadeMaxima);
    }

    @Override
    public String toString() {
        return "BikeDePasseio [cor=" + cor + ", velocidade=" + velocidade + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

}
