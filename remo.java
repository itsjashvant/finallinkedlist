class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class Main
{
   node head;
   public int count()
   {
       node temp=head;
       int c=0;
       while(temp!=null)
       {
           temp=temp.next;
           c++;
       }
       return c;
   }
   public void insertp(int k)
   {
       node n=new node(k);
       if(head==null)
       {
           head=n;
       }
       else
       {
           node temp=head;
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next=n;
           
       }
   }
   public void insert(int pos,int k)
   {
       node n=new node(k);
       if(head==n)
       {
           if(pos!=1)
           {
               System.out.println("invalid input");
           }
           else
           {
               head=n;
           }
       }
           else if(pos>count()+1)
           {
               System.out.println("invlid input");
           }
           else
           {
               node temp=head;
               int c=1;
               while(temp.next!=null)
               {
                   if(c==pos-1)
                   {
                       break;
                       
                   }
                   c++;
                   temp=temp.next;
               }
               n.next=temp.next;
               temp.next=n;
           }
   }
   public void print()
   {
       node temp=head;
       while(temp!=null)
       {
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
   }
   public static void main(String args[])
   {
       Main obj=new Main();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           int l=sc.nextInt();
           obj.insertp(l);
       }
       int po=sc.nextInt();
       int e=sc.nextInt();
       obj.insert(po,e);
       obj.print();
   }
}