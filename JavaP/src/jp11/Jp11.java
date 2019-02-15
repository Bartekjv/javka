package jp11;
import java.util.Scanner;
public class Jp11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Podaj staż pracy: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        if (year >5 && year <10) {
            System.out.println("Jestes regular");
        } else if(year >11){
                System.out.println("Jestes seniorem");}
                else{

                System.out.println("Jestes juniorem");
            }
            }

     }



