package my.project;

import java.util.Scanner;

/**
 * Created by Nikol on 4/5/2016.
 */
public class ConsoleReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
        int i = 2;
        System.out.print("������� ����� �����: ");
        if(sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� ����� ������� ����� �����
            i = sc.nextInt(); // ��������� ����� ����� � ������ ����� � ��������� � ����������
            System.out.println(i*2);
        } else {
            System.out.println("�� ����� �� ����� �����");
        }
    }
}
