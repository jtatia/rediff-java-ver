import java.io.*;
class Home
{void delay()
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
Home ob=new Home();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
int a;
System.out.println("Welcome to Java World");
ob.delay();
System.out.println("please choose what you would like to start with(choose the number written in the brakets)");
ob.delay();
System.out.println("Mail(1)         News(2)          Stock Market(3)          Online Shopping(4)");
a=Integer.parseInt(br.readLine());
if(a==1)
{mail obj=new mail();
obj.main();
}
else if(a==2)
{news obj=new news();
obj.main();
}
else if(a==3)
{stock obj=new stock();
obj.main();
}
else if(a==4)
{onlineshopping obj=new onlineshopping();
obj.main();
}
else 
{System.out.println("Wrong Input");
System.out.println("Thank you for visiting JavaWorld");
}
}
}
