import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of circle" );
		double r = s.nextDouble();
		double pi = 3.14;
		double area = pi*r*r;
		System.out.println("Area of circle:" +area);		
	}

}
