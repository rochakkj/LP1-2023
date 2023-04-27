import java.util.Scanner;
public class exRevisao {
    static String[] nomes = new String[4];
    static double [][] contas = new double[4][4];

    public static void percorrevetor() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" "+ nomes[i + 1]);
        }
    }
    public static void percorrematriz() {
        for (int i = 0; i < 4; i++) {
            System.out.print("\n");
            for (int j = 0; j < 4; j++){
                System.out.print(" " + contas[i][j]);
            }
        }
    }
    public static String verificaint(int num){
        int x;
        if(num == 1){
            x = 1;
        }
        else if (num <= 10 && num > 1){
            x = 2;
        }
        else if(num > 10){
            x = 3;
        }
        else{
            return "Opção inválida!";
        }
        return nomes[x];
    }
    public static void main(String[] args){
        int num;
        Scanner s = new Scanner(System.in);
            for(int i = 1; i < 4; i++){
                System.out.print("\nDigite o " + i + "° nome:\n");
                nomes[i] = s.nextLine();
            }
            percorrevetor();
        for(int j = 0; j < 4; j++){
            System.out.print("\nAgora digite um número inteiro:\n");
            num = s.nextInt();
            verificaint(num);
            System.out.print(verificaint(num));
        }
        for(int n = 1; n < 4; n++){
            System.out.print("\nDigite o " + n +"° número:\n");
            contas[0][n] = s.nextInt();
            contas[n][0] = contas[0][n];
        }
        contas[1][1] = contas [0][1] * contas[0][1];
        contas[1][2] = contas[0][1] - contas [0][2];
        contas[1][3] = contas[0][1] - contas [0][3];
        contas[2][1] = contas[0][2] - contas [0][1];
        contas[2][2] = contas[0][2] * contas [0][2];
        contas[2][3] = contas[0][2] - contas [0][3];
        contas[3][1] = contas[0][3] - contas [0][1];
        contas[3][2] = contas[0][3] - contas [0][2];
        contas[3][3] = contas[0][3] * contas [0][3];
        percorrematriz();
    }
}

