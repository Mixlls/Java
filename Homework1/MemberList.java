package Homework1;
//Nattawat tipma
//6509618150
//15
public class MemberList {
    private String memberNameList = "";
    private String groupName;
    private int amount = 0; 
    public MemberList(String groupName){
        this.groupName = groupName+"\n";
    }
    public void addMember(Person p){
        memberNameList += p.getName()+" : "+p.getGender()+"\n";
        amount++;
    }
    public void printInfo(){
        System.out.println("Group: "+groupName);
        System.out.println(memberNameList);
        System.out.println("Total: "+amount);
    }
    public void addMember(String name, String gender) {
    }
}
