// Rehan Khan
// This program will calculate the date easter falls on given a year after 1583.
import java.util.*;

public class Easter{
    public static void main(String[] args) {
        //code goes here
        Scanner scanner = new Scanner(System.in); //this allows you to read input from the user.
        int y = scanner.nextInt(); // reads the next number the user types. 
        int a = y % 19;
        System.out.println("a = "+a);
        int b = y / 100;
        int c = y % 100;
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        int d = b / 4;
        int e = b % 4;
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        int f = ((b + 8) / 25);
        System.out.println("f = "+f);
        int g = (b - f + 1)/3;
        System.out.println("g = "+g);
        int h = ((19 * a + b - d - g + 15) % 30);
        System.out.println("h = "+h);
        int i = c / 4;
        int k = c % 4;
        System.out.println("i = "+i);
        System.out.println("k = "+k);
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        System.out.println("r = "+r);
        int m = (a + 11 * h + 22 * r)/451;
        System.out.println("m = "+m);
        int n = (h + r - 7 * m + 114) / 31;
        int p = (h + r - 7 * m + 114) % 31;
        System.out.println("n = "+n);
        System.out.println("p = "+p);
        int easterDay = p + 1;

        //Prints easter date
        System.out.println("\nEaster in "+ y + " falls on " + n + "/" + easterDay);
    }
}

