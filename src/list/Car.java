package list;

public class Car {
    String brand;
    String name;
    int year;

    public Car(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }
    public void print(){
        System.out.println("Brand: " +brand);
        System.out.println("Name: " +name);
        System.out.println("Year: " +year);

    }
}
