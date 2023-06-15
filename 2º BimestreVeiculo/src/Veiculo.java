import java.util.Scanner;

public class Veiculo {
    public Scanner scanner = new Scanner(System.in);
    public String marca;
    public String tipo; //caminhão, moto, veículo de passeio, etc
    public String modelo;
    public String ano;


    public veiculo(String marca, String tipo, String modelo, String ano){
        System.out.println("Informe a marca do veículo: ");
        this.marca = scanner.next();
        System.out.println("Informe o tipo do veículo: ");
        this.tipo = scanner.next();
        System.out.println("Informe o modelo do veículo: ");
        this.modelo = scanner.next();
        System.out.println("Informe o ano do veículo: ");
        this.ano = scanner.next();
    }

    public void exibe(){
        System.out.println("O carro é um " + this.modelo + " da marca " + this.marca + " e ano " + this.ano +". É um veículo do tipo " + this.tipo + "."  );
    }
}