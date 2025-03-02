interface FoodOrder{
     void OrderItem();
}
class Pizza implements FoodOrder{
          public void OrderItem(){
               System.out.println("Pizza ordered successfully.....");
          }
}
class Burger implements FoodOrder{
           public void OrderItem(){
              System.out.println("Burger ordered successfully.....");
          }
}
class IntfaceExa{
    public static void main(String[] args){
       FoodOrder pizza=new Pizza();
          pizza.OrderItem();
       FoodOrder burger=new Burger();
          burger.OrderItem();
    }
}