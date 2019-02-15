package jp13;

public class Jp13 {
    public static void main(String[] args) {
        double number =0.89;
        boolean isNormalized = true;
        if (number > 1 ||number < 0) {
            isNormalized = false;
        }
        System.out.println((isNormalized));
        }
    }

