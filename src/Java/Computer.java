package Java;

public class Computer {
    String Brand;
    String Model;
    char Color;
    int price;

    public Computer(String brand,String model){
        this.Brand=brand;
        this.Model=model;
        System.out.println("Computer brand is " + this.Brand +"  "+ "Computer Model is " + this.Model);
    }
    public Computer(String brand,String model,char color,int price){
        this.Brand=brand;
        this.Model=model;
        this.Color=color;
        this.price=price;
        System.out.println("Computer brand is " + this.Brand +"  "+ "Computer Model is " + this.Model +"  " +"Computer color is :" +this.Color + "  " + "Computer Price is :" +this.price);
    }
    public static void main(String[] args) {
        Computer cm=new Computer("lenovo","S3");
        Computer ct=new Computer("hp","pro",'S',1100);
    }
}


