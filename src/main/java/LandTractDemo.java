
import java.util.Scanner;

public class LandTractDemo {
    public static void main(String[] args) {
        double length;
        double width;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length of Tract 1: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width of Tract 1: ");
        width = keyboard.nextDouble();
        LandTract tract1 = new LandTract(length, width);
        System.out.print("Enter the length of Tract 2: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width of Tract 2: ");
        width = keyboard.nextDouble();
        LandTract tract2 = new LandTract(length, width);
        System.out.println("\nTract 1 Area: " + tract1.getArea());
        System.out.println("Tract 2 Area: " + tract2.getArea() + "\n");
        // Determine whether the two tracts are equal
        if (tract1.equals(tract2))
            System.out.println("The tracts are the same size");
        else
            System.out.println("The tracts are NOT the same size");
    }
}