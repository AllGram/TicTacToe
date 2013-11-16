package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class TicTacToeTest {

    @Test
    public void testConstructorGrid() {
    	TicTacToe test = new TicTacToe();
    	// test the length of the array grid
        assertEquals(9, test.grid.length);
    }
    
    @Test
    public void testConstructorPlayer() {
    	// Player one should start
    	TicTacToe test = new TicTacToe();
        assertEquals(1, test.player);
    }

    @Test
    public void testIsGridFullOfLines() {
    	TicTacToe test = new TicTacToe();
    	for (int i = 0; i < 9; i++){
			assertEquals("-", Character.toString(test.grid[i]));
		}
    }
    @Test
    public void testIsWinningRow() {
        TicTacToe test = new TicTacToe();
        for(int i = 0; i < 3; i++){
            test.grid[i] = 'X';
        }
            assertEquals(true, test.winningRow());

        test.grid[2] = 'O';
        for(int i = 3; i < 6; i++){
            test.grid[i] = 'X';
        }
            assertEquals(true, test.winningRow());

        test.grid[3] = 'O';  
        for(int i = 6; i < 9; i++){
            test.grid[i] = 'X';
        }
            assertEquals(true, test.winningRow());

        test.grid[6] = 'O';
        
            assertEquals(false, test.winningRow());
    }
    
} 
