package Java;

import java.util.Scanner;

public class Scanner1 {



    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name=input.nextLine();
        System.out.println("Welcome:"+name);

    }


}

