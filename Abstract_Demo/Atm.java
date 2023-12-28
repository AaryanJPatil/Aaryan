package Abstract_Demo;
abstract class AtmMachine
{
    abstract int withdrawn (int amount);
    abstract String depoist (int amount);
    void checkBalance()
    {
        System.out.println("initial balance is 0");
    }
}
class AtmImplementation extends AtmMachine 
{
    int w,d;

    @Override
    int withdrawn(int amount) {
        w=amount;
        return amount;
        
    }

    @Override
    String depoist(int amount) {
        d=amount;
        return"You depoist"+amount;
        
    }
    @Override
    void checkBalance()
    {
        int bal;
        bal=d-w;
        System.out.println("bal is"+bal);

    }
    
}


public class Atm {
    public static void main(String[] args) {
        AtmImplementation atm =new AtmImplementation();
        atm.checkBalance();
        System.out.println("You depoised"+atm.depoist(200));
        System.out.println("You withdrawn"+atm.withdrawn(150));
        atm.checkBalance();
    }
}
