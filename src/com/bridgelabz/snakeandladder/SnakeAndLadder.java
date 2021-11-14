package com.bridgelabz.snakeandladder;


public class SnakeAndLadder {
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    static int diceCount = 0;
    static String turn = "player1";
    public static void main(String[] args) {
        int player1Position = 0;
        int player2Position = 0;
        int player1DiceCount = 0;
        int player2DiceCount = 0;
        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            diceCount++;
            if (turn.equals("player1")) {
                System.out.println("player1 current position : " + player1Position);
                ++player1DiceCount;
                player1Position = twoPlayers(player1Position);
                System.out.println("player1 Position after die roll : " + player1Position);
                turn = "player2";
            } else {
                System.out.println("player2 current position : " + player2Position);
                ++player2DiceCount;
                player2Position = twoPlayers(player2Position);
                System.out.println("player2 Position after die roll : " + player2Position);
                turn = "player1";
            }
        }
        if (player1Position == WINNING_POSITION) {
            System.out.println("Player1 win the game");
        } else {
            System.out.println("Player2 win the game");
        }
        System.out.println("dice count of player1 : " + player1DiceCount);
        System.out.println("dice count of player2 : " + player2DiceCount);

        System.out.println("No.of Times Roll Die is : " + diceCount);
    }

    public static int twoPlayers(int position) {
        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("DiceNumber is : " + diceNumber);

        int option = (int) (Math.floor(Math.random() * 10) % 2 + 1);
        switch (option) {
            case IS_LADDER:
                System.out.println("Ladder for the Player");
                position = position + diceNumber;
                if (turn.equals("player1")) {
                    turn = "player1";
                } else if (turn.equals("player2")) {
                    turn = "player2";
                }
                if (position > WINNING_POSITION) {
                    System.out.println("No play stay in the Current Position");
                    position = position - diceNumber;
                }
                break;
            case IS_SNAKE:
                System.out.println("Snake for the player");
                position = position - diceNumber;
                if (position < 0) {
                    position = 0;
                }
                break;
            default:
                System.out.println("No Play for the Player");
                position = position;
                break;
        }
        return position;
    }
}