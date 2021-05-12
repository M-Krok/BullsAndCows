package bullscows;

public class InfoPrinting {

    public static void zeroBullsAndZeroCows() {

        System.out.println("Grade: None. The secret code is " + String.join("", Password.getPassword()));
    }


    public static void somethingHit() {

        System.out.println("Grade: " + Grader.getBullCount() + " bull(s) and " + Grader.getCowCount() + " cow(s)."
                + " The secret code is " + String.join("", Password.getPassword()));
    }
}
