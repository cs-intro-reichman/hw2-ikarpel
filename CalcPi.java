// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int k = Integer.parseInt(args[0]);
		double sum = 0.0;
		double div = 1.0;
		for (int i = 0; i < k; i++) {
			if (i % 2 == 0) {
				sum += 1.0/div;
			} else {
				sum -= 1.0/div;
			}
			div += 2.0;
		}
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:	"+ (sum * 4.0));
	}
}
