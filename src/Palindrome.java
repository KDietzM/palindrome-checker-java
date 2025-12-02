
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

    public static boolean isPalindrome(String input){
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static String lowerCase(String input){
        return input.toLowerCase();
    }

    public static String removeSpaces(String input){
        return input.replaceAll("\\s+","");
    }

}

