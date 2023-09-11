import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Första talet?");
        int tal1 = tb.nextInt();
        System.out.println("Andra talet?");
        int tal2 = tb.nextInt();
            tb.nextLine();
        double svar_dec = (double)tal1/tal2;
        int svar = tal1/tal2;
        System.out.println(tal1+"/"+tal2+"="+svar_dec);
        System.out.println(tal1+"/"+tal2+"="+svar);
        System.out.println("Sustantiv?");
        String substantiv = tb.next();
        System.out.println(substantiv+"ar");
    }
}
