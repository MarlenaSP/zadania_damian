import java.util.Scanner;

public class Zadanie1 {
    public void execute() {
        double a, b, pole;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj bok a");
        a = scanner.nextDouble();
        System.out.println("podaj bok b");
        b = scanner.nextDouble();
        pole = a * b;
        System.out.println("pole= " + pole);
    }
}
