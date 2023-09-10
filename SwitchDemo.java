import java.util.Scanner;

public class SwitchDemo {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Greetings");
        String type=sc.nextLine();
        System.out.println("Enter time AM,PM,NOON");
        String time=sc.nextLine();
        switch(type)
        {
            case"Good Morning":
                                 System.out.println("Good Morning");
                                 switch(time)
                                 {
                                    case"AM":
                                           System.out.println("AM valid");
                                           break;
                                    default : 
                                            System.out.println("You entered wrong time");
                                            break;
                                 }
                                break;
            case"Good Afternoon":
                                System.out.println("Good Afternoon");
                                switch(time)
                                 {
                                    case"NOON":
                                           System.out.println("NOON valid");
                                           break;
                                    default : 
                                            System.out.println("You entered wrong time");
                                            break;
                                 }
                                break;
            case"Good Evening":

                                System.out.println("Good Evening");
                                switch(time)
                                 {
                                    case"NOON":
                                           System.out.println("NOON valid");
                                           break;
                                    default : 
                                            System.out.println("You entered wrong time");
                                            break;
                                 }
                                break;
            case"Good Night":
                                System.out.println("Good Night");
                                switch(time)
                                 {
                                    case"PM":
                                           System.out.println("PM valid");
                                           break;
                                    default : 
                                            System.out.println("You entered wrong time");
                                            break;
                                 }
                                break;
            default:
                                System.out.println("You Entered wrong");
                                break;                    
        }
    }
}
