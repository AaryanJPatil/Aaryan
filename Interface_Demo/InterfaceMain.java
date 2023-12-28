package Interface_Demo;
interface square {
    float calculateSq(float side);
}
interface Area extends square
{
    float calculateArea(float radius);
    float calculate(float l,float b);

    class Circle implements Area {

        @Override
        public float calculateSq(float side) {
         return side*side;

        }

        @Override
        public float calculateArea(float radius) {
            final float pi=3.14f;
         return pi*radius*radius;
            
        }

        @Override
        public float calculate(float l, float b) {
            return l*b;
        }
        
    
        
    } 
}
public class InterfaceMain {
    public static void main(String[] args) {
        
        System.out.println("area of sq is"+sq);
    }
}
