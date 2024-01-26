/*
The exchange rate of a Kenyan shilling to Uganda shilling is 1Ksh=24Ush. And an American
dollar to Uganda shillings is 1$=1,950Ush. Write a program that will prompts for any amount of
Kenya shillings and output the corresponding American dollars.
*/
// in this file we are going to use the scanner 
import java.util.Scanner;
class converter{
public static void main (String[]args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter Amount in kenyan shillings:");
double ksh= scan.nextDouble();

 double usd = ksh/160;

System.out.println("Amount in dollars is: " + usd);

}
}
