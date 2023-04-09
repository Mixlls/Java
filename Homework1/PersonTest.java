package Homework1;
//Nattawat tipma
//6509618150
//15
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jane",Person.FEMALE,45.0,153.0);
        Person person2 = new Person("Jack",Person.MALE,70.0,175.0);
        Person person3 = new Person("Kate",Person.FEMALE,40.0,157.0);
        System.out.println(person1.getDetail());
        System.out.println(person2.getDetail());
        System.out.println(person3.getDetail());
    }
}
// : gender=female,  weight=45.0 kg,  99.21 lb. height=153.0 cm, 60.24 inches
// Jack: gender=male,  weight=70.0 kg,  154.32 lb. height=175.0 cm, 68.9 inches
// Kate: gender=female,  weight=40.0 kg,  88.18 lb. height=157.0 cm, 61.81 inches