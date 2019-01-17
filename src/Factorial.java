import java.util.Scanner;

public class Factorial {
    public static void main(String []args){
        Scanner a= new Scanner(System.in);
        System.out.println("Input the no for factorial:");
        int num=a.nextInt();
        int result=1;
        for(int i=1;i<=num;i++){
            result=result*i;

            System.out.println("Factorial of "+ i+" is  "+result);

        }


    }}


