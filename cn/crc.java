import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.math.*;
class crc{

  public static String data1,data2,data3;
public static void main(String[] args)throws Exception {
  System.out.println("enter original message");
  BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
  data1=s.readLine();
  data3=data1; //cheap trick.i m a bad coder
  System.out.println("Enter degree of divisor");
  int x=Integer.parseInt(s.readLine());
  while(x-- >0)
  data1+="0";
  BigInteger data=new BigInteger(data1,2);
  System.out.println("Enter divisor");
  String divisor1=s.readLine();
  BigInteger divisor=new BigInteger(divisor1,2);
  BigInteger crc=data.remainder(divisor);
  System.out.println(crc.intValue());
  data2=data3+crc.toString(2);
  BigInteger codeword=new BigInteger(data2,2);
  System.out.println("codeword:"+codeword.toString(2));
  //errordetection
  BigInteger remainder=codeword.remainder(divisor);

  x=remainder.intValue();
    System.out.println(x);
  if(x==0)
  System.out.println("there's no error");
  else
  System.out.println("error detected");

//input:1001,3,1011



}



}
