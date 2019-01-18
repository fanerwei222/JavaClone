package main.clone;

import main.stream.object.Person;

public class TestClone
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person person1 = new Person("fanwei", 5, "");
        Person person2 = person1;

        System.out.println("----------*-----------*-----------------------------");
        System.out.println("person1 : " + person1.getAge() + person1.getName());
        System.out.println("person2 : " + person2.getAge() + person2.getName());

        person2.setAge(9);
        person2.setName("****hello fanwei");

        System.out.println("----------*-----------*-----------------------------");
        System.out.println("person1 : " + person1.getAge() + person1.getName());
        System.out.println("person2 : " + person2.getAge() + person2.getName());
        System.out.println("----------*-----------*-----------------------------");
        Person person3 = (Person) person1.clone();
        System.out.println("person1 == person3 ??  : " + (person3 == person1));
        System.out.println("person1 : " + person1.getAge() + person1.getName());
        System.out.println("person3 : " + person3.getAge() + person3.getName());
        person3.setAge(16);
        person3.setName("----wobushi fanwei");
        System.out.println("person1 : " + person1.getAge() + person1.getName());
        System.out.println("person3 : " + person3.getAge() + person3.getName());
        System.out.println("----------*-----------*-----------------------------");

    }
}




/** ******/
----------*-----------*-----------------------------
person1 : 5fanwei
person2 : 5fanwei
----------*-----------*-----------------------------
person1 : 9****hello fanwei
person2 : 9****hello fanwei
----------*-----------*-----------------------------
person1 == person3 ??  : false
person1 : 9****hello fanwei
person3 : 9****hello fanwei
person1 : 9****hello fanwei
person3 : 16----wobushi fanwei
----------*-----------*-----------------------------
/** ******/

