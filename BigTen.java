 import java.util.Scanner;

public class BigTen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=1,n,big=0;
		while(i<=10) {
			System.out.println("Enter numbers"+i);
			n = s.nextInt();

			if (n>big)
			 big = n;
			i++;
		}
		System.out.println("big" + big);

	}

}

/* import java.util.Scanner;

public class BigTen {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1, n, big = Integer.MIN_VALUE; // Initialize big to the smallest possible integer

        System.out.println("Enter 10 numbers:");

        while (i <= 4) {
            System.out.print("Enter number " + i + ": ");
            n = s.nextInt(); // Read the number
            big = (n > big) ? n : big; // Update big if n is larger
            i++;
        }

        System.out.println("The largest number is: " + big);
    }
} */
