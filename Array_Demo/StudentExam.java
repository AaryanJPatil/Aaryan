package Array_Demo;

public class StudentExam {
    int marks[]=new int[5];
    int i;
    void StoreMarks()
    {
        marks[0]=100;
        marks[1]=200;
        marks[2]=300;
        marks[3]=250;
        marks[4]=220;
    }
    void displayMarks()
    {
        for(i=0;i<=4;i++)
        {
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        StudentExam se=new StudentExam();
        se.StoreMarks();
        se.displayMarks();

    }
}
