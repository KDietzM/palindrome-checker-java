package de.ulbms.scdh.spike.git;

/**
 * * Checks if a given string input is a palindrome
 *      * meaning it can be read forwards and backwards.
 *      * The input string gets normalized by removing spaces
 *      * and changing all uppercase chars to lowercase.
 */
public class Palindrome {
    public static void main(String[] args){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Zu prüfenden Text eingeben: ");
        String input = scan.nextLine();
        String lowered = lowerCase(input);
        String noSpaces = removeSpaces(lowered);
        boolean result = isPalindrome(noSpaces);

        if (result) {
            System.out.println("Given input is a palindrome.");
        }
        else {
            System.out.println("Given input isn't a palindrome.");
        }
    }

    /**
     * Checks if a given string input is a palindrome
     * meaning it can be read forwards and backwards.
     * @param input user-defined String
     * @return Boolean
     */
    public static boolean isPalindrome(String input){
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    /**
     * Changes the input string to all lower case characters
     * @param input user-defined String
     * @return String in lower case
     */
    public static String lowerCase(String input){
        return input.toLowerCase();
    }

    /**
     * Removes all spaces from a given string
     * @param input user-defined String
     * @return String without spaces
     */
    public static String removeSpaces(String input){
        return input.replaceAll("\\s+","");
    }

}

