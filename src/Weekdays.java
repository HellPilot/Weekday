import java.util.InputMismatchException;
import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        int day;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("����� �� ����� ���� ������ ��� ����������: ");
            day = scan.nextInt();
            System.out.println("��� " + arrweek(day));
        }
        catch (InputMismatchException e) {
            System.out.println("�� ����� �� �����");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����� ������ ���� �� 1 �� 7");
        }
    }
    static String arrweek(int i) {
        String[] week = {"�����������", "�������", "�����", "�������", "�������", "�������", "�����������"};
        return week[i - 1];

    }

}


