//Code to calculate both Area and perimeter of a rectangle.
import java.util.Scanner;
public class code2 {
    public static void main(String[]args){
        Scanner myinput =new Scanner(System.in);//
        short m=30;//For length
        short q=50;//For width
        int area=m*q;
        int perimeter=2*(m+q);
        System.out.println("The area of the rectangle is:\t"+area);
        System.out.println("The perimeter of the rectangle is:\t"+perimeter);
        //Here the user is promted to enter the numbers to the command line.
        System.out.println("Enter the value of length:");
        m=myinput.nextShort();
        System.out.println("Enter the value of width:");
        q=myinput.nextShort();
        area=m*q;
        perimeter=2*(m+q);
        System.out.println("The area of the rectangle is:\t"+area);
        System.out.println("The perimeter of the rectangle is:\t"+perimeter);


    }
}
