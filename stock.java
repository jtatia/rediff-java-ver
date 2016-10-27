import java.io.*;
class stock
{void delay1()
{
long i,j;
System.out.print("Please Wait.");
for(i=0;i<=600000000;i++)
{
}
System.out.print(".");
for(j=0;j<=600000000;j++)
{
}
System.out.println(".");
for(i=0;i<600000000;i++)
{
}
}
void delay()
{
long i,j;
for(i=0;i<=900000000;i++)
{
}
for(j=0;j<=600000000;j++)
{
}
}

String name()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name=br.readLine();
return(name);
}
void main()throws IOException
{stock ob=new stock();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
int d=0;
ob.delay1();
while(d==0)
{ob.delay();
System.out.println("Enter 'G' for top 6 gainers");
ob.delay();
System.out.println("Enter 'L' for top 6 losers");
ob.delay();
System.out.println("Enter 'W' for world markets");
String c=ob.name();
if(c.equals("G"))
{ob.delay1();
System.out.println("         TOP SIX GAINERS OF THE WEEK    ");
System.out.println("COMPANY      |   DAY'S CLOSE |  CHANGE%");     
System.out.println("Pioneer Dis     |      38.70             |   42.8           ");
System.out.println("Birla Corp.       |     282.45            |   34.3          " );
System.out.println("ASS Infrast      |      60.00             |   32.9");
System.out.println("Vardhman Pol |      82.20             |   31.9");
System.out.println("Mukand Engrs |      32.45             |   31.4");
System.out.println("Man Inds.(I)     |      229.20           |   28.3");
ob.delay();
}
else 
if(c.equals("L"))
{ob.delay1();
System.out.println("         TOP SIX LOSERS OF THE WEEK    ");
System.out.println("COMPANY      |   DAY'S CLOSE |  CHANGE%");
System.out.println("Kilitch Drug     |        41.50           |      -41.5   ");
System.out.println("20 Microns      |       111.40          |      -18.4    ");
System.out.println("MTNL              |         32.35          |      -15.0 ");
System.out.println("Tulip Telec.     |        45.60           |       -14.4  ");
System.out.println("Bil Energy S    |        45.40           |       -14.1"); 
System.out.println("Eon Electric    |        27.85           |       -13.6");
ob.delay();
}
else 
if(c.equals("W"))
{ob.delay1();
System.out.println("              MARKETS AROUND THE WORLD");
System.out.println("COUNTRY'S NAME           |           CHANGE%         ");
System.out.println("        India                            |               2.3           ");
System.out.println("        Singapore                   |              -0.1         ");
System.out.println("        China                          |               1.2          ");
System.out.println("        Japan                          |              -2.4        ");
System.out.println("        Germany                     |              -1.7         ");
System.out.println("        UK                               |              -1.3         ");
System.out.println("        USA                             |               -1.2       ");
}
ob.delay();
System.out.println("Press 'H' to go back to go to the home page");
System.out.println("Press any other key to continue");
String ch=ob.name();
if(ch.equals("H"))
{Home obj=new Home();
obj.main();
}
else
continue;
}
}
} 













