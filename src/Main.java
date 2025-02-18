
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pocetfilmu;
        System.out.println("kolik chces filmu");
        pocetfilmu = sc.nextInt();
        Film[] filmy = new Film[pocetfilmu];
        for (int i = 0; i < pocetfilmu; i++) {
            System.out.println("Nazev filmu");
            String nazevfilmu = sc.nextLine();
            sc.nextLine();
            System.out.println("Rok vydani");
            int vydanifilmu = sc.nextInt();
            sc.nextLine();
            System.out.println("Jake je hodnoceni");
            int hodnocenifilmu = sc.nextInt();
            sc.nextLine();
            System.out.println("Kolik je tam hercu");
            int hercifilmu = sc.nextInt();
            sc.nextLine();
            Herec[] herci = new Herec[hercifilmu];
            for (int j = 0; j < pocetfilmu; j++) {
                System.out.println("Jmeno herce");
                String jmenoherce = sc.nextLine();
                sc.nextLine();
                System.out.println("Datum narozeni");
                int narozeniherce = sc.nextInt();
                sc.nextLine();
            }
        }








    }
}