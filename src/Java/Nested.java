package Java;
//outer class
public class Nested {  //outer clsas starts

   static int leg=5;//static field
   String len="English";//non static field
    private static int body=36; //privalte field
   private String eye="blue";

    //[non static] inner class

    public class HumanBehaviour{}
    public void speckingLen(){
        System.out.println("I speak:"+len); //we have access nonstatic field in non static method
    }
    //reading private field

    public void body() {
        System.out.println("my body size is : "+body); //
    }
    //reading static field
    public static void leg() {
        System.out.println("my leg size is: "+leg);
    }
    //reading private non-static field
    public void eye() {
        System.out.println("my eye is: "+eye);  //not possible because non-static
    }


   //static inner class
     public static class Humanbody {
        //reading static field
        public void leg() {
            System.out.println("my leg size is: "+leg);
        }
       //reading private field
        public void body() {

            System.out.println("my body size is: "+body); //can read private field from static inner class
        }
     /*  //reading private non-static field
        public void eye() {
            System.out.println("my eye is: "+eye);  //not possible because non-static
        }*?

      /* public void speckingLen(){
           System.out.println("I speak:"+len);
       }     we cant get access non static field in static method*/
    }//static inner class ends

    //obj creation of  inner class


} //outer clsas ends