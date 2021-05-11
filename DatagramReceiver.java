import java.net.*;
Class DatagramReceiver
{
public static voidmain(String a [ ])
{
try
{
int port=Integer.parseInt(a[0]);
DatagramSocket ds=new DatagramSocket
byte buffer[ ]=new byte(BUFSIZE];
while(true)
{
DatagramPacket =new Datagrampacket(buffer,buffer,length);
ds.receive(dp);
String str=new String (dp.getData( ));
System.out.println(str);
}
}
catch(Exception e)
{
e.printstackTrac( );
}
}