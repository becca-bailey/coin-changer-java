import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {

    private static ArrayList<Integer> expectedChange(int... coins) {
        ArrayList<Integer> change = new ArrayList<Integer>();
        for (int coin : coins) {
            change.add(coin);
        }
        return change;
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

}
