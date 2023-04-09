package Homework2;
/*
nattawat tipma
6509618150
15
*/
import java.util.Random;
public class MiniClock {
    private int hour;
    private int minute;
    public MiniClock(){
        randomTime();
    }
    public MiniClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        if(hour>24&&minute>59){
            this.hour = 00;
            this.minute = 00;
        }
    }
    public void randomTime(){
        Random random = new Random();
        hour = random.nextInt(24);
        minute = random.nextInt(60);
    }
    public int compareTo(MiniClock another){
        return ToString().compareTo(another.ToString());
    }
    public String ToString(){
        return String.format("Clock: %02d:%02d", hour, minute);
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
}
