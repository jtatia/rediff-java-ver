import java.io.*;
import java.util.Date;
class Login
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
void account(String user,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String pass,String sender)throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Login ob=new Login();
System.out.println("                                                                                                                           Welcome "+user);
ob.delay();
System.out.println("  INBOX  |  WRITE MAIL  |   CONTACTS  |  LOGOUT  ");
String choice=br.readLine();
if(choice.equals("INBOX"))
{ ob.npinbox(user,s1,s2,s3,s4,"","","",pass,sender);
}
else if(choice.equals("WRITEMAIL"))
{
ob.write(user,pass,s4);
}
else if(choice.equals("CONTACTS"))
{
if((user.compareTo("luke")!=0)&&(user.compareTo("pranav")!=0)&&(user.compareTo("avner")!=0)&&(user.compareTo("selloid")!=0)&&(user.compareTo("gauraang")!=0))
{System.out.println("No Contacts");
}
else if(user.compareTo("luke")==0)
{
System.out.println("pranav-pranav@javamail.com");
System.out.println("gauraang-gauraang@javamail.com");
System.out.println("avner-avner@javamail.com");
System.out.println("selloid-selloid@javamail.com ");
}
else if(user.compareTo("pranav")==0)
{
System.out.println("luke-luke@javamail.com");
System.out.println("gauraang-gauraang@javamail.com");
System.out.println("avner-avner@javamail.com");
System.out.println("selloid-selloid@javamail.com ");
}
else if(user.compareTo("gauraang")==0)
{
System.out.println("pranav-pranav@javamail.com");
System.out.println("luke-luke@javamail.com");
System.out.println("avner-avner@javamail.com");
System.out.println("selloid-selloid@javamail.com ");
}
else if(user.compareTo("avner")==0)
{System.out.println("selloid-selloid@javamail.com ");
System.out.println("pranav-pranav@javamail.com");
System.out.println("luke-luke@javamail.com");
System.out.println("gauraang-gauraang@javamail.com");
}
else 
{
System.out.println("pranav-pranav@javamail.com");
System.out.println("luke-luke@javamail.com");
System.out.println("gauraang-gauraang@javamail.com");
System.out.println("avner-avner@javamail.com");
}
ob.delay();
System.out.println("Press enter to go back");
String d=br.readLine();
ob.account(user,s1,s2,s3,s4,s5,s6,s7,pass,sender);
}
else if(choice.equals("LOGOUT"))
{ob.delay1();
System.out.println("Thank you for logging into java mail");
ob.main(user,s5,s6,s7,s4,pass,sender);
}
}
void npinbox(String user,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String pass,String send)throws IOException
{Login ob=new Login();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
ob.delay();
String sto,subject,age,sender;
String s[]=new String[2];
 String sub[]=new String[2];
 String ouser[]=new String[2];
String mess[]=new String[2];
 s[0]="JavaMailManager";
 sub[0]="Welcome";
ouser[0]=s4;
Date d=new Date();
System.out.println("Enter 'Back' to go back to your account homepage else press enter");
String back=br.readLine();
if(back.equals("Back"))
{
ob.account(user,s1,s2,ouser[0],s4,s5,s6,s7,pass,send);
}
System.out.println("Sender                   |  Subject    |  date                                                                            "); 

int a=0;
 s[1]=send;
sub[1]=s2;
ouser[1]=s4;
mess[1]=s3;
if(s[1].compareTo("")!=0)
{ 
for(int i=0;i<2;i++) 
     {
         a++;
System.out.println("|  "+s[i]+"  |  "+ sub[i]+ " | "+d+          "choice:"+ a);
}
int choice=Integer.parseInt(br.readLine());
if(choice==1)
{System.out.println("REPLY |  FORWARD  |  DELETE  |  BACK");
System.out.println(mess[0]);
String ch=br.readLine();
if(ch.equals("REPLY"))
{
System.out.println("Send To :  "+s[0]+"@javamail.com");
sto=s[0]+"@javamail.com";
System.out.println("Subject:RE "+sub[0]);
subject=s[0];
System.out.println("Message"); 
age=br.readLine();
ob.delay1();
System.out.println("Message Sent");
sender=user;
ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],sto,subject,age,pass,sender);
}
else if(ch.equals("FORWARD"))
{System.out.print("Send To: ");
sto=br.readLine();
System.out.println("Sub: "+sub[0]);
subject=sub[0];
System.out.println("Message");
System.out.println(mess[0]);
age=mess[0];
ob.delay1();
System.out.println("Message Sent");
sender=user;
ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],sto,subject,age,pass,sender);
}
else if(ch.equals("DELETE"))
{
s[0]="";
ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],"","","",pass,"");
}
else if(ch.equals("BACK"))
{ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],"","","",pass,"");
}
}
else if(choice==2)
{System.out.println("REPLY |  FORWARD  |  DELETE  |  BACK");
System.out.println(mess[1]);
String ch=br.readLine();
if(ch.equals("REPLY"))
{
System.out.println("Send To :  "+s[1]+"@javamail.com");
sto=s[1]+"@javamail.com";
System.out.println("Subject:RE "+sub[1]);
subject="RE "+sub[1];
System.out.println("Message");
age=br.readLine();
ob.delay1();
System.out.println("Message Sent");
sender=user;
ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],sto,subject,age,pass,sender);

}
else if(ch.equals("FORWARD"))
{System.out.println("Send To: ");
sto=br.readLine();
System.out.println("Sub: "+sub[1]);
subject=sub[1];
System.out.println(mess[1]);
age=mess[1];
ob.delay1();
System.out.println("Message Sent");
sender=user;
ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],sto,subject,age,pass,sender);
}
else if(ch.equals("DELETE"))
{
s[1]="";
ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],"","","",pass,"");
}
else if(ch.equals("BACK"))
{ob.npinbox(user,s[1],sub[1],mess[1],ouser[1],"","","",pass,"");
}
}
}
else 
 { 
     for(int i=0;i<1;i++) 
 {
     System.out.println("|  "+s[i]+"  |  "+ sub[i]+ "  | "+d+"             choice: 1 ");
} 
int cc=Integer.parseInt(br.readLine());
if(cc==1)
System.out.println("REPLY |  FORWARD  |  DELETE  |  BACK");
System.out.println(mess[0]);
String ch=br.readLine();
if(ch.equals("REPLY"))
{
System.out.println("Send To :  "+s[0]+"@javamail.com");
sto=s[0]+"@javamail.com";
System.out.println("Subject:RE "+sub[0]);
subject=s[0];
System.out.println("Message"); 
age=br.readLine();
ob.delay1();
System.out.println("Message Sent");
sender=user;
ob.npinbox(user,s1,"","","",sto,subject,age,pass,sender);
}
else if(ch.equals("FORWARD"))
{System.out.print("Send To: ");
sto=br.readLine();
System.out.println("Sub: "+sub[0]);
subject=sub[0];
System.out.println("Message");
System.out.println(mess[0]);
age=mess[0];
ob.delay1();
System.out.println("Message Sent");
sender=user;
ob.npinbox(user,s1,"","","",sto,subject,age,pass,sender);
}
else if(ch.equals("DELETE"))
{
s[0]="";
ob.npinbox(user,s1,"","","","","","",pass,"");
}
else if(ch.equals("BACK"))
{ob.npinbox(user,s1,"","","","","","",pass,"");
}
}
}

void write(String user,String pass,String s4)throws IOException
{
Login ob=new Login();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
String sender;
System.out.print("Send To: ");
String sto=br.readLine();
System.out.print("Subject: ");
String sub=br.readLine();
System.out.println("Message: ");
String mess=br.readLine();
ob.delay1();
System.out.println("Message Sent");
sender=user;
ob.account(user,"","","",s4,sto,sub,mess,pass,sender);
}
public static void main(String a,String s,String sub,String mess,String ouser,String b,String sender)throws IOException
{Login ob=new Login();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
ob.delay1();
System.out.println("Login page");
ob.delay();
System.out.print("Username: ");
String user=br.readLine();
System.out.print("Password: ");
String pass=br.readLine();
if((user.equals(ouser))&&(pass.equals(b)))
{ob.delay1();
System.out.println("yes");
if(s.equals(user+"@javamail.com"))
{
ob.account(user,"",sub,mess,ouser,"","","",b,sender);
}
else
ob.account(user,"","","","","",ouser,"",b,sender);
}
else if((user.equals("luke"))&&(pass.equals("assasinate")))
{ob.delay1();
if(s.equals("luke@javamail.com"))
{
ob.account("luke","",sub,mess,a,ouser,"","",b,sender);
}
else
ob.account("luke","","","",ouser,"","","",b,sender);
}
else if((user.equals("avner"))&&(pass.equals("fernandes")))
{ob.delay1();
if(s.equals("avner@javamail.com"))
{
ob.account("avner","",sub,mess,a,ouser,"","",b,sender);
}
else
ob.account("avner","","","",ouser,"","","",b,sender);
}
else if((user.equals("selloid"))&&(pass.equals("computer")))
{ob.delay1();
if(s.equals("selloid@javamail.com"))
{
ob.account("selloid","",sub,mess,a,ouser,"","",b,sender);
}
else
ob.account("selloid","","","",ouser,"","","",b,sender);
}
else if((user.equals("gauraang"))&&(pass.equals("naik")))
{ob.delay1();
if(s.equals("gauraang@javamail.com"))
{
ob.account("gauraang","",sub,mess,a,ouser,"","",b,sender);
}
else
ob.account("gauraang","","","",ouser,"","","",b,sender);
}
else if((user.equals("pranav"))&&(pass.equals("basketball")))
{ob.delay1();
if(s.equals("pranav@javamail.com"))
{
ob.account("pranav","",sub,mess,a,ouser,"","",b,sender);
}
else
ob.account("pranav","","","",ouser,"","","",b,sender);
}
else 
System.out.println("wrong input");
}
}






























