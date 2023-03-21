class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Main {
  Node head;
  public void insertAtBeg(int x){
    Node n = new Node(x);
    n.next=head;
    head=n;
  }
  public void insertAtEnd(int x){
    Node n = new Node(x);
    if(head==null){
      head = n;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = n;
    }
  }
  public int count(){
    int c=0;
    Node temp = head;
    while(temp!=null){
      c++;
      temp = temp.next;
    }
    return c;
  }
  public void deleteAtBeg(){
    if(head==null)
      return;
    else{
      head = head.next;
    }
  }
  public void deleteAtEnd(){
    if(head==null)
      return;
    else{
      Node temp = head;
      if(temp.next==null){
        head = null;
      }
      else{
        while(temp.next.next!=null){
          temp = temp.next;
        }
        temp.next = null;
      }
    }
  }