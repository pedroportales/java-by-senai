// Definindo classe cachorro
class Carro {
    public void ligar() {
        System.out.println("Vrum vrum!");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.ligar();
    }
}