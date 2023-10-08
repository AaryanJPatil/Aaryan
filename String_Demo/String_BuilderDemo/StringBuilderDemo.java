package String_BuilderDemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder("abc");
        System.out.println(strb.append("EF"));
        System.out.println(strb.append(24));
        System.out.println(strb.insert(3,'A'));
        System.out.println(strb.delete(0,1));
        System.out.println(strb.reverse());
    }

}
