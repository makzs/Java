public class Ex001
{

    public static void exbibirMenuInicial()
    {
        // Mostra o Menu Inicial

        // Vetores Dados de 5 alunos
        /*String[] matriculas = new String[5];
        String[] nomes = new String[5];
        int[] notas1 = new int[5];
        int[] notas2 = new int[5];*/

        // Matriz com Dados dos 5 alunos
        // String[][] dadosAlunos = new String[4][5];

        // Structs ou classes/objetos
        aluno a1 = new aluno();
        a1.matricula = "A";
        a1.nome = "nome1";
        a1.nota1 = 5;
        a1.nota2 = 7;
        // aluno a2 = new aluno();
        // aluno a3 = new aluno();
        // aluno a4 = new aluno();
        // aluno a5 = new aluno();
    }

    public static void main(String[] args)
    {
        // Inicio do programa
        exbibirMenuInicial();
    }

}