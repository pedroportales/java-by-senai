import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stringlist = new ArrayList<String>();

        stringlist.add("Pedro");
        stringlist.add("Renan");
        stringlist.add("Ryan");

        stringlist.remove(1);

        stringlist.add("Renan");

        System.out.println(stringlist);

    }
}
