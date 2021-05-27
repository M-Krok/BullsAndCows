package bullscows;


public class InfoPrinting {

    public static void zeroBullsAndZeroCows() {

        System.out.println("Grade: None.");
    }


    public static void somethingHit() {

        System.out.println("Grade: " + Grader.getBullCount() + " bull(s) and " + Grader.getCowCount() + " cow(s).");
    }


    public static void inputInfo() {

        System.out.println("Please, enter the secret code's length:");
    }

    public static void startGameInfo() {

        System.out.println("Okay, let's start a game!");
    }

    public static void congratulations() {

        System.out.println("Congratulations!! You guessed the secret code.");
    }
}
