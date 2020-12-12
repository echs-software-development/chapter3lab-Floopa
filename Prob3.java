import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCHES = 0.0254;

		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();

		System.out.println("Enter height in inches:");
		double height = input.nextDouble();

		weight = weight * KILOGRAMS_PER_POUND;

		height = height * Meters_PER_INCHES;
    //i was having trouble with the statment below, I eventually asked my dad and he reccomended using Math.pow even though i seem to remeber us doing it differently in class
		double bodyMassIndex = weight / Math.pow(height, 2);

		System.out.println("BMI is " + bodyMassIndex);
	}
}