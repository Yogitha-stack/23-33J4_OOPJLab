class ConExample{
int i;
int j;
ConExample(){
i=34;
j=23;
}
public void Display(){
System.out.println("i value:"+i+"and j value:"+j);
}
public static void main(String[] args){
ConExample obj=new ConExample();
obj.Display();
}}


OUTPUT
i value:34and j value:23