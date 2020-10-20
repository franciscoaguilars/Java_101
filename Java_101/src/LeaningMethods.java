public class LeaningMethods {
    public static void main(String[] args) {
        System.out.println("I'm on main!");
        MyUtils.PrintGarbage();
        MyUtils.PrintStuff("Im on utils!!");
        int mySum = MyUtils.sum2Nums(10, 30);
        System.out.println(mySum);
    }

}
