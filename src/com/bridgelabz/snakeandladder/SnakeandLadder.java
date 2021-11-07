package com.bridgelabz.snakeandladder;
import java.util.*;

public class SnakeandLadder {

	public static void main(String[] args) {
		System.out.println("Enter press 1 to start the Snake and Ladder game:");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.println("________________Die is Rolling_________________");
		if (start == 1) {
			int diceNumber = (int)(Math.floor(Math.random()*10)%6 + 1);
			System.out.println("Die rolled and displayed Numbers as:" +diceNumber);
		}else
			System.out.println("Press 1 to start the Game");

	}

}
