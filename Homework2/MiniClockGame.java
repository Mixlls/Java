package Homework2;

import java.util.Scanner;

public class MiniClockGame {
    private int choose; 
    MiniClockGame clockGame;

    public void play(){
        Scanner input = new Scanner(System.in);
        MiniClock miniClock1 = new MiniClock();
        MiniClock miniClock2 = new MiniClock();
        System.out.println("Game of clock");
        System.out.println("Your answer on clock/period always formatted as H:M");
        do{
            System.out.println("1. Given two clocks, find their difference");
            System.out.println("2. Given one clock and a period, find the time ");
            System.out.println("3. Exit");
            System.out.print("Choose your choice:");
            choose = input.nextInt();
            if(choose>3 || choose<1){
                System.out.println("I don't understand your choice; select just 1-3 ");
            }
            if(choose == 1){
                System.out.println("From Time "+miniClock1.ToString()+" to "+miniClock2.ToString()+" of next day");
                System.out.println("How many hour(s) and minute(s) passed by?");
                for(int i = 0; i<3;i++){
                    int hour = 0,minute = 0;
                    String shour,sminute;
                    System.out.print("Round "+(i+1)+"/3: ");
                    shour = input.nextLine();
                    shour.split(":");
                    MiniClock miniClockPaly = new MiniClock(hour,minute);
                    miniClockPaly.getHour();
                    miniClockPaly.getMinute();
                    MiniClock check = new MiniClock(hour, minute);
                    if(miniClockPaly.compareTo(miniClockPaly) == 0){
                        System.out.println("From Clock: "+miniClock1.ToString()+" To "+miniClock2.ToString()+",difference = ");
                    }
                }
            }
        }
        while(choose != 3);
    }

    public int getChoose() {
        return choose;
    }
    public void setChoose(int choose) {
        this.choose = choose;
    }
    public static void main(String[] args) {
        MiniClockGame player = new MiniClockGame();
        player.play();
    }
}
