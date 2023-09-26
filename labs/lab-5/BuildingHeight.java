import java.util.Scanner;

public class BuildingHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distance, elevationAngle, height;
        System.out.print("How far is the building (meters)? ");
        distance = in.nextDouble();
        System.out.print("What is the elevation angle of the top? ");
        elevationAngle = in.nextDouble();
        height = distance * Math.tan(elevationAngle * (Math.PI / 180));
        System.out.println("The building is " + height + " meters high.");
    }
}
