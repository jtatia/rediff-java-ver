import java.io.*;
class news
{

void delay1()
{
long i,j;
System.out.print("Please Wait.");
for(i=0;i<=400000000;i++)
{
}
System.out.print(".");
for(j=0;j<=400000000;j++)
{
}
System.out.println(".");
for(i=0;i<400000000;i++)
{
}
}
void delay()
{
long i,j;
for(i=0;i<=400000000;i++)
{
}
for(j=0;j<=400000000;j++)
{
}
}
void main()throws IOException
{news obje=new news();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
String choice;
int d=0;
while(d==0)
{
System.out.println("Press 'head' for HeadLines and 'sport' for sports news");
choice=br.readLine();
if(choice.equals("head"))
{obje.delay1();
System.out.println("India is attacked by pakistan");
obje.delay();
System.out.println("Sensex rises 122 points");
}
else if(choice.equals("sport"))
{obje.delay1();
System.out.println("Sachin retires");
obje.delay();
System.out.println("India wins the t20 world cup");
}
obje.delay();
System.out.println("Press H to go to home page else press enter to continue");
char c=(char)br.read();
if(c=='H')
{Home obj=new Home();
obj.main();
break;
}
}
}}