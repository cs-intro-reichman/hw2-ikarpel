//feedback

/*
Great work boaz!
*/
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	     String uppercase = args[0];
             int num = Integer.parseInt(args[1]); 
             String word = uppercase.toUpperCase();
             for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if(currentChar == 'A' || currentChar == 'E' || currentChar == 'F' || currentChar == 'H' || currentChar == 'I'|| currentChar == 'L'|| currentChar == 'M'|| currentChar == 'N'|| currentChar == 'O'|| currentChar == 'R'|| currentChar == 'S'|| currentChar == 'X'){
                              
                    System.out.println("Give me an "+ currentChar+ ": "+ currentChar+"!"); 
                }else{
                    System.out.println("Give me a  "+ currentChar+ ": "+ currentChar+"!"); 
                } 
            }    
            System.out.println("What does that spell?");
            for ( int j = 0; j < num; j++) {
                System.out.println( word+"!!!");
            }
                 
        }
}
