package jp7;

public class Jp7 {
    public static void main(String [] args) {
        String imie = "Bartek";
        imie = imie.toUpperCase();

        System.out.println("Twoje imie to: " + imie);
        System.out.println(imie.charAt(imie.length() - 1) == 'A' && !imie.equals("KUBA") && !imie.equals("BARNABA")
                ? "KOBIETA" : "MEZCZYZNA");
    //SPRAWDZENIE OSTATNIEJ LITERY JESLI OSTATNIA A KOBIETA, JESLI NIE MEZCZYNA
    }


    }

