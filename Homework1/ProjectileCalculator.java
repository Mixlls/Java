package Homework1;
import java.lang.Math;
//Nattawat tipma
//6509618150
//15
public class ProjectileCalculator {
    private double velocity; 
    private double angle;

    public double getVelocity() {
        return velocity;
    }
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
   
    public double getAngle() {
        return angle;
    }
    public void setAngle(int angle) {
        this.angle = angle;
    }

    public double highestpoint(double velocity, double angle){
        return Math.round((Math.pow(velocity,2)*(Math.pow(Math.sin(Math.toRadians(angle)),2)))/(2*10)*100)/100;
    }

    public double falling(double velocity, double angle){
        return Math.round(Math.pow(velocity,2)*(Math.sin(Math.toRadians(angle)*2))/10)*100/100;
    }
}
