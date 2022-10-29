import java.util.Scanner;

public class FifthTask {
        public static void main(String[] args) {
            System.out.println("задача 5");
            Scanner in = new Scanner(System.in);
            System.out.print("Укажите номер месяца: ");
            int monthNumber= in.nextInt();
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь - зима");
                    break;
                case 2:
                    System.out.println("Февраль - зима");
                    break;
                case 3:
                    System.out.println("Март - весна");
                    break;
                case 4:
                    System.out.println("Апрель - весна");
                    break;
                case 5:
                    System.out.println("Май - весна");
                    break;
                case 6:
                    System.out.println("Июнь - лето");
                    break;
                case 7:
                    System.out.println("Июль - лето");
                    break;
                case 8:
                    System.out.println("Август - лето");
                    break;
                case 9:
                    System.out.println("Сентябрь - осень");
                    break;
                case 10:
                    System.out.println("Октябрь - осень");
                    break;
                case 11:
                    System.out.println("Ноябрь - осень");
                    break;
                case 12:
                    System.out.println("Декабрь - зима");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
        }
}
