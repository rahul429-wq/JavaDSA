package LinkedlistDSA;

public class DeleteAllNodeAfterTarget {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
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

    public void printLL(){
        if(head==null){
            System.out.println("No elements present");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ==> ");
            temp=temp.next;

        }
        System.out.println("NULL");
    }
    //delete all after some value

    public void DeleteAllAfterTarget(int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
            if(temp.next.data==data){
                temp.next=null;
            }
        }
    }




    public static void main(String[] args) {
        DeleteAllNodeAfterTarget l1=new DeleteAllNodeAfterTarget();
        l1.addFirstElement(50);
        l1.addFirstElement(40);
        l1.addFirstElement(35);
        l1.addFirstElement(25);
        l1.addFirstElement(15);
        l1.addFirstElement(5);
        l1.addFirstElement(1);
        l1.printLL();
        int target=25;
        l1.DeleteAllAfterTarget(target);
        l1.printLL();





    }
}
