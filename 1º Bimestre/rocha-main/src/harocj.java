import java.util.Scanner;

public class harocj {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero1, numero2, numero3 = 0;
        char operador;
        System.out.println("Calculadora:");
        System.out.println("Digite o primeiro número: ");
        numero1 = leia.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = leia.nextDouble();
        System.out.println("Digite o operador: ");
        operador = leia.next().charAt(0);
        if (operador == '+'){
            numero3 = numero1 + numero2;
            System.out.printf("Operação: ", operador);
            System.out.printf("" + numero1);
            System.out.printf(" + " + numero2);
            System.out.printf(" = " + numero3);
        }
        if (operador == '-'){
            numero3 = numero1 - numero2;
            System.out.printf("Operação: ", operador);
            System.out.printf("" + numero1);
            System.out.printf(" - " + numero2);
            System.out.printf(" = " + numero3);
        }
        if (operador == '/'){
            numero3 = numero1 / numero2;
            System.out.printf("Operação: ", operador);
            System.out.printf("" + numero1);
            System.out.printf(" / " + numero2);
            System.out.printf(" = " + numero3);
        }
        if (operador == '*'){
            numero3 = numero1 * numero2;
            System.out.printf("Operação: ", operador);
            System.out.printf("" + numero1);
            System.out.printf(" * " + numero2);
            System.out.printf(" = " + numero3);
        }
    }
}
