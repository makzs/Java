package Aulas.Aula08;

public class Pagamento {  

    // dados do objeto
    public double valorSalario = 5000.00;

    // metodo que altera os dados
    public void alterarSalario( double novovalor){
        valorSalario = novovalor;
    }

    // função estatica para somar
    public static double somar(double a, double b){
        return a+b;
    }

}
