import java.util.Scanner;

class Numero {
    private int n;

    Numero(int n) {
        this.n = n;
    }

    public String ehImpar(int n) {
        if ( n % 2 == 0 ) {
            return "Falso";
        } else {
            return "Verdadeiro";
        }
    }

    public String ehPositivo(int n) {
        if ( n > 0 ) {
            return "Verdadeiro";
        } else {
            return "Falso";
        }
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = scanner.nextInt();

        Numero numero = new Numero(n);

        System.out.println("É ímpar: " + numero.ehImpar(n));
        System.out.println("É positivo: " + numero.ehPositivo(n));
    }
}
