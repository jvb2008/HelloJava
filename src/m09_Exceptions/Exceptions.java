package m09_Exceptions;

public class Exceptions {
    static void main() {
        try {
            var result = 10 / 0;
            System.out.println("Hola");
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.toString());
        }

    }
}
