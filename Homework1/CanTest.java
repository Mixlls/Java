package Homework1;
import java.util.Scanner;
//Nattawat tipma
//6509618150
//15
public class CanTest {
    public static void main(String[] args) {
        Can can = new Can();
        float radius = 0;
        float height = 0;
        System.out.println("Please input the radius of a can");
        Scanner input = new Scanner(System.in);
        radius = input.nextFloat();
        System.out.println("Please input the height of a can");
        height = input.nextFloat();
        System.out.println("The side area of this can is:"+can.calcilateSideArea(radius, height));
        System.out.println("The side area of this can is:"+can.calculateVolume(radius, height));


        
    }
}
