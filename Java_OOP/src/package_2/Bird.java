package package_2;

public class Bird extends Animal implements Flyable{

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    

    public void fly(){
        System.out.println("I'm flying");
    }

    public int age(){
        return age;
    }

    public void move() {
        System.out.println("The fish is swimming");
    }
}
