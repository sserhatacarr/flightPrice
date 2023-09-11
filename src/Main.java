import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, tripType;
        double totalCost;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance in kilometers: ");
        distance = input.nextInt();

        if (distance <= 50) {
            System.out.println("Distance cannot be less than 50 kilometers.");
        } else {
            System.out.print("Please enter your age: ");
            age = input.nextInt();

            if (age < 0) {
                System.out.println("Please enter a valid age.");
            } else {
                System.out.println("Select the trip type:\n1-) One Way\n2-) Round Trip");
                tripType = input.nextInt();

                if (tripType == 1) {
                    totalCost = calculateOneWayCost(distance, age);
                    System.out.println("Your trip cost = $" + totalCost);
                } else if (tripType == 2) {
                    totalCost = calculateRoundTripCost(distance, age);
                    System.out.println("Your trip cost = $" + totalCost);
                } else {
                    System.out.println("Please enter a valid trip type.");
                }
            }
        }
    }

    // Calculate one-way trip cost
    private static double calculateOneWayCost(int distance, int age) {
        double baseFare = distance * 0.1;
        double discount = 1.0;

        if (age < 12) {
            discount = 0.5;
        } else if (age <= 24) {
            discount = 0.9;
        } else if (age >= 65) {
            discount = 0.7;
        }

        return baseFare * discount;
    }

    // Calculate round trip cost
    private static double calculateRoundTripCost(int distance, int age) {
        double oneWayCost = calculateOneWayCost(distance, age);
        return oneWayCost * 2 * 0.8; // 20% round trip discount
    }
}
