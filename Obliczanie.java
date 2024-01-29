import java.util.Scanner;
import java.util.ArrayList;
public class Obliczanie {
    public static void Oblicz(){
        Scanner writer = new Scanner(System.in);
        System.out.println("Proszę wpisać \"Oblicz\", aby wykonać obliczenie albo \"Opuść\" by wyjść z programu");
        String start = writer.next();
    switch (start){
        case "Oblicz":
            Obliczanie.obliczanie1();
            break;
        case "oblicz":
            Obliczanie.obliczanie1();
            break;
        case "Opuść":
            break;
        case "opuść":
            break;
        case "Opusc":
            break;
        case "opusc":
            break;
        default:
            Obliczanie.Oblicz();
    }
    }
    public static void obliczanie1(){
    System.out.println("Wpisz cyfrę:");
    Obliczanie.obliczanie2();
    }
    public static void obliczanie2(){
        Scanner writer=new Scanner(System.in);
        int i= writer.nextInt();
        Obliczanie.znak();
    }
    public static void znak(){
        Scanner writer=new Scanner(System.in);
        System.out.println("Proszę wpisać znak lub równanie:");
        String znak= writer.next();
        switch (znak){
            case "+":
                Obliczanie.dodaj();
                break;
            case "-":
                Obliczanie.odejnij();
                break;
            case ":":
                Obliczanie.podziel();
                break;
            case "/":
                Obliczanie.podziel();
                break;
            case "*":
                Obliczanie.pomnoz();
                break;
            case "równanie":
                Obliczanie.rownanie();
                break;
            default:
                Obliczanie.znak();
        }
    }
    public static void dodaj(){
        Scanner writer=new Scanner(System.in);
        System.out.println("Wpisz cyfrę:");
        int o= writer.nextInt();
        int i=o+i;

    }
    public static void odejnij(){
        Scanner writer=new Scanner(System.in);
        System.out.println("Wpisz cyfrę:");
        int o= writer.nextInt();
        int i=i-o;
    }
    public static void podziel(){
        Scanner writer=new Scanner(System.in);
        System.out.println("Wpisz cyfrę:");
        int o= writer.nextInt();
        int i=i/o;
    }
    public static void pomnoz(){
        Scanner writer=new Scanner(System.in);
        System.out.println("Wpisz cyfrę:");
        int o= writer.nextInt();
        int i=i*o;
    }
    public  static void rownanie(){
        System.out.println("Twój wynik to"+i);
        Obliczanie.Oblicz();
    }
}
