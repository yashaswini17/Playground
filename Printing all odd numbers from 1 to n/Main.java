import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i;
      for(i=1;i<=n;i++)
      {
        if(i%2!=0)
        {
        System.out.print(i);
        System.out.println("");
	}
      }      
}
}
