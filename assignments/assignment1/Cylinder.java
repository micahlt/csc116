import java.util.Random;

public class Cylinder {
    public static void main(String[] args) {
        Random rand = new Random();
        int radius = rand.nextInt(20) + 1;
        int height = rand.nextInt(20) + 1;
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * Math.PI * radius * height;
        System.out.println("A cylinder with radius " + radius + " and height " + height + " has a volume of " + volume
                + " and a surface area of " + surfaceArea + ".");
    }
}
