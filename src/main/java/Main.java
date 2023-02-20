import Model.Car;
import Repo.DataRepo;
import Model.CarRecord;
import Model.EngineRecord;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //ex1();
        //ex2();
        ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
    }

    private static void ex1() {
        var peopleList = DataRepo.getPeople();
        var retList = peopleList.stream()
                .filter(r -> r.getAge() > 30)
                .collect(Collectors.toList());

        System.out.println(retList);
    }

    private static void ex2() {
        var peopleList = DataRepo.getPeople();
        var retList = peopleList.stream()
                .mapToInt(r -> r.getAge())
                .average()
                .getAsDouble();

        System.out.println(retList);
    }

    private static void ex3() {
        var catList = DataRepo.getCats();
        var retList = catList.stream()
                .filter(r -> r.getColor() == "Brown")
                .sorted(Comparator.comparing(r -> r.getAge()))
                .collect(Collectors.toList());

        System.out.println(retList);
    }

    private static void ex4() {
        // TODO...
    }

    private static void ex5() {
        // TODO...
    }

    private static void ex6() {
        // TODO...
    }

    private static void ex7() {
        // TODO...
    }

    private static void ex8() {
        // TODO...
    }

    private static void ex9() {
        // TODO...
    }
    private static void ex10() {
        // TODO...
    }
}
