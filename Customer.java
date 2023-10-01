public class Customer {
    int custId;
    String custName;
    //default constructor
   Customer()
    {
        System.out.println("I am in default customer");
        custId=101;
        custName="Aviraj";
    }
    //parameterised constructor
   Customer(int id,String name)
   {
    System.out.println("I am in para cont");
    custId=id;
    custName=name;
   }
    void displayCustomer()
    {
         System.out.println("Id is "+custId);
          System.out.println("name is "+custName);
    }
}
