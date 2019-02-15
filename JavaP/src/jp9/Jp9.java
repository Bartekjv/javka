package jp9;
import java.util.Scanner;

public class Jp9 {
    public static void main(String[] args) {
        Scanner scanner =(new Scanner(System.in));
System.out.println("Podaj rok urodzenia: ");
int year =scanner.nextInt();
scanner.nextLine();
System.out.println("podaj login i haslo");
String login =scanner.nextLine();
String haslo =scanner.nextLine();


if (year <0 || year > 2019) {
    System.out.println("błędne dane");
}else{
    if ((2019 - year) >=18) {
        System.out.println("jestes pełnoletni");
        if (login.equals("admin") && haslo.equals("admin")) {
        System.out.println("Jestes adminem");
    }
        else if(login.equals("user") && haslo.equals("user")){
            System.out.println("jestes userem");
        }
        else {
        System.out.println("jestes nikim");
    }
    } else {
            System.out.println("jestes małolatem");

        }
    }
}
}


