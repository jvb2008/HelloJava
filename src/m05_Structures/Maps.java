package m05_Structures;

import java.util.HashMap;

public class Maps {
    static void main() {
        HashMap<Integer, String> names = new HashMap<>();
        System.out.println(names.size());

        names.put(1, "Josu");
        names.put(2, "Juan");
        names.put(3, "Maite");
        names.put(4, "Julio");
        names.put(5, "Martin");

        System.out.println(names);
        System.out.println(names.get(2));
        System.out.println(names.put(4, "Julio1"));
        System.out.println(names);

//        names.remove(2);
//        System.out.println(names);

        HashMap<Integer, String> names2;
        names2 = (HashMap<Integer, String>) names.clone();
        System.out.println(names2);

        names.replace(3, "Maite2");
        names.putIfAbsent(6, "hola");
        System.out.println(names);
        System.out.println(names.values());


    }
}
