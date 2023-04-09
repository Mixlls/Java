package Homework1;
import java.lang.Math;
//Nattawat tipma
//6509618150
//15
public class Person {
    public static final String FEMALE = "female";
    public static final String MALE = "male";
    private String name;
    private String gender;
   
    private double weight;
    private double height;
    public Person(String name,String gender, double weight,double height) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public String getDetail(){
        return name+": gender = "+gender+", weight = "+weight+" kg,"+getWeightPound()+" lb. height = "+height+" cm,"+getHeightInches()+" inches";
    }
    public String getGender() {
        return gender;
    }
    public double getWeight(){
        return weight;
    }
    public double getWeightPound(){
        return Math.round(weight*2.2046*100)/100.0;
    }
    public double getHeight(){
        return height;
    }
    public double getHeightInches(){
        return Math.round(height*0.39370*100)/100.0;
    }
}
