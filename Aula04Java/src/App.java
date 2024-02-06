import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double somaDasNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaDasNotas += nota;
        }

        double media = somaDasNotas / 3;
        System.out.println("A média das notas é: " + media);
    }
}
