package bullscows;


public class GeneratedCode {




    public static String codeGenerator(int n) {

        String pseudoRandomNumber = Long.toString(System.nanoTime());
        char[] pseudo = pseudoRandomNumber.toCharArray();
        String code = "";

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

}


