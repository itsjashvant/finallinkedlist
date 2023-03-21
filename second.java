class node
{
  node next;
  int data;
  node(int data)
  {
    this.data=data;
  }
}
   public  class main
   {
     node head;
     public void insert(int k)
     {
       node n=new node(k);
       n.next=head;
       head=n;
     }
     public void inserta(int l)
     {
       node nu=new node(l);
       node temp1=head;
       while(temp1.next!=null)
      {
        temp1=temp1.next;
      }
      temp1.next=nu;
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
       node n1=new node(10);
       node n2=new node(20);
       node n3=new node(30);
       node n4=new node(40);
       obj.head=n1;
       n1.next=n2;
       n2.next=n3;
       n3.next=n4;
       //obj.insert(1000);
       obj.inserta(10000);
       obj.print();
     }
     
   }