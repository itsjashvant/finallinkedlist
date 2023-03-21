class  node
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
  public int count()
  {
    int c=0;
    node temp=head;
    while(temp!=null)
    {
      temp=temp.next;
      c++;
    }
    return c;
  }
  public void print()
  {
    node temp=head;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  public void delete(int pos)
  {
    if(head==null)
    return;
    else
    {
      if(head.next==null)
      {
        if(pos!=1)
      {
        System.out.println("invalid input");
      }
      else
      {
        head=null;
      }
      }
      else if(pos>count())
    {
      System.out.println("invalid input");
    }
    else
    {
      int c=1;
      node temp=head;
      while(temp!=null)
      {
        if(pos-1==c)
        {
          break;
        }
        c++;
        temp=temp.next;
      }
      temp.next=temp.next.next;
    }
    }
  }
  public static void main(String args[])
  {
    main obj=new main();
    node n=new node(10);
    node n1=new node(20);
    node n2=new node(30);
    obj.head=n;
    n.next=n1;
    n1.next=n2;
    obj.count();
    obj.print();
    obj.delete(8);
    obj.print();
  }
}