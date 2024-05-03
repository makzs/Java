package Aulas.Heranças;

// hierarquia : classe -> abstract class -> interface
public abstract class Bike {
    protected String cor;
    protected int velocidade;
    protected int velocidadeMaxima;

    
    /*public Bike() {
        
    }*/

    public int getVelocidade() {
        return velocidade;
    }

    // o construtor nao é herdado para as classes filhas
    public Bike(String cor, int velocidadeMaxima) {
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // sobreescrever o metodo (dar a possibilidade de ser herdada para as classes filhas)
    @Override
    public String toString() {
        return "Bike [cor=" + cor + ", velocidade=" + velocidade + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
