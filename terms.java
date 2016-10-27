import java.io.*;
class terms
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
for(i=0;i<=500000000;i++)
{
}
}
void main(String user,String pass)throws IOException
{
terms ob=new terms();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to JavaMail. JAva.com India Limited provides e-mail services pursuant to the terms and conditions set forth below. By clicking on the [create] button, you are agreeing to use the Services in a manner consistent with the terms and conditions of this Agreement, Privacy Policy and with all applicable laws and regulations.");
ob.delay();
System.out.println("1. Modification of Terms of Service: JAVA.com may change the terms and conditions of the Service upon which Java.com will notify you of the changes. Java.com may at its sole discretion from time to time offer you variety of features and facilities for the service. Java.com however reserves its right to discontinue to offer such features and facilities for the service at anytime without prior notice. ");
ob.delay();
System.out.println("2. Subscriber Conduct: SPAMMING IS PROHIBITED. Spamming includes the transmission of any form of mail that can be interpreted as junk mail or mail generated via a distribution list which the recipient has not specifically requested. Java.com will immediately terminate the service/ any email account, which it believes, in its sole discretion, is transmitting or is otherwise connected with any spam or other unsolicited bulk email. You agree you are solely responsible for your content and you acknowledge Javamail acts as a passive conduit for the distribution and transmission of your data. You represent and warrant the content you provide to Javamail");
ob.delay();
System.out.println("(a) does not infringe on any third party's intellectual property or proprietary rights or rights of publicity or privacy;"); 
ob.delay();
System.out.println("(b) does not violate any law, statute, ordinance or regulation; ");
ob.delay();
System.out.println("(c) is not defamatory, trade libelous, or ");
ob.delay();
System.out.println("(d) does not contain viruses or other similar harmful or deleterious programming routines. If you violate this provision you will be penalised up to and including termination of your rights to use the service and any other remedies available to Java.com by law. ");
ob.delay();
System.out.println("3. Registration Data: In consideration for the Service, you agree to provide Javamail current, complete, and accurate registration information (the Registration Data) as prompted to do by the Service and to maintain and update this information as required to keep it current, complete and accurate. You understand the Javamail Service is advertising supported and you grant Java.com the right to disclose the aggregate Registration Data to third parties in connection with marketing the Services. Furthermore, Java.com may itself use your individual Registration Data to provide targeting of advertisements and other Service offers.");
ob.delay();
System.out.println("4. Privacy: Except as provided in Section 2 above, Java.com will not intentionally monitor or disclose any private e-mail message or address information unless required by law, enforcement agencies, regulation or court order. You agree to respect the privacy and confidentiality of others. ");
ob.delay();
System.out.println("5. Personal Use & Security: You acknowledge your right to use the Service is personal to you. You agree not to resell or make any commercial use of the Service without the express consent of Java.com. You are entirely responsible for not maintaining the confidentiality of your password and account. You shall be fully liable for all use of your account, including any unauthorized use of your account by any third-party.");
ob.delay();
System.out.println("6. Indemnification: You agree to defend, indemnify and hold harmless Javamail and Java.com, its employees, directors, officers, agents and their successors and assigns from and against any and all liabilities, damages, losses, costs and expenses, including attorney's fees, caused by or arising out of claims based upon the use of your account, including any claim of libel, defamation, violation of rights of privacy or publicity, loss of service by other subscribers and infringement of intellectual property or other rights. ");
ob.delay();
System.out.println("7. Terms. This Agreement shall continue in full force and effect for so long as you are using the Services. Either you or java.com may terminate the service at any time, with or without cause. The provisions of Sections 2, 6 and 12 shall survive any such termination.");
ob.delay();
System.out.println("Java.com reserves the right, in its sole discretion, to terminate your access to the services and the related services or any portion thereof at any time, without notice.Java.com may also terminate or suspend your access to the services for inactivity, which is defined as failing to log into a particular service for an extended period of time, as determined by Java.com.The amount of time that Java.com currently considers as an active period of time is 30 (thirty) days. Upon inactivity beyond this period, the new emails sent to the mailbox will not be delivered to you. The amount of time that Java.com currently considers as an inactive period of time is 45 (forty-five) days. Upon inactivity beyond this period, all the existing emails in the mailbox will be deleted. New emails sent to the mailbox will also not be delivered. Your right to get new mails and use the service will be resumed once you access the service but you will not get access to any of the above mails lost due to inactivity. The amount of time that Java.com currently considers as an extended period of time is 3 (three) months. The service is completely terminated for the user. Upon termination of the service, your right to use the Services immediately ceases. Java.com shall have no obligation to maintain any content or to forward any unread or unsent messages to you or any third party.");
ob.delay();
System.out.println("In case of any grievance, please contact the Grievance Officer. If you are the rightful owner of the content or an affected person and have the reason to believe that any content that has been uploaded/contributed through this Service contravenes your rights in violation of Rule 3 of the Information Technology (Intermediary Guidelines) Rules, 2011 (.Rules.), then you may intimate the same to JavaWold.com in the following manner: (a) Sending a request in writing or through email signed with electronic signature identifying the content alleged to be in infringement of your rights as the rightful owner or affecting you prejudicially; (b) Providing exact identification and description of the content by giving its URL that is to be disabled, which in your view contravenes Rule 3(2) of aforesaid .Rules.. (c) Giving a declaration cum undertaking alongwith necessary documents establishing you (i) as the rightful owner of the content to be disabled, or (ii) as an affected person, and stating that the information submitted is true, complete & accurate and no material fact has been hidden. Further, stating that JavaWold.com and its Management, Directors, employees, including Grievance Officer shall not be liable for any loss or damage or claim for relying upon the said request. (d) Contact information including address, telephone number, email address, etc. where you can be contacted if required. You can send your request to Grievance Officer, JavaWold.com at- Jai TAtia - Grievance Officer  JavaWold.com India Ltd.     Address- computer lab, Manovikas English Medium High School,Margao,Goa,  Email-grievances@JavaWoldworld.co.in      Phone- +91-223-613820000 (between 9am to 6pm IST from Monday - Friday except Public holidays) (e) The grievance(s) shall be redressed in accordance with the said Rules and in good faith by the Grievance Officer.© Copyright 1996 - 2012 JavaWoldWorld.Com India Limited. All Rights Reserved.");
ob.delay();
System.out.println("Enter 'Back' to go back");
String ba=br.readLine();
if(ba.equals("back"))
{
ob.delay1();
create obj=new create();
obj.account(user,pass);
}
}
}