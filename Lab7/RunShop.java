import java.util.*;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShopArr shop = new ShopArr();
		//System.out.println("Enter the amount of cheese:" );//modificaiton #3
		//Cheese.numCheese = input.nextInt();//modification #3
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
	}

}
