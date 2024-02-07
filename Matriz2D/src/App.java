import java.util.Scanner;

class Matriz2D {
    private int[][] m;

    Matriz2D(){
        m = new int[2][2];
    }

    public void imprimir() {
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor de [" + i + "][" + j + "]: ");
                m[i][j] = scanner.nextInt();
                //System.out.print(m[i][j] + ", ");
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + ", ");
            }
            
            System.out.println("");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Matriz2D matriz2d = new Matriz2D();

        matriz2d.imprimir();
    }
}
