import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pralka pralka = new Pralka();
        Odkurzacz odkurzacz = new Odkurzacz();

        Scanner wyczytajLinijke = new Scanner(System.in);
        System.out.println("Podaj numer prania 1...12");
        int wybranyNumerPrania = wyczytajLinijke.nextInt();

        System.out.println(pralka.wybierzNumerProgramuPrania(wybranyNumerPrania));


        odkurzacz.on();
        odkurzacz.on();
        odkurzacz.on();
        odkurzacz.wyswietlKomunikat("Odkurzacz wyladowal sie");
        odkurzacz.off();
    }
}
