import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b;
        Scanner klavye = new Scanner(System.in);
        System.out.println("A kenarının uzunluğunu giriniz:");
        a = klavye.nextInt();
        System.out.println("B kenarının uzunluğunu giriniz:");
        b = klavye.nextInt();
	    Dikdortgen dikdortgen = new Dikdortgen(a,b);
        dikdortgen.dikdortgenCiz();
    }
}
