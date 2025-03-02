import java.util.Scanner;
public class StrBuffer{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer("hello World!");
          System.out.println("choose any option");
          System.out.println("delete a substring");
          System.out.println("delete character");
          System.out.println("enter your choice");
          int choice=Sc.nextInt();
          switch(choice){
             case 1:
             sb.delete(5,11);
             System.out.println("after deleting a substring:" +sb);
             break;
             case 2:
             sb.deleteCharAt(sb.length()-1);
             System.out.println("after deleting character:" +sb);
             break;
             default:
             System.out.println("invalid option");
             break;
             }
      }
}