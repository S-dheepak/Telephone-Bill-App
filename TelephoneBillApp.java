import java.util.*;
class TelephoneBillApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Dear User Welcome To DS Services");
		System.out.println("Click 1 to know more about our service cost \nClick 2 to exit the app");
		Scanner sc=new Scanner(System.in);
		int sel=sc.nextInt();
		switch(sel)
		{
			case 1: System.out.println("We offer both prepaid and post-paid plans");
			        System.out.println("To know more about: \nprepaid plans Enter Pre \npost-paid plans Enter Post");
					String p=sc.next();
					if( p.equalsIgnoreCase("Pre") )    // ( p.equals("Pre")|| p.equals("pre") || p.equals("PRE") )
						{
							System.out.println("Select your requirement : \n1.Data pack \n2.Talk-time \n3.Roaming \n4.Add-ons");
							int req1=sc.nextInt();
                           
							switch(req1)
							{
								case 1: System.out.println("1.1GB/Day \n2.1.5GB/Day \n3.2GB/Day");
								int dp=sc.nextInt();
								if(dp==1)
								{
									System.out.println("99Rs/28Days");
								}
								else if(dp==2)
								{
										System.out.println("115Rs/28Days");
								}
								else if(dp==3)
								{
										System.out.println("148Rs/28Days");
								}
								else
								{
									System.out.println("No valid Data Pack is selected");
								}
								break;

								case 2: System.out.println("1.One Day Unlimited Calls \n2.50Calls/Week \n3.200Calls/Month");
								int tt=sc.nextInt();
								if(tt==1)
								{
									System.out.println("25Rs/Day");
								}
								else if(tt==2)
								{
									System.out.println("105Rs/7Days");
								}
								else if(tt==3)
								{
									System.out.println("335Rs/28Days");
								}
								else
								{
									System.out.println("No valid Talk-Time is selected");
								}
								break;

								case 3: System.out.println("1.Roaming Inside India \n2.Roaming International");
								int roam=sc.nextInt();
								if(roam==1)
								{
									System.out.println("11Rs/1Hour");
								}
								else if(roam==2)
								{
									System.out.println("88Rs/1Hour");
								}
								else
								{
									System.out.println("Invalid Roaming");
								}
								break;

								case 4: System.out.println("1.1GB \n2.1.5GB \n3.2GB \n4.5GB \n5.25GB");
								int add=sc.nextInt();
								if(add==1)
								{
									System.out.println("11Rs");
								}
								else if(add==2)
								{
									System.out.println("18Rs");
								}
								else if(add==3)
								{
									System.out.println("25Rs");
								}
								else if(add==4)
								{
									System.out.println("50Rs");
								}
								else if(add==5)
								{
									System.out.println("150Rs");
								}
								else
								{
									System.out.println("Invalid Add-on pack");
								}
								break;

								default: System.out.println("No proper requirement");
								break;
							}
						}
						else if(p.equalsIgnoreCase("Post"))         //(p.equals("Post") || p.equals("post") || p.equals("POST") )
						{
							System.out.println("Select your requirment : \n1.Unlimited Calls(Domestic only) \n2.Unlimited Calls(Domestic only)+100GB 4G Internet \n3.500mins Call(International) or 1000mins Call(Domestic only)");
							int req2=sc.nextInt();
                           
							switch(req2)
							{
								case 1: System.out.println("100Rs");
								break;

								case 2: System.out.println("250Rs");
								break;

								case 3: System.out.println("750Rs");
								break;

								default :System.out.println("Invalid Post-paid plan");
							}
						break;
						}
					
		case 2: System.out.println("Thanks for choosing DS service provider");
			        break;
		
		default:	System.out.println("Invalid Selection");
		                 break;
	
		}
	}
}
