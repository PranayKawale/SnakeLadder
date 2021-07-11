package com.snakeladder;

import java.util.Random;

public class UC3 {
	public static void main(String[] args) {
		int startingpos = 0;
	    int dice = 0;
        System.out.println(" Player at start position "+ startingpos);
        dice = rollDice();
        mapTo(dice, startingpos);
    }
    public static int rollDice(){
        Random random = new Random();
        int dice = random.nextInt(6);
        dice = dice+1;
        System.out.println("Dice Num : "+ dice);
        return dice;
    }
    public static void mapTo(int dice, int pos){
        Random random = new Random();
        int map = random.nextInt(2);
        map = map +1;
        System.out.println("Check option : "+ map);

        switch (map){
            case 1:
                System.out.println("you are in the same position due  to No play");
                break;
            case 2:
                pos = pos + dice;
                System.out.println("your position after ladder is : "+ pos);
                break;
            case 3:
                pos = pos - dice;
                System.out.println("your position after snake is : "+ pos);
                break;
        }
    }

	

}
