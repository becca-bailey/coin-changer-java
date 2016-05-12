import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChanger {

    static List<Integer> coins = Arrays.asList(25,10,5,1);

    public static ArrayList<Integer> makeChange(int cents) {

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

