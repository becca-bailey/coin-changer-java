import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChanger {

    public static ArrayList<Integer> makeChange(int cents) {
        ArrayList<Integer> change = new ArrayList<Integer>();

        while (cents > 0) {
            change.add(1);
            cents -= 1;
        }
        return change;
    }
}

