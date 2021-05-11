import java.net.*;
import java.io.*;
import java.util.*;
class SSDemo
{
public static void main(String a[ ])
{
try
{
int port=Integer.parseInt(a[1]);
Random random=new Random( );
ServerSocket ss=new ServerSocket (port);
while(true)
{
Socket s=ss.accept( );
OutputStream os=s.getOutputStream( );
DataOutputStream dos=new DataOutputStream(os);
int k=random.nextInt( );
System.out.println(k);
dos.writeInt(k);
s.close( );
}
}
catch (Exception e)
{
System.out.println("exception:"+e);
}
}
}