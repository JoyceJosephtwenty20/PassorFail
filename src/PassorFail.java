import java.util.Scanner;

public class PassorFail {
    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        int score;

        do{
            System.out.println("Enter a student's test score. Type -1 to quit.");
            score = keybd.nextInt();

            if (score >= 60){
                System.out.println("Student passed.:)");}

            else if (score <60 && score > 0 ){
                System.out.println("Student failed.");}

            else {
                System.out.println("I see you want close the application!!");
            }

        } while (score != -1);

        System.out.println("Thank you for using the Pass or Faile test system!:)");
    }
}