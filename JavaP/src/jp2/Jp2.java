package jp2;

public class Jp2 {
    public static void main(String [] args){
        String name, lastname, possition;
        final String PESEL;
        char gender;
        double salary_net;
        boolean isRetired;
        name= "Zbigniew";
        lastname= "Woźniak";
        possition= "Konserwator";
        PESEL= "77980909827";
        gender= 'M';
        salary_net=2200.99;
        isRetired= false;
        System.out.printf("%10s | %10s | %10s | %12s | %2s| %12fzł | %b", name, lastname, possition, PESEL, gender, salary_net, isRetired);




    }
}
