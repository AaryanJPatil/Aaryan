public class Employee1 {
    int empAge=19;
    String empName="Pollard";
    String empAddress="Kalamboli";

    void changeAdd(String add)
    {
        empAddress=add;

    }
    void displayEmployee()
    {
        System.out.println("name of emp is"+empName);
        System.out.println("age of emp  is"+empAge);
        System.out.println("address of emp is"+empAddress);
    }
    
}
