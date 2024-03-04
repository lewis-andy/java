public class OddNumbersSum {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        do {
            if (number % 2 != 0) {
                System.out.println(number);
                sum += number;
            }
            number++;
        } while (number <= 100);

        System.out.println("Sum of odd numbers: " + sum);
    }
}
