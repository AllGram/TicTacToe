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
    


    // test if the input is in valid size (valid grid)
    @Test
    public void testCheckIfValidSize() {
    	TicTacToe test = new TicTacToe();
    	test.x = 10;
    	assertEquals(false, test.checkIfValidInput()); 
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

    	test.x = 0;
    	assertEquals(false, test.checkIfValidInput());
    	test.x = 1;
    	assertEquals(false, test.checkIfValidInput());
    	test.x = 2;
    	assertEquals(true, test.checkIfValidInput());

    	test.x = 3;
    	assertEquals(true, test.checkIfValidInput());
    	test.x = 4;
    	assertEquals(false, test.checkIfValidInput());
    	test.x = 5;
    	assertEquals(true, test.checkIfValidInput());

    	test.x = 6;
    	assertEquals(false, test.checkIfValidInput());
    	test.x = 7;
    	assertEquals(false, test.checkIfValidInput());
    	test.x = 8;
    	assertEquals(false, test.checkIfValidInput());
   	}

   	@Test
    public void testChangePlayer() {
    	TicTacToe test = new TicTacToe();
    	test.player = 1;
    	test.changePlayer();
    	assertEquals(2, test.player);
    	test.changePlayer();
    	assertEquals(1, test.player); 
   	}

} 
