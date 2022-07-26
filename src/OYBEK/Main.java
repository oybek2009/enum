package OYBEK;


import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person messi = new Person("Messi", 35);
        Person ronaldo = new Person("Ronaldo", 30);
        Person benzema = new Person("Benzema", 31);
        Person mbappe = new Person("Mbappe", 32);

        Scanner scanner = new Scanner(in);
        System.out.print("Player name write: ");
        String s = scanner.nextLine();
        Player colors1 = Player.valueOf(s.toUpperCase());
        switch (colors1) {
            case MESSI -> messi.print();
            case MBAPPE -> mbappe.print();
            case BENZEMA -> benzema.print();
            case RONALDO -> ronaldo.print();

        }
    }
}

enum Player {

    RONALDO, MESSI, MBAPPE, BENZEMA
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}