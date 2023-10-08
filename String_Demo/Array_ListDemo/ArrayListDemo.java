package Array_ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Boolean>empMarriedList=new ArrayList<Boolean>();
        empMarriedList.add(true);
        empMarriedList.add(false);
        empMarriedList.add(false);
        empMarriedList.add(true);
        System.out.println("list of married emp"+empMarriedList);
        Collections.sort(empMarriedList);
        Iterator itr=empMarriedList.iterator();
        System.out.println("After iterator use list is");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
