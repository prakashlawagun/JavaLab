import java.applet.Applet;
import java.awt.Graphics;
import java.applet.*;
import java.awt.*; 
class MyfirstApplet extends Applet
{
String str = "";
public void init() // init method
{
str = str + "I am Init ";
}
public void start() // start method
{
str = str + "I am start : ";
}
public void stop() // stop method and holds the applet on pause state
 {
str = str + "I am stop : ";
}
public void destroy() // destroy method, destroys the applet
{
System.out.println("Applet Destroyed.");
}
public void paint(Graphics g) 
{
String str =this.getParameter("msg");
g.drawString(str,500,700);
}
}
//APPLET code="MyfristApplet.class" width="200" height="200">
//<PARAM name="msg" value="Greekshows"></APPLET>