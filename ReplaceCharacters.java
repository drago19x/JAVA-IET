import java.util.Scanner;

public class ReplaceCharacters {

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert character to lowercase for comparison
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    // Method to replace vowels with '#' and consonants with '$'
    public static String replaceVowelsAndConsonants(String input) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is a vowel
            if (isVowel(currentChar)) {
                result.append('#'); // Replace vowel with #
            } else if (Character.isLetter(currentChar)) {
                result.append('$'); // Replace consonant with $
            } else {
                result.append(currentChar); // Leave non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Replace vowels and consonants
        String modifiedString = replaceVowelsAndConsonants(input);

        // Output the modified string
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }
}
