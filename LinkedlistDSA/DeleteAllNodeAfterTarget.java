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
            if(temp.data==data){
                temp.next=null;

            }
        }
    }

    //delete single element from LL

    public void DeleteSingleElement(int pos) {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        int size=0;
        Node curr=head;
        while (curr!=null){
            curr=curr.next;
            size++;
        }
        int index=size-pos;

        int i=1;
        Node prev=head;
        while (i<index){
            prev=prev.next;
            i++;
        }
        prev.next= prev.next.next;
    }


    public void SimpleDelete(int pos){
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp=head;
        int size=0;
        while (temp!=null)
        {
            temp=temp.next;
            size++;
        }
        int i=1;
//        int index=pos;
        Node t=head;
        while (i<pos){
            t=t.next;
            i++;
        }
        t.next=t.next.next;
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
        int target=1;
//        l1.DeleteSingleElement(target);
        l1.SimpleDelete(target);
//        l1.DeleteAllAfterTarget(target);
        l1.printLL();










    }
}
