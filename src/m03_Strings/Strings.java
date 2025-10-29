package m03_Strings;

public class Strings {

    static void main() {

        // Declaración
        String name = "Josu";
        var surname = new String("Motoso");

        // Operaciones básicas
        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener carácter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Josu"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println(name.equals("Josu"));
        System.out.println(name.equals("josu"));
        System.out.println(name.equalsIgnoreCase("josu"));

        // == vs. equals
        var a = "Josu";
        var b = "Josu";
        var c = new String("Josu");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola, me llamo Josu ".trim());

        // Replace
        System.out.println(" Hola, me apellido Josu ".replace("Josu", "Motoso"));

        // Format
        var age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));
    }
}
