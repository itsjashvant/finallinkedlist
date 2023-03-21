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
  public void insertAtPos(int pos, int x){
    Node n = new Node(x);
    if(head==null){
      if(pos>1){
        System.out.println("invalid position");
      }
      else{
      head = n;
      }
    }
    else{
      if(pos==1){
        n.next=head;
        head=n;
      }
      else if(pos>count()+1){
        System.out.println("invalid position");
      }
      else{
        Node temp = head;
        int c=1;
        while(temp.next!=null){
          if(c==pos-1){
            break;
          }
          c++;
          temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
      }
    }
  }
    public static void main(String[] args) {
      Main obj = new Main();
      Node n1 = new Node(10);
      obj.head = n1;
      Node n2 = new Node(20);
      n1.next = n2;
      Node n3 = new Node(30);
      n2.next = n3;
      
      //obj.insertAtBeg(50);
      //obj.insertAtEnd(50);
      obj.insertAtPos(3,60);
      //obj.insertAtPos(3,80);
    }
}