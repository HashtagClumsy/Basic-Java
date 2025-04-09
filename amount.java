import java.util.Scanner;
public class amount {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter item number");
		int itemNum = s.nextInt();
		System.out.println("Enter item name");
		String itemName = s.next();
		System.out.println("Enter quantity");
		int quantity = s.nextInt();
		System.out.println("Enter cost of one unit");
		double rate = s.nextDouble();
		double amount = rate*quantity;
	    System.out.println("The total amount is: " +amount);
	}

}
