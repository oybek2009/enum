package car;

import java.util.Scanner;

import static java.lang.System.in;

public class Car {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        while (true) {
            System.out.println("1->Start car");
            System.out.print("= ");
            int t = scanner.nextInt();

            if (t == 1) {
                System.out.println("Car start!!!");

                System.out.println();
                System.out.println("1->Drift");
                System.out.println("2->Stop car");
                System.out.print("= ");
                int t1 = scanner.nextInt();

              if (t1 == 1) {
                System.out.println("Drift car");
                break;
              }else if (t1 == 2) {
                System.out.println("Stop car!!!");
              }else {
                  System.out.println("Error!!!");
                  break;
              }

            }else {
                System.out.println("Error!!!");
                break;
    }


            }

        }
    }

