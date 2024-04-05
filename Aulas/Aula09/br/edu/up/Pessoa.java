package br.edu.up;
public class Pessoa {

    private String nome;
    private int altura;
    private int peso;

    public Pessoa(){
        
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, int altura, int peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public int getAltura(){
        return this.altura;
    }

    public int getPeso(){
        return this.peso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAltura(int altura){
        if (altura > 15 && altura < 250){
            this.altura = altura;

        }
    }



}
