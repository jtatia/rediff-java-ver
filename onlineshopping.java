import java.io.*;
import java.util.Date;
class onlineshopping
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

void delayl()
{
long i,j;
for(i=0;i<=900000000;i++)
{
}
for(j=0;j<=200000000;j++)
{}
}
void calculate()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
onlineshopping ob=new onlineshopping();
System.out.println();
ob.delay1();
String buy[]=new String[20];
int price[]=new int[20];
int sum=0;int x=0;
int art[]=new int[20];
int srno[][]={{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60},{
61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80},{81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100},{101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,
118,119,120},{121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140}};
String proname[][]={{"Cordless Steam Iron","Spy Car Key Chain Camera - 16 GB Expandable","Sewing Machine And Kids Learner Laptop","Universal USB Charger / Adaptor For iPod",
"Electronic Digital Safe - Best Functions","Vacuum Cleaner 800 Watt + 2 Slice Pop -up Toaster","Travel Charger Ac Power Adapter For Apple iPod","Sewing Machine With Foot Pedal",
 "Double Thread","Earphone With Changeable Colorful Earplugs","Penguin MP3 Speaker With Usb, SD And MMC Card","Walkman With Inbuilt Speaker","Attractive Fly Killer Cum Night Lamp - Very Useful",
"Universal Bluetooth Headset","Excellent Headphone With Microphone","Lint Remover","Clip On MP3 Player - 8 GB Expandable","Leatherite Cushioned Headphone With Microphone",
"2pcssony Playstation 2 PS2 Wireless Controller","Home Security Color Camera","Charger / Adaptor For Mp3, MP4 Players"},{"Stylish Simple Attractive Zero T Shirt","New Cotton Formal Shirt",
"Pack Of Three Collared T-shirts","Branded Quality Cotton Casual Shirt","Pack Of Three Collar T-shirt","Styilish And Trendy Cotton Casual Shirt","Formal And Casual Combo For Men",
"Pack Of Three Collared T-shirts","Puma Trendy Cotton T-shirt","Branded Quality Trouser And Premium Shirt Combo-3","Waterproof Reversible Stylish Rain Jacket",
"Rc-1 Raincoat With Cap And Cover-all Style","Rs-2 Rain Suite For Gents","Branded Premium Cotton Trouser","Double Grip - Revesable Rain Jacket Cum Windcheater",
"Pack Of Three Cotton Casual Shirts","Storm Breaker Rain Jacket","Sports Combo For Men","Branded Trouser And Premium Shirt Combo","Cotton Casual Shirt"},{"Sony Cybershot DSC W630 Digital Camera",
"Sony Cybershot DSC W620 Digital Camera","Canon Powershot A2200 Digital Camera","Canon Ixus 1100 Hs Point & Shoot","Nikon Coolpix L610 Digital Compact Camera",
"Olympus Vg 150 Digital Camera","Nikon Coolpix L26 Digital Camera","Nikon Coolpix L25 Digital Camera","New Canon Powershot Sx260 Digital Camera","New Canon Powershot A2200 Digital Camera",
"New Canon Powershot A2300 Digital Camera","Panasonic Lumix Dmc-ls5 Digital Camera 14 MP","Fujifilm Finepix Jz100 Point & Shoot","Fujifilm Finepix X100 Mirrorless","Fujifilm Finepix Jz100 Point & Shoot",
"Fujifilm X10 Point & Shoot","Fujifilm Finepix Ax500 Point & Shoot","Fujifilm S2980 Bridge","Fujifilm Finepix C25 Digital Camera","Fujifilm Sl260 Bridge"},{"Onion And Vegetable Chopper High Quality",
"Executive Set Kitchen Knife Set Of 7pcs","Executive Set 2 In 1 Super Slicer High Quality","Executive Apple Cutter Optimum Transmission","Executive Slicer Food Chopper Cut Slice Dry Fruit",
"Apple Cutter And French Fry Fries Potato Cutter Slicer","Executive Vegetable And Nut Slicer 1 Army Knife","Multi Purpose Kitchen Shears Scissor And 1 Army Knife Executive Set",
"Chilly-n-nut Cutter Executive Set Executive High Quality","6in1 Vegetable Cutting Slicer 1 Army Knife High Quality","6 Knives Concord German Kitchen Knife Set Executive Set",
"High Quality 6in1 Vegetable Cutting Slicer Executive Set","3 In1 Multi Purpose Kitchen Shears Scissor Executive Set","Executive Beater Must In Your Kitchen High Quality",
"Executive Set Concord Knives 6pc And Kitchen Shears Scissor","Executive Set Vegetable And Nut Slicer High Quality","Premium Executive Peeler Grater And Slicer",
"Executive High Quality Finger Chips Cutter High Quality","Executive High Quality Cleaning Brush 4pc High Quality","Faucet Water Filter Purifier Buy1get1free Executive Set"},{"Perfect Water Spray Gun",
"Combo Of 25 PCs Toolkit And Universal Foot Pump","41 Piece Professional Screwdriver Bit & Socket Set","Digital Electronic Safe With Anti Burglary Alarm","New Useful Glass Cutter - Wheel Model",
"New Useful Glass Cutter - Pointed Model","41 Pcstoolkit Screw Driver Set + Wire Cutter","41 Pcstoolkit Screw Driver Set + 10pcs Hex Key","41 PC Toolkit Screw Driver Set + 8 PC Spaner Set",
"41 PCs Toolkit Screw Driver Set + USB LED Light","41 PCs Toolkit Screw Driver Set + Cordless Shaver","41 PCs Toolkit Screw Driver Set + Cool Watch","41 PCs Toolkit Screw Driver Set + Pad Lock",
"11 In 1 Multipurpose Pocket Survival Tool","Imported Sewing Machine","Toolkit For Mobile And Laptop Repair","Screw Driver Set With Line Tester And 8 Bits","8 PCs Spanner Set Must In Every Home",
"Glue Gun With Free Extra Glue Sticks","41 PCs Magnetic Toolkit Screw Driver Set"},{"Walking Machine Burn Extra Fat & Stay Fit","New Magnetic Acupressure Needled Ball For Exercise",
"Ab Crunch / Ab Roller Fitness Equipment","New Useful Knee Support","Roll-up Arm Bands For Swimming For 3-6 Years Age","Fancy Arm Bands For Swimming For 6-12 Years Age",
"Useful Wrist Support","New Useful Ankle Support","New Useful Elbow Support","Palm Support - Special Sports Accessory","Electric Heating Pad For Pain Relief","Magnetic Acupressure Twister To Loose Weight",
"Acupressure Magnetic Power Mat","New Roller Skates For Kids","New Pair Of Table Tennis Rackets","New Pair Of Badminton Rackets","New Football - Good Quality","New Cricket Set For Kids",
"New Basket Ball - Good Quality","Skating Head Gear / Helmet For Kids"},{"Life Is So Beautiful","Smiles","Rich In Red","Red And White Roses","Dear Congratulations!!","Bouquet Of 15 Pink Carnation",
"Lilly's Bunch","Red Love Pure","Wine + Roses Bunch","First Love Of Sign","White & Pink Carnation","Gerbera Love Mix","Basket Enjoyfull","12 Red And White Roses","Combo Perfect",
"Roses With Kaju Burfi","Gerbera Red","Surprise With Cake","A Vase Of Roses","Bunch 5 Pink Lillies",}};
String orprice[][]={{"Rs. 1,199","Rs. 3,999","Rs. 2,698","Rs. 498","Rs. 14,999","Rs. 3,200","Rs. 1,198","Rs. 1,500","Rs. 698","Rs. 1,995","Rs. 800","Rs. 800","Rs. 998","Rs. 600","Rs. 800","Rs. 499","Rs. 700",
"Rs. 2,800","Rs. 3,000","Rs. 300"},{"Rs. 775","Rs. 975","Rs. 1,190","Rs. 1,150","Rs. 1,450","Rs. 1,450","Rs. 2,500","Rs. 1,090","Rs. 1,199","Rs. 3,459","Rs. 750","Rs. 399","Rs. 299","Rs. 1,590","Rs. 500",
"Rs. 2,999","Rs. 950","Rs. 950","Rs. 2,459","Rs. 1,450"},{"Rs. 7,990","Rs. 6,990","Rs. 5,495","Rs. 12,995","Rs. 13,950","Rs. 4,490","Rs. 5,450","Rs. 4,490","Rs. 18,995","Rs. 5,495","Rs. 6,995","Rs. 5,990",
"Rs. 7,999","Rs. 74,999","Rs. 7,999","Rs. 39,999","Rs. 4,999","Rs. 12,499","Rs. 5,499","Rs. 17,999"},{"Rs. 229","Rs. 500","Rs. 259","Rs. 250","Rs. 299","Rs. 350","Rs. 299","Rs. 299","Rs. 229","Rs. 399",
"Rs. 249","Rs. 399","Rs. 299","Rs. 299","Rs. 399","Rs. 299","Rs. 299","Rs. 225","Rs. 199","Rs. 199"},{"Rs. 950","Rs. 980","Rs. 700","Rs. 15,000","Rs. 498","Rs. 598","Rs. 1,200","Rs. 1,600","Rs. 1,600",
"Rs. 1,200","Rs. 1,600","Rs. 1,600","Rs. 1,200","Rs. 989","Rs. 1,998","Rs. 600","Rs. 900","Rs. 900","Rs. 1,200","Rs. 999"},{"Rs. 11,998","Rs. 898","Rs. 1,998","Rs. 698","Rs. 798","Rs. 898","Rs. 698","Rs. 498",
"Rs. 548","Rs. 548","Rs. 450","Rs. 800","Rs. 500","Rs. 1,198","Rs. 798","Rs. 898","Rs. 898","Rs. 998","Rs. 898","Rs. 800",},{"Rs. 1,589","Rs. 1,625","Rs. 1,425","Rs. 1,225","Rs. 1,225","Rs. 999","Rs. 1,899",
"Rs. 888","Rs. 2,500","Rs. 1,125","Rs. 999","Rs. 999","Rs. 1,099","Rs. 777","Rs. 1,999","Rs. 1,389","Rs. 1,125","Rs. 1,399","Rs. 1,389","Rs. 1,625"}};
int disprice[][]={{ 599, 599,1499,199,3498,1596,349,799,199,799,199 ,149,399,199 ,349,249 ,199 ,2499,1599,199},{199,325,499,399,499,399,549,499,499,799,499,399,299,699,449,899,499,399,799,
399},{7800,6800,5330,12500 ,13200 ,4399 ,5299 ,4360 ,17500 ,5100 ,6690 ,4790 ,7799 ,74799 ,7799 ,39799 ,3999 ,12299 ,3450 ,17799},{159,169,179,149,169,169,169,169,159,169,169,149,169,129,169,
149,169,129,109,129},{499,499,155,3600,199,149,299,349,399,349,399,399,299,199,998,199,199,249,399,145},{3498,198,1398,224,198,398,178,199,199,199,199,199,199,498,199,349,349,398,349,
199},{1299,1299,1199,849,845,666,1590,559,1999,858,659,779,729,529,1559,1099,885,1119,1099,1332}};
int c[]=new int[20]; 
String choice[]={"ELECTRONICS & GADGETS","APPARELS & ACCESSORIES","CAMERAS & ACCESSORIES","KITCHEN APPLIANCES & UTILITY","HARDWARES AND TOOLS","SPORTS & FITNESS","GIFTS"};
for(int i=0;i<7;i++)
{for(int j=0;j<20;j++)
{
proname[i][j]=proname[i][j].toUpperCase();
}
}
art[0]=0;
c[0]=0;

       System.out.println("How many items would you like to add to the cart");
           int num=Integer.parseInt(br.readLine());
           int i; 
           for(i=1;i<=num;i++)
           {  System.out.println("Please enter the serial number of the "+i+" th article");
               art[i]=Integer.parseInt(br.readLine());
               System.out.print("Quantity:");
               c[i]=Integer.parseInt(br.readLine());
             }
             System.out.println("Press '1' to submit");
              int d=Integer.parseInt(br.readLine());
        if(d==1)
        {
            int a=-0;
            for(int s=1;s<20;s++)
            {if(art[s]==0)
                {break;
                }
                for( i=0;i<7;i++)
            {  for(int j=0;j<20;j++)
                {            
                    if(art[s]==srno[i][j])
                    {   a++;
                        sum=sum+disprice[i][j]*c[s];
                        buy[a]=proname[i][j];
                price[a]=disprice[i][j];
                System.out.println("| "+a+" | "+proname[i][j]+"  |  "+disprice[i][j]); 
            }
            }
        }    }
                    System.out.println("Press 'p' to move towards the payment procedure");
                    
                    String cf=br.readLine();
                    if(cf.equals("p"))
                    {
                        System.out.println("Please fill in the details below. please be accurate so that we can safely deliver the prducts to you");
                        ob.delay();
                        System.out.print("First Name: ");
                        String name=br.readLine();
                        System.out.print("Last Name: ");
                        String last=br.readLine();
                        System.out.print("Address: ");
                        String add=br.readLine();
                        System.out.print("Country: ");
                        String count=br.readLine();
                        System.out.print("State: ");
                        String state=br.readLine();
                        System.out.print("City: ");
                        String city=br.readLine();
                        System.out.print("Pin/Zip: ");
                        String pin=br.readLine();
                        System.out.print("Mobile no.: 91");
                        String mob =br.readLine();
                        System.out.println("Press any key to continue to the second step");
                        String g=br.readLine();
                        ob.delay1();
                        System.out.println("Press '1' for Cash On Delivery");
                        System.out.println("Press '2' for payment by Credit Card");
                        int f=Integer.parseInt(br.readLine());
                        Date dat=new Date();
                        if(f==1) 
                        { int ds=0;
                            ob.delay1();
                            System.out.println("                                     JAVAWORLD SHOPPING BILL                                                                               ");
                            System.out.println("Name: "+name+""+last);
                            System.out.println("Address: "+add);
                            System.out.println("Date And Time: "+dat); 
                            System.out.println();
                            System.out.println("_______________________________________________________________________________");
                            System.out.println("|   SR.NO..  |   PRODUCT NAME  |   QUANTITY  |   PRICE  |  TOTAL                        ");
                            System.out.println("_______________________________________________________________________________");
                        for(i=1;i<20;i++)
                                {ds++;
                                 if(price[i]==0)
                                    break;
                                  int  st=price[i]*c[i];
                                    System.out.println("|       "+ds+"   |   "+buy[i]+"  |    "+c[i]+"   |   "+price[i]+"  "+st);
                                    
                          }
                          System.out.println("________________________________________________________________________________");
                          System.out.println("|                                                                      TOTAL= "+sum+"                         ");
                          System.out.println("________________________________________________________________________________");
                System.out.println("PRESS '0' TO EXIT");
                          System.out.println("PRESS '1' TO MAKE ANOTHER TRANSACTION");
                          System.out.println("PRESS ANY OTHER NUMBER TO GO BACK TO THE HOME PAGE");
                          int choi=Integer.parseInt(br.readLine());
                          if(choi==0)
                          {ob.delay1();
                          System.out.println("THANK YOU FOR USING JAVAWORLD SHOPPING");
                          ob.delay();
                          System.out.println("YOU WILL RECIEVE THE PURCHASED PRODUCTS WITHIN 7 DAYS");
                          ob.delay();
                          System.out.println("PLEASE CONTACT OUR REGIONAL COORDINATOR FOR ANY QUERIES");
                          ob.delay();
                          System.out.println(" VISIT SOON");
                          
                                                                }
                                                                else if(choi==1)
                                                                {ob.display();
                                                                }
                                                                else
                                                                {
                                                                    Home obj=new Home();
                                                                    obj.main();
                                                                }
                          
                        
                        
                        }
                else if(f==2)
                {int ss=0;
                while( ss==0)
                {System.out.println("Welcome to CREDIT CARD BANKING");
                     System.out.print("TYPE(eg.Visa): ");
                    String type=br.readLine();
                    System.out.print("Card Holders Name");
                   String cn=br.readLine();
                    System.out.print("Card Number: ");
                    String card=br.readLine();
                    System.out.println("EXPIRY DATE(MM/YYYY): ");
                    String ed=br.readLine();
                    System.out.print("Cvv NO: ");
                    int cvv=Integer.parseInt(br.readLine());
                   if((cvv<100)&&(cvv>999))
                   {System.out.println("Wrong Input");
                       continue;
                    }
                ss=1;}
                    ob.delay1();
                    System.out.println("Tansaction Password:");
                    String tp=br.readLine();
                    ob.delay1();
                    System.out.println("Please do not close this window nor press any key sice the transactin is going on");
                    ob.delay();
                    ob.delay();
                    System.out.println("Thank You for using credit card banknig");
                    System.out.println("Transaction has been carried out");
                    int ds=0;
                            ob.delay1();
                            System.out.println("                                     JAVAWORLD SHOPPING BILL                                                                               ");
                            System.out.println("Name: "+name+""+last);
                            System.out.println("Address: "+add);
                            System.out.println("Date And Time: "+dat); 
                            System.out.println();
                            System.out.println("_______________________________________________________________________________");
                            System.out.println("|   SR.NO..  |   PRODUCT NAME  |   QUANTITY  |   PRICE  |  TOTAL                        ");
                            System.out.println("_______________________________________________________________________________");
                        for(i=1;i<20;i++)
                                {ds++;
                                 if(price[i]==0)
                                    break;
                                  int  st=price[i]*c[i];
                                    System.out.println("|       "+ds+"   |   "+buy[i]+"  |    "+c[i]+"   |   "+price[i]+"  "+st);
                                    
                          }
                          System.out.println("________________________________________________________________________________");
                          System.out.println("|                                                                      TOTAL= "+sum+"                         ");
                          System.out.println("________________________________________________________________________________");
                          System.out.println();
                          System.out.println("PRESS '0' TO EXIT");
                          System.out.println("PRESS '1' TO MAKE ANOTHER TRANSACTION");
                          System.out.println("PRESS ANY OTHER NUMBER TO GO BACK TO THE HOME PAGE");
                          int choi=Integer.parseInt(br.readLine());
                          if(choi==0)
                          {ob.delay1();
                          System.out.println("THANK YOU FOR USING JAVAWORLD SHOPPING");
                          ob.delay();
                          System.out.println("YOU WILL RECIEVE THE PURCHASED PRODUCTS WITHIN 7 DAYS");
                          ob.delay();
                          System.out.println("PLEASE CONTACT OUR REGIONAL COORDINATOR FOR ANY QUERIES");
                          ob.delay();
                          System.out.println(" VISIT SOON");
                          
                                                                }
                                                                else if(choi==1)
                                                                {ob.display();
                                                                }
                                                                else
                                                                {
                                                                    Home obj=new Home();
                                                                    obj.main();
                                                                }
                                                            }
                                                        }
    }   
        else
        System.out.println("Wrong Input");
    }
static void display()throws IOException
{onlineshopping ob=new onlineshopping();
ob.delay1();
System.out.println("                                                        WELCOME TO JAVA SHOPPING                                        ");
ob.delayl();
ob.delayl();
System.out.println("Over here you will get the best quality products at very cheap rate");
ob.delayl();
System.out.println("We have also introduced 'Cash On Delivery!!!'");
ob.delayl();
System.out.println("Therefore you can pay for the product after the delivery");
ob.delayl();
System.out.println("In case of exchange please return the product in its original condition within 21 days from the date of purchase");
ob.delayl();
System.out.println(" © javashopping 2001=2012. all rights reserved");
ob.delayl();
System.out.println("HAPPY SHOPPING");
ob.delayl();
ob.main();
}
void main()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
onlineshopping ob=new onlineshopping();
System.out.println();
int r=0;int a=0;
int srno[][]={{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,
60},{61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80},{81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100},{101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,
117,118,119,120},{121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140}};
String proname[][]={{"Cordless Steam Iron","Spy Car Key Chain Camera - 16 GB Expandable","Sewing Machine And Kids Learner Laptop","Universal USB Charger / Adaptor For iPod",
"Electronic Digital Safe - Best Functions","Vacuum Cleaner 800 Watt + 2 Slice Pop -up Toaster","Travel Charger Ac Power Adapter For Apple iPod","Sewing Machine With Foot Pedal",
 "Double Thread","Earphone With Changeable Colorful Earplugs","Penguin MP3 Speaker With Usb, SD And MMC Card","Walkman With Inbuilt Speaker","Attractive Fly Killer Cum Night Lamp - Very Useful",
"Universal Bluetooth Headset","Excellent Headphone With Microphone","Lint Remover","Clip On MP3 Player - 8 GB Expandable","Leatherite Cushioned Headphone With Microphone",
"2pcssony Playstation 2 PS2 Wireless Controller","Home Security Color Camera","Charger / Adaptor For Mp3, MP4 Players"},{"Stylish Simple Attractive Zero T Shirt","New Cotton Formal Shirt",
"Pack Of Three Collared T-shirts","Branded Quality Cotton Casual Shirt","Pack Of Three Collar T-shirt","Styilish And Trendy Cotton Casual Shirt","Formal And Casual Combo For Men",
"Pack Of Three Collared T-shirts","Puma Trendy Cotton T-shirt","Branded Quality Trouser And Premium Shirt Combo-3","Waterproof Reversible Stylish Rain Jacket",
"Rc-1 Raincoat With Cap And Cover-all Style","Rs-2 Rain Suite For Gents","Branded Premium Cotton Trouser","Double Grip - Revesable Rain Jacket Cum Windcheater",
"Pack Of Three Cotton Casual Shirts","Storm Breaker Rain Jacket","Sports Combo For Men","Branded Trouser And Premium Shirt Combo","Cotton Casual Shirt"},{"Sony Cybershot DSC W630 Digital Camera",
"Sony Cybershot DSC W620 Digital Camera","Canon Powershot A2200 Digital Camera","Canon Ixus 1100 Hs Point & Shoot","Nikon Coolpix L610 Digital Compact Camera",
"Olympus Vg 150 Digital Camera","Nikon Coolpix L26 Digital Camera","Nikon Coolpix L25 Digital Camera","New Canon Powershot Sx260 Digital Camera","New Canon Powershot A2200 Digital Camera",
"New Canon Powershot A2300 Digital Camera","Panasonic Lumix Dmc-ls5 Digital Camera 14 MP","Fujifilm Finepix Jz100 Point & Shoot","Fujifilm Finepix X100 Mirrorless","Fujifilm Finepix Jz100 Point & Shoot",
"Fujifilm X10 Point & Shoot","Fujifilm Finepix Ax500 Point & Shoot","Fujifilm S2980 Bridge","Fujifilm Finepix C25 Digital Camera","Fujifilm Sl260 Bridge"},{"Onion And Vegetable Chopper High Quality",
"Executive Set Kitchen Knife Set Of 7pcs","Executive Set 2 In 1 Super Slicer High Quality","Executive Apple Cutter Optimum Transmission","Executive Slicer Food Chopper Cut Slice Dry Fruit",
"Apple Cutter And French Fry Fries Potato Cutter Slicer","Executive Vegetable And Nut Slicer 1 Army Knife","Multi Purpose Kitchen Shears Scissor And 1 Army Knife Executive Set",
"Chilly-n-nut Cutter Executive Set Executive High Quality","6in1 Vegetable Cutting Slicer 1 Army Knife High Quality","6 Knives Concord German Kitchen Knife Set Executive Set",
"High Quality 6in1 Vegetable Cutting Slicer Executive Set","3 In1 Multi Purpose Kitchen Shears Scissor Executive Set","Executive Beater Must In Your Kitchen High Quality",
"Executive Set Concord Knives 6pc And Kitchen Shears Scissor","Executive Set Vegetable And Nut Slicer High Quality","Premium Executive Peeler Grater And Slicer",
"Executive High Quality Finger Chips Cutter High Quality","Executive High Quality Cleaning Brush 4pc High Quality","Faucet Water Filter Purifier Buy1get1free Executive Set"},{"Perfect Water Spray Gun",
"Combo Of 25 PCs Toolkit And Universal Foot Pump","41 Piece Professional Screwdriver Bit & Socket Set","Digital Electronic Safe With Anti Burglary Alarm","New Useful Glass Cutter - Wheel Model",
"New Useful Glass Cutter - Pointed Model","41 Pcstoolkit Screw Driver Set + Wire Cutter","41 Pcstoolkit Screw Driver Set + 10pcs Hex Key","41 PC Toolkit Screw Driver Set + 8 PC Spaner Set",
"41 PCs Toolkit Screw Driver Set + USB LED Light","41 PCs Toolkit Screw Driver Set + Cordless Shaver","41 PCs Toolkit Screw Driver Set + Cool Watch","41 PCs Toolkit Screw Driver Set + Pad Lock",
"11 In 1 Multipurpose Pocket Survival Tool","Imported Sewing Machine","Toolkit For Mobile And Laptop Repair","Screw Driver Set With Line Tester And 8 Bits","8 PCs Spanner Set Must In Every Home",
"Glue Gun With Free Extra Glue Sticks","41 PCs Magnetic Toolkit Screw Driver Set"},{"Walking Machine Burn Extra Fat & Stay Fit","New Magnetic Acupressure Needled Ball For Exercise",
"Ab Crunch / Ab Roller Fitness Equipment","New Useful Knee Support","Roll-up Arm Bands For Swimming For 3-6 Years Age","Fancy Arm Bands For Swimming For 6-12 Years Age",
"Useful Wrist Support","New Useful Ankle Support","New Useful Elbow Support","Palm Support - Special Sports Accessory","Electric Heating Pad For Pain Relief","Magnetic Acupressure Twister To Loose Weight",
"Acupressure Magnetic Power Mat","New Roller Skates For Kids","New Pair Of Table Tennis Rackets","New Pair Of Badminton Rackets","New Football - Good Quality","New Cricket Set For Kids",
"New Basket Ball - Good Quality","Skating Head Gear / Helmet For Kids"},{"Life Is So Beautiful","Smiles","Rich In Red","Red And White Roses","Dear Congratulations!!","Bouquet Of 15 Pink Carnation",
"Lilly's Bunch","Red Love Pure","Wine + Roses Bunch","First Love Of Sign","White & Pink Carnation","Gerbera Love Mix","Basket Enjoyfull","12 Red And White Roses","Combo Perfect",
"Roses With Kaju Burfi","Gerbera Red","Surprise With Cake","A Vase Of Roses","Bunch 5 Pink Lillies",}}; 
String orprice[][]={{"Rs. 1,199","Rs. 3,999","Rs. 2,698","Rs. 498","Rs. 14,999","Rs. 3,200","Rs. 1,198","Rs. 1,500","Rs. 698","Rs. 1,995","Rs. 800","Rs. 800","Rs. 998","Rs. 600","Rs. 800","Rs. 499","Rs. 700",
"Rs. 2,800","Rs. 3,000","Rs. 300"},{"Rs. 775","Rs. 975","Rs. 1,190","Rs. 1,150","Rs. 1,450","Rs. 1,450","Rs. 2,500","Rs. 1,090","Rs. 1,199","Rs. 3,459","Rs. 750","Rs. 399","Rs. 299","Rs. 1,590","Rs. 500",
"Rs. 2,999","Rs. 950","Rs. 950","Rs. 2,459","Rs. 1,450"},{"Rs. 7,990","Rs. 6,990","Rs. 5,495","Rs. 12,995","Rs. 13,950","Rs. 4,490","Rs. 5,450","Rs. 4,490","Rs. 18,995","Rs. 5,495","Rs. 6,995","Rs. 5,990",
"Rs. 7,999","Rs. 74,999","Rs. 7,999","Rs. 39,999","Rs. 4,999","Rs. 12,499","Rs. 5,499","Rs. 17,999"},{"Rs. 229","Rs. 500","Rs. 259","Rs. 250","Rs. 299","Rs. 350","Rs. 299","Rs. 299","Rs. 229","Rs. 399",
"Rs. 249","Rs. 399","Rs. 299","Rs. 299","Rs. 399","Rs. 299","Rs. 299","Rs. 225","Rs. 199","Rs. 199"},{"Rs. 950","Rs. 980","Rs. 700","Rs. 15,000","Rs. 498","Rs. 598","Rs. 1,200","Rs. 1,600","Rs. 1,600",
"Rs. 1,200","Rs. 1,600","Rs. 1,600","Rs. 1,200","Rs. 989","Rs. 1,998","Rs. 600","Rs. 900","Rs. 900","Rs. 1,200","Rs. 999"},{"Rs. 11,998","Rs. 898","Rs. 1,998","Rs. 698","Rs. 798","Rs. 898","Rs. 698","Rs. 498",
"Rs. 548","Rs. 548","Rs. 450","Rs. 800","Rs. 500","Rs. 1,198","Rs. 798","Rs. 898","Rs. 898","Rs. 998","Rs. 898","Rs. 800",},{"Rs. 1,589","Rs. 1,625","Rs. 1,425","Rs. 1,225","Rs. 1,225","Rs. 999","Rs. 1,899",
"Rs. 888","Rs. 2,500","Rs. 1,125","Rs. 999","Rs. 999","Rs. 1,099","Rs. 777","Rs. 1,999","Rs. 1,389","Rs. 1,125","Rs. 1,399","Rs. 1,389","Rs. 1,625"}};
int disprice[][]={{ 599, 599,1499,199,3498,1596,349,799,199,799,199 ,149,399,199 ,349,249 ,199 ,2499,1599,199},{199,325,499,399,499,399,549,499,499,799,499,399,299,699,449,899,499,399,799,
399},{7800,6800,5330,12500 ,13200 ,4399 ,5299 ,4360 ,17500 ,5100 ,6690 ,4790 ,7799 ,74799 ,7799 ,39799 ,3999 ,12299 ,3450 ,17799},{159,169,179,149,169,169,169,169,159,169,169,149,169,129,169,
149,169,129,109,129},{499,499,155,3600,199,149,299,349,399,349,399,399,299,199,998,199,199,249,399,145},{3498,198,1398,224,198,398,178,199,199,199,199,199,199,498,199,349,349,398,349,
199},{1299,1299,1199,849,845,666,1590,559,1999,858,659,779,729,529,1559,1099,885,1119,1099,1332}};
String choice[]={"ELECTRONICS & GADGETS","APPARELS & ACCESSORIES","CAMERAS & ACCESSORIES","KITCHEN APPLIANCES & UTILITY","HARDWARES AND TOOLS","SPORTS & FITNESS","GIFTS"};
for(int i=0;i<7;i++)
{for(int j=0;j<20;j++)
{
proname[i][j]=proname[i][j].toUpperCase();
}
}
while(r==0)
{
System.out.println("Enter the first three letters of the product");
System.out.println("Enter 'view' to view the poducts");
System.out.println("Press 'Enter' to view all the products");
String choose=br.readLine();
if(choose.equals("view"))
{
for(int i=0;i<7;i++)
{
System.out.println("Press  "+i+" for "+choice[i]);
ob.delay();
}
 int ch=Integer.parseInt(br.readLine());
System.out.println("__________________________________________________________________________________________________________");
System.out.println("|          PRODUCT NAME              |     ORIGINAL PRICE   |   DISCOUNTED PRICE   |");
System.out.println("___________________________________________________________________________________________________________");
 System.out.println(choice[ch]);
{System.out.println("_________________________________________________________________________________________________________________________");
for(int i=ch;i<=ch;i++)
for(int j=0;j<20;j++)
{                        System.out.println("                                                                                                                             please note down the products serial no.");
     System.out.println("________________________________________________________________________");                   
System.out.print("|     ");
                    System.out.print(srno[i][j]+" ");
                    System.out.printf(proname[i][j]);
                    System.out.print("     |    ");
                    System.out.printf(orprice[i][j]);
                    System.out.print("   |        Rs.");
                    System.out.printf("",disprice[i]);
                    System.out.println("________________________________________________________________________");
}
            }
        System.out.println("Enter 'next' to move towards the next step");
        System.out.println("Press any other key to go back to the menu");
        String nex=br.readLine();
        if(nex.equals("next"))
        {ob.calculate();
        }
        else
        ob.main();
    }
   else if(choose.equals(""))
   {
System.out.println("__________________________________________________________________________________________________________");
System.out.println("|          PRODUCT NAME              |     ORIGINAL PRICE   |   DISCOUNTED PRICE   |");
System.out.println("___________________________________________________________________________________________________________");
 
      for(int i=0;i<7;i++)
{System.out.println(choice[i]); 
                System.out.println("                                                                                                                                        please note down the products serial no.");
System.out.println("___________________________________________________________________________________________________________");    
for(int j=0;j<20;j++)
{
                   System.out.print("|     ");
                    System.out.print(srno[i][j]+" ");
                    System.out.printf(proname[i][j]);
                    System.out.print("     |    ");
                    System.out.printf(orprice[i][j]);
                    System.out.print("   |        Rs.");
                    System.out.printf("",disprice[i]);
                    System.out.println(" | ");                    
           
                }
            }
        System.out.println("Enter 'next' to move towards the next step");
        System.out.println("Press any other key to go back to the menu");
        String nex=br.readLine();
        if(nex.equals("next"))
        {ob.calculate();
        }
        else
        ob.main();
    }
        else
          {int as=0;
System.out.println("___________________________________________________________________________________  ");
System.out.println("|PRODUCT SERIAL NO.  |       PRODUCT NAME              |     ORIGINAL PRICE   |   DISCOUNTED PRICE   |");
System.out.println("____________________________________________________________________________________");
              for(int i=0;i<7;i++)
            {for(int j=0;j<20;j++)
                {choose=choose.toUpperCase();
                    if(proname[i][j].startsWith(choose))
                    {as++;
                        System.out.println("                                                                                                                             please note down the products serial no.");
                        System.out.println("________________________________________________________________________");
                        System.out.println("|  "+srno[i][j]+"  |  "+proname[i][j]+"  |  "+orprice[i][j]+"  |  "+disprice[i][j]);
                        System.out.println("_________________________________________________________________________");
                    }
                }
            }
            if(as==0)
            {System.out.println("Sorry. no match.");
            }   System.out.println("Enter 'next' to move towards the next step");
        System.out.println("Press any other key to go back to the menu");
        String nex=br.readLine();
        if(nex.equals("next"))
        {ob.calculate();
        }
        else
        ob.main();
   
   }
}   
}                          
}
                      
                        
                        
                        
                        

                        
                        
                        
                        
                        
                        
                        
                
                
                
                
                
                
                
                
                
                
















