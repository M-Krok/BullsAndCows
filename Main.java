package bullscows;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n > 10) {
            System.out.println("Error: can't generate a secret number with a length of" +
                    n + "because there aren't enough unique digits.");
        } else {
            String code = GeneratedCode.codeGenerator(n);

            while (code.length() < n) {
                code = GeneratedCode.codeGenerator(n);
            }

            System.out.println("The random secret number is " + code + ".");
        }

       // Grader.grader();



    }
}




