import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Droppa en cool mening, glöm inte att avsluta med en punkt!");
        String cool_mening = tb.nextLine();
        int antal_bokstäver = cool_mening.length();
        System.out.println("Vilken bokstav ska programmet hitta?");
        String bokstav = tb.nextLine();
        int plats = cool_mening.indexOf(bokstav);
        System.out.println("din mening innehåller "+antal_bokstäver+" bokstäver.");
        System.out.println("Bokstaven "+bokstav+" ligger på platsen "+plats+" suiii");
    }
}
