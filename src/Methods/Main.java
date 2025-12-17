package Methods;

public class Main{
    public static void main(String[] args){

        // method = a block of reusable code that is executed when called ()

        // methods are unfamiliar with other variables declared in other methods


        double result = square(3);
        System.out.println(result);

    }
    static void happyBirthday(String birthdayboi, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", birthdayboi);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
}