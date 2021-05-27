package bullscows;
import java.util.Arrays;

public class Grader {

    static String[] code = GeneratedCode.code.split("");

    private static int cowCount = 0;
    private static int bullCount = 0;
    private static boolean codeCorrect = true;



    public static boolean isCodeCorrect() {
        return codeCorrect;
    }


    public static void grader(String n) {

        String[] splitCode = n.split("");



        for (int i = 0; i < n.length(); i++) {

            if (splitCode[i].equals(code[i])) {
                Grader.bullCount++;
            } else if (Arrays.asList(code).contains(splitCode[i])) {
                Grader.cowCount++;
            }
        }

        if (bullCount == 0 && cowCount == 0) {
            InfoPrinting.zeroBullsAndZeroCows();
        } else {
            InfoPrinting.somethingHit();
        }


        if (bullCount == code.length) {
            codeCorrect = false;
            InfoPrinting.congratulations();
        }

        bullCount = 0;
        cowCount = 0;
    }



    public static int getCowCount() {
        return cowCount;
    }

    public static int getBullCount() {
        return bullCount;
    }
}
