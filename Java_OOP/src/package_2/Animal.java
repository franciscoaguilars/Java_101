package package_2;

public abstract class Animal {
    int age;
    String gender;
    int weightInLbs;

    public Animal(int age, String gender, int weightInLbs){
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat(){
        System.out.println("Eating..");
    }

    public void nap(){
        System.out.println("Sleeping");
    }

    public abstract void move();
}
