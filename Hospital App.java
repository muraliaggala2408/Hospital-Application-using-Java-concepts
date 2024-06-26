import java.util.*;
class cv
{
	static Scanner sc = new Scanner(System.in);

	static String reset = "\u001B[0m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	static String blue = "\u001B[34m";
	static String violet = "\u001B[35m";
	static String skyblue = "\u001B[36m";
	static String white = "\u001B[37m";
	static String blink = "\u001B[5m";

	static String red1 = "\u001B[101m";
	static String green1 = "\u001B[102m";
	static String yellow1 = "\u001B[103m";
	static String blue1 = "\u001B[104m";
	static String violet1 = "\u001B[105m";
	static String skyblue1 = "\u001B[106m";
	static String white1 = "\u001B[107m";

	static String bold = "\u001B[1m";
	static String thickness = "\u001B[2m";
	static String hello = "\u001B[3m";
	static String underline = "\u001B[4m";

	static void sleep()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{

		}
	}
	static void sleep1()
	{
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{

		}
	}
	static void sleep2()
	{
		try
		{
			Thread.sleep(5);
		}
		catch(InterruptedException e)
		{

		}
	}

	static void sleep3()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{

		}
	}
}



class login
{
	private String user_name="Murali";
	private String password="123456";
	private String phone="9949925551";
	void setu(String u)
	{
		this.user_name=u;
	}
	void setp(String p)
	{
		this.password=p;
	}
	void setph(String ph)
	{
		this.phone=ph;
	}
	void setup(String u,String p)
	{
		this.user_name=u;
		this.password=p;
	}
	String getu()
	{
		return user_name;
	}
	String getp()
	{
		return password;
	}
	String getph()
	{
		return phone;
	}
}
	
class colors extends login
{
	static String fviolet="\u001B[35m";
	static String fred="\u001B[31m";
	static String fgreen="\u001B[32m";				
	static String fyellow="\u001B[33m";				
	static String fblue="\u001B[34m";
	static String fskyblue="\u001B[36m";
	static String fcyan="\u001B[36m";
	static String bred="\u001B[101m";
	static String bgreen="\u001B[102m";
	static String byellow="\u001B[103m";
	static String bblue="\u001B[104m";
	static String bviolet="\u001B[105m";
	static String bskyblue="\u001B[106m";
	
	static String reset="\u001B[0m";
	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String underline="\u001B[4m";
	static void clear()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	static void sleep(int a)
	{
		try{
			Thread.sleep(a);
		}
		catch(InterruptedException e)
		{
			System.out.println("hello");
		}
	
	}
}

class project extends colors
{
	static Scanner sc=new Scanner(System.in);
	static project y=new project();
	static String u;
	static String p;
	static String ph;
	static int va = 0;
	static int da;
	static void loginprocess()
	{
		System.out.println(fskyblue+thick+"Enter your user_name & password:"+reset);
		System.out.print("\tuser_name:  "+thick+fyellow);
		u=sc.nextLine();
		System.out.print(reset+"\tpassword :  "+thick+fyellow);
		p=sc.nextLine();
		System.out.println(reset);
		if(u.equalsIgnoreCase(y.getu()) && p.equalsIgnoreCase(y.getp()))
		{
			String t1="-------------L O G I N       S U C C E S S F U L-------------";
			for(int i=0;i<=t1.length()-1;i++)
			{
				if(i==0)
				    System.out.print("\n\t\t\t\t\t");
				System.out.print(thick+fskyblue+underline+t1.charAt(i));
				sleep(50);
			}
			va++;
			System.out.println(reset);
		}
		else if(!(u).equalsIgnoreCase(y.getu()) && !(p).equalsIgnoreCase(y.getp()))
		{
			System.out.println(fred+"\t\t\t\t\t\tWrong User_name & Password");
			System.out.println(fskyblue+change+"PRESS: 1"+reset+fblue+thick+"  -->  login again\n"+reset);
			System.out.println(fskyblue+change+"PRESS: 2"+reset+fblue+thick+"  -->  Reset Your user_name & password"+reset);
			System.out.println(fskyblue+change+"PRESS: 3"+reset+fblue+thick+"  -->  exit"+reset);
			int n=Integer.parseInt(sc.nextLine());
			while(true)
			{
				if(n==1)
				{
			   		loginprocess();
					break;
				}
				else if(n==2)
				{
					System.out.println("\t\t\tEnter phone number to reset username & password:");
					while(true)
					{
						ph=sc.nextLine();
						int len=ph.length();
						if(len==10)
						{
							if(ph.equals(y.getph()))
							{
								System.out.println(fred+thick+"\t\t\tPLEASE WAIT WHILE GENERATING OTP.....");
					  			sleep(1500);
								while(true)
				  				{
									int otp=1000+(int)(Math.random()*8999);
									System.out.println(fblue+thick+"\t\t\tYOUR OTP IS:  "+otp+reset);
									System.out.print("Enter your otp:");
									int x=Integer.parseInt(sc.nextLine());
									if(x==otp)
									{
										System.out.println("\t\t\t\t\t\tOTP MATCHED");
										System.out.print("\t\t\t\t\t\tUSER NAME  :-----");sleep(2000);
										System.out.println(y.getu());
										System.out.print("\t\t\t\t\t\tPASSWORD  :-----");sleep(2000);
										System.out.println(y.getp());sleep(2000);
										System.out.println();
										System.out.println();
										M1();	
										break;
									}
									else
									{
										System.out.println(fred+"\t\t\tOTP NOT MATCHED"+reset);
										System.out.println(fgreen+"\t\t\tPLEASE WAIT WHILE RE-GENERATING OTP....."+reset);
										sleep(2000);
									}
			  					}
							}
							else
							{
								System.out.println("YOU ARE NOT A USER");
								System.out.println(fred+"\t\t\t\t\t1---SIGNUP"+reset);
								System.out.println(fgreen+"\t\t\t\t\t2---EXIT "+reset);
								int se=Integer.parseInt(sc.nextLine());
								while(true)
								{
									if(se==1)
									{
										signup();
										break;
									}
									else if(se==2)
									{
										break;
									}
									else
									{
										System.out.println(fyellow+"INVALID INPUT"+reset);
									}
								}
									
							}
							break;
						}
						else
						{
							System.out.println(fred+"\t\t\t\tYOU ENTER INVALID PHONE NUMBER"+reset);
							System.out.println(fgreen+"\t\t\t\tPLEASE ENTER VALID PHONE NUMBER"+reset);
						}
					}
					break;
				}
				else if(n==3)
				{
					break;
				}
				else
				{
			 	 	System.out.println(fred+"\t\t\t\t\tYour Entered Wrong Number:"+reset);
				}
			}
		}
		else if(!(u).equalsIgnoreCase(y.getu()))
		{
			System.out.println(fred+"\t\t\t\t\tWrong User_Name:");
			System.out.println(fskyblue+change+"PRESS: 1"+reset+fblue+thick+"  -->  LOGIN AGAIN"+reset);
			System.out.println(fskyblue+change+"PRESS: 2"+reset+fblue+thick+"  -->  RESET"+reset);
			System.out.println(fskyblue+change+"PRESS: 3"+reset+fblue+thick+"  -->  EXIT"+reset);
			while(true)
			{
				int ga = Integer.parseInt(sc.nextLine());
				if(ga==2)
				{
					System.out.println(fred+thick+"\t\t\tEnter phone number to reset username :"+reset);
					while(true)
					{
						ph=sc.nextLine();
						int len=ph.length();
						if(len==10)
						{
							if(ph.equals(y.getph()))
							{
								System.out.println(fred+thick+"\t\t\tPLEASE WAIT WHILE GENERATING OTP.....");
					  			sleep(1500);
								while(true)
				  				{
									int otp=1000+(int)(Math.random()*8999);
									System.out.println(fblue+thick+"\t\t\tYOUR OTP IS:  "+otp+reset);
									System.out.print("Enter your otp:");
									int x=Integer.parseInt(sc.nextLine());
									if(x==otp)
									{
										System.out.println("OTP MATCHED");
										System.out.println(fgreen+"\t\t\tenter your user name"+reset);
										u=sc.nextLine();
										y.setu(u);
										System.out.println("\t\t\t\t\t\t\t\t  Username is updated successfully");
										System.out.println("\t\t\t\t\t\t\t\t Youe username = "+y.getu());
										System.out.println(fred+"\t\t\t\t\t\t\t\t  1 .  Login "+reset);
										System.out.println(fgreen+"\t\t\t\t\t\t\t\t+  2 .  Exit "+reset);
										while(true)
										{
											int gb = Integer.parseInt(sc.nextLine());
											if(gb==1)
											{
												loginprocess();
												break;
											}
											else if(ga==2)
											{
												System.out.println(fred+"\t\t\t\t\t\t\t\t  Terminated successfully"+reset);
												break;
											}
											else
											{
												System.out.println(fred+"please enter valid option"+reset);
											}
										}	
										break;
									}
									else
									{
										System.out.println(fred+"\t\t\tOTP NOT MATCHED"+reset);
										System.out.println(fgreen+"\t\t\tPLEASE WAIT WHILE RE-GENERATING OTP....."+reset);
										sleep(2000);
									}
			  					}
							}
							else
							{
								System.out.println("ENTER A VALID USER");
								System.out.println(fred+"\t\t\t\t\t1---SIGNUP"+reset);
								System.out.println(fgreen+"\t\t\t\t\t2---EXIT "+reset);
								int se=Integer.parseInt(sc.nextLine());
								while(true)
								{
									if(se==1)
									{
										signup();
										break;
									}
									else if(se==2)
									{
										break;
									}
									else
									{
										System.out.println(fred+"INVALID INPUT"+reset);
									}
								}
									
							}
							break;
						}
						else
						{
							System.out.println(fred+"\t\t\t\tYOU ENTER INVALID PHONE NUMBER"+reset);
							System.out.println(fgreen+"\t\t\t\tPLEASE ENTER VALID PHONE NUMBER"+reset);
						}
					}
					break;
				}
				else if(ga==1)
				{
					loginprocess();
					break;
				}
				else if(ga==3)
				{
					System.out.print("Sucessfully terminated");
					break;
				}
				else
				{	
					System.out.println("PLEASE ENTER VALID INPUT");
				}
			}
			  
		}
		else
		{
			System.out.println(fred+"\t\t\t\t\tWrong Password:");
			System.out.println(fskyblue+change+"PRESS: 1"+reset+fblue+thick+"  -->  LOGIN AGAIN"+reset);
			System.out.println(fskyblue+change+"PRESS: 2"+reset+fblue+thick+"  -->  RESET"+reset);
			System.out.println(fskyblue+change+"PRESS: 3"+reset+fblue+thick+"  -->  EXIT"+reset);
			while(true)
			{
				int ga = Integer.parseInt(sc.nextLine());
				if(ga==2)
				{
					System.out.println("\t\t\tEnter phone number to reset password :");
					while(true)
					{
						ph=sc.nextLine();
						int len=ph.length();
						if(len==10)
						{
							if(ph.equals(y.getph()))
							{
								System.out.println(fred+thick+"\t\t\tPLEASE WAIT WHILE GENERATING OTP.....");
					  			sleep(1500);
								while(true)
				  				{
									int otp=1000+(int)(Math.random()*8999);
									System.out.println(fblue+thick+"\t\t\tYOUR OTP IS:  "+otp+reset);
									System.out.print("Enter your otp:");
									int x=Integer.parseInt(sc.nextLine());
									if(x==otp)
									{
										System.out.println("OTP MATCHED");
										System.out.println("enter your password");
										p=sc.nextLine();
										y.setp(p);
										System.out.println("\t\t\t\t\t\t\t\t  password is updated successfully");
										System.out.println("\t\t\t\t\t\t\t\t Youe password = "+y.getp());
										System.out.println("\t\t\t\t\t\t\t\t  1 .  Login ");
										System.out.println("\t\t\t\t\t\t\t\t  2 .  Exit ");
										while(true)
										{
											int gb = Integer.parseInt(sc.nextLine());
											if(gb==1)
											{
												loginprocess();
												break;
											}
											else if(ga==2)
											{
												System.out.println(fred+"\t\t\t\t\t\t\t\t  Terminated successfully"+reset);
												break;
											}
											else
											{
												System.out.println(fred+"please enter valid option"+reset);
											}
										}	
										break;
									}
									else
									{
										System.out.println(fred+"\t\t\tOTP NOT MATCHED"+reset);
										System.out.println(fgreen+"\t\t\tPLEASE WAIT WHILE RE-GENERATING OTP....."+reset);
										sleep(2000);
									}
			  					}
							}
							else
							{
								System.out.println("\t\t\t\t\tYOUR INVALID USER");
								System.out.println(fred+"\t\t\t\t\t1---SIGNUP"+reset);
								System.out.println(fgreen+"\t\t\t\t\t2---EXIT "+reset);
								int se=Integer.parseInt(sc.nextLine());
								while(true)
								{
									if(se==1)
									{
										signup();
										break;
									}
									else if(se==2)
									{
										break;
									}
									else
									{
										System.out.println(fred+"INVALID INPUT"+reset);
									}
								}
									
							}
							break;
						}
						else
						{
							System.out.println(fred+"\t\t\t\tYOU ENTER INVALID PHONE NUMBER"+reset);
							System.out.println(fred+"\t\t\t\tPLEASE ENTER VALID PHONE NUMBER"+reset);
						}
					}
					break;
				}
				else if(ga==1)
				{
					loginprocess();
					break;
				}
				else if(ga==3)
				{
					System.out.print(fred+"Sucessfully terminated"+reset);
					break;
				}
				else
				{	
					System.out.println(fgreen+"PLEASE ENTER VALID INPUT"+reset);
				}
			}
			  
			
		}
	}
	static void M1( )
	{
		while(true)
		{
			System.out.println(thick+change+underline+"\t\t\t\t\t1. SIGNUP\t\t\t\t\t2. LOG IN"+reset);
			System.out.print(fyellow+thick);
			int n=Integer.parseInt(sc.nextLine());
			System.out.print(reset);
			if(n==1)
			{
				signup();
				break;
			}
			else if(n==2)
			{
				loginprocess();
				break;
			}
			else
			{
				System.out.println(fyellow+change+thick+"\n\t\t\tI N V A L I D  I N P U T"+reset);
				System.out.println();
				System.out.println();
				M1();
				break;
			}
		}
	}
	static void signup()
	{
		System.out.println(fred+thick+underline+"Enter New user_name and password:"+reset);
		System.out.print("\tuser_name:");
		System.out.print(fyellow+thick);
		u=sc.nextLine();
		System.out.print(reset+"\tpassword:"+fyellow+thick);
		p=sc.nextLine();
		System.out.print(reset+fred+thick+underline+"\nPLEASE ENTER NEW PHONE NUMBER:"+reset);
		System.out.print(fyellow+thick);
		ph=sc.nextLine();
		System.out.print(reset);
		String z=String.valueOf(ph.length());
		while(true)
		{
			if(z.equals("10"))
			{
				y.setu(u);y.setp(p);y.setph(ph);
				System.out.println(fred+thick+"\t\t\t\tPLEASE WAIT WHILE GENERATING OTP....."+reset);
				sleep(1700);
		  		while(true)
		  		{
					int otp=1000+(int)(Math.random()*8999);
					System.out.print(fgreen+thick+"\t\t\t\tYOUR OTP IS:"+reset+"  ");
					sleep(200);
					String otp1=String.valueOf(otp);
					int len=otp1.length();
					for(int i=0;i<len;i++)
					{
						System.out.print(change+thick+otp1.charAt(i));
						sleep(800);
					}
					System.out.println(reset);
					System.out.print(fblue+thick+"Enter your otp:"+reset);
					System.out.print(fyellow+thick);
					int x=Integer.parseInt(sc.nextLine());
					System.out.print(reset);
					if(x==otp)
					{
						System.out.println(fgreen+thick+"\n\t\t\t\t\tOTP MATCHED"+reset+"\n");
						sleep(500);
						String intro="----------ACCOUNT SUCCESSFULLY CREATED----------";
						for(int i=0;i<=intro.length()-1;i++)
						{
							if(i==0)
							System.out.print("\t\t\t\t\t");
							System.out.print(thick+change+underline+intro.charAt(i));
							sleep(50);
						}
						System.out.print(reset);
						break;
					}
					else
					{
						System.out.println(fred+"\t\t\tOTP NOT MATCHED\n"+reset);
						sleep(500);
						System.out.println(fred+thick+"\t\t\t\tPLEASE WAIT WHILE RE-GENERATED OTP....."+reset);
						sleep(1800);
					}
		   		}	
				break;
			}
		     	else
		     	{
				System.out.println(fred+"\n\t\t\tINVALID PHONE NUMBER:");
				System.out.println(fgreen+"\t\t\tPHONE NUMBER MUST BE CONTAIN :   "+reset+thick+"10"+fgreen+"  DIGITS"+reset);
				System.out.print(fcyan+thick+"\n\n\t\t\tPLEASE ENTER VALID PHONE NUMBER:   "+reset);
				System.out.print(fyellow);
				ph=sc.nextLine();
				System.out.print(reset);
				z=String.valueOf(ph.length());
			}
		}
		System.out.println(reset);
		sleep(500);
		System.out.println(fyellow+change+thick+"\n\t\t\t PRESS:1"+reset+fyellow+thick+" --> See your account credentials."+reset);
		System.out.println(fyellow+change+thick+"\n\t\t\t PRESS:2"+reset+fyellow+thick+" --> For login."+reset);
		System.out.print(fyellow+thick);
		while(true)
		{
			int s=Integer.parseInt(sc.nextLine());
			System.out.print(reset);
			if(s==1)
			{
				System.out.println(underline+fviolet+"\t\t\t USER_NAME:  "+reset+fyellow+change+y.getu()+reset+underline+fviolet+"\t\t"+"PASSWORD: "+reset+fyellow+change+y.getp()+reset+underline+fviolet+"\t\tPHONE:"+reset+fyellow+change+y.getph()+reset);
				System.out.println();
				System.out.println();
				System.out.println(fred+" 1 Login "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fgreen+" 2 Exit"+reset);
				while(true)
				{
					int A = Integer.parseInt(sc.nextLine());
					if(A==1)
					{
						loginprocess();
						break;
					}
					else if(A==2)
					{
						da=1;	
						break;
					}
					else
					{
						System.out.println(fred+"\t\t\t\tINVALID INPUT"+reset);
					}
				}
				break;
			}
			else if(s==2)
			{
				loginprocess();
				break;
			}
			else
			{
				System.out.println(fred+"\t\t\t\tINVALID INPUT"+reset);
				System.out.println(fgreen+"\t\t\t\tPLEASE ENTER CORRECT OPTION"+reset);
			}
		}
	}
}


class CVCARE
{
	
	static String A_YELLOW ="\u001B[33m";
	static String A_RESET="\u001B[0m";
	static String B_RED ="\u001B[37m";
	static String C_RED_B ="\u001B[41m";
	static String D_GREEN_B ="\u001B[42m";


	void display()throws Exception
	{
		

	
       String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String cyan = "\u001B[36m";
        String bold = "\u001B[1m";
        String reset = "\u001B[0m";
	String blink = "\u001B[5m";

        
        System.out.println(bold + cyan + "\t\t                                                                                                                                " + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + red + "\t\t.----------------.   .----------------.    .----------------.   .----------------.   .----------------.   .----------------." + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + green + "\t\t| .--------------. | | .--------------. |  | .--------------. | | .--------------. | | .--------------. | | .--------------. |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + yellow + "\t\t| |     ______   | | | | ____   ____  | |  | |     ______   | | | |      __      | | | |  _______     | | | |  _________   | |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + blue + "\t\t| |   .' ___  |  | | | ||_  _| |_  _| | |  | |   .' ___  |  | | | |     /  \\     | | | | |_   __ \\    | | | | |_   ___  |  | |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + cyan + "\t\t| |  / .'   \\_|  | | | |  \\ \\   / /   | |  | |  / .'   \\_|  | | | |    / /\\ \\    | | | |   | |__) |   | | | |   | |_  \\_|  | |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + red + "\t\t| |  | |         | | | |   \\ \\ / /    | |  | |  | |         | | | |   / ____ \\   | | | |   |  __ /    | | | |   |  _|  _   | |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + green + "\t\t| |  \\ `.___.'\\  | | | |    \\ ' /     | |  | |  \\ `.___.'\\  | | | | _/ /    \\ \\_ | | |  _| |  \\ \\_  | | | |  _| |___/ |  | |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + yellow + "\t\t| |   `._____.'  | | | |     \\_/      | |  | |   `._____.'  | | | ||____|  |____|| | | | |____| |___| | | | | |_________|  | |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + blue + "\t\t| |              | | | |              | |  | |              | | | |              | | | |              | | | |              | |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + cyan + "\t\t'--------------' | '--------------' |  '--------------' | | '--------------' | | '--------------' | | '--------------' |" + reset);
        Thread.sleep(300);
        System.out.println(blink+bold + red + "\t\t '----------------'   '----------------'    '----------------'   '----------------'   '----------------'   '----------------' " + reset);



	}	
	void naveen()
	{
		System.out.println(cv.yellow+"\n\n \t\t\t\t\t\t  W E L C O M E   T O   T H E   C V    C A R E  "+cv.reset);
		/*display();*/
		System.out.println();
		System.out.println();
		project.M1();
		if(project.va>0 && project.da!=1)
		{
			System.out.println("   ");
		}
		else
		{	
			System.out.println(cv.red+"\t\t\t\t\t\t\t  You are not Login to the CV CARE "+cv.reset);
			new CVCARE().naveen();
		}
		System.out.println();
		System.out.println();
	}
}

abstract class bloodbank
{
	abstract void blooddonation();
	abstract void bloodenquirey();
}
class bloodbank1 extends bloodbank
{
	static String bold    ="\u001B[1m";
  	static String red     ="\u001B[31m"; 
   	static String reset   ="\u001B[0m";    
   	static String green   ="\u001B[32m";
    	static String yellow  ="\u001B[33m";
    	static String blue    ="\u001B[34m";
  	static String cyan    ="\u001B[35m";
        static String magenta ="\u001B[36m";

	static String change="\u001B[7m";	
	static String underline="\u001B[4m";
	static String fred="\u001B[31m";
	static String thick="\u001B[1m";
	static void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{

		}
	}


	static Scanner sc=new Scanner(System.in);
	void blooddonation()
	{
		System.out.println(fred+thick+underline+"Enter your name"+reset);
		sleep();
		String r1=sc.next();
		System.out.println(fred+thick+underline+"Enter your mobile number"+reset);
		sleep();
		long l1=sc.nextLong();
		System.out.println(fred+thick+underline+"Enter the age "+reset);
		sleep();
		int a=sc.nextInt();
		System.out.println(fred+thick+underline+"Enter the weight"+reset);
		sleep();
		int b=sc.nextInt();
		System.out.println(fred+thick+underline+"Do you have any health problem"+reset);
		sleep();
		String t1=sc.next();
		if(t1.equals("yes"))
		{
			System.out.println(fred+thick+"Name :"+r1+reset);
			System.out.println(fred+thick+"Mobile number :"+l1+reset);
			System.out.println(fred+thick+"Age :"+a+reset);
			System.out.println(fred+thick+"Sorry your not eligible to donate blood due to your health problem"+reset);
		}
		else
		{
			if(a>=18  && b>=50)
			{
				System.out.println(fred+thick+underline+"WHEN WAS YOUR LAST BLOOD DONATION"+reset);
				int c=sc.nextInt();
					if(c>=60)
					{
						System.out.println(blue+bold+"YOU ARE ELIGIBLE TO DONATE BLOOD"+reset);
						sleep();
						System.out.println(magenta+bold+"Choose date to donate the blood"+reset);
						sleep();
						String s=sc.next();
						System.out.println(fred+thick+"Donar details"+reset);
						System.out.println(fred+thick+"Name :"+r1+reset);
						System.out.println(fred+thick+"Mobile number :"+l1+reset);
						System.out.println(fred+thick+"Age :"+a+reset);
						System.out.println(cyan+bold+"Your date was conformed on: "+s+reset);
						sleep();
					}
					else
					{
						System.out.println(fred+thick+"Name :"+r1+reset);
						System.out.println(fred+thick+"Mobile number :"+l1+reset);
						System.out.println(fred+thick+"Age :"+a+reset);
						System.out.println(blue+bold+"YOU ARE NOT ABLE TO DONATE BLOOD BECAUSE U RECENTLY DONATED BLOOD"+reset);
						sleep();
					}
			}
			else if(a<18 && b>=50)
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(green+bold+"YOU ARE NOT ELIGIBLE TO DONATE BLOOD BEACAUSE YOU ARE NOT AN ADULT"+reset);
				sleep();
			}
			else if(a>18 && b<50)
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(red+bold+"YOU ARE NOT ELIGIBLE TO DONATE BLOOD BECAUSE YOU ARE UNDER WEIGHT"+reset);
				sleep();
			}
			else
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(yellow+bold+"SORRY UR NOT ELIGIBLE TO DONATE BLOOD"+reset);
				sleep();
			} 
		}
	}
	void bloodenquirey()
	{
		//System.out.println(cyan+bold+"HOW CAN I HELP YOU"+reset);
		//sleep();
		String[]  blood={"A+","B+","O+","AB+","A-","AB-"};
		int[] units={16,7,18,8,9,5};
		System.out.println(magenta+bold+"Enter the required blood"+reset);
		sleep();
		String r=sc.next().toUpperCase();
		int f=0;
		for(int i=0;i<blood.length;i++)
		{
			if(blood[i].equals(r))
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
		System.out.println(green+bold+"Enter the required no of units"+reset);
		sleep();
		int u=sc.nextInt();
		boolean b=false;
		int d=0;
		for(int i=0;i<blood.length;i++)
		{
			if(blood[i].equals(r))
			{
				d=units[i];
				if(u<=d)
				{
					b=true;
					units[i]-=u;
				}
				break;
			}
		}
		if(b)
		{
			System.out.println(blue+bold+"Enough blood is available for "+r+" group."+reset);
			sleep();
		}
		else
		{
			System.out.println(green+bold+"Sorry we dont have enough blood for "+r+" group."+reset);
			sleep();
		}
		}
		else
		{
			System.out.println(cyan+"Wrong  blood group"+reset);
			sleep();
			System.out.println(magenta+"Press 1 for searching blood group again"+reset);
			sleep();
			int w=sc.nextInt();
			if(w==1)
			{
				new bloodbank1().bloodenquirey();
			}
			else
			{
				System.out.println("exit");
				sleep();
			}
		} 
			
	}
	void BloodBank()
	{
		bloodbank1 x=new bloodbank1();
		System.out.println(blue+bold+"What do u want"+reset);
		sleep();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(thick+change+underline+"\t\t\t\t1. C V BLOOD DONATION\t\t\t\t2.BLOOD ENQUIRY"+reset);
		sleep();

		int k=sc.nextInt();
		if(k==1)
		x.blooddonation();
		else if(k==2)
		{
		System.out.println(cyan+bold+"HOW CAN I HELP YOU"+reset);
		sleep();
		System.out.println(fred+thick+"Enter your name"+reset);
		sleep();
		String s1=sc.next();
		System.out.println(fred+thick+"Enter your age"+reset);
		sleep();
		int n1=sc.nextInt();
		System.out.println(fred+thick+"Enter your mobile number"+reset);
		sleep();
		long l1=sc.nextLong();
		System.out.println(fred+thick+"Enter the patient name"+reset);
		sleep();
		String s2=sc.next();
		System.out.println(fred+thick+"Relation with the patient"+reset);
		sleep();
		String s3=sc.next();
		x.bloodenquirey();
		System.out.println(fred+thick+"Name :         "+s1+reset);
		System.out.println(fred+thick+"Age  :         "+n1+reset);
		System.out.println(fred+thick+"Mobile number :"+l1+reset);
		System.out.println(fred+thick+"patient name : "+s2+reset);
		System.out.println(fred+thick+"Relation :     "+s3+reset);
		}
		else
		System.out.println(red+"Exit"+reset);
	}
}
class bloodbank2 extends bloodbank
{
	static String bold    ="\u001B[1m";
  	static String red     ="\u001B[31m"; 
   	static String reset   ="\u001B[0m";    
   	static String green   ="\u001B[32m";
    	static String yellow  ="\u001B[33m";
    	static String blue    ="\u001B[34m";
  	static String cyan    ="\u001B[35m";
        static String magenta ="\u001B[36m";
	
	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String underline="\u001B[4m";
	static String fred="\u001B[31m";
	static void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{

		}
	}

	static Scanner sc=new Scanner(System.in);
	void blooddonation()
	{
		System.out.println(fred+thick+underline+"Enter your name"+reset);
		sleep();
		String r1=sc.next();
		System.out.println(fred+thick+underline+"Enter your mobile number"+reset);
		sleep();
		long l1=sc.nextLong();
		System.out.println(fred+thick+underline+"Enter the age "+reset);
		sleep();
		int a=sc.nextInt();
		System.out.println(fred+thick+underline+"Enter the weight"+reset);
		sleep();
		int b=sc.nextInt();
		System.out.println(fred+thick+underline+"Do you have any health problem"+reset);
		sleep();
		String t1=sc.next();
		if(t1.equals("yes"))
		{
			System.out.println(fred+thick+"Name :"+r1+reset);
			System.out.println(fred+thick+"Mobile number :"+l1+reset);
			System.out.println(fred+thick+"Age :"+a+reset);
			System.out.println(fred+thick+"Sorry your not eligible to donate blood due to your health problem"+reset);
		}
		else
		{
			if(a>=18  && b>=50)
			{
				System.out.println(fred+thick+underline+"WHEN WAS YOUR LAST BLOOD DONATION"+reset);
				int c=sc.nextInt();
					if(c>=60)
					{
						System.out.println(blue+bold+"YOU ARE ELIGIBLE TO DONATE BLOOD"+reset);
						sleep();
						System.out.println(magenta+bold+"Choose date to donate the blood"+reset);
						sleep();
						String s=sc.next();
						System.out.println(fred+thick+"Donar details"+reset);
						System.out.println(fred+thick+"Name :"+r1+reset);
						System.out.println(fred+thick+"Mobile number :"+l1+reset);
						System.out.println(fred+thick+"Age :"+a+reset);
						System.out.println(cyan+bold+"Your date was conformed on: "+s+reset);
						sleep();
					}
					else
					{
						System.out.println(fred+thick+"Name :"+r1+reset);
						System.out.println(fred+thick+"Mobile number :"+l1+reset);
						System.out.println(fred+thick+"Age :"+a+reset);
						System.out.println(blue+bold+"YOU ARE NOT ABLE TO DONATE BLOOD BECAUSE U RECENTLY DONATED BLOOD"+reset);
						sleep();
					}
			}
			else if(a<18 && b>=50)
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(green+bold+"YOU ARE NOT ELIGIBLE TO DONATE BLOOD BEACAUSE YOU ARE NOT AN ADULT"+reset);
				sleep();
			}
			else if(a>18 && b<50)
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(red+bold+"YOU ARE NOT ELIGIBLE TO DONATE BLOOD BECAUSE YOU ARE UNDER WEIGHT"+reset);
				sleep();
			}
			else
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(yellow+bold+"SORRY UR NOT ELIGIBLE TO DONATE BLOOD"+reset);
				sleep();
			} 
		}
	}
	void bloodenquirey()
	{
		//System.out.println(magenta+bold+"HOW CAN I HELP YOU"+reset);
		//sleep();
		String[]  blood={"A+","B+","O+","AB+","A-","B-"};
		int[] units={6,7,8,8,9,5};
		System.out.println(red+"Enter the required blood"+reset);
		sleep();
		String r=sc.next().toUpperCase();
		int f=0;
		for(int i=0;i<blood.length;i++)
		{
			if(blood[i].equals(r))
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
		System.out.println(cyan+bold+"Enter the required no of units"+reset);
		sleep();
		int u=sc.nextInt();
		boolean b=false;
		int d=0;
		for(int i=0;i<blood.length;i++)
		{
			if(blood[i].equals(r))
			{
				d=units[i];
				if(u<=d)
				{
					b=true;
					units[i]-=u;
				}
				break;
			}
		}
		if(b)
		{
			System.out.println(green+bold+"Enough blood is available for "+r+" group."+reset);
			sleep();
		}
		else
		{
			System.out.println(blue+bold+"S o r r y we dont have enough blood for "+r+" group."+reset);
			sleep();
		}
		}
		else
		{
			System.out.println(yellow+bold+"Wrong blood group"+reset);
			sleep();
			System.out.println(cyan+bold+"Press 1 for searching blood group again"+reset);
			sleep();
			int w=sc.nextInt();
			if(w==1)
			{
				new bloodbank2().bloodenquirey();
			}
			else
			{
				System.out.println("Exit");
			}
		} 
	}
	void BloodBank()
	{
		bloodbank1 x=new bloodbank1();
		System.out.println(red+bold+"What do u want"+reset);
		sleep();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(thick+change+underline+"\t\t\t\t1. C V BLOOD DONATION\t\t\t\t2.BLOOD ENQUIRY"+reset);
		sleep();

		//System.out.println(blue+bold+"1. B L O O D  D O N A T I O N \n2. B L O O D  E N Q U I R Y"+reset);
		int k=sc.nextInt();
		if(k==1)
		x.blooddonation();
		else if(k==2)
		{
		System.out.println(magenta+bold+"HOW CAN I HELP YOU"+reset);
		sleep();
		System.out.println(fred+thick+"Enter your name"+reset);
		sleep();
		String s1=sc.next();
		System.out.println(fred+thick+"Enter your age"+reset);
		sleep();
		int n1=sc.nextInt();
		System.out.println(fred+thick+"Enter your mobile number"+reset);
		sleep();
		long l1=sc.nextLong();
		System.out.println(fred+thick+"Enter the patient name"+reset);
		sleep();
		String s2=sc.next();
		System.out.println(fred+thick+"Relation with the patient"+reset);
		sleep();
		String s3=sc.next();
		x.bloodenquirey();
		System.out.println(fred+thick+"Name :         "+s1+reset);
		System.out.println(fred+thick+"Age  :         "+n1+reset);
		System.out.println(fred+thick+"Mobile number :"+l1+reset);
		System.out.println(fred+thick+"patient name : "+s2+reset);
		System.out.println(fred+thick+"Relation :     "+s3+reset);
		}
		else
		System.out.println(magenta+"exit"+reset);
		sleep();
	}
}
class bloodbank3 extends bloodbank
{
	static String bold    ="\u001B[1m";
  	static String red     ="\u001B[31m"; 
   	static String reset   ="\u001B[0m";    
   	static String green   ="\u001B[32m";
    	static String yellow  ="\u001B[33m";
    	static String blue    ="\u001B[34m";
  	static String cyan    ="\u001B[35m";
        static String magenta ="\u001B[36m";

	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String underline="\u001B[4m";
	static String fred="\u001B[31m";
	static void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{

		}
	}

	static Scanner sc=new Scanner(System.in);
	void blooddonation()
	{
		System.out.println(fred+thick+underline+"Enter your name"+reset);
		sleep();
		String r1=sc.next();
		System.out.println(fred+thick+underline+"Enter your mobile number"+reset);
		sleep();
		long l1=sc.nextLong();
		System.out.println(fred+thick+underline+"Enter the age "+reset);
		sleep();
		int a=sc.nextInt();
		System.out.println(fred+thick+underline+"Enter the weight"+reset);
		sleep();
		int b=sc.nextInt();
		System.out.println(fred+thick+underline+"Do you have any health problem"+reset);
		sleep();
		String t1=sc.next();
		if(t1.equals("yes"))
		{
			System.out.println(fred+thick+"Name :"+r1+reset);
			System.out.println(fred+thick+"Mobile number :"+l1+reset);
			System.out.println(fred+thick+"Age :"+a+reset);
			System.out.println(fred+thick+"Sorry your not eligible to donate blood due to your health problem"+reset);
		}
		else
		{
			if(a>=18  && b>=50)
			{
				System.out.println(fred+thick+underline+"WHEN WAS YOUR LAST BLOOD DONATION"+reset);
				int c=sc.nextInt();
					if(c>=60)
					{
						System.out.println(blue+bold+"YOU ARE ELIGIBLE TO DONATE BLOOD"+reset);
						sleep();
						System.out.println(magenta+bold+"Choose date to donate the blood"+reset);
						sleep();
						String s=sc.next();
						System.out.println(fred+thick+"Donar details"+reset);
						System.out.println(fred+thick+"Name :"+r1+reset);
						System.out.println(fred+thick+"Mobile number :"+l1+reset);
						System.out.println(fred+thick+"Age :"+a+reset);
						System.out.println(cyan+bold+"Your date was conformed on: "+s+reset);
						sleep();
					}
					else
					{
						System.out.println(fred+thick+"Name :"+r1+reset);
						System.out.println(fred+thick+"Mobile number :"+l1+reset);
						System.out.println(fred+thick+"Age :"+a+reset);
						System.out.println(blue+bold+"YOU ARE NOT ABLE TO DONATE BLOOD BECAUSE U RECENTLY DONATED BLOOD"+reset);
						sleep();
					}
			}
			else if(a<18 && b>=50)
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(green+bold+"YOU ARE NOT ELIGIBLE TO DONATE BLOOD BEACAUSE YOU ARE NOT AN ADULT"+reset);
				sleep();
			}
			else if(a>18 && b<50)
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(red+bold+"YOU ARE NOT ELIGIBLE TO DONATE BLOOD BECAUSE YOU ARE UNDER WEIGHT"+reset);
				sleep();
			}
			else
			{
				System.out.println(fred+thick+"Name :"+r1+reset);
				System.out.println(fred+thick+"Mobile number :"+l1+reset);
				System.out.println(fred+thick+"Age :"+a+reset);
				System.out.println(yellow+bold+"SORRY UR NOT ELIGIBLE TO DONATE BLOOD"+reset);
				sleep();
			} 
		}
	}
	void bloodenquirey()
	{
		//System.out.println(magenta+bold+"HOW CAN I HELP YOU"+reset);
		//sleep();
		String[]  blood={"A+","B+","O+","AB+","A-","B-"};
		int[] units={6,7,8,8,9,5};
		System.out.println(red+"Enter the required blood"+reset);
		sleep();
		String r=sc.next().toUpperCase();
		int f=0;
		for(int i=0;i<blood.length;i++)
		{
			if(blood[i].equals(r))
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
		System.out.println(cyan+bold+"Enter the required no of units"+reset);
		sleep();
		int u=sc.nextInt();
		boolean b=false;
		int d=0;
		for(int i=0;i<blood.length;i++)
		{
			if(blood[i].equals(r))
			{
				d=units[i];
				if(u<=d)
				{
					b=true;
					units[i]-=u;
				}
				break;
			}
		}
		if(b)
		{
			System.out.println(green+bold+"Enough blood is available for "+r+"group."+reset);
			sleep();
		}
		else
		{
			System.out.println(blue+bold+"Sorry we dont have enough blood for "+r+"group."+reset);
			sleep();
		}
		}
		else
		{
			System.out.println(yellow+bold+"Wrong blood group"+reset);
			sleep();
			System.out.println(cyan+bold+"Press 1 for searching blood group again"+reset);
			sleep();
			int w=sc.nextInt();
			if(w==1)
			{
				new bloodbank3().bloodenquirey();
			}
			else
			{
				System.out.println("Exit");
			}
		} 
	}
	void BloodBank()
	{
		bloodbank3 x=new bloodbank3();
		System.out.println(red+bold+"What do u want"+reset);
		sleep();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(thick+change+underline+"\t\t\t\t1. C V BLOOD DONATION\t\t\t\t2.BLOOD ENQUIRY"+reset);
		sleep();

		//System.out.println(blue+bold+"1.Blood donation \n2.Blood enquiry"+reset);
		sleep();
		int k=sc.nextInt();
		if(k==1)
		x.blooddonation();
		else if(k==2)
		{
		System.out.println(magenta+bold+"HOW CAN I HELP YOU"+reset);
		sleep();
		System.out.println(fred+thick+"Enter your name"+reset);
		sleep();
		String s1=sc.next();
		System.out.println(fred+thick+"Enter your age"+reset);
		sleep();
		int n1=sc.nextInt();
		System.out.println(fred+thick+"Enter your mobile number"+reset);
		sleep();
		long l1=sc.nextLong();
		System.out.println(fred+thick+"Enter the patient name"+reset);
		sleep();
		String s2=sc.next();
		System.out.println(fred+thick+"Relation with the patient"+reset);
		sleep();
		String s3=sc.next();
		x.bloodenquirey();
		System.out.println(fred+thick+"Name :         "+s1+reset);
		System.out.println(fred+thick+"Age  :         "+n1+reset);
		System.out.println(fred+thick+"Mobile number :"+l1+reset);
		System.out.println(fred+thick+"patient name : "+s2+reset);
		System.out.println(fred+thick+"Relation :     "+s3+reset);
		}
		else
		System.out.println(magenta+"Exit"+reset);
	}
}
class charan
{
	static String bold    ="\u001B[1m";
  	static String red     ="\u001B[31m"; 
   	static String reset   ="\u001B[0m";    
   	static String green   ="\u001B[32m";
    	static String yellow  ="\u001B[33m";
    	static String blue    ="\u001B[34m";
  	static String cyan    ="\u001B[35m";
        static String magenta ="\u001B[36m";
	static String blink = "\u001B[5m";

	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String underline="\u001B[4m";

	static Scanner sc=new Scanner(System.in);
	void charukesh()throws Exception
	{
		System.out.println(green+bold+"Which blood bank do u want to select"+reset);
		
		System.out.println();
		System.out.println();

		System.out.println(thick+change+underline+"\t\t\t1. C V BLOOD BANK\t\t\t2.SAI CHARAN BLOOD  BANK\t\t\t3. KIMS ICON BLOOD BANK "+reset);
		Thread.sleep(500);

		int y=sc.nextInt();
		if(y==1)
		{
			bloodbank1 x1=new bloodbank1();
			blood.murali();
			x1.BloodBank();
		}
		else if(y==2)
		{
			bloodbank2 x2=new bloodbank2();
			blood.murali();
			x2.BloodBank();
		}
		else if(y==3)
		{
			bloodbank3 x3=new bloodbank3();
			blood.murali();
			x3.BloodBank();
		}
		else
		{
			System.out.println(red+bold+"Invalid option \n Enter the valid option"+reset);
			new charan().charukesh();
		}
	}
}





class blood {

    public static void murali() {
        String[] lines = {
                "\t\t\t\u001B[31;5m  .  ..  .  .   .  .  .   .  .      .  .   .  .  .   .  .      .  .   .  .  .   .  .\u001B[0m",
                "\t\t\t\u001B[31;5m                                                          .                             \u001B[0m",
                "\t\t\t\u001B[31;5m                                                                                          \u001B[0m",
                "\t\t\t\u001B[31;5m                .-=======-.   :========:                                                  \u001B[0m",
                "\t\t\t\u001B[31;5m    .  .      .++-=#%%#*+-=+=*==+#%%#+==*-  .   .  .  .   .  .   .  .  .   .  .      .  .\u001B[0m",
                "\t\t\t\u001B[31;5m  .   .  .  .:*:+%%@@@%%%%#--=%@%%@@%%%#==*.  .  .   .  .      .  .   .  .  .   .  .     \u001B[0m",
                "\t\t\t\u001B[31;5m    .  .    .#:#@%%%%%%@@@@@%@@@%%%%%%%%%+-*.   .  .  .   .  .  ..  .  .   .  .  .   .  .\u001B[0m",
                "\t\t\t\u001B[31;5m            -*:%@@@@@@%@@@@@@@@@%%%%@@@%%%.#\u001B[0m                                             ",
                "\t\t\t\u001B[31;5m            .%.%%@@@@@@%%@@@@@@%%%%%@@@@%*.%\u001B[0m                                             ",
                "\t\t\t\u001B[31;5m             -+:%%@@@@@%%%%%%%%@%%%%@@@@%:*-\u001B[0m                                              ",
                "\t\t\t\u001B[31;5m  .  ..  .  . -*:*@@@@@@@%@%%%%%%@@@%%%*:*=.  .  .   .  .  .   .  .   .  .  .   .  .      .  .\u001B[0m",
                "\t\t\t\u001B[31;5m    .  .      .:*==%@@@@@@@%%@@@%%%%%#--*:  .   .  .  .   .  .  ..  .  .   .  .  .   .  .   .\u001B[0m",
                "\t\t\t\u001B[31;5m  .              -*-=#@@@%%%@@@@%%%#=-*-   .                                                 \u001B[0m",
                "\t\t\t\u001B[31;5m                  .=+==*%%%%@@%%%*-=+-                                                    \u001B[0m",
                "\t\t\t\u001B[31;5m                     :=+==#%%%*==+=:                                                      \u001B[0m",
                "\t\t\t\u001B[31;5m  .  ..  .  .   .  .  ..:+*%%%*+:.  .  .   .  .  .   .  .      .  .   .  .  .   .  .   .\u001B[0m",
                "\t\t\t\u001B[31;5m.   .  .   .  .  .   .  ..+%%%-.  .      .  .   .  .  .   .  .  ..  .  .   .  .  .   .  .\u001B[0m",
                "\t\t\t\u001B[31;5m  .      .  .      .     *%%%%%+    .            .  .=+======+======+=====+=.      .     \u001B[0m",
                "\t\t\t\u001B[31;5m                           =%:                      *-=###################=-#             \u001B[0m",
                "\t\t\t\u001B[31;5m                           =@:                      #.#@@%%%%@%%%%@@@@%@%%#.%             \u001B[0m",
                "\t\t\t\u001B[31;5m  .         .      .       =@:      .  .      .     #.#@@%%%@@%%%%@@@@@@@@#.%.  .  .      \u001B[0m",
                "\t\t\t\u001B[31;5m.   .  .   .  .  .   .  .  =%: .  .   .  .  .   .  .#.#@@@%%%%%%%%@@@@%%@@#:% .  .   .  .\u001B[0m",
                "\t\t\t\u001B[31;5m  .      .  .      .      .-%:      .  .   .  .  .  #.#%%%%%%%%%%%%%%%%%%%#.%.  .  .      \u001B[0m",
                "\t\t\t\u001B[31;5m                           =%:                      #.#%%%@@@%%%@@%%%%%%%%#.%             \u001B[0m",
                "\t\t\t\u001B[31;5m                           =%:                      #.*#######%%%@%%%%@@%%#.%             \u001B[0m",
                "\t\t\t\u001B[31;5m                           -%:                      #.*#######%%%%%%@@@@@%#.%             \u001B[0m",
                "\t\t\t\u001B[31;5m    .  .      .  .   .  .  =%: .  .   .  .  .   .  .#.++++*++*#%@@%%%%%%%%#.% .      .  .\u001B[0m",
                "\t\t\t\u001B[31;5m  .  ..  .  .   .  .  .   .-%:      .  .   .  .  .  #.#@%%%%%%%%%%%%%%%@@@#.%.  .  .   .  \u001B[0m",
                "\t\t\t\u001B[31;5m                           =%:                     .#.++++*+++#%%%@@@%%@@@#.%             \u001B[0m",
                "\t\t\t\u001B[31;5m                           =%:                      #.#%%%@%%%@@%%%@%%%%@@#.%             \u001B[0m",
                "\t\t\t\u001B[31;5m                           -%:                      #.#%@@%%%%@@@%%%%%%%%%#.%.            \u001B[0m",
                "\t\t\t\u001B[31;5m    .  .   .  .  .   .  .  =%: .  .      .  .   .  .=+-#@@@@%%@%%%%%%%%%%#-+= .      .  .\u001B[0m",
                "\t\t\t\u001B[31;5m  .  ..  .  .   .  .  .   .-@:  .   .  .   .  .  .   :*==%%%%%@@@%%@@@%%+-*:.   .  .  ..  \u001B[0m",
                "\t\t\t\u001B[31;5m                 .      .  =@:                     .   :*%%#%%@@@@@%@%%%*+.   .         . \u001B[0m",
                "\t\t\t\u001B[31;5m                           =@:                          .%%+-+*%@@#++-#%.                 \u001B[0m",
                "\t\t\t\u001B[31;5m                           =@:      :+###*-              :::==+%%%*===-:                  \u001B[0m",
                "\t\t\t\u001B[31;5m    .  .      .  .   .  .  :%= .  .=%=.  -%-.   .  .  .   .  +%%%%%+.      .  .      .  .\u001B[0m",
                "\t\t\t\u001B[31;5m  .  ..  .  .   .  .  .   . +#.   .@*  . :@=  .  .   .  .    .-=%#-:  .  .  .   .  .      \u001B[0m",
                "\t\t\t\u001B[31;5m    .  .      .  .   .  .  ..=%+. :%* ..+%= .   .  .  .   .  . .%+  .  .   .  .  .   .  .\u001B[0m",
                "\t\t\t\u001B[31;5m                              .=+**%%#%*=.                     =%:                        \u001B[0m",
                "\t\t\t\u001B[31;5m                                   .:=##*+=======---------===+*#-                         \u001B[0m",
                "\t\t\t\u001B[31;5m                                        .:::--:---------:--::::                          \u001B[0m"
        };

        for (String line : lines) {
            System.out.println(line);
            sleep(300);
        }
    }

    public static void sleep(int milliseconds)
	{
        try
	{
            Thread.sleep(milliseconds);
        }
	catch (InterruptedException e) 
	{
            e.printStackTrace();
        }
    }
}




abstract class hospital
{
	abstract void generalphysician();
	abstract void dental();
	abstract void neurology();
	abstract void gynecology();
	abstract void dermatology();
	abstract void cardiology();
}
class hospital1 extends hospital
{
	static double bill;
	static double bills;
	static Scanner sc=new Scanner(System.in);
	static hospital1 x=new hospital1();
	static String reset = "\u001B[0m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	static String blue = "\u001B[34m";
	static String violet = "\u001B[35m";
	static String skyblue = "\u001B[36m";
	static String white = "\u001B[37m";
	static String blink = "\u001B[5m";

	static String red1 = "\u001B[101m";
	static String green1 = "\u001B[102m";
	static String yellow1 = "\u001B[103m";
	static String blue1 = "\u001B[104m";
	static String violet1 = "\u001B[105m";
	static String skyblue1 = "\u001B[106m";
	static String white1 = "\u001B[107m";



	public static final String RESET = "\u001B[0m";
    	public static final String BLACK = "\u001B[30m";
    	public static final String RED = "\u001B[31m";
    	public static final String GREEN = "\u001B[32m";
   	public static final String YELLOW = "\u001B[33m";
    	public static final String BLUE = "\u001B[34m";
    	public static final String MAGENTA = "\u001B[35m";
    	public static final String CYAN = "\u001B[36m";
    	public static final String WHITE = "\u001B[37m";

    	public static final String GREEN_BACKGROUND = "\u001B[42m";
    	public static final String BLUE_BACKGROUND = "\u001B[44m";
    	public static final String BOLD = "\u001B[1m";
    	public static final String UNDERLINE = "\u001B[4m";
    	public static final String REVERSED = "\u001B[7m";
	static void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{

		}
	}
	public static boolean isValidUpiId(String upiId) {
        return upiId.contains("@");
    	}



	double billing(double b)
	{
		bill=b;
		return bill;
	
	}
	void otp()
	{
		
		System.out.println(red+"Please enter the OTP sent to your number:"+reset);
		sleep();
		int otp=1000+(int)(Math.random()*8999);
		System.out.println(otp);
		int qw = sc.nextInt();
		if(otp==qw)
		{
			System.out.println(blue+"Transaction has been successfull..!"+reset);
			sleep();
		}
		else
		{
			System.out.print(green+"Invalid OTP, Please Enter Valid OTP Sent to Your Mobile"+reset);
			otp();
		}
	}
	void transaction()
	{

        // Displaying payment options with a classic and attractive design
	System.out.println(CYAN + BOLD + "****************************************************" + RESET);
        System.out.println(CYAN + BOLD + "*                 PAYMENT OPTIONS                  *" + RESET);
        System.out.println(CYAN + BOLD + "****************************************************" + RESET);
	sleep();
        System.out.println(YELLOW + "1. " + BOLD + "Paytm" + RESET);
        System.out.println("   " + GREEN_BACKGROUND + "  $  " + RESET);
	sleep();
        System.out.println(YELLOW + "2. " + BOLD + "PhonePe" + RESET);
        System.out.println("   " + GREEN_BACKGROUND + "  $  " + RESET);
	sleep();
        System.out.println(YELLOW + "3. " + BOLD + "Gpay" + RESET);
        System.out.println("   " + BLUE_BACKGROUND + "  $  " + RESET);
		//System.out.println(violet+"1.Paytm/n 2.PhonePe/n 3.Gpay/n"+reset);


		int a = sc.nextInt();
		if(a==1)
		{
			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				otp();
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}
		}
		else if(a==2)
		{
			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				otp();
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}			
		}
		else if(a==3)	
		{
			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				otp();
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}
		}
		else
		{
			System.out.println(blue+"Invalid Input. Please enter the valid input..."+reset);
			transaction();	
		}
	}
	void totalbill(double a)
	{
	System.out.println(CYAN + BOLD + "**********************************************" + RESET);
        System.out.println(CYAN + BOLD + "*              BILL GENERATION               *" + RESET);
        System.out.println(CYAN + BOLD + "**********************************************" + RESET);
	sleep();
        System.out.println(GREEN+"Your bill is...> "+bills);
	sleep();
	System.out.printf(GREEN+"Your Total Payable Bill is----> %.2f%n",(bills));
	sleep();

	transaction();
       }
	void slot()
	{
		System.out.println(violet+"PLEASE BOOK YOUR SLOT TO CONSULT DOCTOR"+reset);
		sleep();
		System.out.println(red+"1-9AM TODAY\n2-2PM AFTERNOON\n3-6PM EVENING"+reset);
		int b=sc.nextInt();
		if(b==1)
		{
			System.out.println(green+"SLOT BOOKED AT 9AM THE DOCTOR WILL BE AVAILABLE AT THAT TIME"+reset);
			sleep();
		}
		else if(b==2)
		{
			System.out.println(yellow+"SLOT BOOKED AT 2PM THE DOCTOR WILL BE AVAILABLE AT THAT TIME"+reset);
			sleep();
		}
		else
		{
			System.out.println(blue+"SLOT BOOKED AT 6PM THE DOCTOR WILL BE AVAILABLE AT THAT TIME"+reset);
			sleep();
		}
	}
	void generalphysician()
	{ 
		System.out.print(violet1+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(red+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-Genral Medicine][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(green+"2-Dr.SAI CHARAN[MBBS-General Medicine][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(yellow+"3-Dr.MADHU[MBBS-General Medicine][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int bc=sc.nextInt();
		if(bc==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(blue+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int c=sc.nextInt();
			if(c==1)
			{
				generalphysician();
			}
			if(c==2)
			{
				totalbill(bills);
		        }
		}
		else if(bc==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int d=sc.nextInt();
			if(d==1)
			{
				generalphysician();
			}
			if(d==2)
			{
				totalbill(bills);
		        }
		}
		else if(bc==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int e=sc.nextInt();
			if(e==1)
			{
				generalphysician();
			}
			if(e==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(yellow+"Invalid option "+reset);
			sleep();
			//display();
		}	
	}
	void dental()
	{ 
		System.out.print(red1+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(yellow+"1-Dr.CHAITANYA VADDI[BDS-Dental,MDS-Implantologist][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(blue+"2-Dr.SAI CHARAN[BDS-Dental,MDS-Prosthodontics][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(green+"3-Dr.MADHU[BDS-Dental][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int cd=sc.nextInt();
		if(cd==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int f=sc.nextInt();
			if(f==1)
			{
				dental();
			}
			if(f==2)
			{
				totalbill(bills);
		        }
		}
		else if(cd==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int g=sc.nextInt();
			if(g==1)
			{
				dental();
			}
			if(g==2)
			{
				totalbill(bills);
		        }
		}
		else if(cd==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(green+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int h=sc.nextInt();
			if(h==1)
			{
				dental();
			}
			if(h==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(yellow+"Invalid option "+reset);
			//display();
		}	
	}
	void dermatology()
	{ 
		System.out.print(blue+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(red+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,Diploma-Dermatology][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(yellow+"2-Dr.SAI CHARAN[MBBS-General Medicine,MD-Dermotology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(green+"3-Dr.MADHU[MBBS-General Medicine,Diploma-Dermatology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int de=sc.nextInt();
		if(de==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(blue+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int i=sc.nextInt();
			if(i==1)
			{
				dermatology();
			}
			if(i==2)
			{
				totalbill(bills);
		        }
		}
		else if(de==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int j=sc.nextInt();
			if(j==1)
			{
				dermatology();
			}
			if(j==2)
			{
				totalbill(bills);
		        }
		}
		else if(de==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int k=sc.nextInt();
			if(k==1)
			{
				dermatology();
			}
			if(k==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(red+"Invalid option "+reset);
			//display();
		}	
	}
	void gynecology()
	{ 
		System.out.print(green1+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(blue+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-obstetrtics&Gynaecology][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(yellow+"2-Dr.SAI CHARAN[MBBS-General Medicine,MD-obstetrtics&Gynaecology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(violet+"3-Dr.MADHU[MBBS-General Medicine,MD-obstetrtics&Gynaecology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int ef=sc.nextInt();
		if(ef==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int l=sc.nextInt();
			if(l==1)
			{
				gynecology();
			}
			if(l==2)
			{
				totalbill(bills);
		        }
		}
		else if(ef==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(yellow+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int m=sc.nextInt();
			if(m==1)
			{
				gynecology();
			}
			if(m==2)
			{
				totalbill(bills);
		        }
		}
		else if(ef==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(green+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int n=sc.nextInt();
			if(n==1)
			{
				gynecology();
			}
			if(n==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(blue1+"Invalid option "+reset);
			//display();
		}	
	}
	void cardiology()
	{ 
		System.out.print(violet1+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(red+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-Genral Medicine,DNB-Cardoilogy][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(yellow+"2-Dr.SAI CHARAN[MBBS-General Medicine,DM-cardiology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(blue+"3-Dr.MADHU[MBBS-General Medicine,DM-cardiology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int fg=sc.nextInt();
		if(fg==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(green+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int o=sc.nextInt();
			if(o==1)
			{
				cardiology();
			}
			if(o==2)
			{
				totalbill(bills);
		        }
		}
		else if(fg==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int p=sc.nextInt();
			if(p==1)
			{
				cardiology();
			}
			if(p==2)
			{
				totalbill(bills);
		        }
		}
		else if(fg==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int q=sc.nextInt();
			if(q==1)
			{
				cardiology();
			}
			if(q==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(green+"Invalid option "+reset);
			//display();
		}	
	}
	void neurology()
	{ 
		System.out.print(yellow+"Choose a Doctor to Consult ");
		sleep();
		System.out.println();
		System.out.println(red+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-Genral Medicine,DM-Neurology][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(blue+"2-Dr.SAI CHARAN[MBBS-General Medicine,DM-Neurology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(violet+"3-Dr.MADHU[MBBS-General Medicine,DM-Neurology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int gh=sc.nextInt();
		if(gh==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(blue+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int r=sc.nextInt();
			if(r==1)
			{
				neurology();
			}
			if(r==2)
			{
				totalbill(bills);
		        }
		}
		else if(gh==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int s=sc.nextInt();
			if(s==1)
			{
				neurology();
			}
			if(s==2)
			{
				totalbill(bills);
		        }
		}
		else if(gh==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int t=sc.nextInt();
			if(t==1)
			{
				neurology();
			}
			if(t==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(yellow+"Invalid option"+reset);
			//display();
		}	
	}
	
	void display()
	{

        	System.out.println(WHITE + BOLD + "1. " + UNDERLINE + "GENERAL PHYSICIAN" + RESET);
		sleep();
        	System.out.println(GREEN + BOLD + "2. " + UNDERLINE + "DENTAL" + RESET);
		sleep();
        	System.out.println(YELLOW + BOLD + "3. " + UNDERLINE + "DERMATOLOGY" + RESET);
		sleep();
        	System.out.println(BLUE + BOLD + "4. " + UNDERLINE + "GYNECOLOGY" + RESET);
		sleep();
        	System.out.println(GREEN + BOLD + "5. " + UNDERLINE + "CARDIOLOGY" + RESET);
		sleep();
        	System.out.println(MAGENTA + BOLD + "6. " + UNDERLINE + "NEUROLOGY" + RESET);
		sleep();


                int ab=sc.nextInt();
		if(ab==1)
		{
	 	 	generalphysician();
		}
		else if(ab==2)
		{
			dental();
		}
		else if(ab==3)
		{
			dermatology();
		}
		else if(ab==4)
		{
			gynecology();
		}
		else if(ab==5)
		{
			cardiology();
		}
		else
		{
			neurology();
		}
	}
	void m1()
	{
		x.display();
	}
}
class hospital2 extends hospital
{
	static double bill;
	static double bills;
	static Scanner sc=new Scanner(System.in);
	static hospital2 x=new hospital2();
	static String reset = "\u001B[0m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	static String blue = "\u001B[34m";
	static String violet = "\u001B[35m";
	static String skyblue = "\u001B[36m";
	static String white = "\u001B[37m";
	static String blink = "\u001B[5m";

	static String red1 = "\u001B[101m";
	static String green1 = "\u001B[102m";
	static String yellow1 = "\u001B[103m";
	static String blue1 = "\u001B[104m";
	static String violet1 = "\u001B[105m";
	static String skyblue1 = "\u001B[106m";
	static String white1 = "\u001B[107m";

	
	public static final String RESET = "\u001B[0m";
    	public static final String BLACK = "\u001B[30m";
    	public static final String RED = "\u001B[31m";
    	public static final String GREEN = "\u001B[32m";
    	public static final String YELLOW = "\u001B[33m";
    	public static final String BLUE = "\u001B[34m";
    	public static final String MAGENTA = "\u001B[35m";
    	public static final String CYAN = "\u001B[36m";
    	public static final String WHITE = "\u001B[37m";

    	// ANSI formatting options
    	public static final String BOLD = "\u001B[1m";
    	public static final String UNDERLINE = "\u001B[4m";
    	public static final String REVERSED = "\u001B[7m";
	public static final String GREEN_BACKGROUND = "\u001B[42m";
    	public static final String BLUE_BACKGROUND = "\u001B[44m";
	static void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{

		}
	}

	public static boolean isValidUpiId(String upiId) {
        return upiId.contains("@");
    }
	double billing(double b)
	{
		bill=b;
		return bill;
	
	}
	void otp()
	{
		
		System.out.println(red+"Please enter the OTP sent to your number:"+reset);
		sleep();
		int otp=1000+(int)(Math.random()*8999);
		System.out.println(otp);
		int qw = sc.nextInt();
		if(otp==qw)
		{
			System.out.println(blink+blue+"Transaction has been successfull..!"+reset);
			sleep();
		}
		else
		{
			System.out.print(green+"Invalid OTP, Please Enter Valid OTP Sent to Your Mobile"+reset);
			otp();
		}
	}
	void transaction()
	{

        // Displaying payment options with a classic and attractive design
	System.out.println(CYAN + BOLD + "***************************************************" + RESET);
        System.out.println(CYAN + BOLD + "*                PAYMENT OPTIONS                  *" + RESET);
        System.out.println(CYAN + BOLD + "***************************************************" + RESET);
        System.out.println(YELLOW + "1. " + BOLD + "Paytm" + RESET);
        System.out.println("   " + GREEN_BACKGROUND + "  $  " + RESET);

        System.out.println(YELLOW + "2. " + BOLD + "PhonePe" + RESET);
        System.out.println("   " + GREEN_BACKGROUND + "  $  " + RESET);

        System.out.println(YELLOW + "3. " + BOLD + "Gpay" + RESET);
        System.out.println("   " + BLUE_BACKGROUND + "  $  " + RESET);
		//System.out.println(violet+"1.Paytm/n 2.PhonePe/n 3.Gpay/n"+reset);



		int a = sc.nextInt();
		if(a==1)
		{	
			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				otp();
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}
		}
		else if(a==2)
		{
			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				otp();
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}			
		}
		else if(a==3)	
		{
			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				otp();
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}
		}
		else
		{
			System.out.println(blue+"Invalid Input. Please enter the valid input..."+reset);
			transaction();	
		}
	}
	void totalbill(double a)
	{

		
		//System.out.printf(green1+"Your Total Payable Bill is----> %.2f%n",(bills));
	System.out.println(CYAN + BOLD + "**********************************************" + RESET);
        System.out.println(CYAN + BOLD + "*            BILL GENERATION                 *" + RESET);
        System.out.println(CYAN + BOLD + "**********************************************" + RESET);
	sleep();

        System.out.println(GREEN+"Your bill is...> "+bills);
	sleep();
	System.out.printf(GREEN+"Your Total Payable Bill is----> %.2f%n",(bills));
	sleep();


		transaction();
       }
	void slot()
	{
		System.out.println(violet1+"PLEASE BOOK YOUR SLOT TO CONSULT DOCTOR"+reset);
		sleep();
		System.out.println(red+"1-9AM TODAY\n2-2PM AFTERNOON\n3-6PM EVENING"+reset);
		sleep();
		int b=sc.nextInt();
		if(b==1)
		{
			System.out.println(green+"SLOT BOOKED AT 9AM THE DOCTOR WILL BE AVAILABLE AT THAT TIME"+reset);
		}
		else if(b==2)
		{
			System.out.println(yellow+"SLOT BOOKED AT 2PM THE DOCTOR WILL BE AVAILABLE AT THAT TIME"+reset);
		}
		else
		{
			System.out.println(blue+"SLOT BOOKED AT 6PM THE DOCTOR WILL BE AVAILABLE AT THAT TIME"+reset);
		}
	}
	void generalphysician()
	{ 
		System.out.print(violet1+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(red+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-Genral Medicine][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(green+"2-Dr.SAI CHARAN[MBBS-General Medicine][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(yellow+"3-Dr.MADHU[MBBS-General Medicine][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int bc=sc.nextInt();
		if(bc==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(blue+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int c=sc.nextInt();
			if(c==1)
			{
				generalphysician();
			}
			if(c==2)
			{
				totalbill(bills);
		        }
		}
		else if(bc==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int d=sc.nextInt();
			if(d==1)
			{
				generalphysician();
			}
			if(d==2)
			{
				totalbill(bills);
		        }
		}
		else if(bc==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int e=sc.nextInt();
			if(e==1)
			{
				generalphysician();
			}
			if(e==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(yellow+"Invalid option "+reset);
			//display();
		}	
	}
	void dental()
	{ 
		System.out.print(red1+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(yellow+"1-Dr.CHAITANYA VADDI[BDS-Dental,MDS-Implantologist][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(blue+"2-Dr.SAI CHARAN[BDS-Dental,MDS-Prosthodontics][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(green+"3-Dr.MADHU[BDS-Dental][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int cd=sc.nextInt();
		if(cd==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int f=sc.nextInt();
			if(f==1)
			{
				dental();
			}
			if(f==2)
			{
				totalbill(bills);
		        }
		}
		else if(cd==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int g=sc.nextInt();
			if(g==1)
			{
				dental();
			}
			if(g==2)
			{
				totalbill(bills);
		        }
		}
		else if(cd==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(green+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int h=sc.nextInt();
			if(h==1)
			{
				dental();
			}
			if(h==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(yellow+"Invalid option "+reset);
			//display();
		}	
	}
	void dermatology()
	{ 
		System.out.print(blue+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(red+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,Diploma-Dermatology][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(yellow+"2-Dr.SAI CHARAN[MBBS-General Medicine,MD-Dermotology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(green+"3-Dr.MADHU[MBBS-General Medicine,Diploma-Dermatology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int de=sc.nextInt();
		if(de==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(blue+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int i=sc.nextInt();
			if(i==1)
			{
				dermatology();
			}
			if(i==2)
			{
				totalbill(bills);
		        }
		}
		else if(de==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int j=sc.nextInt();
			if(j==1)
			{
				dermatology();
			}
			if(j==2)
			{
				totalbill(bills);
		        }
		}
		else if(de==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(white+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int k=sc.nextInt();
			if(k==1)
			{
				dermatology();
			}
			if(k==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(red+"Invalid option "+reset);
			//display();
		}	
	}
	void gynecology()
	{ 
		System.out.print(green+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(blue+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-obstetrtics&Gynaecology][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(yellow+"2-Dr.SAI CHARAN[MBBS-General Medicine,MD-obstetrtics&Gynaecology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(violet+"3-Dr.MADHU[MBBS-General Medicine,MD-obstetrtics&Gynaecology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int ef=sc.nextInt();
		if(ef==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int l=sc.nextInt();
			if(l==1)
			{
				gynecology();
			}
			if(l==2)
			{
				totalbill(bills);
		        }
		}
		else if(ef==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(yellow+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int m=sc.nextInt();
			if(m==1)
			{
				gynecology();
			}
			if(m==2)
			{
				totalbill(bills);
		        }
		}
		else if(ef==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(green+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int n=sc.nextInt();
			if(n==1)
			{
				gynecology();
			}
			if(n==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(blue1+"Invalid option "+reset);
			//display();
		}	
	}
	void cardiology()
	{ 
		System.out.print(violet+"Choose a Doctor to Consult "+reset);
		sleep();
		System.out.println();
		System.out.println(red+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-Genral Medicine,DNB-Cardoilogy][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(yellow+"2-Dr.SAI CHARAN[MBBS-General Medicine,DM-cardiology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(blue+"3-Dr.MADHU[MBBS-General Medicine,DM-cardiology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int fg=sc.nextInt();
		if(fg==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(green+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int o=sc.nextInt();
			if(o==1)
			{
				cardiology();
			}
			if(o==2)
			{
				totalbill(bills);
		        }
		}
		else if(fg==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int p=sc.nextInt();
			if(p==1)
			{
				cardiology();
			}
			if(p==2)
			{
				totalbill(bills);
		        }
		}
		else if(fg==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int q=sc.nextInt();
			if(q==1)
			{
				cardiology();
			}
			if(q==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(green+"Invalid option "+reset);
			//display();
		}	
	}
	void neurology()
	{ 
		System.out.print(yellow1+"Choose a Doctor to Consult ");
		sleep();
		System.out.println();
		System.out.println(green+"1-Dr.CHAITANYA VADDI[MBBS-General Medicine,MD-Genral Medicine,DM-Neurology][6YEARS EXPERIENCE][CV HOSPITAL][REVIEW(4/5)][CONSULTATION FEE-600/-"+reset);
		sleep();
		System.out.println(blue+"2-Dr.SAI CHARAN[MBBS-General Medicine,DM-Neurology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-500/-"+reset);
		sleep();
		System.out.println(violet+"3-Dr.MADHU[MBBS-General Medicine,DM-Neurology][4YEARS EXPERIANCE][CV HOSPITAL][REVIEW(4/5)][CONSUTATION FEE-400/-"+reset);
		sleep();
		int gh=sc.nextInt();
		if(gh==1)
		{
			bills=bills+(billing(600));
			slot();
			System.out.print(blue+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int r=sc.nextInt();
			if(r==1)
			{
				neurology();
			}
			if(r==2)
			{
				totalbill(bills);
		        }
		}
		else if(gh==2)
		{
			bills=bills+(billing(500));
			slot();
			System.out.print(violet+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int s=sc.nextInt();
			if(s==1)
			{
				neurology();
			}
			if(s==2)
			{
				totalbill(bills);
		        }
		}
		else if(gh==3)
		{
			bills=bills+(billing(400));
			slot();
			System.out.print(red+"Enter 1 to Consult Another Doctor 2 for Bill"+reset);
			sleep();
			int t=sc.nextInt();
			if(t==1)
			{
				neurology();
			}
			if(t==2)
			{
				totalbill(bills);
		        }
	        }
		else
		{
			System.out.print(yellow+"Invalid option"+reset);
			//display();
		}	
	}
	
	void display()
	{

        	System.out.println(WHITE + BOLD + "1. " + UNDERLINE + "GENERAL PHYSICIAN" + RESET);
		sleep();
        	System.out.println(GREEN + BOLD + "2. " + UNDERLINE + "DENTAL" + RESET);
		sleep();
        	System.out.println(YELLOW + BOLD + "3. " + UNDERLINE + "DERMATOLOGY" + RESET);
		sleep();
        	System.out.println(BLUE + BOLD + "4. " + UNDERLINE + "GYNECOLOGY" + RESET);
		sleep();
        	System.out.println(GREEN + BOLD + "5. " + UNDERLINE + "CARDIOLOGY" + RESET);
		sleep();
        	System.out.println(MAGENTA + BOLD + "6. " + UNDERLINE + "NEUROLOGY" + RESET);
		sleep();



                int ab=sc.nextInt();
		if(ab==1)
		{
	 	 	generalphysician();
		}
		else if(ab==2)
		{
			dental();
		}
		else if(ab==3)
		{
			dermatology();
		}
		else if(ab==4)
		{
			gynecology();
		}
		else if(ab==5)
		{
			cardiology();
		}
		else
		{
			neurology();
		}
	}
	void m1()
	{
		x.display();
	}
}
class Hospital3 extends cv
{
public static final String BOLD = "\u001B[1m";
public static final String UNDERLINE = "\u001B[4m";
public static final String BLUE = "\u001B[34m";
public static final String MAGENTA = "\u001B[35m";
public static final String RED = "\u001B[31m";
public static final String RESET = "\u001B[0m";
static void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{

		}
	}

	static Scanner sc=new Scanner(System.in);
	void murali()
	{
		//System.out.println(BOLD + RED + "=== Welcome To The Clinic Doctor Consultation ===" + RESET);
		System.out.println(RED + BOLD + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + RESET);
        	System.out.println(RED + BOLD + "|     WELCOME TO THE CLINIC DOCTOR   |" + RESET);
        	System.out.println(RED + BOLD + "|             CONSULTATION           |" + RESET);
        	System.out.println(RED + BOLD + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + RESET);
		sleep();
        	System.out.println(BLUE + BOLD + UNDERLINE + "1. CV HOSPITAL" + RESET);
		sleep();
        	System.out.println(MAGENTA + BOLD + UNDERLINE + "2. CHARAN HOSPITAL" + RESET);
		sleep();

		int h=sc.nextInt();
		if(h==1)
		{
			new hospital1().m1();
		}
		else if(h==2)
		{
			new hospital2().m1();
		}
		else
		{
			System.out.println(skyblue+"Enter the correct option"+reset);
			new Hospital3().murali();
		}
	}
}
class welcome
{   
	String blink = "\u001B[5m";  // ANSI escape code for blinking text
        String red = "\u001B[31m";   // ANSI escape code for red text
        String reset = "\u001B[0m";  // ANSI escape code to reset text attributes
	static String bold = "\u001B[1m";
	static String thickness = "\u001B[2m";
    	welcome()
	{
        String asciiArt ="\t\t\t\t\t\t _____________________________ \n"+
			 "\t\t\t\t\t\t|  __________________________ |\n"+
			 "\t\t\t\t\t\t| |     W E L C O M E       | |\n"+
			 "\t\t\t\t\t\t| |         T O             | |\n"+
			 "\t\t\t\t\t\t| |      A P O L L O        | |\n"+
			 "\t\t\t\t\t\t| |_________________________| |\n"+
			 "\t\t\t\t\t\t|_____________________________|";

        String[] asciiLines = asciiArt.split("\n");

        for (String line : asciiLines) {
            System.out.println(blink + red + line + reset);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class welcome1
{   
	String blink = "\u001B[5m";  // ANSI escape code for blinking text
        String red = "\u001B[31m";   // ANSI escape code for red text
        String reset = "\u001B[0m";  // ANSI escape code to reset text attributes
	static String bold = "\u001B[1m";
	static String thickness = "\u001B[2m";
    	welcome1()
	{
        String asciiArt ="\t\t\t\t\t\t _____________________________ \n"+
			 "\t\t\t\t\t\t|  __________________________ |\n"+
			 "\t\t\t\t\t\t| |      W E L C O M E      | |\n"+
			 "\t\t\t\t\t\t| |         T O             | |\n"+
			 "\t\t\t\t\t\t| |      N E T M E D S      | |\n"+
			 "\t\t\t\t\t\t| |_________________________| |\n"+
			 "\t\t\t\t\t\t|_____________________________|";

        String[] asciiLines = asciiArt.split("\n");

        for (String line : asciiLines) {
            System.out.println(blink + red + line + reset);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
interface Pharmancy
{       static String bold    ="\u001B[1m";
  	static String red     ="\u001B[31m"; 
   	static String reset   ="\u001B[0m";    
   	static String green   ="\u001B[32m";
    	static String yellow  ="\u001B[33m";
    	static String blue    ="\u001B[34m";
  	static String cyan    ="\u001B[35m";
        static String magenta ="\u001B[36m";
	Scanner sc = new Scanner(System.in);
	double dolo650price   = 50;
 	double crocinprice    = 100;
	double blumox500price = 150; 
	double dolo650(int quantity);
	double crocinprice(int quantity);
	double blumox500(int quantity);
}
class netmeds implements Pharmancy
{


public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // ANSI formatting options
    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String REVERSED = "\u001B[7m";
    public static final String BLINK = "\u001B[5m";
    public static boolean isValidUpiId(String upiId) {
        return upiId.contains("@");
    }


	double bill = 0;
	public double dolo650(int quantity)
	{
		return(quantity*dolo650price+20);
	}
	public double crocinprice(int quantity)
	{
		return(quantity*crocinprice+20);
	}
	public double blumox500(int quantity)
	{
		return(quantity*blumox500price+20);
	}
	void counter()
	{
		new welcome1();
	System.out.println(YELLOW + BOLD + "*****************************************" + RESET);
        System.out.println(YELLOW + BOLD + "*       MEDICINE SELECTION MENU         *" + RESET);
        System.out.println(YELLOW + BOLD + "*****************************************" + RESET);


        System.out.print(BLUE + BOLD + "1-" + UNDERLINE + " DOLO 650" + RESET);
        System.out.print(RED + BOLD + "\n2-" + UNDERLINE + " CROCIN" + RESET);
        System.out.print(GREEN + BOLD + "\n3-" + UNDERLINE + " BLUMOX 500" + RESET);
        System.out.print(MAGENTA + BOLD + "\nPlease select which medicine you want: " + RESET);


		int n = sc.nextInt();
		switch(n)
		{
				
			case 1 : System.out.println(magenta+"Enter quantity :----"+reset);
			bill=bill+dolo650(sc.nextInt());
			break;
			case 2 : System.out.println(magenta+"Enter quantity :----"+reset);
			bill=bill+crocinprice(sc.nextInt());
			break;
			case 3 : System.out.println(magenta+"Enter quantity :----"+reset);
			bill=bill+blumox500(sc.nextInt());
			break;	
			default : System.out.println(red+"I n v a l i d  S e l e c t i o n...!!!"+reset);
		}
		System.out.println(green+"1- If u want to buy more.. \n2- billing "+reset);
		int n1=sc.nextInt();
		if(n1==1)
		{
			counter();
		}
		else if(n1==2)
		{
			billing(bill);
		}
	}
	private static void printTableRow(String label, double value) {
	System.out.printf("|| %-25s || %-10.2f ||%n", label, value);
    	}
	void billing(double bill) 
	{
        System.out.println(cyan+"---------------------------------------------");
        System.out.println(cyan+"||    B I L L I N G  D E T A I L S         ||");
        System.out.println(cyan+"---------------------------------------------");
        printTableRow("Bill amount", bill);
        double gst = bill * 0.15;
        printTableRow("GST on bill", gst);
        printTableRow("Delivery charges", 30.00);

        double discount = (bill > 1000) ? bill * 0.20 : 0;
        printTableRow("Discount amount", discount);

        double totalAmount = bill + gst + 30.00 - discount;
        printTableRow("Total payable amount", totalAmount);

        System.out.println(cyan+"---------------------------------------------");

        System.out.println(red + bold + "Choose payment method:----" + reset);
        System.out.println(blue + "1 - UPI");
        System.out.println("2 - Card" + reset);
		int paymentOption = sc.nextInt();
		if (paymentOption == 1)
		{
    			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}
    			System.out.println(green+"Please enter your mobile number :-----:"+reset);
    			String f = sc.next();
			if(f.length()==10)
			{
        			System.out.println(red+"Please enter the OTP:"+reset);
        			int otp = 1000 + (int)(Math.random()*8999);
        			System.out.println(otp);
        			int enterecrocinp = sc.nextInt();
        			if (enterecrocinp == otp)
				{
            				System.out.println(green+"Total bill payable is : "+reset + totalAmount);
            				System.out.println(red+"Please select 1 to pay or any other key to cancel...."+reset);
            				char paymentConfirmation = sc.next().charAt(0);
            				if (paymentConfirmation == '1') 
					{
                				System.out.println(green+bold+"W O O H O O...!!!\nPayment SUCCESSFULLY DONE\nOur delivery boy delivers your medicine within a short time\n Thank You visit again "+reset);
            				}
					
        			}
    			}
			else
			{
				System.out.println("Enter the correct number");
				billing(bill);
			}
		}
 		else if (paymentOption == 2)
		{
    			System.out.println(yellow+"Enter card details: "+reset);
    			String cardDetails = sc.next();
    			System.out.println(red+"Please enter your mobile number:"+reset);
    			String f = sc.next();
    			if (f.length()==10)
			{
        			System.out.println(green+"Please enter the OTP:"+reset);
        			int otp = 1000 + (int) (Math.random() * 8999);
        			System.out.println(otp);
        			int enterecrocinp = sc.nextInt();
        			if (enterecrocinp == otp)
				{
            				System.out.println(green+"Total bill payable is: "+reset + totalAmount);
            				System.out.println(cyan+"Please select 1 to pay or any other key to cancel."+reset);
            				char paymentConfirmation = sc.next().charAt(0);
            				if (paymentConfirmation == '1')
					{
                				System.out.println(green+bold+"Woohoo...!!!\nPayment SUCCESSFULLY DONE\nOur delivery boy delivers your medicine within a short time\n Thank You visit again "+reset);
           
            				}
				/*else
				{
                			System.exit(0);
            			}*/
        			}
    			}
			else
			{
				System.out.println("Enter the correct number");
				billing(bill);
			}
		}
	}
}
class Apollo extends netmeds implements Pharmancy
{       static String bold   ="\u001B[1m";
  	static String red    ="\u001B[31m"; 
   	static String reset  ="\u001B[0m";    
   	static String green  ="\u001B[32m";
    	static String yellow ="\u001B[33m";
    	static String blue   ="\u001B[34m";
  	static String cyan   ="\u001B[35m";
        static String magenta="\u001B[36m";
	double bill = 0;
	public static boolean isValidUpiId(String upiId) {
        return upiId.contains("@");
    }
	public double dolo650(int quantity)
	{
		return(quantity*dolo650price+20);
	}
	public double crocinprice(int quantity)
	{
		return(quantity*crocinprice+20);
	}
	public double blumox500(int quantity)
	{
		return(quantity*blumox500price+20);
	}
	void counter()
	{
		new welcome();


	System.out.println(YELLOW + BOLD + "*****************************************" + RESET);
        System.out.println(YELLOW + BOLD + "*        MEDICINE SELECTION MENU        *" + RESET);
        System.out.println(YELLOW + BOLD + "*****************************************" + RESET);
        System.out.print(BLUE + BOLD + "1-" + UNDERLINE + " DOLO 650" + RESET);
        System.out.print(RED + BOLD + "\n2-" + UNDERLINE + " CROCIN" + RESET);
        System.out.print(GREEN + BOLD + "\n3-" + UNDERLINE + " BLUMOX 500" + RESET);
        System.out.print(MAGENTA + BOLD + "\nPlease select which medicine you want: " + RESET);


		int n = sc.nextInt();
		switch(n)
		{
			case 1 : System.out.println(cyan+"Enter quantity----"+reset);
			bill=bill+dolo650(sc.nextInt());
			break;
			case 2 : System.out.println(cyan+"Enter quantity----"+reset);
			bill=bill+crocinprice(sc.nextInt());
			break;
			case 3 : System.out.println(cyan+"Enter quantity----"+reset);
			bill=bill+blumox500(sc.nextInt());
			break;	
			default : System.out.println(red+"Invalid Selection...!!!"+reset);
		}
		System.out.println(green+"1- if u want to buy.. \n2- billing "+reset);
		int n1=sc.nextInt();
		if(n1==1)
		{
			counter();
		}
		else if(n1==2)
		{
			billing(bill);
		}
	}
	private static void printTableRow(String label, double value) {
	System.out.printf("|| %-25s || %-10.2f ||%n", label, value);
    	}
	void billing(double bill) 
	{
        System.out.println("---------------------------------------------");
        System.out.println("||     B I L L I N G  D E T A I L S        ||");
        System.out.println("---------------------------------------------");
        printTableRow("Bill amount", bill);
        double gst = bill * 0.15;
        printTableRow("GST on bill", gst);
        printTableRow("Delivery charges", 30.00);

        double discount = (bill > 1000) ? bill * 0.20 : 0;
        printTableRow("Discount amount", discount);

        double totalAmount = bill + gst + 30.00 - discount;
        printTableRow("Total payable amount", totalAmount);

        System.out.println("---------------------------------------------");

        System.out.println(red + bold + "Choose payment method:" + reset);
        System.out.println(blue + "1 - UPI");
        System.out.println("2 - Card" + reset);
	int paymentOption = sc.nextInt();
		if (paymentOption == 1)
		{
    			boolean t=true;
			while(t)
			{
				System.out.println(yellow+"Please enter your UPI Id: "+reset);
				String upiId = sc.next();
				if (isValidUpiId(upiId)) {
            			System.out.println("Valid UPI ID");
				t=false;
        			} 			
			else {
            		System.out.println("Invalid UPI ID");
        		}
			}
    			System.out.println(blue+"Please enter your mobile number:"+reset);
    			String f = sc.next();
			if(f.length()==10)
			{
        			System.out.println(red+"Please enter the OTP:"+reset);
        			int otp = 1000 + (int) (Math.random() * 8999);
        			System.out.println(otp);
        			int enterecrocinp = sc.nextInt();
        			if (enterecrocinp == otp)
				{
            				System.out.println(green+"Total bill payable is: "+reset + totalAmount);
            				System.out.println(yellow+"Please select 1 to pay or any other key to cancel."+reset);
            				char paymentConfirmation = sc.next().charAt(0);
            				if (paymentConfirmation == '1') 
					{
                				System.out.println(green+bold+"Woohoo...!!!\nPayment successfully done\nOur delivery boy delivers your medicine within a short time\n Thank You visit again "+reset);
           
            				}
					
        			}
    			}
			else
			{
				System.out.println("enter the correct number");
				billing(bill);
			}
		}
 		else if (paymentOption == 2)
		{
    			System.out.println(green+"Enter card details: "+reset);
    			String cardDetails = sc.next();
    			System.out.println(cyan+"Please enter your mobile number:"+reset);
    			String f = sc.next();
    			if (f.length()==10)
			{
        			System.out.println(red+"Please enter the OTP:"+reset);
        			int otp = 1000 + (int) (Math.random() * 8999);
        			System.out.println(otp);
        			int enterecrocinp = sc.nextInt();
        			if (enterecrocinp == otp)
				{
            				System.out.println(green+bold+"Total bill payable is: "+reset + totalAmount);
            				System.out.println(blue+"Please select 1 to pay or any other key to cancel."+reset);
            				char paymentConfirmation = sc.next().charAt(0);
            				if (paymentConfirmation == '1')
					{
                				System.out.println(green+bold+"Woohoo...!!!\nPayment successfully done\nOur delivery boy delivers your medicine within a short time\nThank You visit again "+reset);
            				}
					/*else
					{
                			System.exit(0);
            				}*/
        			}
    			}
			else
			{
				System.out.println("enter the correct number");
				billing(bill);
			}
		}
	}
}
class user2
{       static String bold   ="\u001B[1m";
  	static String red    ="\u001B[31m"; 
   	static String reset  ="\u001B[0m";    
   	static String green  ="\u001B[32m";
    	static String yellow ="\u001B[33m";
    	static String blue   ="\u001B[34m";
  	static String cyan   ="\u001B[35m";
        static String magenta="\u001B[36m";
	static final String UNDERLINE = "\u001B[4m";
	static void display()
	{

	System.out.println(cyan + bold + "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + reset);
        System.out.println(cyan + bold + "&            PHARMACY MENU              &" + reset);
        System.out.println(cyan + bold + "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + reset);
	
        System.out.println(blue + bold + "1- " + UNDERLINE + "N E T M E D S" + reset);
        System.out.println(magenta + bold + "2- " + UNDERLINE + "A P O L L O" + reset);


		int n = Pharmancy.sc.nextInt();
		if(n==1)
		{
			new netmeds().counter();
		}
		else if(n==2)
		{
			new Apollo().counter();
		}
		else
		{
			System.out.println(red+"-----I n v a l i d  S e l e c t i o n-----"+red);
			display();
		}
	}
	void ravindra()
	{
               
	        Scanner sc=new Scanner(System.in);
		System.out.println(magenta+"Welcome to the medical stores "+reset);
		display();
		
	}
}

class deepika extends cv
{

	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String underline="\u001B[4m";
	
	static String reset = "\u001B[0m";
        static String red = "\u001B[31m";
        static String green = "\u001B[32m";
        static String yellow = "\u001B[33m";
        static String blue = "\u001B[34m";
        static String purple = "\u001B[35m";
        static String cyan = "\u001B[36m";
        static String white = "\u001B[37m";
        static String blink = "\u001B[5m";

	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) throws Exception {
		new CVCARE().display();
		new CVCARE().naveen();
		//sampath();
		sampath();
		thankyou();
	}
	static void thankyou()throws Exception
	{

	 // Your ASCII art with colors, blinking, and sleep
       // System.out.println(blink + purple + "\t\t$──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────$" + reset);
        Thread.sleep(500);
	System.out.println(blink + cyan + "\t\t														       ");
	System.out.println(blink + white + "\t\t														       ");
        System.out.println(blink + red + "\t\t     " + "------------ ----    ----    ------    ----    ---- ----    ----      ---      ---   --------   ----    ----" + reset + red+"     ");
        Thread.sleep(500);
        System.out.println(blink + green + "\t\t     " + "************ ****    ****   ********   *****   **** ****   ****        ***    ***   **********  ****    ****" + reset +green+ "     ");
        Thread.sleep(500);
        System.out.println(blink + yellow + "\t\t     " + "------------ ----    ----  ----------  ------  ---- ----  ----          ---  ---   ----    ---- ----    ----" + reset +yellow+ "     ");
        Thread.sleep(500);
        System.out.println(blink + blue + "\t\t     " + "    ****     ************ ****    **** ************ *********            ******    ***      *** ****    ****" + reset + blue+"     ");
        Thread.sleep(500);
        System.out.println(blink + purple + "\t\t     " + "    ----     ------------ ------------ ------------ ---------             ----     ---      --- ----    ----" + reset +purple+ "     ");
        Thread.sleep(500);
        System.out.println(blink + cyan + "\t\t     " + "    ****     ****    **** ************ ****  ****** ****  ****            ****     ****    **** ************" + reset +cyan+ "     ");
        Thread.sleep(500);
        System.out.println(blink + white + "\t\t     " + "    ----     ----    ---- ----    ---- ----   ----- ----   ----           ----      ----------  ------------" + reset + white+"     ");
        Thread.sleep(500);
        System.out.println(blink + red + "\t\t     " + "    ****     ****    **** ****    **** ****    **** ****    ****          ****       ********   ************" + reset + red+"     ");
        Thread.sleep(500);
	System.out.println(blink + green + "\t\t														       ");
	System.out.println(blink + yellow + "\t\t														       ");
        //System.out.println(blink + blue + "\t\t$──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────$" + reset);
        Thread.sleep(300); // Sleep for 2 seconds

        // Additional sleep for a moment to make the blinking effect more noticeable
        Thread.sleep(500);

	}

	static void sampath()throws Exception
	{
	String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String cyan = "\u001B[36m";
        String bold = "\u001B[1m";
        String reset = "\u001B[0m";
	String blink = "\u001B[5m";


	System.out.println(blink+bold + cyan +"\t\t\t\t                                           :+**++==++**+:");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t                                        :#+.            .+#:");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t                                      -@:                  :@-");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t                                     *=        **==+*.       =*");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t                                    *:        :+    +:        :*");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t                                   #=         :+    +:         -#");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t                                  -#          :+    +-          #-");
	
        System.out.println(blink+bold + red +"\t\t\t\t                                  #-   .@:                :@.   -#");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t          .:::::::::::::::::::::::@:   -#                  *-   .@:::::::::::::::::::::::.");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t       .*=:.......................#-   .%-.....      .....-%.   -%.......................:-#.");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t       +-                         -%          :+    +-          #-                         -+");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t       ==                          #=         :+    +:         -#                          ==");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t        =#++=======================+%-        :+    +:        -%+=======================++#=");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t           +-                        *=        *+==+*.       =*                        -+");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t           +-                         :%-                  -%:                         -+");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t           +-                            ##.            .#%                            -+");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t           +-                              .+%%*=--=*%%*.                              -+");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t           +-                                                                          -+");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t           +-    =#*****************#:  =#*****************%   *******************+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t           +-    +-                 *:  +=                 @   #                 .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t           +-    +-                 *:  +=                 @   #                 .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t           +-    +-                 *:  +=                 @   #                 .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t           +-    +-    BLOODBANKS   *:  +=    HOSPITALS    @   #  MEDICAL STORES .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t           +-    +-                 *:  +=                 @   #                 .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t           +-    +-                 *:  +=                 @   #                 .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t           +-    +-                 *:  +=                 @   #                 .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t           +-    -*******************.  -******************#   +******************=    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t           +-                                                                          -+");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t           +-                                                                          -+");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t           +-                                                                          -+");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t           +-    +-      %:     -+.              ++               +-      @.     :*    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t           +-    +-      #:     -+               ++               +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t           +-    +-      #:     -+               ++               +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t           +-    +-      #:     -+               ++               +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t           +-    +-      #:     -+               ++               +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t           +-    +-      #:     -+               ++               +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t           +-    +-      #:     -+               ++               +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t           +-    +-      #:     -+         =@@%. ++ =@@@          +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t           +-    +-      #:     -+           .   ++   .           +-      @      .+    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t           +-    +=......%:     -+               ++               +-      @......:*    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t           +-    .--------      -+               ++               +-      :-------.    -+");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t           +-                   -+               ++               +-                   -+");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t           +-                   -+               ++               +-                   -+");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t           +-                   -+               ++               +-                   -+");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t           +-                   -+               ++               +-                   -+");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t  .#+++++++**+++++++++++++++++++**+++++++++++++++**+++++++++++++++**+++++++++++++++++++**+++++++#.");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t  :*      				  WELCOME TO CVCARE                                    *:");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t  :*                                                                                            *:");
	Thread.sleep(300);
        System.out.println(blink+bold + green +"\t\t\t\t .-#............................................................................................#-.");
	Thread.sleep(300);
        System.out.println(blink+bold + yellow +"\t\t\t\t@-::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-@");
	Thread.sleep(300);
        System.out.println(blink+bold + blue +"\t\t\t\t@                                                                                                  @");
	Thread.sleep(300);
        System.out.println(blink+bold + cyan +"\t\t\t\t@                                                                                                  @");
	Thread.sleep(300);
        System.out.println(blink+bold + red +"\t\t\t\t@                                                                                                  @");
	Thread.sleep(300);
		

		System.out.println();
		System.out.println();
		boolean b=true;

		System.out.println(thick+change+underline+"\t\t\t1.BLOODBANKS\t\t\t2.HOSPITALS\t\t\t3.MEDICAL STORES\t\t\t4.Exit"+reset);
		int p=sc.nextInt();
		if(p==1)
		{
			new charan().charukesh();
			while(b)
			{
			System.out.println(green+"1. Do u need anything else\n2. Exit"+reset);
			int ch=sc.nextInt();
			if(ch==1)
			{
				new charan().charukesh();
			}
			else
			{
				b=false;
				sampath();
			}
			}	
		}
		else if(p==2)
		{
			new Hospital3().murali();
			while(b)
			{
			System.out.println(green+"1.Do u need anything else\n2. Exit"+reset);
			int ch1=sc.nextInt();
			if(ch1==1)
			{
				new Hospital3().murali();
			}
			else
			{
				b=false;
				sampath();
			}
			}
		}
		else if(p==3)
		{
			new user2().ravindra();
			while(b)
			{
			System.out.println(yellow+"1. Do u need anything else\n2. Exit"+reset);
			int ch2=sc.nextInt();
			if(ch2==1)
			{
				new user2().ravindra();
			}
			else
			{
				b=false;
				sampath();
			
			}
			}
		}
		else if(p==4)
		{
			System.out.println("EXXXXXXXXIIIIIIIIT");
			b=false;
		}
		else
		{
			System.out.println(blue+" I N V A L I D  O P T I O N "+reset);
			System.out.println(red+"1. Enter the correction option\n2. Exit"+reset);
			int ch3=sc.nextInt();
			if(ch3==1)
			{
				sampath();
			}
			else
			{
				System.out.println(green+"Exit"+reset);
			}
			
		}
	}
}

