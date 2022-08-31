package LinkedlistDSA;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<String>();
        l1.addFirst("10");
        l1.addFirst("20");
        l1.addFirst("30");
        System.out.println(l1.size());
        System.out.println(l1);
    }
}
