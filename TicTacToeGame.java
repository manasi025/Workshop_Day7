//Tic Tac Toe Game Problem where a user defined Player will challenge a Computer

package bridgelabz;

import java.util.Scanner;

public class TicTacToeGame 
{
	private static char board[] = new char[10];
	private static char userPlayer;
	
	//Main
	public static void main (String[] args)
	{
		System.out.println("Welcome to Tic Toc Toe Game!");
		beginGameUC1();
		userInputUC2();
		showBoardUC3();
	}

	//UC-3
	private static void showBoardUC3() 
	{
		// TODO Auto-generated method stub
		
	}

	//UC-2
	 public static void userInputUC2() 
	{
		// TODO Auto-generated method stub
		System.out.print("Please select any one symbol from (X/O) as your input : ");
		Scanner sc = new Scanner(System.in);
		userPlayer = sc.next().charAt(0);
		if(userPlayer == 'X' || userPlayer == 'O')
		{
			System.out.print("The User Player's Symbol is : " + userPlayer);
		}
		else
		{
			System.out.print("Invalid input!!...Please select your symbol from 'X' or 'O' only. ");
			return;
		}
	}
	 
	 //UC-1
	static void beginGameUC1() 
	{
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++)
		{
			board[i] = ' ';	
		}
	}
}
