package com.snakeladder;

import java.util.Random;


public class UC2 {
	public static void main(String[] args) {
		 int startingposition = 0;
	      
	        System.out.println("Single player at start position "+ startingposition);
	        RollDice();
	    }
	    public static void RollDice(){
	        Random random = new Random();
	        int dice = random.nextInt(6);
	        dice = dice+1;
	        System.out.println("Dice after rolling : "+ dice);

	    }
	
	}