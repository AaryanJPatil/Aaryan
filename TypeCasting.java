public class TypeCasting {

    public static void main(String[] args) {
       //implict type casting
        int a,b;
        a=10;
        b=200;
        double a1,b1,div;
        a1=a;
        b1=b;
        div=a1/b1;
        System.out.println("div is"+div);

        //explict type casting(double to int)
        double pi=3.14;
        int a2=(int)pi;
        System.out.println("a2 value is"+a2);
    }
}
/*destination variable= (destination data type)same variable
 * 
 */