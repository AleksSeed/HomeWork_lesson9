import java.time.LocalDate;

public class Main {
    public static int searchYears(int year) {
        if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Год высокосный");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год высокосный");
        } else if (year % 100 == 0) {
            System.out.println("Год не высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
        return (0);
    }

    public static int setupOS(int clientOS, int clientDeviceYear){
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
        return (0);
    }

    public static int deliveryDistance(int deliveryDistance) {
        int term = (deliveryDistance / 40) + 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20) {
            System.out.println("Потребуется дней: " + term);
        }
        return(0);
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        searchYears(2022);

        System.out.println("\nЗадание 2");
        int currentYear = LocalDate.now().getYear();
        setupOS(1, currentYear);    //0 - iOS, 1 - Android

        System.out.println("\nЗадание 3");
        deliveryDistance(94);
    }
}