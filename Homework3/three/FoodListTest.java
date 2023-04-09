package Homework3.three;
/*
Nattawat itpma
6509618150
15
 */
public class FoodListTest{
    public static void main(String[] args) {
        FoodList fl = new FoodList();
        fl.addFood(new Dessert("Vanilla Layer Cake ", "Cake", "S&P", 800));
        fl.addFood(new Dessert("Croissant ", "Bakery", "S&P", 300));
        fl.addFood(new Dessert("Honey Toast", "Bakery", "After You", 950));
        fl.addFood(new Dessert("Strawberry Panna Cotta","Sweet","Onthe table", 400));
        fl.addFood(new Dessert("Red Bean Moji", "Japanese", "Sukishi", 650));
        fl.print();
        System.out.println ("--------S&P -------------------");
        FoodList spFood= fl.getFoodSoldAt("S&P");
        spFood.print();
        System.out.println ("--------Random 3 -------------------");
        FoodList ranFood= fl.getRandomFood(3);ranFood.print();
        System.out.println ("--------AfterRemove over 750 -------------------");
        fl.removeFoodOver(750);fl.print();
    }
}