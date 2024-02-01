package chapter06;

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person("계백");

        System.out.println(person.nation);
        System.out.println(person.name);

        // person.nation = "을지문덕"; // final nation
    }
}
