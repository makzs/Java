package Aulas.Aula07;

public class Programa {
    
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("Ricardo", 25);
        //pessoa1.nome = "Ricardo";
        //pessoa1.idade = 25;

        Pessoa pessoa2 = new Pessoa("Ana");
        //pessoa2.nome = "Ana";
        pessoa2.idade = 21;

        Pessoa pessoa3 = new Pessoa();

        System.out.println("Pessoa 1 (nome): " + pessoa1.nome);
        System.out.println("Pessoa 2 (nome): " + pessoa2.nome);
        System.out.println("Pessoa 3 (nome): " + pessoa3.nome);
        System.out.println("-------------------------------");
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

    }

}
