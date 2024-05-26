import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // defino o arquivo de texto que desejo
        File arquivo = new File(
                "C:\\Users\\autologon\\Desktop\\teste\\Java\\Aulas\\LeituraGravaçãoTexto\\ExemploArquivos\\src\\Clientes.csv");
            List<Cliente> listaClientes = new ArrayList<>();

        try { // tentar rodar

            Scanner leitor = new Scanner(arquivo);

            // descarta a linha do cabecario
            leitor.nextLine();


            // enquanto tiver linhas no arquivo
            while (leitor.hasNextLine()) {
                // se le a linha e imprime na tela
                String linha = leitor.nextLine();
                // quebrar as linhas pela tabulação
                String[] dados = linha.split(";");

                String nome = dados[0];
                String telefone = dados[1];
                String email = dados[2];

                Cliente novoCliente = new Cliente(nome, telefone, email);
                listaClientes.add(novoCliente);
            }

            leitor.close();
        } catch (FileNotFoundException x) { // trata o erro
            System.out.println("O arquivo" + arquivo + " nao foi encontrado pois " + x.getCause());
        }

        // gravação no arquivo
        Cliente novoCliente = new Cliente("maria", "454321321", "maria@email.com");

        try {
            FileWriter arquivogravar = new FileWriter("C:\\Users\\autologon\\Desktop\\teste\\Java\\Aulas\\LeituraGravaçãoTexto\\ExemploArquivos\\src\\Clientes.csv");
            PrintWriter gravador = new PrintWriter(arquivogravar);

            for (Cliente c : listaClientes) {
                c.toCSV();
            }
            gravador.close();
        } catch (IOException e) {
            System.out.println("Erro de IO");
        }
    }
}
// public static void main(String[] args) {

// // defino o arquivo de texto que desejo
// File arquivo = new
// File("C:\\Users\\autologon\\Destop\\teste\\Java\\Aulas\\LeituraGravaçãoTexto\\ExemploArquivos\\src\\arquivo.txt");
// try{ // tentar rodar

// Scanner leitor = new Scanner(arquivo);

// // enquanto tiver linhas no arquivo
// while (leitor.hasNextLine()){
// // se le a linha e imprime na tela
// String linha = leitor.nextLine();
// System.out.println("Linha: " + linha);
// }

// leitor.close();
// } catch (FileNotFoundException x){ // trata o erro
// System.out.println("O arquivo" + arquivo + " nao foi encontrado pois " +
// x.getCause());
// }

// }
// }
