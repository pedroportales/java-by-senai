import java.util.Scanner;

class Vetor {
    private int[] vetor;

    Vetor() {
    }

    public void preencher(int n) {
        vetor = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor do elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public int[] getVetor() {
        return vetor;
    }
}

class Matriz {
    private int[][] matriz;

    Matriz() {
    }

    public void preencher(int m, int n) {
        matriz = new int[m][n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor do elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }
}

class Verificador {
    public boolean éPar(int n) {
        return n % 2 == 0;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Vetor vetor = new Vetor();
        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        vetor.preencher(tamanhoVetor);

        Matriz matriz = new Matriz();
        System.out.print("Digite o número de linhas da matriz: ");
        int linhasMatriz = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunasMatriz = scanner.nextInt();
        matriz.preencher(linhasMatriz, colunasMatriz);

        Verificador verificador = new Verificador();

        System.out.println("Elementos do vetor e se são pares:");
        int[] arrayVetor = vetor.getVetor();
        for (int i = 0; i < arrayVetor.length; i++) {
            System.out.println(arrayVetor[i] + ": " + verificador.éPar(arrayVetor[i]));
        }

        System.out.println("Elementos da matriz e se são pares:");
        int[][] arrayMatriz = matriz.getMatriz();
        for (int i = 0; i < arrayMatriz.length; i++) {
            for (int j = 0; j < arrayMatriz[i].length; j++) {
                System.out.println(arrayMatriz[i][j] + ": " + verificador.éPar(arrayMatriz[i][j]));
            }
        }
    }
}
