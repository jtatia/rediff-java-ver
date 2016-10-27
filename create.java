import java.io.*;
class create
{
void account(String user,String pass)throws IOException
{create ob=new create();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("By entering 'create' to Create an account, you confirm that you accept the terms and conditions & privacy policy");
ob.delay();
System.out.println("If you want to read the terms and policy enter 'terms' ");
String choice=ob.name();
if(choice.equals("create"))
{ob.delay1();
System.out.println("Hi "+user+", congratulations! You have registered successfully.");
ob.delay();
System.out.println("Please give us some more information about you");
ob.delay();
System.out.println("Education");
String edu=ob.name();
System.out.println("Occupation: ");
String occ=ob.name();
System.out.println("Interests");
String in=ob.name();
ob.delay1();
System.out.println("Press 'Log' to Login");
System.out.println("Press Home to go back to the home Page");
String cd=ob.name();
if(cd.equals("Home"))
{
Home obj=new Home();
obj.main();
}
else if(cd.equals("Log"))
{
Login obj=new Login();
obj.main(user,"","","",user,pass,"");
}
}
else if(choice.equals("terms"))
{ob.delay1();
terms obj=new terms();
obj.main(user,pass);
}
}
String name()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name=br.readLine();
return(name);
}
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
{create ob=new create();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
int d,s;
s=1;
d=0;
String che,sa,pass,name;
ob.delay1();
System.out.println("Lets get you started");
ob.delay();
System.out.println("Please fill the form below");
ob.delay();
System.out.println("                                                                    *-mandatory parameter");
while(d>=0)
{d++;
System.out.println();
System.out.println("Registration details: ");
System.out.println("press 'Enter' to start");
String en=br.readLine();
System.out.print("Full name*: ");
name=br.readLine();
if(name.compareTo("")==0)
{
System.out.println("mandatory parameter not entered");
continue;
}
System.out.print("Choose a javamail id*:");
String id=br.readLine();
if(id.compareTo("")==0)
{System.out.println("Mandatory parameter not entered");
continue;
}
if((id.compareTo("Luke")==0)||(id.compareTo("Sophia")==0)||(id.compareTo("Pranav")==0)||(id.compareTo("Avner")==0)||(id.compareTo("Ashton")==0))
{
System.out.println("this id has already been used");
continue;
}
else
System.out.println("id is available");

System.out.print("Password(more than 6 characters)*: ");
pass=br.readLine();
int l=pass.length();
if(l<5)
{
System.out.println("password has less characters");
continue;
}
System.out.print("Retype password*: ");
String re=br.readLine();
if(pass.compareTo(re)!=0)
{
System.out.println("wrong password. please retype again");
continue;
}
System.out.print("alternate email id*: ");
String ae=br.readLine();
int le=ae.length();
int des=0;
for(int j=0;j<le;j++)
{
char cd=ae.charAt(j);
if(cd=='@')
{
des=des+1;
break;
}
}
if(des!=1)
{
System.out.println("not a valid id");
continue;
}
if(ae=="")
{System.out.println("mandatory parameter not entered");
continue;
}
System.out.print("Date Of Birth(D/M/Y)*: ");
String dob=br.readLine();
if(dob.equals(""))
{System.out.println("mandatory parameter not entered");
continue;
}
System.out.println("Gender*: ");
System.out.println("Male(M)    Female(F)");
char gen=(char)br.read();
if((gen!='M')&&(gen!='F'))
{
System.out.println("Wrong Input");
continue;
}
System.out.print("Country: ");
String co=ob.name();
if(co.equals(""))
{System.out.println("mandatory parameter not entered");
continue;
}
System.out.print("City: ");
String ci=ob.name();
System.out.print("Enter the text shown*: ");
int c=(int)(Math.random()*8);
switch(c)
{
case 1:
{
System.out.println("Q4s0");
che=ob.name();
if((che.compareTo("Q4s0")>0)||(che.compareTo("Q4s0")<0))
{
continue;
}

break;
}
case 2:
{
System.out.println("4Ws3");
che=ob.name();
if((che.compareTo("4Ws3")>0)||(che.compareTo("4Ws3")<0))
{
continue;
}

break;
}
case 3:
{
System.out.println("Ds3T");
 che=ob.name();
if((che.compareTo("Ds3T")>0)||(che.compareTo("Ds3T")<0))
{
continue;
}

break;
}
case 4:
{
System.out.println("V4rT");
che=ob.name();
if((che.compareTo("V4rT")>0)||(che.compareTo("V4rT")<0))
{
continue;
}

break;
}
case 5:
{
System.out.println("e4Ts");
che=ob.name();
if((che.compareTo("e4Ts")>0)||(che.compareTo("e4Ts")<0))
{
continue;
}

break;
}
case 6:
{
System.out.println("qe2a");
 che=ob.name();
if((che.compareTo("qe2a")>0)||(che.compareTo("qe2a")<0))
{
continue;
}

break;
}
case 7:
{
System.out.println("da32");
 che=ob.name();
if((che.compareTo("da32")>0)||(che.compareTo("da32")<0))
{
continue;
}
break;
}
default:
{
System.out.println("s4q1");
 che=ob.name();
if((che.compareTo("s4q1")>0)||(che.compareTo("s4q1")<0))
{
continue;
}
break;
}
}
ob.delay();
ob.account(id,pass);
}
}
}









