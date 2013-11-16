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

    // test if the input is in valid size (valid grid)
    @Test
    public void testCheckIfValidSize() {
    	TicTacToe test = new TicTacToe();
    	int pos = 10;
    	char sympol = 'x';
    	assertEquals(false, test.checkIfValid(10, sympol)); 
   	}

   	//check whether the grid is empty or not 
   	@Test
    public void testCheckIfValidCharInPos() {
    	TicTacToe test = new TicTacToe();
    	// put in dummie data
    	test.grid[0] = 'x';
    	test.grid[1] = 'o';
    	test.grid[2] = '-';

    	test.grid[3] = '-';
    	test.grid[4] = 'x';
    	test.grid[5] = '-';

    	test.grid[6] = 'o';
    	test.grid[7] = 'x';
    	test.grid[8] = 'o';

    	assertEquals(false, test.checkIfValid(0, 'x'));
    	assertEquals(false, test.checkIfValid(1, 'x'));
    	assertEquals(true, test.checkIfValid(2, 'x'));

    	assertEquals(true, test.checkIfValid(3, 'x'));
    	assertEquals(false, test.checkIfValid(4, 'x'));
    	assertEquals(true, test.checkIfValid(5, 'x'));

    	assertEquals(false, test.checkIfValid(6, 'x'));
    	assertEquals(false, test.checkIfValid(7, 'x'));
    	assertEquals(false, test.checkIfValid(8, 'x'));
   	}
} 
