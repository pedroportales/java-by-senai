import java.util.Scanner;

class Ponto2D {
    private int x, y;

    Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        Ponto2D ponto2d = new Ponto2D(x, y);

        System.out.println("\n---- PONTO 2D ----");
        System.out.println("X: " + ponto2d.getX());
        System.out.println("Y: " + ponto2d.getY());

    }
}
