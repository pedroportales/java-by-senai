import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listaIntegers = new ArrayList<>();

        int soma = 0;

        listaIntegers.add(1);
        listaIntegers.add(2);
        listaIntegers.add(3);

        for (int i = 0 ; i < listaIntegers.size(); i++) {
            soma += listaIntegers.get(i);
        }

        System.out.println(soma);
    }
}
