import java.io.*;
import java.util.*;
import java.math.*;


public class string{
public static void main(String args[])throws Exception{
String s1="192.186.1.1/16";
String[] words=s1.split("/");
String ip=words[0];
String[] ip1=ip.split("[.]");


BigInteger b1=new BigInteger(ip1[0]);

BigInteger b2=new BigInteger(ip1[1]);
BigInteger b3=new BigInteger(ip1[2]);
BigInteger b4=new BigInteger(ip1[3]);

System.out.println("Ip address in binary");
System.out.println(b1.toString(2)+"."+b2.toString(2)+"."+ b3.toString(2) +"."+b4.toString(2));
Double n=Double.parseDouble(words[1]);
Double y=Double.parseDouble(ip1[3]);
Double m=(Math.pow(n,2)); //number of addresses
System.out.println("number of addresses:"+m);
int m1=m.intValue();
int y1=y.intValue();
Double ns=256/m; //number of subnets
int ns1=ns.intValue();
System.out.println("number of subnets:"+ns1);
int ss=m1/ns1;


String a=" ";
String b=" ";
for(int j=0;j<ns1;j++)
{ System.out.println(ss*j);
  System.out.println(ss*(j+1));

  if((ss*j)< y1 &&y1<=(ss*(j+1)))
  {
    a=String.valueOf(ss*j);
    b=String.valueOf(ss*(j+1)-1);
  }

}
BigInteger fa=new BigInteger(a);
BigInteger la=new BigInteger(b);

System.out.println("First address is:");
System.out.println(b1.toString(2)+"."+b2.toString(2)+"."+ b3.toString(2) +"."+ fa.toString(2));
System.out.println("last address is:");
System.out.println(b1.toString(2)+"."+b2.toString(2)+"."+ b3.toString(2) +"."+ la.toString(2));







}
}
