//feedback

/*
Great work boaz!
*/
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	     String word = args[0];
             int num = Integer.parseInt(args[1]); 
             for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                              
                    System.out.println("Give me an "+ currentChar+ ": "+ currentChar+"!"); 
        
            } 
            System.out.println("What does that spell?");
            for ( int j = 0; j < num; j++) {
                System.out.println( word+"!!!");
            }
                 
        }
}
