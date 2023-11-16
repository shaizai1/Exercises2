import java.util.Scanner;
//1
class game{
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int randomnum = (int) (Math.random() * (max - min + 1 + min));

        Scanner input = new Scanner(System.in);
        
        boolean win = false;

        while (win == false) {
        System.out.print("Enter a number between 0 and 100  ");
        int choice = input.nextInt();
        
        if (choice == randomnum)
        win = true;

        else if (choice < randomnum) 
        System.out.print("higher!");

        else if (choice > randomnum) 
        System.out.print("lower!");


        }

        System.out.println("well done!");

    }
}
//2

class number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int count = 0;
        double sum = 0;
        double average = 0;
        int number;
        System.out.print("Enter any number of inegers, to quit enter 0");

        do {
            number = input.nextInt();
            sum += number;
            count++;
            average = sum/(count-1);
            if(number > 0)
            positives ++;
            else if(number<0)
            negatives++;
            else{
            }
        } while (number != 0);{
        System.out.println("The number of positives is:" + positives);
        System.out.println("The number of negatives is:" + negatives);
        System.out.println("The sum of all entered numbers is:" + sum);
        System.out.println("The average of all entered numbers is:" + average);
        }
    }
}

//3
class university{
    
    public static void main(String[] args) {
        double start = 10000;
        double rate = 1.05;
        double tuition = start;

        double decade = 0;
        double total = 0;

        for (int count = 1; count <=14; count++) {
            tuition = tuition * rate;
            if (count == 10) {
                decade = tuition;
            }
            
            if (count >= 11) {
                total += tuition;
            }
        }
        System.out.println("Tuition in 10 years: " + decade);
        System.out.println("From year 11 onwards, four years of tuition would be: " + total);

    }
}

class highest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:  ");
        int student = input.nextInt();
        String nameTwo = "";

        String highestScorer = "";
        int highScore = Integer.MIN_VALUE;
        int scoreTwo = 0;

        for (int i =0; i < student; i++) {
            System.out.println("Enter student name: " + (i+1) +":");
            String name = input.next();

            System.out.println("Enter score: " + (i+1) + ":");
            int score = input.nextInt();

            if (score > highScore) {
                highScore = score;
                highestScorer = name;
            }
            else if (scoreTwo < score) {
                scoreTwo = score;
                nameTwo = name;
            }
        }
        System.out.println("The highest scoring student is: " + highestScorer);
        System.out.println("The second highest scoring student is: " + nameTwo);

    }

}