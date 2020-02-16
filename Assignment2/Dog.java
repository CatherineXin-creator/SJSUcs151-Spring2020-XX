package Assignment2;

public class Dog extends Animal implements Domesticated {

    public Dog() {
        this.typeOfAnimal = "dog";
        this.nameOfAnimal = "lucky";
        this.genderOfAnimal = "Male";
        this.environment = "home";
        this.moveSpeed = 28;
    }


    public void Move() {
        System.out.println("The dog is walking to you");
        System.out.println();

    }

    public void Sound() {
        System.out.println("wang~");
        System.out.println();
    }

    public void Eat() {
        System.out.println("The dog is eating ice cream");
        System.out.println();
    }

    public void Sleep() {
        System.out.println(" The dog is sleeping. zzzzzzzz~");
        System.out.println();
    }

    public void bark() {
        System.out.println("(barking) wang wang wang wang wang~~~~~~~~~~");
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void walk() {
        System.out.println("The dog is walking to you slowly.");
    }

    @Override
    public void greetHuman() {
        System.out.println("The dog is wagging his tail at you");
    }
}
