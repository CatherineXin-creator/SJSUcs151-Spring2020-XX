package Assignment2;

public class Cat extends Animal implements Domesticated {
    public Cat() {
        this.typeOfAnimal = "cat";
        this.nameOfAnimal = "Kitty";
        this.genderOfAnimal = "Female";
        this.environment = "home";
        this.moveSpeed = 31;
    }

    public Cat(String typeOfAnimal, String nameOfAnimal, String genderOfAnimal, String environment, double moveSpeed) {
        super(typeOfAnimal, nameOfAnimal, genderOfAnimal, environment, moveSpeed);
    }

    public void Move() {
        System.out.println("The cat is running to you");
        System.out.println();

    }

    public void Sound() {
        System.out.println("miao~");
        System.out.println();
    }

    public void Eat() {
        System.out.println("The cat is eating fish");
        System.out.println();
    }

    public void Sleep() {
        System.out.println(" The cat is sleeping. zzzzzzzz~");
        System.out.println();
    }

    public void Scratch() {
        System.out.println("The cat is scratching one the tree.");
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void walk() {
        System.out.println("The cat is running to you");
    }

    @Override
    public void greetHuman() {
        System.out.println("The cat is nuzzling up to your leg.");
    }
}
