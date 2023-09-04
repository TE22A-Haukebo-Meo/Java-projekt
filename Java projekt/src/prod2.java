import java.util.Scanner;

public class prod2 {
     
    public static void main(String[] args){
         System.out.println("SKapa din kraktär:");
         Scanner tb = new Scanner(System.in);
        System.out.print("Vda kraktär heta?");
        String namn = tb.nextLine();
        System.out.println("Så du heter "+namn);
    }
}