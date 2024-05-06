public class BikeDePasseio extends Bike{

    // se utiliza caixa alta quando é final, isso indica que nao se deve alterar mais
    private final int CAPACIDADE_DE_CARGA = 50;

    public BikeDePasseio(String cor, int velocidadeMaxima){
        // super é a chamada do construtor da classe mae
        super(cor, velocidadeMaxima);
    }

    public int getCapacidadeCarga(){
        return CAPACIDADE_DE_CARGA;
    }

    @Override
    public String toString() {
        return "BikeDePasseio [cor=" + cor + ", velocidade=" + velocidade + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

}
