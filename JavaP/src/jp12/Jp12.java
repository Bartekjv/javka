package jp12;
import java.util.Scanner;
import java.math.MathContext;
import java.math.*;
public class Jp12 {

    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("Wybierz operacje (+),(-),(*),(/),(%),");
double var1= scanner.nextDouble();
scanner.nextLine();

char key =scanner.nextLine().charAt(0);
        double var2= scanner.nextDouble();
switch (key) {
    case '+':
        System.out.printf("%f %c %f = %f", var1, key, var2, var1 + var2);
        break;
    case '-':
        System.out.printf("%f %c %f = %f", var1, key, var2, var1 - var2);
        break;
    case '*':
        System.out.printf("%f %c %f = %f", var1, key, var2, var1 * var2);
        break;
    case '/':
        System.out.printf("%f %c %f = %f", var1, key, var2, var1 / var2);
        break;
    case '%':
        System.out.printf("%f %c %f = %f", var1, key, var2, var1 % var2);
        break;
}
    }
    }

