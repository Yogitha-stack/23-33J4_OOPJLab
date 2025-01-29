class MethodOverloading
{
public long mul(long a,long b,long c){
return a*b*c;
}
public static void main(String[] args){
MethodOverloading ob1=new MethodOverloading();
long d=ob1.mul(2,3,5);
System.out.println(d);
}
}

OUTPUT
30