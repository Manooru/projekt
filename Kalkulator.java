import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kalkulator, ver 0.00a. " +
                "Funkcja jedynie przez kosnolę na czas obecny i ograniczoną liczbę działań do dwóch");
        Scanner writer = new Scanner(System.in);
        int c;
        System.out.println("Wpisz cyfrę: ");
        int a = writer.nextInt();

        System.out.println("Wpisz znak: ");
        var type = writer.next();

        System.out.println("Wpisz liczbę: ");
        int b = writer.nextInt();

        switch (type) {
            case "+":
                c = a + b;
                System.out.println("Twój wynik to: " + c);
                break;
            case "-":
                c = a - b;
                System.out.println("Twój wynik to: " + c);
                break;
            case "*":
                c = a * b;
                System.out.println("Twój wynik to: " + c);
                break;
            case "/":
                c = a / b;
                System.out.println("Twój wynik to: " + c);
                break;

            default:
                System.out.println("Wprowadziłeś nieodpowiedni znak. Akceptowalne znaki to: '+', '-', '*', '/'");
        }
    }
}
