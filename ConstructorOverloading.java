class Demo{
   Demo()
    {
      System.out.println("Empty Constructor");
    }
   Demo(int a)
   {
     System.out.println("a value is:"+a);
   }
   Demo(int a,int b)
   {
     System.out.println("a value is"+a+" and b value is:"+b);
   }
}
class ConstructorOverloading{
     public static void main(String[] args){
           Demo obj=new Demo();
           Demo obj1=new Demo();
           Demo obj2=new Demo(6);
           Demo obj3=new Demo(3,6);
    }
}


OUTPUT
Empty Constructor
Empty Constructor
a value is:6
a value is3 and b value is:6
  