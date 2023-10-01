public class Company {
    public static void main(String[] args) {
        Employee1 emp=new Employee1();
        
        System.out.println("before add change");
             emp.displayEmployee();
         System.out.println("after change address");
         emp.changeAdd("Vashi");
         emp.displayEmployee();

    }
}
