package Array_Demo;

public class Two_Dimensional {
    public static void main(String[] args) {
        int i,j;
        int marks[][]={
            {100,200,300},
            {400,500,600},
            {700,800,900}
        };
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print("\t"+marks[i][j]);

            }
            System.out.println();
        }
    }
}
