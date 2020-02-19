<<<<<<< HEAD
package Assignment2;

public class Whale extends Animal {
    public Whale() {
        this.typeOfAnimal = "whale";
        this.nameOfAnimal = "white";
        this.genderOfAnimal = "Female";
        this.environment = "ocean";
        this.moveSpeed = 12;
    }

    public Whale(String typeOfAnimal, String nameOfAnimal, String genderOfAnimal, String environment, double moveSpeed) {
        super(typeOfAnimal, nameOfAnimal, genderOfAnimal, environment, moveSpeed);
    }

    public void Move() {
        System.out.println("The whale is swimming to you");
        System.out.println();

    }

    public void Sound() {
        System.out.println("~~~~~~");
        System.out.println();
    }

    public void Eat() {
        System.out.println("The whale is eating fish");
        System.out.println();
    }

    public void Sleep() {
        System.out.println(" The whale is sleeping. zzzzzzzz~");
        System.out.println();
    }

    public void Swim() {
        System.out.println("The whale is swimming away from you.");
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
=======
package Assignment2;

public class Whale extends Animal {
    public Whale() {
        this.typeOfAnimal = "whale";
        this.nameOfAnimal = "white";
        this.genderOfAnimal = "Female";
        this.environment = "ocean";
        this.moveSpeed = 12;
    }

    public Whale(String typeOfAnimal, String nameOfAnimal, String genderOfAnimal, String environment, double moveSpeed) {
        super(typeOfAnimal, nameOfAnimal, genderOfAnimal, environment, moveSpeed);
    }

    public void Move() {
        System.out.println("The whale is swimming to you");
        System.out.println();

    }

    public void Sound() {
        System.out.println("~~~~~~");
        System.out.println();
    }

    public void Eat() {
        System.out.println("The whale is eating fish");
        System.out.println();
    }

    public void Sleep() {
        System.out.println(" The whale is sleeping. zzzzzzzz~");
        System.out.println();
    }

    public void Swim() {
        System.out.println("The whale is swimming away from you.");
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
>>>>>>> 54c0caf4cb2055ce7bf3a7e8908f42970735a27c
