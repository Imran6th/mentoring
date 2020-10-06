package Java;

public class Quiz3_1 {
    int number1=35;
    int number2=78;
    int number3=87;

    public void greatestNumber(){
        if(number1<number2){
            if(number2>number3){
                System.out.println("Greated Number is: "+number2);
            }else {
                System.out.println("Greated Number is: "+number3);
            }
        }else if(number1>number2){
            if(number1>number3){
                System.out.println("Greated Number is: "+number1);
            }else {System.out.println("Greated Number is: "+number3);}
        }


    }

    public static void main(String[] args) {
     Quiz3_1 obj=new Quiz3_1();
     obj.greatestNumber();

    }
}
