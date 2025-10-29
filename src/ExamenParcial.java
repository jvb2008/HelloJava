public class ExamenParcial {
    static void main() {
        int a = 8, b = 3;
        int resultado = a / b;
        System.out.println(resultado);


        System.out.println((4 > 2) && !(3 < 1 || 5 == 5));

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);

        String x = "Hola";
        x = x + x.length();
        System.out.println(x);

        int n = 15;
        if (n % 5 == 0)
            if (n % 3 == 0)
                System.out.println("Divisible por 15");
            else
                System.out.println("Divisible por 5");
        else
            System.out.println("No divisible");

        int opcion = 4;
        switch (opcion) {
            case 1:
            case 2:
                System.out.println("Uno o Dos");
                break;
            case 3:
                System.out.println("Tres");
            default:
                System.out.println("Otro valor");
        }


        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[arr.length - 2]);

        /// 9.	¿Cuál es la forma correcta de declarar un array de enteros en Java?
        int[] numeros = new int[5];
        System.out.println(numeros.length);
        
    }


}
