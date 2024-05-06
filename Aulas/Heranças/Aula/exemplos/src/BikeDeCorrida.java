public class BikeDeCorrida extends Bike{

    public BikeDeCorrida(String cor, int velocidadeMaxima){
        // super é a chamada do construtor da classe mae
        super(cor, velocidadeMaxima);
    }

    // utiliza o metodo da interface para definir a capacidade de carga (implementação da interface transporte)
    public int getCapacidadeCarga(){
        return 60;
    }

    @Override
    public String toString() {
        // se o encapsluamento for private tera que usar o get
        // return "BikeDeCorrida [cor=" + super.getCor() + ",]";
        // se o encapsulamento for protected ele herdara os atributos
        return "BikeDeCorrida [cor=" + cor + ", velocidade=" + velocidade + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }
}
