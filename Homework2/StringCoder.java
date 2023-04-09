package Homework2;
/*
nattawat tipma
6509618150
15
*/
import java.lang.StringBuilder;
public class StringCoder {
    private String code;
    public StringCoder(String code){
        this.code = code;
    }
    public String blowup(){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<code.length()-1;i++){
            if(Character.isDigit(code.charAt(i)) ){
                for(int j = 0; j<code.charAt(i)-'0'; j++){
                    if(Character.isDigit(code.charAt(code.length()-1)) == false){
                        str.append(code.charAt(i + 1));
                    }
                    else{
                        str.append(code.charAt(i + 1));
                    }
                }
            }
            else{
                str.append(code.charAt(i));
            }
        }
        char last = code.charAt(code.length()-1);
        code = str.toString()+last;
        return code;
    }
    public int maxRun(String str){
        int count = 1,max = 0;
        for(int i = 0; i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                max = count;
                count = 1;
            }
        }
        if(max>count){
            return max;
        }
        else{
            return count;
        }
        
    }
    public int maxRun(){
        int count = 1,max = 0;
        for(int i = 0; i<code.length()-1;i++){
            if(code.charAt(i) == code.charAt(i+1)){
                count++;
            }
            else{
                if(count>max)
                    max = count;
                count = 1;
            }
        }
        if(max>count){
            return max;
        }
        else{
            return count;
        }
    }
    public void formStep(){
    int max = maxRun();
    int count = 0;
    char ch = code.charAt(0);
    //print top
        for (int i = 0; i < max; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        //print body 
        for (int i = 0; i < code.length(); i++) {
            //cahr
            if(ch==code.charAt(i)) count++;
            else{
                for (int j = 0; j < maxRun()-count; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < count; j++) {
                    System.out.print(ch);
                }
                System.out.println("|");
                ch=code.charAt(i);
                count=1;
            }
            //digit
            if(i==code.length()-1){
                for (int j = 0; j < maxRun()-count; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < count; j++) {
                    System.out.print(ch);
                }
                System.out.println("|");
            }
        }

        //print lass
        for (int i = 0; i < max; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public String getCode(){
        return code;
    }
    public void setCode(String str){
        code = str;
    }
}
