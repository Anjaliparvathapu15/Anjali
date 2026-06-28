package com.consolebasedapps;

import java.util.Scanner;

public class TicTacToe {
	static Scanner sc = new Scanner(System.in);
	static char player = 'X';

	public static void main(String[] args) {
		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		String toContinue;
		do {
			while (true) {
				display(board);
				System.out.println("player " + player + " turn");
				System.out.println("enter the row :");
				int row = sc.nextInt();
				System.out.println("enter the cloumn :");
				int col = sc.nextInt();

				if (!playerMov(board, row, col, player)) {
					System.out.println("Invalid move !try again ");
					continue;
				}
				if (checkWin(board)) {
					System.out.println(player + " Won the game ");
					break;
				}
				if (isFull(board)) {
					System.out.println("Game Draw !!");
					break;
				}

				player = (player == 'X') ? 'O' : 'X';
			}
			System.out.println("Do you want to continue the Game ");
			toContinue = sc.next();
		} while (toContinue.equalsIgnoreCase("Y"));
		System.out.println("Thank you for playing!!");
	}

	static boolean isFull(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	static boolean checkWin(char[][] board) {
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			} else if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			} else if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
				return true;
			} else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
				return true;
			}
		}
		return false;
	}

	static boolean playerMov(char[][] board, int row, int col, char player) {
		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
			return false;
		} else if (board[row][col] != ' ') {
			return false;
		}
		board[row][col] = player;
		return true;
	}

	static void display(char[][] board) {
		System.out.println("----------");
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " |");
			}
			System.out.println();
			System.out.println("----------");
		}

	}

}
