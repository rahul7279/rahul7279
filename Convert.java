import java.util.Scanner
class Test
{
  public static void main(String args[])
  {
    float rs;
    int ps;
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the amount in Rupee");
    rs=obj.nexFloat();
    ps=(int)(rs*100);
    System.out.print("Amount im paise: "+ps);
  }
}
    
    
