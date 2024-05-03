package Aulas.Heranças;

public class BikedeTrilha extends Bike{

    public BikedeTrilha(String cor, int velocidadeMaxima){
        // super é a chamada do construtor da classe mae
        super(cor, velocidadeMaxima);
    }

    @Override
    public String toString() {
        return "BikedeTrilha [cor=" + cor + ", velocidade=" + velocidade + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

}
