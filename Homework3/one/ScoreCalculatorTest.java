package Homework3.one;
/*
Nattawat itpma
6509618150
15
 */
public class ScoreCalculatorTest {
        public static void main(String[] args) {
        ScoreCalculator  sc = new ScoreCalculator(5);
        sc.addScore(new StudentScore("3898175",2));
        sc.addScore(new StudentScore("3898177",5));
        sc.addScore(new StudentScore("3898179",4));
        sc.addScore(new StudentScore("3898270",4));
        sc.addScore(new StudentScore("3898267",3));
        sc.addScore(new StudentScore("3898269",0));
        sc.addScore(new StudentScore("3898274",1));
        sc.addScore(new StudentScore("3898275",0));
        sc.addScore(new StudentScore("3898279",5));
        sc.addScore(new StudentScore("3898865",2));
        sc.addScore(new StudentScore("3898673",3));
        sc.addScore(new StudentScore("3898677",2));
        sc.addScore(new StudentScore("3898679",1));
        sc.printList();
        sc.printStat();
    }
}
