import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача-1");
        checkYear1(2021);
    }

    public static void checkYear1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        System.out.println(year + " год не является високосным");
    }

    public static void task2() {
        System.out.println("Задача-2");
        choosePhone(0, 2015);
    }

    static void choosePhone(int clientIOS, int clientDeviceYear) {
        byte oS = 0;
        int currentYear = LocalDate.now().getYear();
        if (oS == clientIOS) {
            if (currentYear > clientDeviceYear) {
                System.out.println("Установите обычную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        if (oS != clientIOS) {
            if (currentYear > clientDeviceYear) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача-3");
        CountDistance(100, 1);
    }

    public static void CountDistance(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
            System.out.println("Для доставки потребуется дней:  " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}