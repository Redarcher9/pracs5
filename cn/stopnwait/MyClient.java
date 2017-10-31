import java.io.*;
import java.net.*;
import java.util.*;
public class MyClient {
public static void main(String[] args) {
try{
Socket s=new Socket("localhost",6666);
System.out.println("connection established");
Scanner scan=new Scanner(System.in);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream dis=new DataInputStream(s.getInputStream());
int z=scan.nextInt();


  dout.writeUTF("Hello Server");
  dout.flush();
  String str=(String)dis.readUTF();
  System.out.println("message= "+str);
  dout.writeUTF("Hello Server2");
  dout.flush();
  str=(String)dis.readUTF();
  System.out.println("message= "+str);
  dout.writeUTF("Hello Server3");
  dout.flush();
  str=(String)dis.readUTF();
  System.out.println("message= "+str);

  dout.writeUTF("Hello Server4");
  dout.flush();
  str=(String)dis.readUTF();
  System.out.println("message= "+str);
  z=scan.nextInt();
  dout.close();
  s.close();



}catch(Exception e){System.out.println(e);}
}

}
