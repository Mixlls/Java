package Homework3.four;
/*
Nattawat itpma
6509618150
15
 */
public class Dessert implements Edible{
    private String Name, Type, StoreName , category;
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
    public float getCalorie(){
        return (float) Calorie;
    }
    public void printDessert(){
        System.out.println("Name:"+Name+" Category:" +Type+" StoreName: "+StoreName+" Calories "+Calorie);
    }
    @Override
    public String getShop() {
        // TODO Auto-generated method stub
        return StoreName;
    }
    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        System.out.printf("Dessert [name:%s , category:%s , storeName:%s, calories:%.1f]\n",
				Name, category, StoreName, Calorie);
    }
    
    
}
