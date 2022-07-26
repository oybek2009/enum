package example;

import java.util.Scanner;

import static java.lang.System.in;

public class LessonIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.println("A ");
        int a = scanner.nextInt();

        System.out.println("B ");
        int b = scanner.nextInt();

        System.out.println("C ");
        int c = scanner.nextInt();
    show(a,b,c);

    }
    public static void  show(int a,int b ,int c){

        if (a>b&&a>c){
            if (b>c){
                System.out.println(a+b);
            }else {
                System.out.println(a+c);
            }

        }else   if (b>a&&b>c){
            if (a>c){
                System.out.println(b+c);
            }else {
                System.out.println(b+a);
            }
        }else   if (c>a&&c>b){
            if (a>b){
                System.out.println(c+a);
            }else {
                System.out.println(b+c);
            }
        }


    }
}
