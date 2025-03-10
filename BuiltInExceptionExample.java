class BuiltInExceptionExample{
     public static void main(String[] args)
     {
       try{
           int[] number={1,2,3};
           int result=number[5]/0;
           System.out.println("Result:" +result);
        }
       
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Array index out of bound exception caught:"+e.getMessage());
      }
      try{
          int num=10/0;
          System.out.println("Number:"+num);
      }
      catch(ArithmeticException e){
           System.out.println("Arthimetic exception caught:"+e.getMessage());
       }
      try{
         String text=null;
         System.out.println(text.length());
     }
      catch(NullPointerException e){
        System.out.println("Null pointer  exception caught:"+e.getMessage());
      }
      }
} 