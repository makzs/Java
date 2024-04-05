package br.edu.up;
public class Carro extends Veiculo{

    // enumerador
    public static enum Tipo {
        uno,
        bmw
    }

    // conceito de encapsular a variavel é definir se ela é publica ou privada (proteger a informação ou nao)
    // atributos
    private String marca;
    private String modelo;
    private int velocidadeMaxmia;
    private int velocidade = 0;

    // construtor
    public Carro (int velocidadeMaxmia){
        this.velocidadeMaxmia = velocidadeMaxmia;
    }

    // metodo getter e setter

    public int getVelocidadeMaxima(){
        return velocidadeMaxmia;
    }

    // get marca (pegar)
    public String getMarca(){
        return marca;
    }

    // set marca (atribuir)
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar(){

        if (this.velocidade < this.velocidadeMaxmia){
            this.velocidade++;
        }
        /* 
        if (modelo.equals(Tipo.uno) && velocidade < 200){
            velocidade++;
        }
        else if (modelo.equals(Tipo.bmw) && velocidade < 240){
            velocidade++;
        }
        */
    }

    public void freiar(){
        if (velocidade > 0){
            velocidade--;
        }
    }


    public int getVelocidade(){
        return velocidade;
    }

    

}
