import java .net.*;
import java.io.*;
class SDemo
{
public static void main(String a[ ])
{
try
{
String Server=a[0];
int port=Integer.parseInt(a[1]);
Socket s=new Socket(Server,port);
InputStream is=s.getInputStream( );
DataInputStream dis=new DataInputStream(is);
int i=dis.readInt( );
System.out.println(i);
s.close();
}
catch (Exception e)
{
System.out.println("exception:"+e);
}
}
}