//HTML Code
/*  
    <title> Test Applet Page </title> 
    <body>
        <applet code=HelloWorld.class width=200 height=200>
        </applet>1
    </body>
*/
import java.awt.Graphics;
import java.applet.Applet;
public class HelloWorld extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hell World!", 20, 20);
    }
}
