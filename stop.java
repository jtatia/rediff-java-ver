
import java.awt.*;
import javax.swing.*;
public class stop extends JApplet
{
public void paint(Graphics g)
{
Font f=new Font("Monotype Corsiva",Font.BOLD,45);
g.setFont(f);
g.setColor(Color.BLUE);
g.drawString("VISIT AGAIN",40,99);
g.setColor(Color.BLACK);
g.fillOval(100,200,55,55);
g.fillOval(200,200,55,55);
g.setColor(Color.BLACK);
g.fillRect(170,271,20,30);
g.fillRect(120,340,120,20);
}
}