package jp10;

import java.util.Scanner;

public class Jp10 {
    public static void main(String[] args) {
        Scanner scanner= (new Scanner (System.in));
        System.out.println("Co chcesz zrobic: \n(1) Zadanie1 \n(2) Zadanie2 \n(3) Zadanie3 \n(0) Wyjście");
        int key = scanner.nextInt();
        switch (key) {
            case 1:
                System.out.println("Zadanie1");
                break;
            case 2:
                System.out.println("Zadanie2");
                break;
            case 3:
                System.out.println("Zadanie3");
                break;
            case 0:
                System.out.println("Wyjscie");
                break;
            default:
                System.out.println("Błędny wybór");
        }


        }


}
