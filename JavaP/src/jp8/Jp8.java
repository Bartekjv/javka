package jp8;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;
public class Jp8 {

        public static void main(String[] args) {
            Scanner scanner = (new Scanner(System.in));
            System.out.println("podaj wartosc a");
int a = scanner.nextInt();
System.out.println("podaj wartosc b");
int b = scanner.nextInt();
scanner.close();
        System.out.println(0.5 * a * (a * sqrt(3) / 2));
        System.out.println(pow(a, 3));
        int grade1 = 5;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println(((double) (grade1 + grade2 + grade3)) / 3);
        System.out.println(a * b);
        double salary_net = 8000;
        int vat_tax = 23;
        System.out.println(salary_net * (1 + ((double) vat_tax) / 100));
scanner.close();

    }
}

