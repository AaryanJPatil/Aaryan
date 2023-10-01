public class Student1 {
    String name;
    int rollNO;
    int age;
    String address;
    void initializedStudent()
    {
        name="priyanka";
        rollNO=123;
        age=20;
        address="panvel";
    }
    void displayStudent()
    {
        System.out.println("name is"+name);
        System.out.println("rollno is"+rollNO);
        System.out.println("age is"+age);

    }
    public static void main(String[] args) {
        Student1 st=new Student1();
        st.initializedStudent();
        st.displayStudent();
    }
}
