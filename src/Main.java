import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        test();
    }

    private static void task1() {
        System.out.println("Задача №1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = "";

        fullName += middleName + " " + firstName + " " + lastName;

        System.out.println("Ф. И. О. сотрудника - " + fullName);
    }

    private static void task2() {
        System.out.println("Задача №2");

        String fullName = "Ivan Ivanov Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    private static void task3() {
        System.out.println("Задача №3");

        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName.replace("ё", "е"));
    }

    private static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя сотрудника: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите Фамилию сотрудника: ");
        String middleName = scanner.nextLine();
        System.out.print("Введите Отчество сотрудника: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + middleName + " " + lastName;

        if (fullName.equals(fullName.toUpperCase())) {
            System.out.println("Ошибка. Укажите Ф.И.О. с соблюдением орфографии");
        } else if (fullName.equals(fullName.toLowerCase())) {
            System.out.println("Ошибка. Укажите Ф.И.О. с соблюдением орфографии");
        } else {
            System.out.println("Вы записаны в базу данных сотрудника как: " + fullName);
        }
    }
}