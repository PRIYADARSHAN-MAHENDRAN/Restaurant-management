import java.util.Scanner;
public class Main
{
	static  String userPass[][]=new String[5][2];
	
    	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int Continuerun=0;
		while (Continuerun==0) { 
	    System.out.println("~~~~~~~~~~ Restaurant Management ~~~~~~~~~~");
	    System.out.println("1.Login");
	    System.out.println("2.Signup");
	    int choice=sc.nextInt();
	    switch (choice){
	        case 1:
			LoginPg();
			break;
			case 2:
			System.out.println("coming ");
			break;
			/*int flag=1;
			while (flag==1) {
			
	            System.out.print("USERNAME : ");
	            String username=sc.next();
				System.out.print("PASSWORD : ");
	            String password=sc.next();
	            for(int i=0;i<5;i++){
	                if(username.equals(userPass[i][0]) && password.equals(userPass[i][1])){
	                    System.out.println("LOGIN SUCCESSFULLY");
						System.out.println();
						MainMenu();
						break;
	                }
	            }
				System.out.println();
				System.out.println("````` Entered wrong username password `````");
				System.out.println();
				System.out.println("1.Re-login");
				System.out.println("2.Home page");
				System.out.println();
				flag=sc.nextInt();
				
			}

	            break;
			
	    }*/
	}}
	}
	static void LoginPg(){
		Scanner sc=new Scanner(System.in);
		int flag=1;
		while (flag==1) {
		
			System.out.print("USERNAME : ");
			String username=sc.next();
			System.out.print("PASSWORD : ");
			String password=sc.next();
			for(int i=0;i<5;i++){
				if(username.equals(userPass[i][0]) && password.equals(userPass[i][1])){
					System.out.println("LOGIN SUCCESSFULLY");
					System.out.println();
					MainMenu();
				}
			}
			System.out.println();
			System.out.println("````` Entered wrong username password `````");
			System.out.println();
			System.out.println("1.Re-login");
			System.out.println("2.Home page");
			System.out.println();
			flag=sc.nextInt();
			if (flag==2){
				main();
			}

			
		}
	}
	static void MainMenu(){
		System.out.println("mainmenu");
	}
}
