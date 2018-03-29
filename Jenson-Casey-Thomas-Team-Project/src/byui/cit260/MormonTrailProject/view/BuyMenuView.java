package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;

public class BuyMenuView extends View {

    static int totalItems;
    static String[] items;
    static double[] prices;
    static int[] quantity;

    public void main(String[] args) {

        System.out.println("Welcome to the General Store");
        totalItems = getNumberOfItems("How many items do you want to buy? ");
        items = new String[totalItems];
        prices = new double[totalItems];
        quantity = new int[totalItems];

        int count = 0;
        while (count < totalItems) {

            getItemDetails(count);
            count++;
        }

        displayCart();

    }

    private void getItemDetails(int index) {

        items[index] = getItemName("What is the name of item # " + (index + 1) + "? ");
        prices[index] = getItemPrice("What is the price of item # " + (index + 1) + "? ");
        quantity[index] = getItemQuantity(("How many of item # " + (index + 1)) + "? ");
    }

    private static void displayCart() {

        System.out.println("**************************************************************");
        System.out.println("                     Your Purchase Details                    ");
        System.out.println("**************************************************************");
        for (int i = 0; i < totalItems; i++) {

            showLineItem(i);

        }

        System.out.println("*******************************************");

        double total = calculateTotal();
        System.out.println("Your Total is: " + total);
    }

    private static void showLineItem(int index) {

        String quantityText = quantity[index] + "\t--\t"; // 3 -- Pencils
        String itemText = items[index] + "............"; // Pencils
        String priceText = prices[index] + " = " + prices[index] * quantity[index];

        System.out.println(quantityText + itemText + priceText);

    }

    private double getItemPrice(String m) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        double input = Double.parseDouble(value);
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + m);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) {

                    System.out.println("\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    System.out.println("\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return input; // return the value entered
    }

    private static double calculateTotal() {
        double total = 0;
        for (int i = 0; i < totalItems; i++) {
            total += prices[i] * quantity[i];

        }

        return total;

    }

    private String getItemName(String m) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + m);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) {

                    System.out.println("\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    System.out.println("\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return value; // return the value entered
    }

    private int getItemQuantity(String m) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        int input = Integer.parseInt(value);
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + m);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) {

                    System.out.println("\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    System.out.println("\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return input; // return the value entered
    }

    private int getNumberOfItems(String m) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        int input = Integer.parseInt(value);
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + m);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) {

                    System.out.println("\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    System.out.println("\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return input; // return the value entered
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }

}
