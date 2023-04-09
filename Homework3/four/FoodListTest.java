package Homework3.four;
/*
Nattawat itpma
6509618150
15
 */
public class FoodListTest {
	public static void main(String[] args) {
		FoodList fl = new FoodList();
		fl.addFood(new Dessert("Vanilla Layer Cake ", "Cake", "S&P", 800));
		fl.addFood(new Meal("Green Salad", "S&P", 250, true));
		fl.addFood(new Dessert("Croissant ", "Bakery", "S&P", 300));
		fl.addFood(new Dessert("Honey Toast", "Bakery", "After You", 950));
		fl.addFood(new Meal("Fried Calamari", "On the table", 850, false));
		fl.addFood(new Dessert("Strawberry Panna Cotta","Sweet","On the table", 400));
		fl.addFood(new Meal("Fried Tofu", "On the table", 150, true));
		fl.addFood(new Dessert("Red Bean Moji", "Japanese", "Sukishi", 650));
		fl.addFood(new Meal("Pork Steak", "Sukishi", 850, false));
		fl.print();
		System.out.println ("-------- S&P -------------------");
		FoodList spFood = fl.getFoodSoldAt("S&P");
		spFood.print();
		System.out.println ("-------- Random 3 -------------------");
		FoodList ranFood = fl.getRandomFood(3);
		ranFood.print();
		System.out.println ("-------- Vegetarian Food -------------------");
		FoodList veggie = fl.getVegetarianFood();
		veggie.print();
		System.out.println ("-------- After Remove over 750 -------------------");
		fl.removeFoodOver(750);
		fl.print();
	}
}
