
public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int repeats = Integer.parseInt(args[1]);  

       
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

           
            String cheer;
            if ("AEFHILMNORSX".indexOf(ch) != -1) {
                cheer = "an";
            } else {
                cheer = "a";
            }

            System.out.println("Give me " + cheer + " " + ch + ": " + ch + "!");
        }

       
        System.out.println("What does that spell?");
        for (int i = 0; i < repeats; i++) {
            System.out.println(word + "!!!");
        }
    }
}
