import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" hello please choose from below "
				+  "\n 1. deposit \n 2. withdraw \n 3. display balance \n 4. exit");
		
		int amt = 0, bal = 0, ch;
		do {
			System.out.println("Enter your Choice");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the deposit amount");
				amt = s.nextInt();
				bal = bal + amt;
				System.out.println("Total balance: " + bal);
				break;
			case 2:
				System.out.println("Enter withdraw amount");
				amt = s.nextInt();
				if (amt < bal) {
					bal = bal - amt;
				    System.out.println(" Available balance: " + bal);
				}
				else  
					System.out.println("insufficient amount");
			    break;

			case 3:
				System.out.println(" the amount in account: " + bal);
				break;
			case 4:
				System.out.println("tq for banking");
				break;
			default:
				System.out.println("Invalid");

			}
		} while (ch != 4);

	}

}
