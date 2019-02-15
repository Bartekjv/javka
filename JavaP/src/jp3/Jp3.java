package jp3;

public class Jp3 {
    public static void main(String [] args){
        String var1, var2, var3, var4;
        var1= "java";
        var2= "easy";
        var3= var1+var2;
        var4= var3+ " chyba nie";
        //deklaracja
        System.out.println (var4);
        System.out.println (var3.toUpperCase());
        //cala zmiennna duzymi
        System.out.println (var3.toLowerCase());
        //cala zmienna malymi
        System.out.println (var4.length());
//ilosc znakow w zmiennej
System.out.println( "index2: " + var3.charAt(2));
System.out.println ("index 5: " +var3.charAt(5));
//znak o indeksie 2 i 5
System.out.println (var4.charAt(var4.length() -3));
//trzeci znak od konca
System.out.println ("VAR1 SUBSTR: " +var4.substring(0,4));
System.out.println ("VAR2 substr: " +var4.substring(4,8));
//znaki od indeksu 0-4 i 4-8
        String var5= "ALA MA KOTA KOT MA ALE";
        String words [] = (var5.split(" "));
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);

        //dzieli podana zmienna na poszczegolne słowa
        boolean p, q;
        p = true;
        q = true;
        System.out.println(!(p && q) == ((!p) || (!q)));
        p = true;
        q = false;
        System.out.println(!(p && q) == ((!p) || (!q)));
        p = false;
        q = true;
        System.out.println(!(p && q) == ((!p) || (!q)));
        p = false;
        q = false;
        System.out.println(!(p && q) == ((!p) || (!q)));
//potwierdzenie prawa morgana



    }
}
