import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int liczba1, liczba2, wynikObu;
        Licz licz = new Licz();
        System.out.println("podaj liczbę");
        Scanner wczytywanie = new Scanner(System.in);
        liczba1 = wczytywanie.nextInt();
        System.out.println("podałeś " + liczba1);
        System.out.println("podaj drugą liczbę");
        liczba2 = wczytywanie.nextInt();
        System.out.println("podałeś " + liczba2);
        wynikObu = licz.sumuj(liczba1, liczba2);
        System.out.println("suma liczb " + liczba1 + " i liczby " + liczba2 + " to " + wynikObu);
        int wynikKwadratu = licz.kwadratLiczby(liczba1);
        System.out.println(" kwadrat lioczby pierwszej podanej przez ciebie to " + wynikKwadratu);
        System.out.println("a kwadrat drugiej to " + licz.kwadratLiczby(liczba2));
        System.out.println("kwadrat wyniku wynosi " + licz.kwadratLiczby(wynikObu));

    }
}
