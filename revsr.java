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
  public void insert(int k)
  {
    node n=new node(k);
    if(head==null)
    {
     head=n;
     n.next=n;
    }
    else
    {
      node temp=head;
      n.next=head;
      while(temp.next!=head)
      {
        
      temp=temp.next;
      }
      temp.next=n;
      head=n;
    }
  }
    public static void main(String args[])
    {
      main obj=new main();
      obj.insert(10);
      obj.insert(20);
     obj.insert(30);
      //obj.insert(40);
      //obj.insert(50);
    }
}