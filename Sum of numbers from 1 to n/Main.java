import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
     int n1=in.nextInt();
      int sum=0;
	    for(int i=1;i<=n1;i++)
        {
          sum=sum+i;
	}System.out.println(sum);
}
}