import java.util.InputMismatchException;
import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        int day;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Какой по счету день недели вас интересует: ");
            day = scan.nextInt();
            System.out.println("Это " + arrweek(day));
        }
        catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Число должно быть от 1 до 7");
        }
    }
    static String arrweek(int i) {
        String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        return week[i - 1];

    }

}


