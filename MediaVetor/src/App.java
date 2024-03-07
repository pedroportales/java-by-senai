import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.print("Insira quantos valores você quer: ");
        int vetorTam = scanner.nextInt();

        int vetor[] = new int[vetorTam];

        for (int i = 0; i < vetorTam; i++) {
            System.out.printf("Insira o %dº valor (inteiro): ", i+1);
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        System.out.printf("A média dos valores é: %.2f", (double) soma / vetorTam);
        
    }
}
