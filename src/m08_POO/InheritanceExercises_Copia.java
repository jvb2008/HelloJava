package m08_POO;

public class InheritanceExercises_Copia {
    static void main() {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk() (Bocinazo).
        Car car = new Car("red", 3);
        car.move();
        car.honk();

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        dog.makeSound();


    }

    public static class Vehicle {
        String color;
        int numDoors;

        public Vehicle(String color, int numDoors) {
            this.color = color;
            this.numDoors = numDoors;
        }

        void move() {
            System.out.println("El coche se mueve");
        }
    }

    public static class Car extends Vehicle {
        public Car(String color, int numDoors) {
            super(color, numDoors);
        }

        void honk() {
            System.out.println("El coche pita con la bocina");
        }
    }

    public static class Animal {
        void makeSound() {
            System.out.println("Sonido genérico");
        }
    }

    public static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Guau");
        }
    }

    public static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Miau");
        }
    }
}
