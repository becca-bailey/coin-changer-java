import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChanger {

    public static ArrayList<Integer> makeChange(int cents) {
        ArrayList<Integer> change = new ArrayList<Integer>();

        while (cents >= 10) {
            change.add(10);
            cents -= 10;
        }

        while (cents >= 5) {
            change.add(5);
            cents -= 5;
        }

        while (cents > 0) {
            change.add(1);
            cents -= 1;
        }
        return change;
    }
}

