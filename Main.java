import java.util.Scanner;
public class Main
{
	 
	static  String userPass[][]=new String[3][2];
    	public static void main(String[] args) {
        
	    userPass[0][0]="MUTHU";
	    userPass[0][1]="qwerty";
	    Scanner sc=new Scanner(System.in);
		int Continuerun=0;
		while (Continuerun==0) { 
	    System.out.println("~~~~~~~~~~ Restaurant Management ~~~~~~~~~~");
	    System.out.println("1.Login");
	    System.out.println("2.Signup");
		System.out.println("0.Exit");
	    int choice=sc.nextInt();
	    switch (choice){
	        case 1:
			LoginPg();
			break;
			case 2:
			SignupPg();
			break;
			case 0:
			System.out.println();
			System.out.println();
			System.err.println("````` Program is closed `````");
			return;
			default:
			System.out.println();
			System.out.println();
			System.out.println("````` Enter correct memu again `````");
			System.out.println();
			break;
		}
	}
}
	static void LoginPg(){
		Scanner sc=new Scanner(System.in);
		int flag=1;
		while (flag==1) {
		
			System.out.print("USERNAME : ");
			String username=sc.next();
			System.out.print("PASSWORD : ");
			String password=sc.next();
			for(int i=0;i<userPass.length;i++){
				if(username.equals(userPass[i][0]) && password.equals(userPass[i][1])){
					System.out.println("LOGIN SUCCESSFULLY");
					System.out.println();
					MainMenu();
					return;
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
				return;
			}

			
		}
	}
	static void SignupPg(){
		System.out.println();
		System.out.println("~~~~~ Signup account ~~~~~");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("USERNAME : ");
		String username=sc.next();
		System.out.print("PASSWORD : ");
		String password=sc.next();
		for(int i=0;i<userPass.length;i++){
			if(userPass[i][0]==null){
				userPass[i][0]=username;
				userPass[i][1]=password;
				System.out.println();
				System.out.println("````` Account is successfully created `````");
				System.out.println();
				System.out.println("~~~~~ Login into account ~~~~~");
				System.out.println();
				LoginPg();
				return;
			}
		}
		System.out.println("Number of admin account are full");
		System.out.println();
		System.out.println();

	}
	static void MainMenu(){
		System.out.println("mainmenu");

	}
}
