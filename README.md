# Flight Price Calculator

Calculate flight ticket prices based on distance and discounts.

## Overview

This Java program calculates the cost of a flight ticket based on the following input criteria:

- Distance (KM)
- Age
- Trip type (One Way or Round Trip)

The base price is set at 0.10 $ per kilometer. The program first calculates the total cost of the flight and then applies discounts based on the following conditions:

- All input values must be valid (positive numbers for distance and age, and trip type 1 or 2). Otherwise, an "Invalid Input!" warning is displayed.
- If the passenger is under 12 years old, a 50% discount is applied to the ticket price.
- If the passenger is between 12 and 24 years old, a 10% discount is applied to the ticket price.
- If the passenger is 65 years old or older, a 30% discount is applied to the ticket price.
- If the passenger selects "Round Trip" as the trip type, a 20% discount is applied to the ticket price.

## Usage

1. Enter the distance in kilometers.
2. Enter your age.
3. Select the trip type:
    - 1 - One Way
    - 2 - Round Trip

The program will calculate and display the total cost of the flight.

## Example Scenarios

**Scenario 1:**

Enter the distance in kilometers: 1500
Enter your age: 20
Select the trip type (1 => One Way, 2 => Round Trip): 2

Total Cost = 216 $

**Scenario 2:**

Enter the distance in kilometers: -500
Enter your age: 1
Select the trip type (1 => One Way, 2 => Round Trip): 77

Invalid Input!

**Scenario 3:**

Enter the distance in kilometers: 200
Enter your age: 35
Select the trip type (1 => One Way, 2 => Round Trip): 1

Total Cost = 20.0 $

## Hints

- Base Price = Distance * 0.10
- Age Discount = Base Price * Age Discount Rate
- Discounted Price = Base Price - Age Discount
- Round Trip Discount = Discounted Price * 0.20
- Total Price = (Discounted Price - Round Trip Discount) * 2

## Author

Serhat Acar

