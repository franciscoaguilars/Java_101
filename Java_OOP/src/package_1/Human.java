package package_1;


public class Human {
    // Attributes
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + " years old");
    }

    public void eat(){
        System.out.println("Eating!");
    }

    public void walk(){
        System.out.println("Walking!");
    }

    public void work(){
        System.out.println("Working");
    }
}
