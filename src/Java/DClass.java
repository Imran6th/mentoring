package Java;

public class DClass {




    public static void main(String[] args) {
        //obj creation of outer class
        Nested mv=new Nested();

        //obj creation of static inner class
        Nested.Humanbody inner=new Nested.Humanbody();
        inner.body();
        inner.leg();






    }
}
