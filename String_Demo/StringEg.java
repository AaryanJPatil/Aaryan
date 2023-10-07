package String_Demo;

public class StringEg {
    public static void main(String[] args) {
        
    
    String s1="Hello";
    String s2="Aptech";
    System.out.println("length of s1 is"+s1.length());
    System.out.println("character at index 1"+s1.charAt(1));
    System.out.println(s1.concat(s2));
    System.out.println("last index of h"+s2.lastIndexOf('h'));
    System.out.println("replace Aptech to Kptech "+s2.replace('A','K'));
    String s3="            Hello";
    System.out.println("length of s3 is"+s3.length());
    System.out.println("original s3 is"+s3);
    String s4=s3.trim();
    System.out.println("length of s4 is"+s4.length());

}
}