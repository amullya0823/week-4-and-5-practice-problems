import java.util.Scanner;

public class l1pp5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int[] result = new int[4];

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        int index = 0;

        for(int i = 6; i <= 9; i++) {
            result[index] = number * i;
            index++;
        }

        index = 0;

        for(int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index]);
            index++;
        }

    }
}