package m02_Fundamentals;

public class VarsAndConstants {

    public static void main(String[] args) {

        // Variables

        String name = "Josu";
        System.out.println(name);

        name = "Josu2";
        System.out.println(name);

        // name = 39; Error (no podemos cambiar el tipo de dato)

        int age = 39;
        System.out.println(age);

        var email = "jmotoso001@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "jmotoso001@gmail.com";
        // EMAIL = "jmotoso001@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
}
