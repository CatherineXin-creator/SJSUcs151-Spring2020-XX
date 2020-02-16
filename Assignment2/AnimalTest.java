package Assignment2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("The name of the dog is " + dog.getNameOfAnimal() + ".");
        dog.greetHuman();
        dog.bark();

        Cat cat = new Cat();
        System.out.println("This is a " + cat.genderOfAnimal + " cat.");
        cat.greetHuman();
        cat.Scratch();

        Racoon racoon = new Racoon();
        System.out.println("The moving speed of racoon is about " + racoon.moveSpeed + " mph.");
        racoon.Eat();
        Whale whale = new Whale();
        System.out.println("The whale is living in the " + whale.environment + ".");
        whale.Swim();

    }

}
