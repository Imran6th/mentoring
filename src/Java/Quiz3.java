package Java;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {

        Scanner se=new Scanner(System.in);
        System.out.println("Enter 1-7 int number");
        int input=se.nextInt();

        if(input==1){
            System.out.println("Today is Monday");
        }else if (input==2){
            System.out.println("Today is Tuesday");
        }else if (input==3){
        System.out.println("Today is Wednesday");
        }else if (input==4){
            System.out.println("Today is Thurday");
        }else if (input==5){
            System.out.println("Today is Friday");
        }else if (input==6){
            System.out.println("Today is Saturday");
        }else{
            System.out.println("Today is Sunday");
        }

    }



}
