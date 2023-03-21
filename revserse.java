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
  node temp4;
  node head;
  public void loop()
  {
    node temp=head;
    node temp1=head;
    while(temp!=null && temp1!=null)
    {
      temp=temp.next;
      temp1=temp1.next.next;
      if(temp==temp1)
      {
        System.out.println("loop has occur");
        
        temp4=temp;
        break;
      }
    }
  }
    public void print()
    {
      node temp5=head;
      node temp6=temp4;
      while(temp5!=temp6)
      {
        temp5=temp5.next;
        temp6=temp6.next;
      }
      System.out.println(temp5.data);
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
    obj.print();
    obj.loop();
  
  }
}