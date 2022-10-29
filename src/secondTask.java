import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        System.out.println("задача 2");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1, если вы пользователь Android. Введите 0, если вы пользователь iOS: ");
        int clientOS = in.nextInt();
        System.out.print("Введите год выпуска вашего телефона: ");
        int clientDeviceYear = in.nextInt();
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS ==1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
}