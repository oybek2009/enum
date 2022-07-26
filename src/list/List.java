package list;


import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class List {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        boolean isHave = false;

        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "M5", 2020));
        list.add(new Car("Ford", "X100", 2021));
        list.add(new Car("Audi", "X200", 2016));

        System.out.println(list);


        System.out.print("Car name write: ");
        String n = scanner.nextLine();

        for (Car name : list) {
            name.print();
            if (n == String.valueOf(name)) {
            }
            if (isHave) {
                System.out.println("Bor");
            } else {
                System.out.println("Yo`q");
            }
        }
    }
}
