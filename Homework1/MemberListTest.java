package Homework1;
//Nattawat tipma
//6509618150
//15
public class MemberListTest {
    public static void main(String[] args) {
        MemberList group = new MemberList("Scuba Divinf Fun");
        Person person1 = new Person("Jane",Person.FEMALE,0,0);
        group.addMember(person1);
        Person person2 = new Person("Jack","MALE",0,0);
        group.addMember(person2);
        Person person3 = new Person("Kate","FEMALE",0,0);
        group.addMember(person3);
        group.printInfo();
    }
}
