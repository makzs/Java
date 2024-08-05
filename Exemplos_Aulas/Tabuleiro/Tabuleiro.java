public class Tabuleiro {

    public static void main(String[] args) {
        Personagem p1 = new Personagem(4, 4);
        gerarTabuleiro(8, 8, p1);
    }

    public static void gerarTabuleiro(int altura, int largura, Personagem personagem) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == personagem.getPosicaoY() && j == personagem.getPosicaoX()) {
                    System.out.print("[ X ]");
                } else {
                    System.out.print("[ . ]");
                }
            }
            System.out.println();
        }
    }

}




