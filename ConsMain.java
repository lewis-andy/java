// A simple constructor
class MyClass{
int x;
//Following is theh constructor
MyClass(){
x = 10;
}

// A method to set x
public void setx( int z){
x = z;
}
//A method to get x
public int getx(){
return x;
}//End for getting x


}//End of myclass


//calling constructor too initialize objects as follows
public class ConsMain{
public static void main(String args[]){
MyClass t1 = new MyClass();
MyClass t2 = new MyClass();
System.out.println(t1.getx() + " " + t2.getx());
t2.setx(34);//setting the value of x using the setx method
System.out.println(t1.getx()*t2.getx());

}//End of public void

}//End of main class