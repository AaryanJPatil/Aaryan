public class TypesOfVariable {
    int result;
    int sum()
 {
        int a,b;
        a=10;
        b=20;
        result=a+b;
     return result;
    }
    int div()
     {
     int c,d;
     c=30;
     d=15;
     result=c/d;
     return result;
    }
    public static void main(String args[])
    {
        TypesOfVariable ty=new TypesOfVariable();
        System.out.println("sum is"+ty.sum());
        System.out.println("div is"+ty.div());
    }
    
}
