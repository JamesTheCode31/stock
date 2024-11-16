/*
James Arnold S. Nieves
October 16, 2024
Final Challenge No.1:Retail Store Inventory Management
*/
public class StockManagement {
    public static void main(String[] args) {
        // Stock levels for 10 products
        int[] stockLevels = {10, 5, 8, 15, 12, 6, 9, 3, 20, 7};

        // Prices for 10 products
        double[] prices = {15.5, 10.0, 7.5, 12.0, 20.0, 5.0, 8.0, 25.0, 30.0, 9.0};

        // Calculate the total value of stock
        double totalValue = 0;

        // Loop through each product
        for (int i = 0; i < stockLevels.length; i++) {
            totalValue += stockLevels[i] * prices[i];
        }

        // Output the total value
        System.out.printf("The total value of all items in stock is: $%.2f%n", totalValue);
    }
}
