package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class TicTacToeTest {

    @Test
    public void testConstructor() {

    	TicTacToe test = new TicTacToe();
    	// test the x.length
        assertEquals(3, test.grid.length);
        // test the y.lenght
        assertEquals(3, test.grid[0].length);
    }
    
} 