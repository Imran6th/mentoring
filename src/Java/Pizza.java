package Java;

public class Pizza {

    String nameofpizza;
    char size;
    int priceofpizza;

  public Pizza(){

  }

  public Pizza(String nameofpizza,char size,int priceofpizza ){

   String pizzaname=this.nameofpizza=nameofpizza;
   char pizzasize=this.size=size;
   int pizzaprice=this.priceofpizza=priceofpizza;

      System.out.println("pizza name is"+nameofpizza+"  "+"Pizza size is"+size+"   "+"Pizza Price is"+priceofpizza);
  }
    public static void main(String[] args) {
        Pizza Halal=new Pizza( "Pan Pizza",'s',7);
        Pizza Italian=new Pizza("Veggie",'m',10);
    }
}

