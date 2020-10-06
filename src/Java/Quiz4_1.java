package Java;

import java.util.Scanner;

public class Quiz4_1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        if (age>=18 ){
            System.out.println("You are Eligible to Vote");
        }else {
            System.out.println("You are not Eligible to Vote");
        }
    }
}
