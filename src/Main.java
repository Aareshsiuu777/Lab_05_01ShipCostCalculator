import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;

        // Prompt user for item price
        System.out.print("Enter the price of the item: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();

            // If item price is 100 or more, shipping is free
            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                // Otherwise, shipping is 2% of the price
                shippingCost = itemPrice * 0.02;
            }

            totalCost = itemPrice + shippingCost;

            // Output the shipping cost and total price
            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" + totalCost);
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
