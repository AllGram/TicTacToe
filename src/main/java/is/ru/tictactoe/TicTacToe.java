package is.ru.tictactoe;

public class TicTacToe {
	
	int x = 0, y = 0;
	char grid[][];
	
    
	public TicTacToe() {
		grid = new char[3][];
		for (int i = 0; i < 3; i++){
			grid[i] = new char[3];
		}
		fillWithChar();
	}


	private void fillWithChar()
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				grid[i][j] = '-';
			}
		}
	}
}