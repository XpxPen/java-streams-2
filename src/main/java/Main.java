import Model.Car;
import Repo.DataRepo;
import Model.CarRecord;
import Model.EngineRecord;

import java.util.Arrays;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ex10();
    }

    private static void ex1() {
        // TODO...
        var peopleList = DataRepo.getPeople();
        var retList = peopleList.stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println(retList);

    }

    private static void ex2() {
        // TODO...
        var peopleList = DataRepo.getPeople();
        var retval = peopleList.stream().flatMapToInt(p -> IntStream.of(p.getAge())).average().getAsDouble();
        System.out.println(retval);
    }

    private static void ex3() {
        // TODO...
        var catList = DataRepo.getCats();
        var retList = catList.stream()
                .filter(c -> c.getColor().equals("Brown"))
                .sorted((a, b) -> a.getAge().compareTo(b.getAge()))
                .collect(Collectors.toList());
        System.out.println(retList);
    }

    private static void ex4() {
        // TODO...
        Integer[] numbers = new Integer[] { 1, 2, 3, 1, 2, 3, 4};
        var list = Arrays.asList(numbers);
        var retList = list.stream().distinct().collect(Collectors.toList());
        // var nl2 = list.stream().collect(Collectors.toSet());
        System.out.println(retList);
    }

    private static void ex5() {
        // TODO...
        var carList = DataRepo.getCarsWithEngines();
        var numBigEngines = carList.stream()
                .filter(c -> c.getEngine().getNumCylinders() >= 8)
                .count();
        System.out.println(numBigEngines);
    }

    private static void ex6() {
        // TODO...
        var peopleList = DataRepo.getPeople();
        var retList = peopleList.stream()
                .map(p-> {
                    return p.getFirstName().toUpperCase(Locale.ROOT);
                })
                .collect(Collectors.toList());
        System.out.println(retList);

    }

    private static void ex7() {
        // TODO...
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        var carList = DataRepo.getCars();
        var retList = carList.stream()
                .filter(c -> c.getPrice() > 20000)
                .map(c -> new CarRecord(c.getId(), c.getMake(), c.getModel(), formatter.format(c.getPrice())))
                .collect(Collectors.toList());
        System.out.println(retList);
    }

    private static void ex8() {
        // TODO...
        var carList = DataRepo.getCars();
        var peopleList = DataRepo.getPeople();
        var retList = peopleList.stream()
                .map(p-> {
                    if (p.getCarId() == null){
                        return "none";
                    }
                    else {
                        var car = carList.stream().filter(c -> c.getId().equals(p.getCarId())).collect(Collectors.toList()).get(0);
                        return car.getModel();
                    }
                })
                .collect(Collectors.toList());
        System.out.println(retList);
    }

    private static void ex9() {
        // TODO...
        var carList = DataRepo.getCarsWithEngines();
        var retList = carList.stream()
                .map(c -> {
                    var taxes = 0F;
                    var engine = c.getEngine();
                    if (engine.getNumCylinders() >= 8) {
                        taxes = engine.getDisplacment() * 100;
                    }
                    return new EngineRecord(engine.getNumCylinders(), engine.getDisplacment(), taxes);
                }).collect(Collectors.toList());
        System.out.println(retList);

    }
    private static void ex10() {
        // TODO...
        var carList = DataRepo.getCarsWithEngines();
        var retList = carList.stream()
                .map(c -> {
                    var taxes = 0F;
                    var engine = c.getEngine();
                    if (engine.getNumCylinders() >= 8) {
                        taxes = engine.getDisplacment() * 100;
                    }
                    return new Car(c.getId(), c.getMake(), c.getModel(), c.getPrice() + taxes);
                }).collect(Collectors.toList());
        System.out.println(retList);
    }
}
