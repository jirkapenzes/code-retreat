package codeRetreat.tests;

import junit.framework.TestCase;

/**
 * Author: Jirka Pénzeš
 * Date: 8.12.12
 * Time: 1:02
 */
public class GameOfLifeTest extends TestCase {

    /*
    1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
	2. Any live cell with two or three live neighbours lives on to the next generation.
	3. Any live cell with more than three live neighbours dies, as if by overcrowding.
	4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
    */

    public void gameOfLifeTest() throws Exception {
        assertEquals(true, true);
    }

}
