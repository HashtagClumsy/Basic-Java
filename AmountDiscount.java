import java.util.Scanner;

public class AmountDiscount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter item number");
        int itemNum = s.nextInt();
        System.out.println("Enter item Name");
        String itemName = s.next();
        System.out.println("Enter item quantity");
        int qty = s.nextInt();
        System.out.println("Enter unit cost of item");
        double rate = s.nextDouble();

        double amount = qty * rate;
        double discount = 0; // Initialize discount to 0

        // Determine the discount based on the amount
        if (amount >= 1000 && amount < 2000) {
            System.out.println("Discount 10%");
            discount = 0.10 * amount; // Assign value to discount
        } else if (amount >= 2000 && amount < 3000) {
            System.out.println("Discount 15%");
            discount = 0.15 * amount; // Assign value to discount
        } else if (amount >= 3000 && amount < 5000) {
            System.out.println("Discount 20%");
            discount = 0.20 * amount; // Assign value to discount
        } else if (amount >= 5000) {
            System.out.println("Discount 25%");
            discount = 0.25 * amount; // Assign value to discount
        } else {
            System.out.println("No discount applied. Total amount = " + amount);
            return; // Exit the program if no discount is applied
        }

        // Calculate the new amount after discount
        double new_amount = amount - discount;
        System.out.println("Total amount after discount = " + new_amount);
    }
}