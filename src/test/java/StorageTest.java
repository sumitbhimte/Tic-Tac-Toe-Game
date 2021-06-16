
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sumit Bhimte
 */
public class StorageTest {
    
    public StorageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTotalMoves method, of class Storage.
     */
    @Test
    public void testGetTotalMoves() {
        System.out.println("getTotalMoves");
        Storage instance = new Storage();
        int expResult = 0;
        int result = instance.getTotalMoves();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCurrentPlayerName method, of class Storage.
     */
    @Test
    public void testGetCurrentPlayerName() {
        System.out.println("getCurrentPlayerName");
        Storage instance = new Storage();
        String expResult = "X";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getXWonCount method, of class Storage.
     */
    @Test
    public void testGetXWonCount() {
        System.out.println("getXWonCount");
        Storage instance = new Storage();
        int expResult = 0;
        int result = instance.getXWonCount();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getYWonCount method, of class Storage.
     */
    @Test
    public void testGetYWonCount() {
        System.out.println("getYWonCount");
        Storage instance = new Storage();
        int expResult = 0;
        int result = instance.getYWonCount();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of registerMove method, of class Storage.
     */
    @Test
    public void testRegisterMove() {
        
        Storage instance = new Storage();
        instance.registerMove(0, 0);
        assertEquals(instance.getPlayerByPosition(0, 0),"X");
       
    }

    /**
     * Test of incrementXWonCount method, of class Storage.
     */
    @Test
    public void testIncrementXWonCount() {
        System.out.println("incrementXWonCount");
        Storage instance = new Storage();
        instance.incrementXWonCount();
        
       
    }

    /**
     * Test of incrementYWonCount method, of class Storage.
     */
    @Test
    public void testIncrementYWonCount() {
        System.out.println("incrementYWonCount");
        Storage instance = new Storage();
        instance.incrementYWonCount();
        
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkWinner method, of class Storage.
     */
    @Test
    public void testCheckWinner() {
        
        Storage instance = new Storage();
        instance.registerMove(0, 0);//x
        instance.registerMove(2, 0);
        instance.registerMove(0, 1);//x
        instance.registerMove(2, 1);
        instance.registerMove(0, 2);//x
        assertEquals(instance.checkWinner(),"X");
    }

    /**
     * Test of ResetMatrix method, of class Storage.
     */
    @Test
    public void testResetMatrix() {
        System.out.println("ResetMatrix");
        Storage instance = new Storage();
        instance.ResetMatrix();
        //assertArrayEquals(instance.ResetMatrix(), "");
        
        
    }

    /**
     * Test of ResetScore method, of class Storage.
     */
    @Test
    public void testResetScore() {
        System.out.println("ResetScore");
        Storage instance = new Storage();
        instance.ResetScore();
        
       
    }

    /**
     * Test of isGameOver method, of class Storage.
     */
    @Test
    public void testIsGameOver() {
        System.out.println("isGameOver");
        Storage instance = new Storage();
        boolean expResult = false;
        boolean result = instance.isGameOver();
        assertEquals(expResult, result);
        
        
    }
    
}
