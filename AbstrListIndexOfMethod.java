// Java program to demonstrate 
// indexOf() method 
// for Integer value 
  
import java.util.*; 
  
public class AbstrListIndexOfMethod { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 
  
            // Creating object of AbstractList<Integer> 
            AbstractList<Integer> 
                arrlist1 = new ArrayList<Integer>(); 
  
            // Populating arrlist1 
            arrlist1.add(10); 
            arrlist1.add(20); 
            arrlist1.add(30); 
            arrlist1.add(40); 
            arrlist1.add(50); 
  
            // print arrlist1 
            System.out.println("ArrayListlist : "
                               + arrlist1); 
  
            // getting the index of element 30 
            // using indexOf() method 
            int index = arrlist1.indexOf(30); 
  
            // print the index 
            System.out.println("index : " + index); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 







