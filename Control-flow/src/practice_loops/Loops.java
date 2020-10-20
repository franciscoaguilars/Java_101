package practice_loops;


public class Loops {
    public static void main(String[] args) {
        //While loops
        int count = 0;

        while ( count <= 100) {
            System.out.println(count);
            count += 1;
        }

        String sentence = "This is a sentence";
        reverseChars(sentence);
    }


    public static void reverseChars(String sentence){
        for (int i = sentence.length() - 1; i >= 0; i--){
            System.out.println("char: " + sentence.charAt(i));
        } 
    }
}
