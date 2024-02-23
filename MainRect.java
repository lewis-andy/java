import java.util.Scanner;
class Rectangle{
int width; 
int length;
//Constructor to initialize the class datamembers
Rectangle(){
width = 10;
length = 15;
}
 
//Parameterized constractor
Rectangle(int w,int l){
width = w;
length = l;
}
Rectangle(int w,int l) {
width=w;
length=l;
}
public int area(){ return width*length;}
}//End of class Rectanglee

public class MainRect{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Enter The width");
int wid = scan.nextInt();
System.out.println("Enter the Length");
int len = scan.nextInt();
Rectangle  = Rectangle(wid,len);
printRectangle(rect);
//calling method and passing into object

}//end of public static void



//a method that prints rectangle details
public static void printRectangle(Rectangle R){

System.out.print("The width of the rectangle is " +R.getwidth());
System.out.print("The Length of the rectangle is " +R.getlength());
System.out.print("The area of the rectangle is " +R.area());
}//End of print rectangle
}//End of public class rectmain