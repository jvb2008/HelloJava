package m08_POO;

import java.util.ArrayList;

public class PolymorphismExercises_Copia {
    static void main() {
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(4.4));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Rectangle(3, 7.7));
        shapes.add(new Circle(5.98));
        for (Shape shape : shapes) {
            System.out.println(shape.CalculateArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.

        Printer printer = new Printer();
        printer.print(2);
        printer.print(2.2);
        printer.print("Hola");

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    }

    static class Shape {
        double CalculateArea() {
            return 0;
        }
    }

    static class Rectangle extends Shape {
        double an;
        double alt;

        public Rectangle(double an, double alt) {
            this.an = an;
            this.alt = alt;
        }

        @Override
        double CalculateArea() {
            return this.an * this.alt;
        }
    }

    static class Circle extends Shape {
        double r;

        public Circle(double r) {
            this.r = r;
        }

        @Override
        double CalculateArea() {
            return this.r * this.r;
        }
    }

    static class Printer {
        void print(int pr) {
            System.out.println(pr);
        }

        ;

        void print(double pr) {
            System.out.println(pr);
        }

        ;

        void print(String pr) {
            System.out.println(pr);
        }

        ;

    }
}
