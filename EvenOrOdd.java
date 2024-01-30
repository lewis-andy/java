import java.util.Scanner;

public class EvenOrOdd {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Any number: ");
            long num = scanner.nextLong();
            if(num%2==0){
                System.out.println("even number");
            }

            else{
                System.out.println("odd number");
            }
        }

}
