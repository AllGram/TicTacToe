package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class TicTacToeTest {

    @Test
    public void testConstructorGrid() {

    	TicTacToe test = new TicTacToe();
    	// test the x.length
        assertEquals(3, test.grid.length);
        // test the y.lenght
        for(int i = 0; i < 3; i++){
        	assertEquals(3, test.grid[i].length);
        }
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
    	for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				assertEquals("-", Character.toString(test.grid[i][j]));	
			}
		}
    }
/*
    @Test
    public void testPlayInput() {
    	TicTacToe test = new TicTacToe();

    	assertEquals();
    }
*/
} 
