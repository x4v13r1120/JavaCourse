package com.company;

public class Main {

    public static void main(String[] args) {

        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double total = (myDouble + mySecondDouble ) * 100.00;
        double remainder = total % 40;
        boolean myBoolean = false;
        if (remainder == 0){
            myBoolean = true;
        }
        System.out.println(myBoolean);
        if (remainder != 0 ){
            System.out.println("Your remainder is " + remainder );
        }
    }
}
