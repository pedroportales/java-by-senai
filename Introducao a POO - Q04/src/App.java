class Calculadora {

    public void soma(int a, int b) {
        System.out.println(a + b);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        calc.soma(10, 10);
        
    }
}
