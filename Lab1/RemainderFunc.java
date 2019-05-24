import java.util.Scanner;
public class RemainderFunc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		System.out.print("Please enter the divisor: ");
		int div = input.nextInt();
		
		int i = 1;
		do{
			System.out.println("Num: " + i + " % " + div + " = " + (i%div));
			i++;
		}while(i <= max);
	}

}
