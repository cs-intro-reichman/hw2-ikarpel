// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String let = args[1];
		int count = 0;
		if(let.equals("v"))
		{
			for (int i = 1; i <= n; i++) {
				
				if(i!=1){		
					System.out.print(i+" ");
					count = 1;
							
					for(int div = i; div != 1; count++) 
					{		
						
						if (div % 2 == 0) {
							div = div / 2;
							System.out.print(div+" ");
						} else {
							div = 3 * div + 1;
							System.out.print(div+" ");
						}
						
					}
					System.out.print("("+count+")");
					System.out.println("");
				}else{
					System.out.print("1 4 2 1 (4)");
					System.out.println("");
				}
				
				
			}
			System.out.println("Every one of the first "+ n +" hailstone sequences reached 1.");
		}else{
				System.out.println("Every one of the first "+ n +" hailstone sequences reached 1.");
			}



	}

}

