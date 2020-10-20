package practice_strings;

public class Strings {
    public static void main(String[] args) {
        String sentence = "Hello world";

        System.out.println(sentence.length() - 1);

        System.out.println(sentence.substring(0, 3));

        String a = "Test";
        String b = "Test2";

        System.out.println(a.equals(b)); // Boolean 

        System.out.println(a.charAt(a.length() - 1));;
    }
}
