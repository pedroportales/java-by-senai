import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listaIntegers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        listaIntegers.add(1);
        listaIntegers.add(2);
        listaIntegers.add(3);
        listaIntegers.add(4);
        listaIntegers.add(5);
        listaIntegers.add(6);
        listaIntegers.add(7);
        listaIntegers.add(8);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();
        int existe = 0;

        for (int i = 0; i < listaIntegers.size(); i++) {
            if (num == listaIntegers.get(i)) {
                System.out.printf("O número %d existe na lista.\n", num);
                existe = 1;
            }
        }

        if (existe == 0) {
            System.out.printf("O número %d NÃO existe na lista.\n", num);
        }
    }
}
