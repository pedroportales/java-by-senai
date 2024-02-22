import java.util.Scanner;
import java.util.ArrayList;

class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int envelhecer(int idadeEnvelhecida) {
        return idade + idadeEnvelhecida;
    }

    public double engordar(double pesoAdquirido) {
        return peso + pesoAdquirido;
    }

    public double emagrecer(double pesoPerdido) {
        return peso - pesoPerdido;
    }

    public double crescer(double alturaAdquirida){
        return altura + alturaAdquirida;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        Scanner scanner = new Scanner(System.in);

        int saida = 1;

        while (saida != 4) {
            System.out.println("---- MENU ----");
            System.out.println("(1) Adicionar pessoa");
            System.out.println("(2) Remover pessoa");
            System.out.println("(3) Listar");
            System.out.println("(4) Sair");
            System.out.print("Escolha uma opção: ");

            saida = scanner.nextInt();

            switch (saida) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
            
        }
    }
}
