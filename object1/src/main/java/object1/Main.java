package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person("Jane", 23, 180);
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Height: " + person.height);

        Car car = new Car("Honda", "CRV", 2015);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        Chair chair = new Chair("Leather", "Blue", 2);
        System.out.println("Material: " + chair.getColor());
        System.out.println("Color: " + chair.getMaterial());
        System.out.println("Legs: " +chair.getLegs());

        Dog dog = new Dog("Donut", 1, "Golden retriever");
        System.out.println("Name: "+ dog.getName());
        System.out.println("Age: "+ dog.getBreed());
        System.out.println("Breed: "+dog.getAge());
    }
    }

