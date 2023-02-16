# Java Streams Assignments
The [DataRepo](./src/main/java/Repo/DataRepo.java) class contains static methods to be used for the exercises.

# Ex 1. Old People
Using the streams API, use the `DataRepo.getPeople()` method to display a list of people on the console
that are greater than 30 years old.

```
private static void ex1() {
    var peopleList = DataRepo.getPeople();
    var retList = peopleList.stream()
        // TODO... 
    System.out.println(retList);
}
```

Example Output:
```
[{6: Frank Zappa 35}, {7: Gary Hoey 40}, {8: Igor Smith 45}, {9: Jack White 50}, {10: Larry Same 55}]
```

# Ex 2. Average Age
Using the streams API, use the `DataRepo.getPeople()` method to display the average age of all the people on the console.

Example Output:
```
32.5
```

# Ex 3. Brown Cats
Using the streams API, use the `DataRepo.getCats()` method to display only the brown cats ascending in age on the console.

Example Output:
```
[{5: Lily Brown 10}, {1: Gabby Brown 11}]
```

# Ex 4. Unique Numbers
Given the following array:

```java
Integer[] numbers = new Integer[] { 1, 2, 3, 1, 2, 3, 4};
```
Use the streams API to display only the unique numbers on the console.

Example Output:
```
[1, 2, 3, 4]
```

# Ex 5. Large Engines
Using the streams API, use the `DataRepo.getCarsWithEngines()` method to display the number of engines that
have equal to or greater than 8 cylinders on the console.

Example Output:
```
1
```

# Ex 6. First Names
Using the streams API, use the `DataRepo.getPeople()` method to display the first name of all the people in uppercase on the console.

Example Output:
```
[ALICE, BOB, CHARLIE, DAVE, EGAR, FRANK, GARY, IGOR, JACK, LARRY]
```

# Ex 7. Car Model List
Using the streams API, use the `DataRepo.getCars()` method to display cars that cost over $20,000.  Use the NumberFormatter
to display the currency correctly.

The [CarRecord](./src/main/java/Model/CarRecord.java) class may help you.

Example Output:
```
[{3: Ford Mustang $25,000.00}, {4: Chevy Volt $30,000.00}, {5: Mazada Mazda6 $30,000.00}]
```

# Ex 8. Cars that People Own
Using the streams API, use the `DataRepo.getCars()` and `DataRepo.getPeople()` methods  to display a list of models that each person owns on the console.

Example Output:
```
[Prius, Escort, Mustang, Volt, Mazda6, none, none, none, none, none]
```

# Ex 9. Gas Guzzler Tax
Using the streams API, use the `DataRepo.getCarsWithEngines()` method to determine the gas guzzler tax for all engines that have equal to or more
than 8 cylinders.  The tax is calculated by the following formula:

`tax = Engine Size (Displacement) * $100`

Display all the engines with their taxes on the console.

The [EngineRecord](./src/main/java/Model/EngineRecord.java) class may help you.

Example Output:
```
[{Cyl: 4, Size: 2.2, Taxes: $0.00}, {Cyl: 4, Size: 2.0, Taxes: $0.00}, {Cyl: 8, Size: 5.0, Taxes: $500.00}, {Cyl: 4, Size: 2.0, Taxes: $0.00}, {Cyl: 4, Size: 2.5, Taxes: $0.00}]
```

# Ex 10. Total Car Price
Using the streams API, use the `DataRepo.getCarsWithEngines()` method to display a list of cars and their prices including
the gas guzzler tax from Ex.9.

Example Output (notice the Mustang):
```
[{1: Toyota Prius $20,000.0}, {2: Ford Escort $15,000.0}, {3: Ford Mustang $25,500.0}, {4: Chevy Volt $30,000.0}, {5: Mazada Mazda6 $30,000.0}]
```
