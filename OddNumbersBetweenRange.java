public class OddNumbersBetweenRange {
    public static void main(String[] args) {
        int number = -27;

        System.out.println("Odd numbers between -27 and 78:");

        do {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 78);
    }
}
