package Aulas.Heranças;

public class Bike {
    private String cor;
    private int velocidade;

    
    public Bike() {
        
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Bike(String cor) {
        this.cor = cor;
    }


    // sobreescrever o metodo (dar a possibilidade de ser herdada para as classes filhas)
    @Override
    public String toString() {
        return "Bike [cor=" + cor + ", velocidade=" + velocidade + "]";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
