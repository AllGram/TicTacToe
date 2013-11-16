package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	int x , y;
	char grid[];
	int player;
	
    
	public TicTacToe() {
		grid = new char[9];
		player = 1;
		fillWithChar();
	}


	private void fillWithChar(){
		for (int i = 0; i < 9; i++){
			grid[i] = '-';
		}
	}

	// prints out the TicTacToe board
	public void print(){
		System.out.println();
		System.out.println("Current status:");
		for (int i = 0; i < 9; i++){
			System.out.print(i);
			if(i == 2 || i == 5 || i == 8){
				System.out.println();
			}
		}
	}

	// function to check if the input is valid
	public boolean checkIfValid( int pos ,char sympol ){
		// check if the grid is whithin the limit of the array
		if ( pos > 8 || pos < 0){
			return false;
		}
		// check if the grid is empty
		if ( grid[pos] != '-'){
			return false;
		}
		return true;
	}

}


