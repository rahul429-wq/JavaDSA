#include<bits/stdc++.h>
using namespace std;
class Node{
   public:
   int data;
   Node* next;  

   Node(int data)
   {
      this->data=data;
      this->next=NULL;
   }
};

// singly LL
// !InsertAtHead
void InsertAtHead(Node* &head,int d){
   Node* temp=new Node(d);
   temp->next=head;
   head=temp;
}
// !InsertAttail
void InsertAtTail(Node* &tail,int d){
   Node* temp=new Node(d);
   tail->next=temp;
   tail=tail->next;
}


//todo print LL
void print(Node* &head){
   Node* temp=head;
   while (temp!=NULL)
   {
      cout<<temp->data<<" -> ";
      temp=temp->next;
   }
   cout<<endl;
}
int main(){
   Node* node1=new Node(10);
   // cout<<node1->data<<endl;
   // cout<<node1->next<<endl;

Node* head=node1;
Node* tail=node1;
print(head);
InsertAtTail(tail,12);
print(head);
InsertAtTail(tail,16);
print(head);


}