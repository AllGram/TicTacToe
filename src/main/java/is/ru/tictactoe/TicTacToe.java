package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	int x , y;
	char grid[][];
	int player;
	
    
	public TicTacToe() {
		grid = new char[3][];
		for (int i = 0; i < 3; i++){
			grid[i] = new char[3];
		}
		player = 1;
		fillWithChar();
	}


	private void fillWithChar(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				grid[i][j] = '-';
			}
		}
	}

	// prints out the TicTacToe board
	public void print(){
		System.out.println();
		System.out.println("Current status:");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

      
    // The play function. The 
	public void play(){
		Scanner in = new Scanner(System.in);
		int xnew = 0;
		int ynew = 0;
		//x = in.nextInt();
		//y = in.nextInt();
		grid[xnew][ynew] = 'X';
	}


}


