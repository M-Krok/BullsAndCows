package bullscows;

public class GeneratedCode {


    static String pseudoRandomNumber = Long.toString(System.nanoTime());
    static char[] pseudo = pseudoRandomNumber.toCharArray();

    static String code = "";






    public static String codeGenerator(int n) {

        for (int i = 0; i < pseudo.length; i++) {

            if ((code.isEmpty() && pseudo[i] == '0') || code.contains(String.valueOf(pseudo[i]))) {
                continue;
            } else if (code.length() < n) {
                code += pseudo[i];
            } else {
                break;
            }
        }
        return code;
    }






    public static void codeLogic(int n) {


        if (n > 10) {
            System.out.println("Error: can't generate a secret number with a length of" +
                    n + "because there aren't enough unique digits.");
        } else {
            String code = GeneratedCode.codeGenerator(n);

            while (code.length() < n) {
                code = GeneratedCode.codeGenerator(n);
            }

        }
    }

}


