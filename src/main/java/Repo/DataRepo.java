package Repo;

import Model.Car;
import Model.Cat;
import Model.Engine;
import Model.Person;
import java.util.ArrayList;

public class DataRepo {
    public static ArrayList<Person> getPeople() {
        var retval = new ArrayList<Person>();
        retval.add(new Person(1, 1,"Alice", "Jones", 10));
        retval.add(new Person(2, 2, "Bob", "Marley", 15));
        retval.add(new Person(3, 3, "Charlie", "Daniels", 20));
        retval.add(new Person(4, 4, "Dave", "Campbell", 25));
        retval.add(new Person(5, 5, "Egar", "Winter", 30));
        retval.add(new Person(6, "Frank", "Zappa", 35));
        retval.add(new Person(7, "Gary", "Hoey", 40));
        retval.add(new Person(8, "Igor", "Smith", 45));
        retval.add(new Person(9, "Jack", "White", 50));
        retval.add(new Person(10, "Larry", "Same", 55));
        return retval;
    }

    public static ArrayList<Cat> getCats() {
        var retval = new ArrayList<Cat>();
        retval.add(new Cat(1, "Gabby", "Brown", 11));
        retval.add(new Cat(2, "Baxie", "Gray", 8));
        retval.add(new Cat(3, "Gyspy", "Black", 9));
        retval.add(new Cat(4, "Stretchie", "White", 11));
        retval.add(new Cat(5, "Lily", "Brown", 10));
        return retval;
    }

    public static ArrayList<Car> getCars() {
        var retval = new ArrayList<Car>();
        retval.add(new Car(1, "Toyota", "Prius", 20000F));
        retval.add(new Car(2, "Ford", "Escort", 15000F));
        retval.add(new Car(3, "Ford", "Mustang", 25000F));
        retval.add(new Car(4, "Chevy", "Volt", 30000F));
        retval.add(new Car(5, "Mazada", "Mazda6", 30000F));
        return retval;
    }

    public static ArrayList<Car> getCarsWithEngines() {
        var retval = new ArrayList<Car>();
        retval.add(new Car(1, "Toyota", "Prius", 20000F, new Engine(2.2F, 4)));
        retval.add(new Car(2, "Ford", "Escort", 15000F, new Engine(2.0F, 4)));
        retval.add(new Car(3, "Ford", "Mustang", 25000F, new Engine(5.0F, 8)));
        retval.add(new Car(4, "Chevy", "Volt", 30000F, new Engine(2.0F, 4)));
        retval.add(new Car(5, "Mazada", "Mazda6", 30000F, new Engine(2.5F, 4)));
        return retval;
    }
}
