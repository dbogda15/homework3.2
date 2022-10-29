import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        System.out.println("задача 4");
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите расстояние от вашего дома до нашего офиса: ");
        int deliveryDistance = in.nextInt();
        int deliveryDay = (deliveryDistance + 59)/40;
            System.out.println("Потребуется дней:" + deliveryDay);}

    }