class ExceptionExample{
     public static void main(String[] args)
     {
       try{
           int num=10/0;
           System.out.println("Result:" +num);
        }
       catch(ArithmeticException e){
           System.out.println("Arthimetic exception caught:"+e.getMessage());
       }
      finally{
         System.out.println("Execution Completed");
      }
      }
} 