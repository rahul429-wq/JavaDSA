package LinkedlistDSA;

public class SearchInLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirstElement(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLastElement(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    //print
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println("");
    }
    public int SearchInLL(int data){
        if (head == null) {
            System.out.println("List is Empty");
            return -1;
        }
        int counter=0;
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
            counter=counter+1;
            if(temp.data==data){
                return counter;
            }
        }
        return -1;
    }

        public static void main(String[] args) {
            SearchInLL l1=new SearchInLL();
            l1.addLastElement(1);
            l1.addLastElement(5);
            l1.addLastElement(7);
            l1.addLastElement(3);
            l1.addLastElement(8);
            l1.addLastElement(2);
            l1.addLastElement(3);
            l1.printList();
            int num=5;
            System.out.println(l1.SearchInLL(num));





    }
}
