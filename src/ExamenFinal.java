import java.util.ArrayList;
import java.util.HashSet;

public class ExamenFinal {
    static void main() {
        double x = 5;
        int y = 2;
        double resultado = x / y + y;
        System.out.println(resultado);

        String s = "Hola";
        s = s.concat(" Mundo");
        System.out.println(s.length());

        int n = 2;
        switch (n) {
            case 1:
                System.out.print("A");
            case 2:
                System.out.print("B");
            case 3:
                System.out.print("C");
                break;
            default:
                System.out.print("D");
        }

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(3);
        lista.add(5);
        HashSet<Integer> conjunto = new HashSet<>(lista);
        System.out.println(conjunto.size());

        for (int i = 1; i < 10; i += 3) {
            System.out.println(i);
        }

        System.out.println(operar(2, 3));
        Animal a = new Perro();
        a.sonido();
    }

    static int operar(int a, int b) {
        return a + b * a;
    }

    static class Animal {
        void sonido() {
            System.out.println("Sonido genérico");
        }
    }

    static class Perro extends Animal {
        void sonido() {
            System.out.println("Ladrido");
        }
    }
}
