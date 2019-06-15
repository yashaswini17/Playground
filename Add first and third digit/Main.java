import java.util.Scanner;
class Main{
	public static void main (String[] args) {
       Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
		//int n2=in.nextInt();
      int x=n1/100;
      int y=((n1%10)%10);
     // int z=y%10;
      int a=x+y;
       System.out.println(a);
	}
}