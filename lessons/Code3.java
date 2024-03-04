/*For this program, You will find the code to calculate
marks for undergraduate students in kenyan universities.
*/
import java.util.Scanner;

public class Code3 {
    public static void main(String[]args){

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter Your marks:");
        double marks = Scanner.nextDouble();

      //  char grade= (marks>=40)?'A':'F';
        if (marks<=39){
            System.out.println("Your grade is: F You have to take a supplementary or retake." );
        }
        else if(marks>=40 && marks<=49) {
            System.out.println("Your grade is: D" );
        }
        else if(marks>=50 && marks<=59) {
            System.out.println("Your grade is: C" );
        }
        else if(marks>=60 && marks<=69) {
            System.out.println("Your grade is: B" );
        }
        else if(marks>=70 && marks<=100) {
            System.out.println("Your grade is: A" );
        }

        else{
            System.out.println("This is an Error You cannot score more than 100%");
        }
      //  System.out.println("The grade is : "+ grade);

    }
}

