class node
{
  int data;
  node next;
  node(int data)
  {
    this.data=data;
  }
}
public class main
{node head;
  public void print()
  {
    
    node temp=head;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  public void reverse()
  {
    node pre=null;
    node cu=null;
    node temp=head;
    while(temp!=null)
    {
      cu=temp.next;
      pre=cu.next;
      temp=pre;
      temp=cu;
    }
  }
  public static void main(String args[])
  {
    main obj=new main();
    node n=new node(10);
    node n1=new node(20);
    node n2=new node(30);
    node n3=new node(40);
    node n4=new node(50);
    obj.head=n;
    n.next=n1;
  n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    obj.print();
    obj.reverse();
    obj.print();
  }
}