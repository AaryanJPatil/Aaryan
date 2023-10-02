package Method_Overloading;

public class Operation {
    void add(int a,int b)
    {
        System.out.println("1st method add is"+(a+b));
    }
    void add(int a,int b,int c)
    {
       System.out.println("2nd method add is"+(a+b+c)); 
    }
    void add(int a ,float b)
    {
        System.out.println("3rd method add is"+(a+b));
    }
    void add(float b,int a)
    {
        System.out.println("4th method add is"+(a+b));
    }
    double add(int a,double b)
    {
        //int c=(int)b;
        return a+b;
    }
    public static void main(String[] args) {
        Operation op=new Operation();
        System.out.println(op.add(10, 20.5));
        op.add(10,56,9);
        op.add(20.4f,3);
        

    }
}
