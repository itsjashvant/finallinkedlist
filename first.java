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
 
  public void inerte(int p)
  {
    node n9=new node(p);
    node temp=head;
    if(head==null)
    {
      head=n9;
    }
    else
    {
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    
    temp.next=n9;
    }
  }
  public void inp(int data,int pos)
  {
    //if(head==null)
    //{
      //if(pos>1)
      //{
        System.out.println("invalid position");
     // }
   // }
 
    public void inert(int k)
    {
      node n5=new node(k);
      {
        n5.next=head;
        head=n5;
      }
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
  public static void main(String args[])
  {
    main obj=new main();
    node n=new node(10);
    node n1=new node(20);
    node n2=new node(30);
    node n3=new node(40);
    obj.head=n;
    n.next=n1;
    n1.next=n2;
    n2.next=n3;
    obj.print();
  // obj.inert(100);
    obj.inerte(1000);
  }
}