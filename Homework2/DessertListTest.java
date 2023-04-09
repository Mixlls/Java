package Homework2;
/*
nattawat tipma
6509618150
15
*/
public class DessertListTest {
    public static void main(String[] args) {
        DessertList dessertList = new DessertList();
        Dessert food1 = new Dessert();
        Dessert food2 = new Dessert();
        Dessert food3 = new Dessert();
        Dessert food4 = new Dessert();
        Dessert food5 = new Dessert();
        food1.setDessert("Honey Toast","Bakery","After You",350.0);
        food2.setDessert("Tokyo Sundae","Ice Cream","Bake a Wish",500.0);
        food3.setDessert("Classic Tiramisu","Bakery","After You",900.5);
        food4.setDessert("Blueberry Cheesecake","Bakery","After You",450.0);
        food5.setDessert("Chocolate Fondant","Bakery","After You",400.0);
        dessertList.add(food1);
        dessertList.add(food2);
        dessertList.add(food3);
        dessertList.add(food4);
        dessertList.add(food5);
        dessertList.printInfo();
    }
}
