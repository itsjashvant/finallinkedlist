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
{
  node head;
  public void loop()
  {
    node temp=head;
    node temp1=head;
  while(temp!=null && temp1!=null)
  {
    temp=temp.next;
    temp1=temp1.next.next;
    if(temp1==temp)
    {
      System.out.println("loop has been occur at"+temp.data);
      break;
    }
    
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
  n4.next=n3;
  obj.loop();
}
}