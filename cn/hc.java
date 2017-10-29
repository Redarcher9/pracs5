import java.util.Scanner;

class hc
{

  public static int opt;
  public static int[] tmsg =new int[8];
  public static void main(String[] args)throws Exception
  {
    Scanner s = new Scanner(System.in);
    System.out.println("1.Even parity");
    System.out.println("2.odd parity");
    opt=s.nextInt();
    int p1,p2,p4;
    System.out.println("Enter received code");
    input();
    p1=check(tmsg[1],tmsg[2],tmsg[3],tmsg[4],opt);
    p2=check(tmsg[2],tmsg[3],tmsg[5],tmsg[6],opt);
    p4=check(tmsg[1],tmsg[3],tmsg[5],tmsg[7],opt);
    System.out.println("P1 :"+p1);
    System.out.println("P2 :"+p2);
    System.out.println("P4 :"+p4);
    int x=4*p4 +2*p2+1*p1;
    int y=8-x;
    System.out.println("Error detected at bit "+x);
    if(tmsg[y]==0)
    tmsg[y]=1;
    else
    tmsg[y]=0;
    System.out.println("Corrected Code:")
    for (int i=1; i<=7;i++ ) {
      System.out.println(tmsg[i]);

    }



  }
  public static void input()
  {
  Scanner s1 = new Scanner(System.in);
  for(int i=1;i<=7;i++)
  {
    tmsg[i]=s1.nextInt();
  }
  }
  public static int check(int a,int b,int c,int d,int opt)
  {
    int count=0;
    int[] q={a,b,c,d};
    int i=4;
    System.out.println(" ");
    while(i-- >0)
    {
      if (q[i]==1)
      {count++;}
    }

    if(opt==1 && (count%2 ==0))
      return 0;
    else if(opt==1 &&(count%2==1))
      return 1;
    else if(opt==2 &&(count%2==0))
      return 1;
    else
      return 0;
    }

  }
