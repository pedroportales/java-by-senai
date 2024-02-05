// Definindo classe cachorro
class Cachorro {
    public void latir() {
        System.out.println("Au au!");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.latir();
    }
}
