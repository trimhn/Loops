import java.util.Scanner;

public class InputOne {
    //Have the user input a number and print all numbers from that input value to 1.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the no:");
        int num;
    num=keyboard.nextInt();
        for(int i=num; i>=1;i--)
            System.out.println(i);
        }

    }