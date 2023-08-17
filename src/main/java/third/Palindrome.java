package third;

public class Palindrome {
    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";
        System.out.print(text);
        System.out.println(isPalindrome(text) ? " - Палиндром" : " - Не палиндром");

        text = "Просто текст";
        System.out.print(text);
        System.out.println(isPalindrome(text) ? " - Палиндром" : " - Не палиндром");
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(text.replaceAll("\\s", "")).reverse().toString());
    }
}
