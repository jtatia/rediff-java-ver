import java.io.*;
class mail
{
void delay1()
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
public static void main()throws IOException
{
mail ob=new mail();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ob.delay1();
System.out.println("Welcome to Java Mail");
ob.delay();
System.out.println("If you do not have an account and wish to create an account press C");
ob.delay();
System.out.println("if you are an existing user press L to login");
ob.delay();
System.out.println("If you wish to go back to the home page press H");
ob.delay();
char b=(char)br.read();
if(b=='C')
{
create obj=new create();
obj.main();
}
else if(b=='L')
{Login obj=new Login();
obj.main("jai","","","","jai","jajwi","");
}
else if(b=='H')
{Home obj=new Home();
obj.main();
}
}
}

