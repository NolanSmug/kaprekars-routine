import java.util.Arrays;
import java.io.*;

public class Kaprekar {
    public static void main(String[] args) throws IOException {
        PrintWriter	pw	= new PrintWriter("kaprekar_numbers.csv");
        pw.write("Number,Steps\n");

        for (int i = 1000; i < 10000; i++) {
            int steps = kaprekar(i)
            pw.printf("%d,%s\n", i, steps == -1) ? "invalid number" : steps + (steps == 1 ? " step" : " steps"));
        }
        pw.close();
    }

    private static int kaprekar(int num) {
        if (num % 1111 == 0) {
            return -1;
        }
        if (num == 6174) {
            return 0;
        }

        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num = num / 10;
        }

        Arrays.sort(digits);
        reverse(digits);

        int sorted = 0;
        for (int digit : digits) {
            sorted = sorted * 10 + digit;
        }

        int reverse = Integer.parseInt(new StringBuilder(Integer.toString(sorted)).reverse().toString());
        int difference = Math.abs(sorted - reverse);

        if (difference == 6174) {
            return 1;
        }

        return 1 + kaprekar(difference);
    }

    private static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

    }
}
