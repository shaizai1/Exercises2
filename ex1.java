import java.util.Scanner;
//1
class weight{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your BMI");
        double bmi = input.nextDouble();

        if (bmi<18.5){
        System.out.print("You are underweight");
        }
        else if (18.5<= bmi && bmi<= 25){
        System.out.print("You are normal");
        }
        else if (25<=bmi && bmi <= 30){
        System.out.print("You are overweight");
        }
        else {
        System.out.print("You are obese");
        }
    }
}

//2
class lottery{
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 90) +10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a two digit number");
        int choice = input.nextInt();

        int lott1 = lottery / 10;
        int lott2 = lottery % 10;

        int choice1 = choice / 10;
        int choice2 = choice % 10;

        System.out.println("Lottery number " + lottery);

        if (choice == lottery){
            System.out.println("Congrats! You have won 10,000 ");
        }
        else if (choice2 == lott1 && choice1 == lott2){
            System.out.println("Congrats! You have won 3,000");
        }
        else if (choice2 == lott2 || choice1 == lott1){
            System.out.println("Congrats! You have won 1,000");
        }
        else {
            System.out.println("better luck next time!");
        }


    
    }
}