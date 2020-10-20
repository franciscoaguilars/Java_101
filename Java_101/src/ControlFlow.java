public class ControlFlow {
    public static void main(String[] args) {
        boolean test = true;


        if (test){
            System.out.println("This is true.");
        } else {
            System.out.println("This is false. ");
        }

        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if (currentTemp < favoriteTemp - 30){
            opinion = "It's pretty cold";
        }else if(currentTemp < favoriteTemp - 20){
            opinion = "It's kinda cold..";
        }else if (currentTemp > favoriteTemp + 10){
            opinion = "It's hot out.";
        } else{
            opinion = "It's a beautiful day";
        }

        System.out.println(opinion);

        
    }

    
}
