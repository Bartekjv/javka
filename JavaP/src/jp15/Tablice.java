package jp15;

public class Tablice {
    public static void main(String[] args) {
        double signal[]={1.2,2.3,3,4,5,6};
        System.out.println(signal[0]);
        System.out.println(signal[1]);
        System.out.println(signal[2]);
        System.out.println(signal[3]);
        System.out.println(signal[4]);
        System.out.println(signal[5]);
signal[4]= 0;
        System.out.println(signal[4]);
String names[]=new String[150];
        System.out.println("dlugosc tablicy to:" + signal.length);
        char line [] ={' ', ' ', ' ',};
        char kik [] []={line,line,line};
        char kik2 [][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        System.out.printf("%c %c %c\n", kik2[0][0],kik2[0][1],kik2[0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0],kik2[1][1],kik2[1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0],kik2[2][1],kik2[2][2]);
        kik2[1][2]= 'x';
        System.out.println();
        System.out.printf("%c %c %c\n", kik2[0][0],kik2[0][1],kik2[0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0],kik2[1][1],kik2[1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0],kik2[2][1],kik2[2][2]);



        }
    }

