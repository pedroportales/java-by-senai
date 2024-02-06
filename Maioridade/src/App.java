import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //int idade = 0;

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você tem " + idade + " anos, e é menor de idade");
        } else {
            System.out.println("Você tem " + idade + " anos, e é maior de idade");
        }


    }
}
