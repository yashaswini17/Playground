import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      	Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      //int n2=in.nextInt();
      int x=n1%100;
      int y=x/10;
		 System.out.println(y);
	}
}