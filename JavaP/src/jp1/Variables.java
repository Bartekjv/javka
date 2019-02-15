package jp1;

public class Variables {
    public static void main(String[] args) {
        //deklaracja i inicjalizacja
        int x = 0;
        System.out.println(x);
        //deklaracja
        int y = x+11;
        //napisy
        System.out.println("y= " +y);
 String word = "Lorem ipsum Lorem ipsum";
 System.out.println (word.charAt (8));
        System.out.println (word.indexOf ("s"));
System.out.println("ilość znakow to: " +word.length());

//porownanie
        String word2 = "Header";
        System.out.println(word.equals(word2));
        System.out.println(word2.equals("header"));
        System.out.println(word2.equals("Header"));
        System.out.println(!word2.equals(word));
        System.out.println(word.equals(word2));


System.out.println(word.substring(6,11));
System.out.println(word.substring(6,11).length());
//wyciaga znaki z zakresu 6-11 zmmiennej word
// przelicza ile znakow miesci sie w podanym zakresie
        String words [] = word.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);




    }
}
