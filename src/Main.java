import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name;
        System.out.print("как тебя зовут");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
            System.out.println("Привет," + name + "!");
    }
}