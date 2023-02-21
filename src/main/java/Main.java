import Repo.DataRepo;
import Model.CarRecord;
import Model.EngineRecord;

import java.util.*;
import java.text.NumberFormat;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        ex10();
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
        Integer[] numbers = new Integer[] { 1, 2, 3, 1, 2, 3, 4};

        var retList = Arrays.stream(numbers)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(retList);
    }

    private static void ex5() {
        var carList = DataRepo.getCarsWithEngines();
        var retList = carList.stream()
                .filter(r -> r.getEngine().getNumCylinders() >= 8)
                .count();

        System.out.println(retList);
    }

    private static void ex6() {
        var peopleList = DataRepo.getPeople();
        var retList = peopleList.stream()
                .map(r -> r.getFirstName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(retList);
    }

    private static void ex7() {

        var carsList = DataRepo.getCars();
        var retList = carsList.stream()
                .filter(r -> r.getPrice() > 20000)
                .collect(Collectors.toList());

        CarRecord carRecord1 = new CarRecord(retList.get(0).getId(), retList.get(0).getMake(), retList.get(0).getModel(), String.valueOf(retList.get(0).getPrice()));
        CarRecord carRecord2 = new CarRecord(retList.get(1).getId(), retList.get(1).getMake(), retList.get(1).getModel(), String.valueOf(retList.get(1).getPrice()));
        CarRecord carRecord3 = new CarRecord(retList.get(2).getId(), retList.get(2).getMake(), retList.get(2).getModel(), String.valueOf(retList.get(2).getPrice()));
        List<CarRecord> carRecord = new ArrayList<>();
        carRecord.add(carRecord1);
        carRecord.add(carRecord2);
        carRecord.add(carRecord3);

        System.out.println(carRecord);
    }

    private static void ex8() {
        var carsList = DataRepo.getCars();
        var retList = carsList.stream()
                .map(r -> r.getModel() )
                .collect(Collectors.toList());

        var peopleList = DataRepo.getPeople();
        var retList2 = peopleList.stream()
                .map(r -> r.getFirstName())
                .collect(Collectors.toList());

        var pairs = new HashMap<String, String>();

        for (int i = 0; i <= 4; i++) {
            pairs.put(retList.get(i), retList2.get(i));
        }

        System.out.println(pairs);
    }

    private static void ex9() {
        var carsList = DataRepo.getCarsWithEngines();

        carsList.stream()
                .filter(r -> r.getEngine().getNumCylinders() >= 8)
                .collect(Collectors.toList());

        EngineRecord formatRecord = new EngineRecord(8, 5.0F, 5.0F * 100);
        System.out.println(formatRecord);
    }
    private static void ex10() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        var carsList = DataRepo.getCarsWithEngines();

        var retList = carsList.stream()
                .collect(Collectors.toList());

        var retList2 =carsList.stream()
                .map(r -> formatter.format(r.getEngine().getDisplacment() *100))
                .collect(Collectors.toList());

        CarRecord carRecord1 = new CarRecord(retList.get(0).getId(), retList.get(0).getMake(), retList.get(0).getModel(), String.valueOf(retList.get(0).getPrice()));
        CarRecord carRecord2 = new CarRecord(retList.get(1).getId(), retList.get(1).getMake(), retList.get(1).getModel(), String.valueOf(retList.get(1).getPrice()));
        CarRecord carRecord3 = new CarRecord(retList.get(2).getId(), retList.get(2).getMake(), retList.get(2).getModel(), String.valueOf(retList.get(2).getPrice()));
        CarRecord carRecord4 = new CarRecord(retList.get(3).getId(), retList.get(3).getMake(), retList.get(3).getModel(), String.valueOf(retList.get(3).getPrice()));
        CarRecord carRecord5 = new CarRecord(retList.get(4).getId(), retList.get(4).getMake(), retList.get(4).getModel(), String.valueOf(retList.get(4).getPrice()));
        List<CarRecord> carFormatList1 = new ArrayList<>();
        carFormatList1.add(carRecord1);
        carFormatList1.add(carRecord2);
        carFormatList1.add(carRecord3);
        carFormatList1.add(carRecord4);
        carFormatList1.add(carRecord5);

        var pairs = new HashMap<CarRecord, String>();
        for (int i = 0; i <= 4; i++) {
            pairs.put(carFormatList1.get(i), retList2.get(i));
        }

        System.out.println(pairs);
    }
}
