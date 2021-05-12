package bullscows;
import java.util.Arrays;

public class Grader {



    private static int cowCount = 0;
    private static int bullCount = 0;


    public static void grader() {




        for (int i = 0; i < TryPassword.getInputCode().length; i++) {

            if (TryPassword.getInputCode()[i].equals(Password.getPassword()[i])) {
                Grader.bullCount++;
            } else if (Arrays.asList(Password.getPassword()).contains(TryPassword.getInputCode()[i])) {
                Grader.cowCount++;
            }
        }

        if (bullCount == 0 && cowCount == 0) {
            InfoPrinting.zeroBullsAndZeroCows();
        } else {
            InfoPrinting.somethingHit();
        }
    }


    public static int getCowCount() {
        return cowCount;
    }

    public static int getBullCount() {
        return bullCount;
    }
}
