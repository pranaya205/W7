import java.awt.*;
import java.awt.event.*;
public class AdapterWithAnonymous extends Frame
{
Button btn;
public AdapterWithAnonymous( )
{
setLayout(new  FlowLayout( ));
btn=new Button("Click for Red");
add(btn);
btn.addActionListener(new ActionListener ( ));
{
public void actionPerformed(ActionEvent  ae)
{
System.out.println("Your click is Successful");
setBackground(color.red);
}
}
setSize(200,200);
setVisible(true);
}
public static void main(String args[ ])
{
new AdapterWithAnonymous( );
}
}
