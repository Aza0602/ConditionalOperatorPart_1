import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
    }

    public static void task1 () {

        System.out.println("Задача 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("«Если Ваш возраст равен " + age + " то вы достигли совершенолетия».");
        }
        else {
            System.out.println("«Если Ваш возраст равен " + age + " то вы не достигли совершеннолетия, нужно немного подождать».");
        }

    }

    public static void task2 () {

        System.out.println("Задача 2");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру воздуха");
        int temp = sc.nextInt();

        if (temp >= 5) {
            System.out.println("«На улице " + temp + " градусов, можно идти без шапки».");
        }
        else {
            System.out.println("«На улице " + temp + " градусов, нужно надеть шапку».");
        }
    }

}