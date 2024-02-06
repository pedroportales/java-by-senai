import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];
        int maior = 0, menor = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            num[i] = scanner.nextInt();

            if ( i == 0 ) {
                maior = num[i];
                menor = num[i];
            } else if ( num[i] > maior ) {
                maior = num[i];
            } else if ( num[i] < menor) {
                menor = num[i];
            }
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
    }
}
