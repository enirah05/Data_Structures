class LinkedList {
    Node head;
    Node tail;
    LinkedList(){
        head=null;
        tail=null;
    }
    class Node{
        int data;
        Node next;
        Node(int val){
            data= val;
            next= null;
        }
    }
    public void Append(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
            tail.next=null;
        }
    }

    public void dis(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }

    public void Delete(int val){
        Node temp= head;
        if(head.data==val){
            head=head.next;
        }
        while(temp.next!=null){
            temp=temp.next;
            if(temp.next.data==val){
                temp.next=temp.next.next;
            }
        }
    }
}
public class ll{
    public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.Append(50); 
       l1.Append(60);
       l1.Append(70); 
       l1.Append(80);
       l1.Append(90); 
       l1.Append(100);
       l1.dis();
       li.Delete(90);
       l1.dis();
    }
}