package com.bridgelabz.snakeandladder;

import java.util.*;

public class SnakeandLadder {
	final static int MAX_POSITION = 100;
	static int player1Position = 0;
	static int player2Position = 0;

	public static void main(String[] args) {

		int playerPosition = 0;
		int winningPosition = 100;
		int dicecount = 0;
		int turn = 1;
		int position = 0;

		System.out.println("Enter press 1 to start the Snake and Ladder game:");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();

		if (start == 1) {
			System.out.println("__Game is going to Start _");
			for (int i = 0; playerPosition < winningPosition; i++) {
				int playerOption = (int) (Math.floor(Math.random() * 10) % 3);
				int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
				switch (playerOption) {
				case 0:
					if (turn == 1) {
						position = playerPosition;
						player1Position = playerPosition;
						playerPosition = player2Position;
						turn = 2;
						System.out.println("Player1 choose No_Play at Position Number:" + player1Position);
					}
					else {
						position = playerPosition;
						player1Position = playerPosition;
						playerPosition = player2Position;
						turn = 1;
						System.out.println("Player2 choose No_Play at Position Number:" + player2Position);
					}

					break;
				case 1:
					for (int i1 = 0; i1 < 2; i1++) {
						playerPosition = playerPosition + diceNumber;
						if (playerPosition > winningPosition)
							playerPosition = playerPosition - diceNumber;
						if (turn == 1) {
							position = playerPosition;
							player1Position = playerPosition;
							playerPosition = player2Position;
							turn = 2;
							System.out.println("Player1 got ladder at Position Number:" + player1Position);
						}
						else {
							position = playerPosition;
							player1Position = playerPosition;
							playerPosition = player2Position;
							turn = 1;
							System.out.println("Player2 got ladder at Position Number:" + player2Position);
						}
					}
					break;
				case 2:
					 playerPosition = playerPosition - diceNumber;
					if (playerPosition < 0)
						playerPosition = 0;
					else if (playerPosition > 100)
						playerPosition = playerPosition - diceNumber;
					if (turn == 1) {
						position = playerPosition;
						player1Position = playerPosition;
						playerPosition = player2Position;
						turn = 2;
						System.out.println("Player1 got snake at position Number:" + player1Position);
					}
					else {
						position = playerPosition;
						player1Position = playerPosition;
						playerPosition = player2Position;
						turn = 1;
						System.out.println("Player got snake at position Number:" + player2Position);
					}

				}
				dicecount++;
			}

		} else
			System.out.println("Press 1 to start the Game");
		System.out.println("player reached the positon:" + playerPosition);
		System.out.println("No of times dice rolled is:" + dicecount);
	}

}