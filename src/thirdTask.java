import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        System.out.println("задача 3");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год для определения его високосности: ");
        int year = in.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год - високосный");
            }
        else {
            System.out.println(year + "год - не високосный");}
    }
}