import java.util.Scanner;
public class QuadraticEquation{
   public static void main (String args[]){
   Scanner scanner=new Scanner (System.in);
System.out.print("enter coefficient of a:");
double a=scanner.nextDouble();
System.out.print("enter coefficient of b:");
double b=scanner.nextDouble();
System.out.print("enter coefficient of c:");
double c=scanner.nextDouble();
double D=b*b-4*a*c;
System.out.println("Discriminant(D):"+D);
if(D>0){
System.out.println("the equation has two real and distrinct roots.");
double root1=(-b+sqrt(D))/(2*a);
double root2=(-b-sqrt(D))/(2*a);
System.out.println("Root1:"+root1);
System.out.println("Root2:"+root2);
}
else if(D==0){
System.out.println("the equation has two real and repeated root.");
double root=-b/(2*a);
System.out.println("Root:"+root);
}
else{
System.out.println("the equation has two complex roots.");
double realpart=-b/(2*a);
double imaginarypart=sqrt(-D)/(2*a);
System.out.println("Root1:"+realpart+"+"+imaginarypart+"i");
System.out.println("Root2:"+realpart+"-"+imaginarypart+"i");
}
scanner.close();
}
 public static double sqrt(double number){
 double t;
 double squareRoot=number/2;
 do{
  t=squareRoot;
  squareRoot=(t+(number/t))/2;
 }while((t-squareRoot)!=0);
 return squareRoot;
}
}
