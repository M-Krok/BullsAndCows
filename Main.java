package bullscows;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        int turnCounter = 1;

        InfoPrinting.inputInfo();

        int n = scan.nextInt();

        GeneratedCode.codeLogic(n);


        InfoPrinting.startGameInfo();

        while (Grader.isCodeCorrect()) {

            System.out.println("Turn " + turnCounter + ":");
            Grader.grader(scan.next());
            turnCounter++;

        }






    }
}



