package Homework2;
/*
nattawat tipma
6509618150
15
*/
public class DessertList {
    private String dessertList;
    private Dessert first;
    private Dessert second;
    private Dessert third;
    public DessertList(){
        dessertList = "";
        first = new Dessert();
        second = new Dessert();
        third = new Dessert();
    }
    public void add(Dessert Dessert){
        dessertList += "\t"+Dessert.getName()+" "+Dessert.getCalorie()+"\n";
        if(Dessert.getCalorie() >= first.getCalorie()){
            third = second;
            second = first;
            first = Dessert;
        }
        else if(Dessert.getCalorie() >= second.getCalorie()){
            third = second;
            second = Dessert;
        }
        else if(Dessert.getCalorie() >= third.getCalorie()){
            third = Dessert;
        }
        
    }
    public void printInfo(){
        System.out.println("List of desssert: \n"+ dessertList);
        System.out.print("Top 3 high calories: \n1.Dessert [");
        first.printDessert();
        System.out.print("2.Dessert [");
        second.printDessert();
        System.out.print("3.Dessert [");
        third.printDessert();

    }

}
