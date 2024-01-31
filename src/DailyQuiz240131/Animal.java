package DailyQuiz240131;

public class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

    static void getName(Animal animal) {
        System.out.println("This animal is " + animal.name);
    }

    void sleep() {
        System.out.println(name + " is sleeping...zzz");
    }

}
