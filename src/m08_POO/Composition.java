package m08_POO;

public class Composition {
    // Composición ("tiene un")
    static void main() {
        Car car = new Car();
        car.on();
    }

    public static class Engine {
        void on() {
            System.out.println("El motor está encendido");
        }
    }

    public static class Car {
        final private Engine engine = new Engine();

        void on() {
            engine.on();
        }
    }
}

