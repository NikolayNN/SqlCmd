package my.project;

import java.util.Scanner;

/**
 * Created by Nikol on 4/5/2016.
 */
public class ConsoleReader {
    public String getString () {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println(consoleReader.getString());
    }
}
