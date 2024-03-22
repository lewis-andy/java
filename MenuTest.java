import java.util.*;
class MenuTest{
static Scanner scan = new Scanner(System.in);
public static void main(String[]args){
menu();//Calling the recurssive method

}//End of main function

public static void menu(){
int option;
System.out.println("Enter[1] to print Integer Numbers");
System.out.println("Enter[2] to print Squares");
System.out.println("Enter[3] to print cubes");
System.out.println("Enter[4] to Exit the system");

option = scan.nextInt();
switch(option){

case 1:
printInteger();
break;

case 2:
printSquares();
break;

case 3:
printCubes();
break;

case 4:
System.out.println("you chose to Exit the system");
System.exit(0);
break;
default:
System.out.println("Invalid option");
break;


}//End of switch
menu();
}//End of menu method
//Method section

public static void printInteger(){
for (int i=0; i<10; i++){
System.out.print(i + "\t");
}
System.out.println();

}//end of print interger

public static void printSquares(){
for (int i=0; i<10; i++){
System.out.print(Math.pow(i, 2 )+"\t");
}
System.out.println();
}//End of print squares
public static void printCubes(){
for( int i=0;  i<=10; i++){
System.out.print(Math.pow(i,3)+"\t");
}
System.out.println();
}//End of print cubes
}//End of main class menu test