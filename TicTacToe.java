package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		char [][] gameBoard = { { '1', '|', '2', '|', '3' }, { '-', '+', '-', '+', '-' }, { '4', '|', '5', '|', '6' },
				{ '-', '+', '-', '+', '-' }, { '7', '|', '8', '|', '9' } };

		printGameBoard(gameBoard);

		for (int i = 0; i < 9; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your placement (1-9)");
			int playerposition = scan.nextInt();

			placePice(gameBoard, playerposition, "player"); // calling placepice method for player
	
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			placePice(gameBoard, cpuPos, "cpu"); // calling placepice method for cpu
			printGameBoard(gameBoard);
		}

	}

	public static void printGameBoard(char[][] Board) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(Board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void winner(char[][] gameBoard, int pos, String user ,char symbol) {
		if 
			(gameBoard[0][0] + gameBoard[0][2] + gameBoard[0][4] == symbol);
			System.out.println("you win");
			
	}

	public static void placePice(char[][] gameBoard, int pos, String user) {
		char symbol = ' ';

		if (user.equals("player"))
			symbol = 'X';
		else if (user.equals("cpu"))
			symbol = 'O';
		for (int i=0; i<5;)
		switch (pos) {
		case 1:
			if (gameBoard[0][0] == ' ')
				gameBoard[0][0] = symbol;
				
				else 
					System.out.println("This position is already filled Select anyother place please:-");

			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;
		}
	}
}
