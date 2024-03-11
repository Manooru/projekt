import java.util.Scanner;
public class Obliczanie {
    public static void Oblicz() {
        Scanner writer = new Scanner(System.in);
        System.out.println("Proszę wpisać \"Oblicz\", aby wykonać obliczenie albo \"Opuść\" by wyjść z programu");
        String start = writer.next();
        start.toLowerCase();
        switch (start) {
            case "oblicz":
                Obliczanie.A();
                break;
            case "opuść", "opusc":
                System.out.println("Dziękujemy za korzystanie z kalkulatora!");
                Obliczanie.voi();
            default:
                Obliczanie.Oblicz();
        }
    }
    public static void A() {
        Scanner writer=new Scanner(System.in);
        if (liczby.a==-0.001){
            System.out.println("Twoja pierwsza liczba to "+liczby.c);
            Obliczanie.Znak();
        } else {
            System.out.println("Wpisz pierwszą lizcbę");
            liczby.a = writer.nextDouble();
            Obliczanie.Znak();
        }
    }
    public static void Znak(){
        Scanner writer=new Scanner(System.in);
        System.out.println("Wpisz znak ");
        String y;
        y=writer.next();
        switch (y){
            case "+":
                liczby.znak=y;
                Obliczanie.B();
            case "-":
                liczby.znak=y;
                Obliczanie.B();
            case "x","*":
                liczby.znak="*";
                Obliczanie.B();
            case "/",":":
                liczby.znak="/";
                Obliczanie.B();
            case "**":
                liczby.znak=y;
                Obliczanie.B();
            default:
                Obliczanie.Znak();
        }
    }
    public static void B(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wpisz drugi znak");
        liczby.b= scanner.nextDouble();
        Obliczanie.wynik();
    }
    public static void wynik(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Twój wynik działania to");
        switch (liczby.znak){
            case "+":
                if (liczby.a==-0.001){
                    liczby.c=liczby.c+liczby.b;
                } else {
                    liczby.c = liczby.a + liczby.b;
                }
                System.out.println(liczby.c+"\nCzy kontynuować? Tak/Nie");
                break;
            case "-":
                if (liczby.a==-0.001){
                    liczby.c=liczby.c-liczby.b;
                } else {
                    liczby.c = liczby.a - liczby.b;
                }
                System.out.println(liczby.c+"\nCzy kontynuować? Tak/Nie");
                break;
            case "/":
                if (liczby.a==-0.001){
                    liczby.c=liczby.c/liczby.b;
                } else {
                    liczby.c = liczby.a / liczby.b;
                }
                System.out.println(liczby.c+"\nCzy kontynuować? Tak/Nie");
                break;
            case "*":
                if (liczby.a==-0.001){
                    liczby.c=liczby.c*liczby.b;
                } else {
                    liczby.c = liczby.a * liczby.b;
                }
                System.out.println(liczby.c+"\nCzy kontynuować? Tak/Nie");
                break;
        }
        String a=scanner.next();
        a.toLowerCase();
        if (a.equals("tak")){
            liczby.a=-0.001;
            Obliczanie.A();
        } else {
            Obliczanie.Oblicz();
        }
    }
    public  static void voi(){

    }
}