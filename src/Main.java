import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3();
        task4();
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

    public static void task3 () {

        System.out.println("Задача 3");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость ");
        int speed = sc.nextInt();

        if (speed <= 60) {
            System.out.println("«Если скорость " + speed + ", то можно ездить спокойно»");
        }
        else {
            System.out.println("«Если скорость " + speed + ", то придется заплатить штраф»");
        }
    }

    public static void task4 () {

        System.out.println("Задача 4");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст человека");
        int chAge = sc.nextInt();

        if (chAge >= 2 && chAge <= 6) {
            System.out.println("«Если возраст человека равен " + chAge + ", то ему нужно ходить в детский сад».");
        } else if (chAge >= 7 && chAge <= 18) {
            System.out.println("«Если возраст человека равен " + chAge + ", то ему нужно ходить в в школу».");
        } else if (chAge > 18 && chAge <= 24) {
            System.out.println("«Если возраст человека равен " + chAge + ", то его место в университете».");
        } else if (chAge > 24) {
            System.out.println("«А если человеку больше 24, то ему пора ходить на работу».");
        }
    }

}