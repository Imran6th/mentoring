package Java;

public class Cycle {

    int modelYear;
    String ModelName;

    public Cycle(int year,String name){

        modelYear=year;
        ModelName=name;

    }

    public static void main(String[] args) {
      Cycle myCycle=new Cycle(2020,"Herculys");

        System.out.println(myCycle.modelYear+" "+myCycle.ModelName);
    }

}

