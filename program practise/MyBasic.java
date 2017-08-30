
import java.util.LinkedList;

public class MyBasic{

    public static void main(String a[]){

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("25");
        ll.add("35");
        ll.add("89");
        ll.add("47");
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? "+ll.contains("Grape"));
    }
}
