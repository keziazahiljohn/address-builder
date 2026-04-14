package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        // Ensure space here

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Ensure space here

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(fullName).append("\n\n");

        addressBuilder.append("Billing Address:\n");
        addressBuilder.append(billingStreet).append("\n");
        addressBuilder.append(billingCity).append(", ");
        addressBuilder.append(billingState).append(" ");
        addressBuilder.append(billingZip).append("\n\n");

        addressBuilder.append("Shipping Address:\n");
        addressBuilder.append(shippingStreet).append("\n");
        addressBuilder.append(shippingCity).append(", ");
        addressBuilder.append(shippingState).append(" ");
        addressBuilder.append(shippingZip).append("\n\n");

        String addressBuilderString = addressBuilder.toString();
        System.out.println(addressBuilderString);
    }
}
