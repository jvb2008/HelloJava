package m05_Structures;

import java.util.HashSet;

public class Sets {

    static void main() {
        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Inserción
        names.add("Josu");
        names.add("Motoso");
        names.add("Programador");
        names.add("jmotoso001@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso ERROR
//        System.out.println(names.getFirst());
//        System.out.println(names.get(1));
//        System.out.println(names.getLast());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminación
        names.remove("Josu");
        System.out.println(names.size());

        // Búsqueda
        System.out.println(names.contains("Josu"));
        System.out.println(names.contains("jmotoso001@gmail.com"));

        System.out.println(names);
        names.add("Josu");
        names.add("Josu");
        names.add("Josu");
        System.out.println(names);

        // Conjuntos
        // names.addAll(numbers); Error
        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        countries.add("Josu");

        names.addAll(countries);
        System.out.println(names);
        System.out.println(countries);

        // Elimina de names todos los countries
        names.removeAll(countries);
        System.out.println(names);

        // Retiene en names todos los countries
        names.retainAll(countries);
        System.out.println(names);


    }
}
