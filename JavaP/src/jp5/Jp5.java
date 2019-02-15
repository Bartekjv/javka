package jp5;
import java.util.Random;

public class Jp5 {
    public static void main(String[] args){
        Random rnd =new Random();
        int var1 = rnd.nextInt(10)+1;
        System.out.println("var1= "+var1);
        int var2 = rnd.nextInt(10)+1;
        System.out.println("var2= " +var2);
        System.out.println(var1 > var2);
        System.out.println (var1 >var2 +3 && var2 > var1 -2);
        System.out.println ((var1 * var2) % 2 == 0);




    }

}
