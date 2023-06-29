package xxCountingString;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int vowels = countVowels(sentence);
        int consonants = countConsonants(sentence);
        int digits = countDigits(sentence);
        int special = countSpecial(sentence);

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }

    public static int countVowels(String sentence) {
        int vowels = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
        }
        return vowels;
    }

    public static int countConsonants(String sentence) {
        int consonants = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                consonants++;
            }
        }
        return consonants;
    }

    public static int countDigits(String sentence) {
        int digits = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
            }
        }
        return digits;
    }

    public static int countSpecial(String sentence) {
        int special = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                special++;
            }
        }
        return special;
    }
}

