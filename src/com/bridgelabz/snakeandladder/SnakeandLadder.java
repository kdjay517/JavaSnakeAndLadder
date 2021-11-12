package com.bridgelabz.snakeandladder;

import java.util.*;

public class SnakeandLadder {

	public static void main(String[] args) {
		int playerPosition = 0;
		System.out.println("Enter press 1 to start the Snake and Ladder game:");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		if (start == 1) {
			System.out.println("_____ Game is going to Start ____");
			System.out.println("____Checking for Player Option ___");
			int playerOption = (int) (Math.floor(Math.random() * 10) % 3);
			int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			switch (playerOption) {
				case 0:
					System.out.println("Player selected for NoPlay at Position Number:" + start);
					break;
				case 1:
					System.out.println("Player got ladder at Position Number:" + start);
					playerPosition += diceNumber;
					System.out.println("After ladder player is went to position:" + start);
					break;
				case 2:
					System.out.println("Player got snake at position Number:" +start);
					playerPosition -= diceNumber;
					System.out.println("After snake player went to position Number:" +start);
					break;

			}
			

		}
		else 
			System.out.println("Press 1 to start the Game");
	}

}
