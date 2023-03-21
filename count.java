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
 public void delete()
 {
   node current=head;
   node temp=head;
   while(current.next!=null)
   {
     while(temp.next!=null)
     {
       if(current.data==temp.next.data)
       {
         temp.next=temp.next.next;
       }
       else
       {
         temp=temp.next;
       }
     }
     current=current.next;
   }
 }

  
  public static void main(String args[])
  {
    main obj=new main();
    node n=new node(10);
    node n1=new node(10);
    node n2=new node(30);
    obj.head=n;
    n.next=n1;
    n1.next=n2;
    obj.count();
    obj.print();
    obj.delete();
    obj.print();
  }
}