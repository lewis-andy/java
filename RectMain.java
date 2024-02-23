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
public int area(){
return width*length;
}

}//End of class Rectanglee

//class ReactMain to implement the rectangle class
public class RectMain{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
Rectangle r1 = new Rectangle();

System.out.println("The Area of the rectangele is " + r1.area());
System.out.println("Enter the width:");
int wid = scan.nextInt();
System.out.println("Enter the length");
int len = scan.nextInt();
Rectangle r2 = new Rectangle(wid, len);
System.out.println("The area of the new Rectangle is:" + r2.area());
}//end of public void
}// End of public class rectmain