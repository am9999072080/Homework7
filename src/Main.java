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
        } else {
            System.out.println(year + " год не является високосным");
        }
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
        calcDays(95);
    }

    static void calcDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется дней:  " + deliveryDays);
        }
        deliveryDays++;
        if (20 < deliveryDistance && deliveryDistance < 60) {
            System.out.println("Для доставки потребуется дней:  " + deliveryDays);
        }
        deliveryDays++;
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Для доставки потребуется дней:  " + deliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

}
