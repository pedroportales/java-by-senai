import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números deseja inserir: ");
        int vetorTam = scanner.nextInt();

        int numeros[] = new int[vetorTam];
        int maiorNumero = -128;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Insira o %dº valor: ", i+1);
            numeros[i] = scanner.nextInt();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.printf("O maior número foi: %d.\n", maiorNumero);
    }
}
