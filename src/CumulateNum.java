import java.util.Scanner;

public class CumulateNum {
    //Have the user enter a number and print the sum of all numbers from that inputted value to 1.
    public static void main(String[] args) {
        int sum = 0;
        int num;
        System.out.println("Give your no:");
        Scanner keyboard = new Scanner(System.in);

        num = keyboard.nextInt();
        for (int i = 1; i <= num; i++) {
            sum = sum + i;}
        System.out.println(sum);

    }
}