package com.company;

public class Main {

    public static void main(String[] args) {
	boolean gameover = true;
	int score = 5000;
	int levelCompleted = 5;
	int bonus = 100;

//	if (score < 5000 &&  score>1000){
//        System.out.println("Your score was 5000");
//        System.out.println("This was executed");
//    }else if (score <1000){
//        System.out.println("Your score was less than 1000");
//    }
//	else {
//        System.out.println("Got here");
//    }

        if (gameover== true){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final scoer was "+ finalScore);
        }



        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameover == true){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was "+ finalScore);
        }

    }
}
