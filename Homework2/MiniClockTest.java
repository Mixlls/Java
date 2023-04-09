package Homework2;
/*
nattawat tipma
6509618150
15
*/
public class MiniClockTest {
    public static void main(String[] args) {
        MiniClock miniClock = new MiniClock(7,56);
        MiniClock miniClock2 = new MiniClock();
        System.out.println(miniClock.ToString());
        System.out.println(miniClock2.ToString());
        System.out.println(miniClock2.compareTo(miniClock));
    }
    
}
