package is.ru.tictactoe;

public class TicTacToe {
	
	int x = 0, y = 0;
	char grid[][];
	
    
	public TicTacToe() {
		grid = new char[3][];
		for (int i = 0; i < 3; i++){
			grid[i] = new char[3];
		}
	}
}