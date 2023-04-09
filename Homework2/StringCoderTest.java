package Homework2;
/*
nattawat tipma
6509618150
15
*/
import java.util.Scanner;
public class StringCoderTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        String str,code;
        do{
            System.out.print("Enter your string: ");
            code = input.nextLine();
            StringCoder stringCoder = new StringCoder(code);
            System.out.println("Round "+count+": "+stringCoder.getCode());
            System.out.println("blowUp "+stringCoder.blowup());
            System.out.println("maxRun "+stringCoder.maxRun(code));
            System.out.println("maxRun blowUp "+stringCoder.maxRun());
            stringCoder.formStep();
            System.out.print("Continue (y/n)?");
            str = input.nextLine();
            count++;
        }while(str.compareTo("y") == 0);
        System.out.println("Bye!");
        

    }
}
