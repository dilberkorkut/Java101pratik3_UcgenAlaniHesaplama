import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c ;
        Scanner input = new Scanner(System.in);


        System.out.print("1.Kenari giriniz: ");
        a = input.nextDouble();
        System.out.print("2.Kenari giriniz: ");
        b = input.nextDouble();
        System.out.print("3.Kenari giriniz: ");
        c = input.nextDouble();

        double u = (a+b+c) / 2 ;
        System.out.println("Ucgenin Cevresi: " + u);

        double alanKare = (u * (u - a)* (u - b) * (u - a)) ;
        double alan = Math.sqrt(alanKare);

        System.out.println( "Ucgenin Alani: " + alan);







    }
}