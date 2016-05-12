import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChanger {

    static List<Integer> coins = new ArrayList<Integer>();

    public static ArrayList<Integer> makeChange(int cents) {

        coins.add(10);
        coins.add(5);
        coins.add(1);

        ArrayList<Integer> change = new ArrayList<Integer>();

        for (int coin : coins) {

            while (cents >= coin) {
                change.add(coin);
                cents -= coin;
            }
        }
        return change;
    }
}

