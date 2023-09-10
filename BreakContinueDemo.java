public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("break demo");
         for(int i=1;i<=10;i++)
        {
            if (i==5)
                break;
            System.out.println(i);
        }
           System.out.println("continue demo");
           for(int i=1;i<=10;i++)
           {
            if (i==5)
                continue;
            System.out.println(i);
           } 
        }
    }

