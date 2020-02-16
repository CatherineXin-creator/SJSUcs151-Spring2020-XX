package Assignment2;

public abstract class Animal {
    protected String typeOfAnimal;
    protected String nameOfAnimal;
    protected String genderOfAnimal;
    protected String environment;
    protected double moveSpeed;

    public Animal() {
    }

    public Animal(String typeOfAnimal, String nameOfAnimal, String genderOfAnimal, String environment, double moveSpeed) {
        this.typeOfAnimal = typeOfAnimal;
        this.nameOfAnimal = nameOfAnimal;
        this.genderOfAnimal = genderOfAnimal;
        this.environment = environment;
        this.moveSpeed = moveSpeed;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public String getGenderOfAnimal() {
        return genderOfAnimal;
    }

    public void setGenderOfAnimal(String genderOfAnimal) {
        this.genderOfAnimal = genderOfAnimal;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }


}
