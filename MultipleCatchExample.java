class MultipleCatchExample{
     public static void main(String[] args)
     {
       try{
           int[] number={1,2,3};
           int result=number[5]/0;
           System.out.println("Result:" +result);
           int num=10/0;
           System.out.println("number:"+num);
        }
       catch(ArithmeticException e){
           System.out.println("Arthimetic exception caught:"+e.getMessage());
       }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Array index out of bound exception caught:"+e.getMessage());
      }
     catch(Exception e){
        System.out.println("General exception caught:"+e.getMessage());
      }
      }
} 