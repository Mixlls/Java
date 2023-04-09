package Homework1;
//Nattawat tipma
//6509618150
//15
import java.util.Scanner;

public class ProjectileCalculatorTest {
    public static void main(String[] args) {
        ProjectileCalculator projectile = new ProjectileCalculator();
        double velocity;
        double angle;
        System.out.println("Please input velocity");
        Scanner input = new Scanner(System.in);
        velocity = input.nextDouble();
        System.out.println("Please input angle");
        angle = input.nextDouble();
        System.out.println("The highest point is at "+projectile.highestpoint(velocity, angle)+" meters and the distance before falling is "+projectile.falling(velocity, angle));
    }
}
