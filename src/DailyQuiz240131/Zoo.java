package DailyQuiz240131;

public class Zoo {
    public static void main(String[] args) {
        Animal animalA = new Animal();
        animalA.setName("dog");

        Animal animalB = new Animal();
        animalB.setName("cat");

        Animal.getName(animalA);
        Animal.getName(animalB);
        animalB.sleep();
    }
}
