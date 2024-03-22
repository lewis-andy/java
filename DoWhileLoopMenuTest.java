/*Menu based program to choose  an option from 
the command line


*/
import java.util.*;
class DoWhileLoopMenuTest{

static Scanner scan = new Scanner(System.in);
public static void main(String[]args){
int option;
do{
System.out.println ("Enter [1] to print interger numbers");
System.out.println ("Enter [2] to print square ");
System.out.println ("Enter [3] to print cube roots");
System.out.println ("Enter [4] to print exit system");

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

}while(true);//end of do-while loop


}//End of public staic main 

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
System.out.print(Math.pow(i,3 ) +"\t";
}
}//End of print cubes

}//End of do while loop menu test