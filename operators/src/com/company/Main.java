package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2 ; //1+2=3
        System.out.println("1 + 2 =" + result);
        //for comments
        int previousResult = result;
        System.out.println("previous Result =" + previousResult);
        result = result -1;//3-1=2
        System.out.println("3 - 1 =" + result);
        System.out.println("Previous Result =" + previousResult);

        result = result * 10; //2*10 = 20
        System.out.println("2 * 10 =" + result);

        result = result / 5; //20/5=4
        System.out.println("20 / 5 =" + result);

        result =result % 3; //the remainder of 4$3 = 1
        System.out.println("4 % 3 =" +result);

        //result = result +1
        result++; //1+1=2
        System.out.println("1 + 1 =" + result);

        result--; //2-1=1
        System.out.println("2 - 1 =" + result);

        //result = result+2
        result+= 2; //1+2=3
        System.out.println("1 + 2 =" + result);

        //result =result * 10
        result*=10; // 3*10=30
        System.out.println("3 * 10 =" + result);

        //result = result / 3
        result /= 3; //30/3=1=
        System.out.println("30 / 3 =" +result);

        //result = result - 2
        result -=2; //10-2=8
        System.out.println("10 - 8 =" + result);

        boolean isAlien = false;
        if (!isAlien) { // can write !isAlien to simplify isAlien == false
            System.out.println("It is not an alien!");//semicolon should finish after no semicolon on the if line
            System.out.println("and I am scared of aliens");
            //we should us a code block here to utilize more then one line without curly brackets u can only use one line after the if-then statement
        }



    }
}
