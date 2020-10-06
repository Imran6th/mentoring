package Java;

public class Mobile {

    String brand;
    String model;
    int price;
    boolean ios;

    public Mobile(String brand,String model){
        this.brand=brand;
        this.model=model;
        System.out.println("Mobile brand is : "+ this.brand +"  " +"Mobile model is : " + this.model);
    }
    public Mobile(String brand,String model,int price,boolean ios){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.ios=ios;
        System.out.println("Mobile brand is : "+ this.brand +"  " +"Mobile model is : " + this.model +"  "+"Mobile price is :  " + this.price + "Mobile with IOS :  " +this.ios); }
    public static void main(String[] args) {
        Mobile mb=new Mobile("Samsung","S10");
        Mobile ml=new Mobile("IPhone","xr",700,true);
    }
}