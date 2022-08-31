package LinkedlistDSA;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //    add first
    public void addFirst(String data){
    Node newNode=new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //addlast
    public void addLast(String data){
    Node newNode=new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //print

    public void printList()
    {
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.print("NULL");
        System.out.println("");
    }

    //delete First node
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head=head.next;
    }
  //delete last node
    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty!!!!");
            return;
        }

        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondlast=head;
        Node lastnode=head.next;
        while (lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    //    getsize

    public int getSize(){
        return  size;
    }


    //reverse whole Linkedlist
    public void reverseIterate(){

        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while (currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;

    }






    public static void main(String[] args) {
        LL l1=new LL();
        l1.addLast("1");
        l1.addLast("2");
        l1.addLast("3");
        l1.addLast("4");
        l1.printList();
        l1.reverseIterate();
        l1.printList();
//        l1.addFirst("4");
//        l1.addFirst("3");
//        l1.addFirst("2");
//        l1.addFirst("1");
//        l1.printList();
//        System.out.println("size-> "+l1.getSize());
//        l1.printList();
//        System.out.println("size-> "+l1.getSize());
//        l1.deleteLast();
//        l1.printList();
//        System.out.println("size-> "+l1.getSize());
//        l1.deleteLast();
//        l1.printList();
//        System.out.println("size-> "+l1.getSize());
//        l1.deleteLast();
//        l1.printList();
//        System.out.println("size-> "+l1.getSize());


//        System.out.println("");
//        LL l2=new LL();
//        l2.addLast("4");
//        l2.addLast("3");
//        l2.addLast("2");
//        l2.addLast("1");
//        l2.printList();



    }
}
