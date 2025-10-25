package m02_Fundamentals;

public class Operators {
    public static void main(String[] args) {

        /*
        Módulo2 Operadores aritméticos
        */

        // Aritméticos

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        /*
        Módulo3 - Operadores de asignación
        */

        // Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        /*
        Operadores de comparación
        */

        // Comparación (Relacionales)

        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        /*
        Módulo2 - Operadores lógicos
        */

        // Lógicos

        // Y (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        // O (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        // NO (NOT)
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        /*
        Módulo2 - Operadores unarios
        */

        // Unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
