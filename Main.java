
import java.time.LocalTime;
import java.util.*;

public class Main {

    static String userPass[][] = new String[3][2];
    static Object listDish[][] = new Object[10][2];
    static Object table[][][] = new Object[5][10][3];
    static int totalDishadded = 0;
    static int Totalsell = 0;
    static int TotalDishdelivered = 0;
    static Calendar timer= Calendar.getInstance();
    public static void main(String[] args) {
        homepg();
    }

    static void homepg() {

        userPass[0][0] = "123";
        userPass[0][1] = "123";
        Scanner sc = new Scanner(System.in);
        int Continuerun = 0;
        while (Continuerun == 0) {
            System.out.println("~~~~~~~~~~ Restaurant Management ~~~~~~~~~~");
            System.out.println("1.Login");
            System.out.println("2.Signup");
            System.out.println("0.Exit");
            int choice=0;
            try {
                 choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("````` ERROR: Enter available menu number only `````");
                homepg();
            }
            System.out.println();
            switch (choice) {
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

    static void LoginPg() {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while (flag == 1) {

            System.out.print("USERNAME : ");
            String username = sc.next();
            System.out.print("PASSWORD : ");
            String password = sc.next();
            for (int i = 0; i < userPass.length; i++) {
                if (username.equals(userPass[i][0]) && password.equals(userPass[i][1])) {
                    System.out.println();
                    System.out.println("`````` LOGIN SUCCESSFULLY ``````");
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
            flag = sc.nextInt();
            if (flag == 2) {
                return;
            }

        }
    }

    static void SignupPg() {
        System.out.println();
        System.out.println("~~~~~ Signup account ~~~~~");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("USERNAME : ");
        String username = sc.next();
        System.out.print("PASSWORD : ");
        String password = sc.next();
        for (int i = 0; i < userPass.length; i++) {
            if (userPass[i][0] == null) {
                userPass[i][0] = username;
                userPass[i][1] = password;
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

    static void MainMenu() {
        Scanner sc = new Scanner(System.in);
        int Continuerun = 1;
        while (Continuerun == 1) {
            System.out.println();
            System.out.println("1.List of dish");
            System.out.println("2.Add today's dish");
            System.out.println("3.Bill");
            System.out.println("4.Analyse");
            System.out.println("0.Logout");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("````` ERROR: Enter available menu number only `````");
                MainMenu();
            }
            System.out.println();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("~~~~~ Dish in menu ~~~~~");
                    System.err.println();
                    for (int i = 0; i < listDish.length; i++) {
                        if (listDish[i][0] != null) {
                            int sno = i + 1;
                            System.out.print(sno + ". ");
                            for (int j = 0; j < 2; j++) {
                                System.out.print(listDish[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("~~~~~ Add dish to menu ~~~~~");
                    System.out.println();
                    System.out.print("Number of dish to add : ");
                    int Tdish = sc.nextInt();
                    System.out.println();
                    Tdish += totalDishadded;
                    if (Tdish <= listDish.length) {
                        for (int i = totalDishadded; i < Tdish; i++) {
                            for (int j = 0; j < 2; j++) {
                                int sno = i + 1;
                                if (j == 0) {
                                    System.out.println("Dish name " + sno + ": ");

                                    listDish[i][j] = sc.next();
                                } else {
                                    Integer inputNumber = null;
                                    boolean validInput = false;
                                    while (!validInput) {
                                        System.out.println("Dish price " + sno + ": ");
                                        String input = sc.next();
                                        if (input.isEmpty()) {
                                            System.out.println();
                                            System.out.println("````` Error: Please enter a number only ``````");
                                            System.out.println();
                                        } else {
                                            try {
                                                inputNumber = Integer.parseInt(input);
                                                validInput = true;
                                            } catch (NumberFormatException e) {
                                                System.out.println();
                                                System.out.println("`````` Error: Please enter a number only ``````");
                                                System.out.println();
                                            }
                                        }
                                    }
                                    listDish[i][j] = inputNumber;
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("`````` Dish are added to menu `````");
                        System.out.println();
                        totalDishadded += Tdish;
                    } else {
                        System.err.println();
                        System.out.println("````` Entered number is greater than total dish menu `````");
                        System.err.println();
                    }
                    break;
                case 3:
                    bill();
                    break;
                case 4:
                    System.out.println("Total sell : " + Totalsell);
                    System.out.println("Total dish delivered : " + TotalDishdelivered);

                    break;
                case 0:
                    return;
                default:
                    System.err.println("````` Enter correct memu again `````");
                    System.out.println();
            }
        }
    }

    static void bill() {
        Scanner sc = new Scanner(System.in);

        int Continuerun = 1;
        while (Continuerun == 1) {
            System.out.println();
            System.out.println("Select Table number (0-4):");
            System.out.println("Enter 0 to go back");
            int TableNumber = 0;
            try {
                TableNumber = sc.nextInt();
            } catch (Exception e) {
                System.out.println("````` ERROR: Enter available table number only (or) 0 for go back `````");
                bill();
            }
            System.out.println();
            System.out.println();
            if (TableNumber < 0 || TableNumber > 4) {
                System.out.println();
                System.err.println("````` Enter correct table number again `````");
                System.out.println();
                continue;
            }
            if (TableNumber == 0) {
                break;
            }
            int Continuerun1 = 1;
            while (Continuerun1 == 1) {
                System.out.println();
                System.out.println("1.Add dish");
                System.out.println("2.Orded dish");
                System.out.println("3.Cancel dish");
                System.out.println("4.Print bill");
                System.out.println("0.Back");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("List of dish available");
                        for (int i = 0; i < totalDishadded; i++) {
                            System.out.println((i + 1) + ". " + listDish[i][0] + " " + listDish[i][1]);
                        }
                        System.out.print("Enter number of dish to order : ");
                        int Totaldishorderintable = sc.nextInt();
                        for (int i = 0; i < Totaldishorderintable; i++) {
                            System.out.println("Enter dish number : ");
                            int DishNum = sc.nextInt();
                            DishNum--;
                            while (DishNum > totalDishadded) {
                                System.out.println("````` Enter correct dish number in list `````");
                                DishNum = sc.nextInt();
                                DishNum--;
                            }
                            table[TableNumber][i][0] = listDish[DishNum][0];
                            table[TableNumber][i][1] = listDish[DishNum][1];
                            LocalTime currentTime = LocalTime.now();
                            LocalTime futureTime = currentTime.plusSeconds(45);
                            table[TableNumber][i][2] = futureTime;
                        }

                        break;
                    case 2:
                        System.out.println();
                        for (int i = 0; i < 10; i++) {
                            if (table[TableNumber][i][1] != null) {
                                System.out.println((i + 1) + ". " + table[TableNumber][i][0] + " " + table[TableNumber][i][1]);
                            }
                        }
                        break;
                    case 3:
                    
                        int dishorder = 0;
                        int count = 0;
                        System.out.println("List of dish orded : ");
                            for (int i = 0; i < 10; i++) {
                                if (table[TableNumber][i][1] != null) {
                                    System.out.println((i + 1) + ". " + table[TableNumber][i][0] + " " + table[TableNumber][i][1]);
                                    dishorder++;
                                }
                            }
                        System.out.println("~~~ Dish to cancel ~~~");
                        while (count <= dishorder) {
                            
                            System.out.println();
                            System.out.println("Enter dish number : ");
                            System.out.println("Enter 0 to go back");
                            int DishNumtocancel = sc.nextInt();

                            if (DishNumtocancel == 0) {
                                break;
                            }
                            DishNumtocancel--;
                            LocalTime currentTimeAfterWait = LocalTime.now();
                            LocalTime storedFutureTime = (LocalTime) table[TableNumber][DishNumtocancel][2];
                            System.out.println("storedFutureTime=" + storedFutureTime);
                            System.out.println("currentTimeAfterWait=" + currentTimeAfterWait);

                            if (currentTimeAfterWait.isAfter(storedFutureTime)) {
                                System.out.println("````` You cannot cancel this dish because dish is orded before 30 seconds `````");
                            } else {
                                System.out.println("Orded "+table[TableNumber][DishNumtocancel][0]+" is canceled");
                                table[TableNumber][DishNumtocancel][0] = null;
                                table[TableNumber][DishNumtocancel][1] = null;
                                table[TableNumber][DishNumtocancel][2] = null;

                            }
                            count++;
                            System.out.println("List of dish orded : ");
                            for (int i = 0; i < 10; i++) {
                                if (table[TableNumber][i][1] != null) {
                                    System.out.println((i + 1) + ". " + table[TableNumber][i][0] + " " + table[TableNumber][i][1]);
                                    
                                }
                            }

                        }break;
                    case 4:
                        int totalprice = 0;
                        System.out.println();
                        int Totaldishorder = 0;
                        for (int i = 0; i < 10; i++) {
                            if (table[TableNumber][i][1] != null) {
                                Totaldishorder++;
                                System.out.println((i + 1) + ". " + table[TableNumber][i][0] + " " + table[TableNumber][i][1]);
                            }
                            totalprice = table[TableNumber][i][1] != null ? totalprice + ((int) table[TableNumber][i][1]) : totalprice;

                        }

                        System.out.println("Total dish : " + Totaldishorder);
                        System.out.println("Total price : " + totalprice);
                        for (int i = 0; i < 10; i++) {
                            table[TableNumber][i][0] = null;//clear value
                            table[TableNumber][i][1] = null;//clear value
                        }
                        Totalsell = Totalsell + totalprice;
                        TotalDishdelivered = TotalDishdelivered + Totaldishorder;
                        break;
                    case 0:
                        Continuerun1++;
                        break;
                    default:
                        System.err.println("````` Enter correct memu again `````");
                        System.out.println();
                }
            }
        }
    }
}
