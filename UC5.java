package com.snakeladder;
import java.util.Random;
import java.util.Scanner;

public class UC5 {
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int ch = 1;
		int currentPositionFor1 = 0;
		int count=0;
		do {
			currentPositionFor1 = play(currentPositionFor1);
			if(currentPositionFor1 == 100) {
				System.out.println("You win ");
			}
			System.out.println("Do want to continew press 1");
			
			ch = scanner.nextInt();
		}while(ch == 1);
		count++;
		System.out.println(count);
	}

	private static int play(int currentPosition) {
			int a = random.nextInt(3);
			int snakePosition = 0;
			int ladderPosition = 0;
			if(a == 0) {
				System.out.println("No Play :: Current Position ::"+currentPosition);
			}else {
				int dicsNo = rollDics();
				currentPosition = currentPosition + dicsNo;
				System.out.println(" Dics ::"+dicsNo);
				boolean flag = true;
				if(currentPosition == 100) {
					System.out.println("you win");
					flag = false;
				}else if(currentPosition > 100) {
					currentPosition = currentPosition - dicsNo;
					flag = true;
				}
				
				if(flag) {
					snakePosition = snake(currentPosition);
					ladderPosition = ladder(currentPosition);
					if(snakePosition == ladderPosition) {
						System.out.println("player move to forward :: Current Position ::"+currentPosition);
						return currentPosition;
					}
					else if(currentPosition > snakePosition) {
						System.out.println("Snake eat :: Current Position ::"+snakePosition);
						currentPosition = snakePosition;
					}else {
						System.out.println("move ladder :: Current Position ::"+ladderPosition);
						currentPosition = ladderPosition;
					}
				}
			}
		return currentPosition;
	}

	private static int rollDics() {
			int a = random.nextInt(6);
			return a+1;
	}
	
	private static int snake(int currnetPosition) {
		switch (currnetPosition) {
		case 44 : currnetPosition = 2;
			break;
		case 53 : currnetPosition = 9;
		break;
		case 64 : currnetPosition = 13;
		break;
		case 72 : currnetPosition = 3;
		break;
		case 84 : currnetPosition = 12;
		break;
		case 99 : currnetPosition = 14;
		break;
		}
		return currnetPosition;
	}

	private static int ladder(int currnetPosition) {
		switch (currnetPosition) {
		case 5 : currnetPosition = 32;
			break;
		case 4 : currnetPosition = 66;
		break;
		case 31 : currnetPosition = 95;
		break;
		case 13 : currnetPosition = 77;
		break;
		case 8 : currnetPosition = 88;
		break;
		case 15 : currnetPosition = 98;
		break;
		}
		return currnetPosition;
	}

}

	


