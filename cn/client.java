import java.io.*;
import java.net.*;
class client
{
  public static void main(String[] args)throws Exception {
    try{Socket s=new Socket("localhost",6666);
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    dout.writeUTF("this is the message");
    dout.flush();
    dout.close();
    s.close();
  }
  catch(Exception e)
  {
    System.out.println("cool");
  }
  }
}
