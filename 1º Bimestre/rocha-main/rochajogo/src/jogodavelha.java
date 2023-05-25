import java.util.Scanner;
public class jogodavelha {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        while (true) {
            digite(tabuleiro);
            if (vitoria(tabuleiro)) {
                System.out.println("Parabéns, você venceu!");
                break;
            } else if (empate()) {
                System.out.println("Deu velha!");
                break;
            }
        }
    }
    public static boolean vitoria(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
                return true; // vitoria horizontal
            }
            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != ' ') {
                return true; // vitoria vertical
            }
        }
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ') {
            return true; // vitoria diagonal
        }
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ') {
            return true; // vitoria diagonal
        }
        return false;
    }

    public static void tab(char[][] tabuleiro){
        int i, j;
        System.out.print("  0 1 2");
        for (i = 0; i < 3; i++) {
            System.out.print("\n -------");
            System.out.print("\n" + i);
            System.out.print(" ");
            for (j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                System.out.print("|");
            }
        }
    }
    public static void digite(char[][] tabuleiro) {
        Scanner s = new Scanner(System.in);
        tab(tabuleiro);
        System.out.print("\nJogador número 1, digite a linha desejada: ");
        int linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        int coluna = s.nextInt();
        tabuleiro[linha][coluna] = 'X';
        tab(tabuleiro);

        System.out.print("\nJogador número 2, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = '0';
        tab(tabuleiro);

        System.out.print("\nJogador número 1, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = 'X';
        tab(tabuleiro);

        System.out.print("\nJogador número 2, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = '0';
        tab(tabuleiro);

        System.out.print("\nJogador número 1, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = 'X';
        tab(tabuleiro);
        vitoria(tabuleiro);

        System.out.print("\nJogador número 2, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = '0';
        tab(tabuleiro);
        vitoria(tabuleiro);

        System.out.print("\nJogador número 1, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = 'X';
        tab(tabuleiro);
        vitoria(tabuleiro);

        System.out.print("\nJogador número 2, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = '0';
        tab(tabuleiro);
        vitoria(tabuleiro);

        System.out.print("\nJogador número 1, digite a linha desejada: ");
        linha = s.nextInt();
        System.out.print("Agora a coluna: ");
        coluna = s.nextInt();
        tabuleiro[linha][coluna] = 'X';
        tab(tabuleiro);
        vitoria(tabuleiro);
    }
    public static boolean empate(){
        return false;
    }
}