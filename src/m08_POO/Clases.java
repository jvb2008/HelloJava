package m08_POO;

public class Clases {

    static void main() {
        var person = new Person("Josu", -38, "123456789A");

//        person.name = "Josu";
//        person.age = 39;

        person.sayHello();

        person.name = "Josu Motoso";
        System.out.println(person.name);

//        person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("JosuDev", 18, "123456789B");
        person2.sayHello();
    }
}

