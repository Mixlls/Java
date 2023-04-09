package Homework1;
//nattawat tipma
//6509618150
//15
public class DessertTest {
        public static void main(String[] args) {
            Dessert food1 = new Dessert();
            Dessert food2 = new Dessert();
            Dessert food3 = new Dessert();
            Dessert food4 = new Dessert();
            Dessert food5 = new Dessert();
            food1.setDessert("Honey Toast","Bakery","After You",900.5);
            food2.setDessert("Tokyo Sundae","Ice Cream","Bake a Wish",500.0);
            food3.setDessert("Classic Tiramisu","Bakery","After You",350);
            food4.setDessert("Blueberry Cheesecake","Bakery","After You",450);
            food5.setDessert("Chocolate Fondant","Bakery","After You",400);
            food1.printDessert();
            food2.printDessert();
            food3.printDessert();
            food4.printDessert();
            food5.printDessert();
    }
}
