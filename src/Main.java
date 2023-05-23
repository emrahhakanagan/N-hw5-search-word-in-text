public class Main {
    public static final String TEXT = "aaabbabaabbaaaabbaabbaabbaabbaaabbabaabbaaabbabaabbxaaaabbaabbaabbaabbbabaabbxaaabbabaabbabaabbaabbaabbxaaabbbaabb";
    public static final String PATTERN = "aabbx";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length(); i++) {
            int ii = i;
            int flag = 0;

            for (int j = 0; j < PATTERN.length(); j++) {
                if (PATTERN.charAt(j) == TEXT.charAt(ii)) {
                    flag++;
                    ii++;
                }

            }
            //ii = i;
            if (flag == PATTERN.length()) {
                count++;
            }
        }
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");

        // АЛЬТЕРНАТИВНАЯ ВЕРСИЯ ЦИКЛА
        /*

        for (int i = 0; i < TEXT.length(); i++) {


            for (int j = 0; j < PATTERN.length(); j++) {
             if (j + i >= TEXT.length() || PATTERN.charAt(j) != TEXT.charAt(j + i)) {
                 break;
             }

             if (j == PATTERN.length() - 1) {
                 count++;
             }

            }
        }


         */


        // АЛЬТЕРНАТИВНАЯ ВЕРСИЯ ЦИКЛА 2 с видео лекции от преподавателя

        /*


       String TEXT = "1231231211212312";
       String PATTERN = "12312";

       int counter = 0;
        for (int i = 0; i <= TEXT.length() - PATTERN.length(); i++) {
            if (TEXT.charAt(i) == PATTERN.charAt(0)) {
                boolean isMatches = true;
                for (int j = 1; j < PATTERN.length(); j++) {
                    if (PATTERN.charAt(j) != TEXT.charAt(i + j)) {
                        isMatches = false;
                        break;
                    }
                }
                counter += isMatches ? 1 : 0;
            }
        }

        System.out.println(counter);

         */



    }
}