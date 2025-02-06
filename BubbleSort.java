import java.util.Scanner;
class BubbleSort
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the  no.of elements into array:");
int n=scanner.nextInt();
int[] arr=new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
 arr[i]=scanner.nextInt();
}
for(int i=0;i<n-1;i++)
{ 
for(int j=0;j<n-i-1;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("sorted array:");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}
