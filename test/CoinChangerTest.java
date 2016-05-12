import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {

    List<Integer> expectedChange(Integer... coins) {
        return new ArrayList<Integer>(Arrays.asList(coins));
    }

    @Test
    public void returnsEmptyCollection() {
        assertEquals(expectedChange(), CoinChanger.makeChange(0));
    }

    @Test
    public void returns1Penny() {
        assertEquals(expectedChange(1), CoinChanger.makeChange(1));
    }

    @Test
    public void returns2Pennies() {
        assertEquals(expectedChange(1,1), CoinChanger.makeChange(2));
    }

    @Test
    public void returns1Nickel() {
        assertEquals(expectedChange(5), CoinChanger.makeChange(5));
    }

    @Test
    public void returns1Nickel1Penny() {
        assertEquals(expectedChange(5,1), CoinChanger.makeChange(6));
    }

    @Test
    public void returns1Dime() {
        assertEquals(expectedChange(10), CoinChanger.makeChange(10));
    }

    @Test
    public void returns1Quarter() {
        assertEquals(expectedChange(25), CoinChanger.makeChange(25));
    }

    @Test
    public void returnsChangeFor99Cents() {
        assertEquals(expectedChange(25,25,25,10,10,1,1,1,1), CoinChanger.makeChange(99));
    }

}
