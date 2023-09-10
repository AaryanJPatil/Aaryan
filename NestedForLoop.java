import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        int i,j,row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row count");
         row=sc.nextInt();

        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
                System.out.println();
        }
        for(i=row-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
                System.out.println();
        }
    }
}
