package Aulas.Aula07;

public class Pessoa {
    
    public String nome;
    public int idade;

    public String toString(){
        return "Nome:" + nome + "Idade: " + idade;
    }

    public Pessoa(){

    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

}
