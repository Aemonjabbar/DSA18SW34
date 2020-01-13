import java.util.LinkedList;

class Person{
    
}
public class Student extends Person {

    public static void main(String[] args) 
    {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("B");
        obj.add("C");
        obj.add("D");
        System.out.println("Elements in linkedList are: "+obj);
        obj.addLast("E");
        obj.addFirst("A");
        System.out.println("LinkedList: "+obj);
        System.out.println("Size of LinkedList is: "+obj.size());
        System.out.println("LinkedList contains the element B: " +obj.contains("B"));
        Object obj2=obj.clone();
        System.out.println("First element in linkedList is: "+obj.element());
        System.out.println("Element at Index 3 is: "+obj.get(3) );
        System.out.println("Last element in linkedList is: "+obj.getLast());
        System.out.println("add 'F' element: "+obj.offer("F"));
        System.out.println("LinkedList: "+obj );
        System.out.println("Show the First element: "+obj.peekFirst());
        System.out.println("Show the Last element: "+obj.peekLast());
        System.out.println("Remove the First element: "+obj.poll());
        System.out.println("Remove the Last element: "+obj.pollLast());
        System.out.println("LinkedList: "+obj);
        System.out.println("Remove index 3 : "+obj.remove(3));
        System.out.println("LinkedList: "+obj);
        System.out.println("The final size of LinkedList is: "+obj.size());
    }   
}