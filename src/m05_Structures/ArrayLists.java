package m05_Structures;

import java.util.ArrayList;

public class ArrayLists {

    static void main() {
        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Inserción
        names.add("Josu");
        names.add("Motoso");
        names.add("Programador");
        System.out.println(names.size());

        // Acceso
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificación
        names.set(2, "jmotoso001@gmail.com");
        System.out.println(names.getLast());

        // Eliminación
        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Búsqueda
        System.out.println(names.contains("Josu"));
        System.out.println(names.contains("jmotoso001@gmail.com"));

        // Clonado
        ArrayList<String> namesClone = new ArrayList<>();
        namesClone = (ArrayList<String>) names.clone();
        System.out.println((namesClone));

        // Limpieza
        names.add("Josu");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());


    }
}
