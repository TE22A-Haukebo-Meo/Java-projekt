public class projekt4 {

    public static void main(String[] args){
        int tal1 = 19;
        int tal2 = 32;
        int summa;
        int produkt;
        summa = tal1+tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);
        int tal3 = 12345;
        int tal4 = 6789;
        produkt = tal2*tal3*tal4;
        System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt);
        double kvot = tal3/tal2;
        System.out.println(tal3+"/"+tal2+"="+kvot);
        int c = tal2%tal1;
        int kvoten = tal2/tal1;
        System.out.println(tal1+"/"+tal2+"="+kvoten+", remainder: "+c);
    }
}
