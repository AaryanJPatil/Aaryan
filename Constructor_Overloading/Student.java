package Constructor_Overloading;

public class Student {
    String name,email;
    int rollNo,marks,pin;
    Student(int marks,int pin)
    {
        System.out.println("I am in 1st const");
        this.marks=marks;
        this.pin=pin;
    }
    Student(int marks,String name)
    {
        System.out.println("I am in 2nd const");
        this.marks=marks;
        this.name=name;
    }
    Student(String name,int rollNo)
    {
        System.out.println("I am in 3rd const");
        this.name=name;
        this.rollNo=rollNo;
    }
    Student(String name,int rollNO,String email)
    {
        System.out.println("I am in 4th const");
        this.name=name;
        this.rollNo=rollNO;
        this.email=email;
    }
    void display()
    {
        System.out.println("name is"+name);
        
        System.out.println("rollNO is"+rollNo);
        System.out.println("email"+email);
        System.out.println("marks"+marks);
         System.out.println("pin is"+pin);
    }
    public static void main(String[] args) {
        Student st1=new Student(100,410206);
        st1.display();
        System.out.println("----------------");
        Student st2=new Student("abc", 20,"abc@gmail.com");
        st2.display();
         System.out.println("----------------");
        Student st3=new Student("ad",35);
          st3.display();
           System.out.println("----------------");
          Student st4=new Student(15,"ef");
        st4.display();
        
    }
}
