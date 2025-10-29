import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class m06_Loops {
    static void main() {


        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }

        //loops

        for (int i = 5; i > 0; i--) {
            System.out.println("Hola");
        }

        String[] frutas = {"a", "b", "c"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);

        }
        // for-each
        for (String fruta : frutas) {
            System.out.println(fruta);
        }


        HashSet<String> names = new HashSet<>();
        names.add("Josu");
        names.add("Motoso");
        names.add("Programador");
        names.add("jmotoso001@gmail.com");
        for (String name : names) {
            System.out.println(name);
        }

        HashMap<Integer, String> names2 = new HashMap<>();
        names2.put(1, "Josu");
        names2.put(2, "Juan");
        names2.put(3, "Maite");
        names2.put(4, "Julio");
        names2.put(5, "Martin");

        for (Map.Entry<Integer, String> a : names2.entrySet()) {
            System.out.println(a.getKey());
            System.out.println(a.getValue());

        }

        int i = 0;
        while (i < frutas.length) {
            System.out.println(frutas[i]);
            i++;
        }

        i = 0;
        do {
            System.out.println(frutas[i]);
            i++;
        } while (i < 0);

        i = 0;
        boolean find = false;
        while (!(find)) {
            if (frutas[i].equals("a")) {
                find = true;
                System.out.println(frutas[i]);
            }
            i++;
        }

        //control de bucles
        //break
        i = 0;
        while (true) {
            if (frutas[i].equals("a")) {
                System.out.println(frutas[i]);
                break;
            }
            i++;
        }

        for (int ind = 0; ind < 5; ind++) {
            if (ind == 3) {
                continue;
            }
            System.out.println(ind);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }

    }

}
