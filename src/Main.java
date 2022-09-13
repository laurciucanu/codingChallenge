/**
 * Given the string with repeating chars , remove the repeating chars when the
 * consecutive count goes more than 2.
 * <p>
 * Example :
 * input : aaaaaaaabbbbbcccc
 * output : aabbcc
 * <p>
 * inout abbbbbbvvvvvv
 * output : abbvv
 */

public class Main {

     public static String removeRepeatingChars(String input) {
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < input.length() - 1; i++) {
            char myChar = input.charAt(i);

            if(myChar != input.charAt(i+1)) {
                output = output.append(input.charAt(i));
            }

            if(myChar == input.charAt(i+1)){
                output = output.append(input.charAt(i)).append(input.charAt(i+1));
                do{
                    i++;
                }while(i < input.length() && input.charAt(i) == myChar);

            }else{
                do{
                    i++;
                }while(i < input.length() && input.charAt(i) == myChar);
            }

        }

        return output.toString();
    }

    public static void main(String[] args) {
        System.out.print(removeRepeatingChars("aaaabbbbcccc"));
//         System.out.print( removeRepeatingChars("aaaaaaaabbbbbcccc"));
//         System.out.print( removeRepeatingChars("abbbbbbvvvvvv") );
    }
}