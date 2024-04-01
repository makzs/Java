public class Carro extends Veiculo{

    // conceito de encapsular a variavel é definir se ela é publica ou privada (proteger a informação ou nao)
    private String marca;
    private int velocidade = 0;

    public void acelerar(){
        if (velocidade < 200){
            velocidade++;
        }
    }
}
