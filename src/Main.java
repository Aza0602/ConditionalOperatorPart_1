import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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

    public static void task5 () {

        System.out.println("Задача 5");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст ребенка");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("«Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе».");
        } else if (age >= 5 && age < 14) {
            System.out.println("«Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении взрослого».");
        } else if (age >= 14) {
            System.out.println("«Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого».");
        }

    }

    public static void task6 () {

        System.out.println("Задача 6");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int place = sc.nextInt();

        if (place >= 1 && place <= 60) {
            System.out.println("В вагоне есть сидячее место.");
        } else if (place > 61 && place <= 102) {
            System.out.println("В вагоне осталось стоячее место.");
        } else if (place >= 103) {
            System.out.println("Вагон уже полностью забит.");
        }

    }

    public static void task7 () {

        System.out.println("Задача 7");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int one = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 число");
        int two = sc.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 число");
        int three = sc.nextInt();

        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two> three) {
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);
        }
    }

}