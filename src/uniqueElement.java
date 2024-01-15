import java.util.Arrays;

public class uniqueElement {

    public static void main(String[] args) {

        String str = "lala";

      // StringBuilder unique = new StringBuilder();
        // System.out.println(str);
        // char hh= str.charAt(0);
        // System.out.println(hh);

        for (int i = 0; i < str.length(); i++) {

            char neLetter = str.charAt(i);

            if (str.indexOf(neLetter) == str.lastIndexOf(neLetter)) {

                System.out.println(neLetter);

            }

        }
        System.out.println("No Unique Elements");

    }
}