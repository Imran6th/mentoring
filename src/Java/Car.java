package Java;

public class Car {
    int modelyear;
    String modelname;

    public  Car(int year,String name){

    this.modelyear=year;
    this.modelname=name;

    }

    public static void main(String[] args) {
        Car myCar=new Car(2016,"rogue");
        System.out.println(myCar.modelyear+" "+myCar.modelname);
    }

}
