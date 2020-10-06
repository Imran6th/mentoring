package Java;

import java.util.Scanner;

public class Quiz4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first number");
        int input1=sc.nextInt();
        System.out.println("Enter your 2nd number");
        int input2=sc.nextInt();
        System.out.println("Enter your 3rd number");
        int input3=sc.nextInt();

        if (input1<input2 && input2<input3) {
            System.out.println("increasing");

        }else if (input1>input2 && input2>input3) {
            System.out.println("Decreasing");

        }else {System.out.println("Neither");}
        }


    }


