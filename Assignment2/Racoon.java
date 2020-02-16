package Assignment2;

public class Racoon extends Animal {
    public Racoon() {
        this.typeOfAnimal = "racoon";
        this.nameOfAnimal = "Kitty";
        this.genderOfAnimal = "Female";
        this.environment = "forest";
        this.moveSpeed = 10;
    }

    public Racoon(String typeOfAnimal, String nameOfAnimal, String genderOfAnimal, String environment, double moveSpeed) {
        super(typeOfAnimal, nameOfAnimal, genderOfAnimal, environment, moveSpeed);
    }

    public void Move() {
        System.out.println("The racoon is walking to you.");
        System.out.println();

    }

    public void Sound() {
        System.out.println("si si si~");
        System.out.println();
    }

    public void Eat() {
        System.out.println("The racoon is eating nuts. ");
        System.out.println();
    }

    public void Sleep() {
        System.out.println(" The racoon is sleeping. zzzzzzzz~");
        System.out.println();
    }

    public void Scratch() {
        System.out.println("The racoon is scratching one the tree.");
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
