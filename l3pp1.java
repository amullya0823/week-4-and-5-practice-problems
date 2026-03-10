import java.util.Scanner;

public class l3pp1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int[] frequency = new int[10];
        int index = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Store digits in array
        while(number != 0 && index < maxDigits) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Count frequency
        for(int i = 0; i < index; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        // Display frequency
        for(int i = 0; i < 10; i++) {
            if(frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

    }
}