import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("задача 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1, если вы пользователь Android. Введите 0, если вы пользователь iOS: ");
        int clientOS = in.nextInt();
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");}
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
}