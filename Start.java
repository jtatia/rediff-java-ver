import java.awt.*;
import javax.swing.*;
public class Start extends JApplet
{void delay()
{for(int i=0;i<900000000;i++)
{
}
for(int i=0;i<900000000;i++)
{
}
}
public void paint (Graphics g) 
{Start ob=new Start();
ob.delay();
Font f = new Font("Comic Sans",Font.BOLD,35);  
g.setFont(f);
g.setColor(Color.BLUE);
g.drawString("Welcome",1,40);
ob.delay();
Font f1 = new Font("Monotype Corsiva",Font.PLAIN,27);  
g.setFont(f1);
g.setColor(Color.GREEN);
g.drawString("To JAVA WORLD",300,80);
g.setColor(Color.BLACK);
g.drawLine(500,86,300,86);
ob.delay();
Font f3 = new Font("Comic Sans",Font.ITALIC,17);  
g.setFont(f3);
g.setColor(Color.GRAY);
g.drawString("Hope you have a nice experience",250,105);
ob.delay();
Font f5 = new Font("Comic Sans",Font.ITALIC,20);  
g.setFont(f5);
g.setColor(Color.RED);
g.drawString("Creator: Jai Tatia",100,150);
Font f4 = new Font("Times New Roman",Font.ITALIC,10);  
g.setFont(f4);
g.setColor(Color.GRAY);
ob.delay();
g.drawString("Copyright © 2012 JavaWorld.  All rights reserved ",10,205);
g.setColor(Color.RED);
g.fillRect(0,0,10000,10000);
}
}