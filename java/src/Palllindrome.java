import java.util.Scanner;

public class Palllindrome {
    static boolean isPalllindrome(String word) {
        word = word.toLowerCase();
        int len = word.length();
        for (int i = 0; i < len/2; i++) {
            return word.charAt(i) == word.charAt(len - i - 1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word+" " +isPalllindrome(word));

    }
}
