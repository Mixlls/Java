package Homework3.three;
/*
Nattawat itpma
6509618150
15
 */
public class Dessert {
    private String Name, Type, StoreName;
    private double Calorie;

    Dessert(String name,String type,String storename,double calorie) {
        Name = name;
        Type = type;
        StoreName = storename;
        Calorie = calorie;
    }
    public String getName() {
        return Name;
    }
    public String getType(){
        return Type;
    }
    public String getStore(){
        return StoreName;
    }
    public double getCalorie(){
        return Calorie;
    }
    public void printDessert(){
        System.out.println("Name:"+Name+" Category:" +Type+" StoreName: "+StoreName+" Calories "+Calorie);
    }
    
    
}
