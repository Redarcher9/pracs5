import java.io.*;
import java.net.*;
import java.util.*;
public class MyServer {
public static void main(String[] args){
try{
  int z=0;
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
Scanner scan=new Scanner(System.in);

   z=scan.nextInt();

    String  str=(String)dis.readUTF();
    System.out.println("message= "+str);
    dout.writeUTF("Acknowledgement sent 1");
    dout.flush();
    str=(String)dis.readUTF();
    System.out.println("message= "+str);
    dout.writeUTF("Acknowledgement sent 2");
    dout.flush();
    str=(String)dis.readUTF();
    System.out.println("message= "+str);
    dout.writeUTF("Acknowledgement sent 3");
    dout.flush();
    str=(String)dis.readUTF();
    System.out.println("message= "+str);
    dout.writeUTF("Acknowledgement sent 4");
    dout.flush();



    dout.close();
    ss.close();

      //do nothing






}catch(Exception e){System.out.println(e);}
}
}
