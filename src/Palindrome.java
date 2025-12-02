
public class Palindrome {
    public static void main(String[] args){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Zu prüfenden Text eingeben: ");
        String input = scan.nextLine();
        String lowered = lower(input);
        String noSpaces = removeSpaces(lowered);
        boolean result = checkPal(noSpaces);

        if (result) {
            System.out.println("Given input is a palindrome. ");
        }
        else {
            System.out.println("Given input isn't a palindrome. ");
        }
    }

    public static boolean checkPal(String input){
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static String lower(String input){
        return input.toLowerCase();
    }

    public static String removeSpaces(String input){
        return input.replaceAll("\\s+","");
    }

}