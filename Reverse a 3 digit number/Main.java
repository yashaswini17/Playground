import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y,sum=0;
    while(x>0)
    {
    y=x%10;
    sum=sum*10+y;
    x=x/10;
      //System.out.println(x);
  }
    System.out.println(sum);
  
  }
}