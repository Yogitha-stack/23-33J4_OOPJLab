abstract class Shape{
    abstract double calculateArea();
     void displayArea(){
            System.out.println("Area:"+calculateArea());
     }
}
class Square extends Shape{
          int side;
          Square(int side){
             this.side=side;
          }
         double calculateArea(){
                return side*side;
         }
}
class Rectangle extends Shape{
           int length;
           int width;
           Rectangle(int length, int width){
            this.length=length;
            this.width=width;
          }
          double calculateArea(){
               return length*width;
          }
}
class ShapeTest{
      public static void main(String[] args){
                Shape sq=new Square(10);
                Shape rect=new Rectangle(10,20);
                sq.displayArea();
                rect.displayArea();
}
}