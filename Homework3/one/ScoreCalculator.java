package Homework3.one;
/*
Nattawat itpma
6509618150
15
 */
import java.util.ArrayList;

public class ScoreCalculator {
    private int ScoreCounter[];
    private ArrayList<StudentScore> scores = new ArrayList<StudentScore>();

    public ScoreCalculator(int max){
        ScoreCounter = new int[max+1]; 
    }
    public void addScore(StudentScore sc){
        scores.add(sc);
        ScoreCounter[sc.getScore()]++;
    }
    public void printList(){    
        System.out.println("--------List of Student Scores --------");
        for(StudentScore i : scores){
            System.out.println(i.getld() + " : " + i.getScore());
        }
        System.out.print("\n");
    }
    public void printStat(){
        int min = 0,max = 0;
        float mix = 0;

        System.out.println("Score Report for "+scores.size()+" Students");

        for(int i = 0; i<scores.size();i++){
            if(scores.get(min).getScore() > scores.get(i).getScore()){
                min = i;
            }
            else if(scores.get(max).getScore() < scores.get(i).getScore()){
                max = i;
            }
            mix += scores.get(i).getScore();
        }

        System.out.println("Min Score is " + scores.get(min).getld() + " : " + scores.get(min).getScore() + " points");
        System.out.println("Min Score is " + scores.get(max).getld() + " : " + scores.get(max).getScore() + " points");
        System.out.println("Average score is "+ Math.round(mix/scores.size()*100)/100.0 + " points");
        System.out.println("Score Distribution");
        for(int i = 0; i<=scores.get(max).getScore();i++){
            System.out.print(i+": ");
            for(int j = 0; j<scores.size();j++){
                if(scores.get(j).getScore() == i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}
