package string;
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        char firstChar = str.charAt(0);
        char lowerCaseFirstChar = Character.toLowerCase(firstChar);
        char upperCaseFirstChar = Character.toUpperCase(firstChar);
        System.out.println("First Character in lowercase: " + lowerCaseFirstChar);
        System.out.println("First Character in uppercase: " + upperCaseFirstChar);
    }
}