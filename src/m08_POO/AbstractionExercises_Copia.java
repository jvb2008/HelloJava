package m08_POO;

public class AbstractionExercises_Copia {
    static void main() {
        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        Circle circle = new Circle(4.4);
        Rectangle rectangle = new Rectangle(4.5, 6.7);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.

        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        guitar.play();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.

        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        PartTimeEmployee pt = new PartTimeEmployee("Mikel", 5, 40);
        System.out.println(pt.getName() + " gana " + pt.calculateSalary());
        FullTimeEmployee ft = new FullTimeEmployee("Juan", 500);
        System.out.println(ft.getName() + " gana " + ft.calculateSalary());

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.

        Car car = new Car();
        car.move();

        Robot robot = new Robot();
        robot.move();


        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        Appliance tv = new TV("Toshiba", 60);
        tv.turnOn();
        tv.turnOff();

        Appliance wm = new WashingMachine("Balay", 50);
        wm.turnOn();
        wm.turnOff();


        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.

        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        Invoice inv = new Invoice();
        inv.pay("poFactura");

        EmployeePayment ep = new EmployeePayment(5, 20);
        ep.setSalaryPerHour(200);
        ep.setHoursWorked(3);
        ep.pay("porHOra");
        ep.pay("porMes");

    }

    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
    abstract static class Shape {
        abstract double calculateArea();
    }

    static class Circle extends Shape {

        private final double radio;

        Circle(double radio) {
            this.radio = radio;
        }

        @Override
        double calculateArea() {
            return (Math.PI * this.radio * this.radio);
        }
    }

    static class Rectangle extends Shape {
        private final double alt;
        private final double anch;

        Rectangle(double alt, double anch) {
            this.alt = alt;
            this.anch = anch;
        }

        @Override
        double calculateArea() {
            return this.alt * this.anch;
        }
    }

    // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.

    interface Playable {
        void play();
    }

    static class Guitar implements Playable {

        @Override
        public void play() {
            System.out.println("Toco la guitarra");
        }
    }

    static class Piano implements Playable {

        @Override
        public void play() {
            System.out.println("Toco el piano");
        }
    }

    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.

    abstract static class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {

        @Override
        void makeSound() {
            System.out.println("Guau");
        }
    }

    static class Cat extends Animal {

        @Override
        void makeSound() {
            System.out.println("Miau");
        }
    }

    //5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.

    static abstract class Employee {
        private String name;

        abstract double calculateSalary();

        Employee(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }
    }

    static class FullTimeEmployee extends Employee {
        private double monthSalary;

        FullTimeEmployee(String name, double monthSalary) {
            super(name);
            this.monthSalary = monthSalary;
        }

        @Override
        double calculateSalary() {
            return monthSalary;
        }

    }

    static class PartTimeEmployee extends Employee {
        final int hoursWorked;
        final int hourSalary;

        PartTimeEmployee(String name, int hoursWorked, int hourSalary) {
            super(name);
            this.hoursWorked = hoursWorked;
            this.hourSalary = hourSalary;
        }

        @Override
        double calculateSalary() {
            return this.hoursWorked * this.hourSalary;
        }

    }

    // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
    interface Movable {
        void move();
    }

    public static class Car implements Movable {

        public Car() {

        }

        @Override
        public void move() {
            System.out.println("El coche se mueve");
        }
    }

    public static class Robot implements Movable {

        public Robot() {

        }

        @Override
        public void move() {
            System.out.println("El robot se mueve");
        }
    }

    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
    private abstract static class Appliance {
        private String brand;

        private Appliance(String brand) {
            this.brand = brand;
        }

        abstract void turnOn();

        abstract void turnOff();

        String getBrand() {
            return this.brand;
        }

        void setBrand(String brand) {
            this.brand = brand;
        }


    }

    public static class TV extends Appliance {
        int pulgadas;

        private TV(String brand, int pulgadas) {
            super(brand);
            this.pulgadas = pulgadas;
        }


        @Override
        void turnOn() {
            System.out.println("La tv con marca " + this.getBrand() + " se enciende. Tiene " + this.pulgadas + " pulgadas");
        }

        @Override
        void turnOff() {
            System.out.println("La tv con marca " + this.getBrand() + " se enciende. Tiene " + this.pulgadas + " pulgadas");
        }
    }

    public static class WashingMachine extends Appliance {
        int kilosSoportados;

        private WashingMachine(String brand, int kilosSoportados) {
            super(brand);
            this.kilosSoportados = kilosSoportados;
        }

        @Override
        void turnOn() {
            System.out.println("La lavadora con marca " + this.getBrand() + " se enciende. Soporta " + this.kilosSoportados + " kilos");
        }

        @Override
        void turnOff() {
            System.out.println("La lavadora con marca " + this.getBrand() + " se enciende. Soporta " + this.kilosSoportados + " kilos");

        }
    }

    // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
    interface Payable {

        void pay(String payMethod);
    }

    static class Invoice implements Payable {

        @Override
        public void pay(String playMethod) {
            System.out.println(String.format("EL metodo de pago es %s", playMethod));
        }
    }


    static class EmployeePayment implements Payable {
        private double hoursWorked;
        private double salaryPerHour;

        EmployeePayment(double hoursWorked, double salaryPerHour) {
            this.hoursWorked = hoursWorked;
            this.salaryPerHour = salaryPerHour;
        }

        @Override
        public void pay(String playMethod) {
            double salary = this.salaryPerHour * this.hoursWorked;
            if (playMethod.equals("porHora")) {
                System.out.println(String.format("El método de pago es %s y serán %f", playMethod, salary));

            } else {
                System.out.println(String.format("El método de pago es %s y serán %f", playMethod, this.hoursWorked * 30));
            }

        }

        void setSalaryPerHour(double salary) {
            this.salaryPerHour = salary;
        }

        void setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }
    }
}


