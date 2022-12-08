import java.time.LocalDate;

public class Main {
    public static void searchYears() {
        int year = 2021;
        if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Год высокосный");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год высокосный");
        } else if (year % 100 == 0) {
            System.out.println("Год не высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
    }

    public static void setupOS(){
        int clientDeviceYear = 2018;
        int clientOS = 1;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }

    public static int deliveryDistance(int deliveryDistance) {
        int term = (deliveryDistance / 40) + 1;
        return term;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        searchYears();

        System.out.println("\nЗадание 2");
        setupOS();

        System.out.println("\nЗадание 3");
        int deliveryDistance = 96;
        int i = deliveryDistance(deliveryDistance);
        System.out.println("Потребуется дней: " + i);
    }
}