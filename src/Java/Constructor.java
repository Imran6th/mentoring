package Java;

public class Constructor {

    String Name;
    String address;
    char Gender;
    int age;
    double contactnumer;

    public Constructor(String name){
        this.Name=name;
        System.out.println("My name is"+ this.Name);
    }
    public Constructor(String name,String address){
        this.Name=name;
        this.address=address;
        System.out.println("My name is"+ this.Name +"  "+"My address is"+ this.address);
    }
    public Constructor(String name,String address,char Gender){
        this.Name=name;
        this.address=address;
        this.Gender=Gender;
        System.out.println("My name is"+ this.Name +"  "+"My address is"+ this.address+"  "+"My Gender is"+ this.Gender);
    }
    public Constructor(String name,String address,char Gender,int age,int contactnumer){
        this.Name=name;
        this.address=address;
        this.Gender=Gender;
        this.age=age;
        this.contactnumer=contactnumer;
        System.out.println("My name is"+ this.Name+"  "+"My address is"+ this.address+"  "+"My Gender is"+ this.Gender+"  "+"My age is"+ this.age+"  "+"My contact number is"+ this.contactnumer);
    }

    public static void main(String[] args) {
        Constructor cn=new Constructor("Annie");
        Constructor ss=new Constructor("Runa","Queens,NYC" );
        Constructor jn=new Constructor("Rois","Bronx,NYC", 'M');
        Constructor sm=new Constructor("Jonah","Seattle,Washington", 'M',42,1711081078);

    }
}
