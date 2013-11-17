package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	int x;
	char grid[];
	int player;
	
    
	public TicTacToe() {
		grid = new char[9];
		player = 1;
		initializedGrid();
	}


	public void initializedGrid(){
		for (int i = 0; i < 9; i++){
			grid[i] = '-';
		}
	}

	// prints out the TicTacToe board
	public void print(){
		System.out.println();
		System.out.println("Current status:");
		for (int i = 0; i < 9; i++){
			System.out.print(" " + grid[i] + " ");
			if(i == 2 || i == 5 || i == 8){
				System.out.println();
			}
		}
	}


	// Checks who is winner
	public boolean checkForWin(){
		if((winningRow() == true || winningColumn() == true) || winningDiagonal() == true){
			return true;
		}
		return false;
	}

	// Checks if there is a winner in a row

	private boolean winningRow(){
		
		if(grid[0] != '-' && grid[0] == grid[1] && grid[1] == grid[2]){
			return true;
		}
		if(grid[3] != '-' && grid[3] == grid[4] && grid[4] == grid[5]){
			return true;
		}
		if(grid[6] != '-' && grid[6] == grid[7] && grid[7] == grid[8]){
			return true;
		}
		return false;
	}

        // Checks if there is a winner in a column

	private boolean winningColumn(){
		if(grid[0] != '-' && grid[0] == grid[3] && grid[3] == grid[6]){
			return true;
		}
		if(grid[1] != '-' && grid[1] == grid[4] && grid[4] == grid[7]){
			return true;
		}
		if(grid[2] != '-' &&grid[2] == grid[5] && grid[5] == grid[8]){
			return true;
		}
		return false;
	}
        // Checks if there is a winner diagonally
	private boolean winningDiagonal(){
		if(grid[0] != '-' && grid[0] == grid[4] && grid[4] == grid[8]){
			return true;
		}		
		if(grid[2] != '-' && grid[2] == grid[4] && grid[4] == grid[6]){
			return true;
		}
		return false;
	}

	// function to check if the input is valid
	public boolean checkIfValidInput(){
		// check if the grid is whithin the limit of the array
		if ( x > 8 || x < 0){
			return false;
		}
		// check if the grid is empty
		if ( grid[x] != '-'){
			return false;
		}
		return true;
	}

	//check for tie
	public boolean checkForTie() {
		for (int i = 0; i < 9; i++){
			if (grid[i] == '-') return false;
		}
		return true;
	}
     
	public void changePlayer(){
		if (player == 1) player = 2;
		else player = 1;
	}

	public void insert(){
		if(player == 1){
			grid[x] = 'X';	
		}
		else{
			grid[x] = 'O';
		}
	}

   
	public void play(){
		Scanner in = new Scanner(System.in);
		boolean validInput;
		
		while(!checkForWin() && !checkForTie()){
			validInput = false;
			print();
			System.out.println("Player " + player + " it's your turn");

			do{
			System.out.println("Add your next move: ");
			System.out.print("What grid do you want (0-8): ");
			x = in.nextInt();
			if(checkIfValidInput()){
				insert();
				validInput = true;
			};
			}while (!validInput);	
			changePlayer();			
		}

		if(checkForWin()){
			print();
			System.out.println();
			System.out.println("Player " + player + " WON!!!!! ");
		}
		else if(checkForTie()){
			print();
			System.out.println("We have a TIE!!!!!! ");
		}

		in.close();
	}
	
	

	public static void main(String[] args) {
		TicTacToe mainTest = new TicTacToe();
		System.out.println("Hello and welcome to a game of Tic Tac Toe");
		System.out.println();
		System.out.println("The playground is described below");
		System.out.println("_________");
		System.out.println("| 0 1 2 |");
		System.out.println("| 3 4 5 |");
		System.out.println("| 6 7 8 |");
		mainTest.play();
	}
}


