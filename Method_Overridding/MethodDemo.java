package Method_Overridding;
class RBI
{
    float BankInterest()
    {
        return 10.00f;
    }
    void display()
    {
        System.out.println("I am in display RBI");

    }
}
class SBI extends RBI
{
        @Override
        float BankInterest()
        {
            super.display();
            return 9.50f;
        }

}
class HDFC extends RBI
{
    @Override
    float BankInterest()
    {
        super.display();
        return 9.80f;
    }
}   
public class MethodDemo {
    public static void main(String[] args) {
        SBI SBI = new SBI();
        System.out.println("RBI ROT is"+sbi);
        HDFC hdfc
        
    }
}
